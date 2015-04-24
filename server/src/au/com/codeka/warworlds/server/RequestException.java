package au.com.codeka.warworlds.server;

import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import au.com.codeka.common.protobuf.GenericError;

/**
 * This exception is thrown when you want to pass an error back to the client.
 */
public class RequestException extends Exception {
    private static final long serialVersionUID = 1L;

    private int mHttpErrorCode;
    private GenericError mGenericError;

    public RequestException(int httpErrorCode) {
        super(String.format("HTTP Error: %d", httpErrorCode));
        mHttpErrorCode = httpErrorCode;
    }

    public RequestException(int httpErrorCode, String message) {
        super(String.format(message, httpErrorCode));
        mHttpErrorCode = httpErrorCode;
    }

    public RequestException(int httpErrorCode, String message, Throwable innerException) {
        super(String.format(message, httpErrorCode), innerException);
        mHttpErrorCode = httpErrorCode;
    }

    public RequestException(Throwable innerException) {
        super(getExceptionDescription(innerException), innerException);

        RequestException reqExc = findInnerException(innerException, RequestException.class);
        if (reqExc != null) {
            mHttpErrorCode = reqExc.mHttpErrorCode;
            mGenericError = reqExc.mGenericError;
        } else {
            mHttpErrorCode = 500;
        }
    }

    private static String getExceptionDescription(Throwable e) {
        RequestException reqExc = findInnerException(e, RequestException.class);
        if (reqExc != null) {
            return "HTTP Error: " + reqExc.mHttpErrorCode;
        }

        SQLException sqlExc = findInnerException(e, SQLException.class);
        if (sqlExc != null) {
            return "SQL Error: " + sqlExc.getErrorCode();
        }

        return "Unknown Exception";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Exception> T findInnerException(Throwable e, Class<T> exceptionType) {
        while (e != null) {
            if (e.getClass().equals(exceptionType)) {
                return (T) e;
            }
            e = e.getCause();
        }
        return null;
    }

    public RequestException(int httpErrorCode, GenericError.ErrorCode errorCode, String errorMsg) {
        super(errorMsg);

        mHttpErrorCode = httpErrorCode;
        mGenericError = new GenericError.Builder()
                            .error_code(errorCode.getValue())
                            .error_message(errorMsg)
                            .build();
    }

    public void populate(HttpServletResponse response) {
        response.setStatus(mHttpErrorCode);
    }

    public int getHttpErrorCode() {
        return mHttpErrorCode;
    }

    public GenericError getGenericError() {
        if (mGenericError == null) {
            mGenericError = new GenericError.Builder()
                    .error_code(GenericError.ErrorCode.UnknownError.getValue())
                    .error_message(getMessage())
                    .build();
        }
        return mGenericError;
    }
}
