// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.FLOAT;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class AllianceRequest extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_ID = 0;
  public static final Integer DEFAULT_ALLIANCE_ID = 0;
  public static final Integer DEFAULT_REQUEST_EMPIRE_ID = 0;
  public static final Long DEFAULT_REQUEST_DATE = 0L;
  public static final RequestType DEFAULT_REQUEST_TYPE = RequestType.JOIN;
  public static final String DEFAULT_MESSAGE = "";
  public static final RequestState DEFAULT_STATE = RequestState.PENDING;
  public static final Integer DEFAULT_NUM_VOTES = 0;
  public static final Integer DEFAULT_TARGET_EMPIRE_ID = 0;
  public static final Float DEFAULT_AMOUNT = 0F;
  public static final ByteString DEFAULT_PNG_IMAGE = ByteString.EMPTY;
  public static final String DEFAULT_NEW_NAME = "";
  public static final List<AllianceRequestVote> DEFAULT_VOTE = Collections.emptyList();

  @ProtoField(tag = 1, type = INT32)
  public Integer id;

  @ProtoField(tag = 2, type = INT32)
  public Integer alliance_id;

  @ProtoField(tag = 3, type = INT32)
  public Integer request_empire_id;

  @ProtoField(tag = 4, type = INT64)
  public Long request_date;

  @ProtoField(tag = 5, type = ENUM)
  public RequestType request_type;

  @ProtoField(tag = 6, type = STRING)
  public String message;

  @ProtoField(tag = 7, type = ENUM)
  public RequestState state;

  @ProtoField(tag = 8, type = INT32)
  public Integer num_votes;

  /**
   * for KICK requests, this is the empire we're kicking
   */
  @ProtoField(tag = 9, type = INT32)
  public Integer target_empire_id;

  /**
   * for DEPOSIT_CASH and WITHDRAW_CASH, the amount of cash to deposit/withdraw
   */
  @ProtoField(tag = 10, type = FLOAT)
  public Float amount;

  /**
   * for CHANGE_IMAGE, the new image to use
   */
  @ProtoField(tag = 11, type = BYTES)
  public ByteString png_image;

  /**
   * for CHANGE_NAME, the new name you want
   */
  @ProtoField(tag = 12, type = STRING)
  public String new_name;

  /**
   * the votes we've received for this request so far.
   */
  @ProtoField(tag = 13, label = REPEATED, messageType = AllianceRequestVote.class)
  public List<AllianceRequestVote> vote;

  public AllianceRequest() {
  }

  public AllianceRequest(Integer id, Integer alliance_id, Integer request_empire_id, Long request_date, RequestType request_type, String message, RequestState state, Integer num_votes, Integer target_empire_id, Float amount, ByteString png_image, String new_name, List<AllianceRequestVote> vote) {
    this.id = id;
    this.alliance_id = alliance_id;
    this.request_empire_id = request_empire_id;
    this.request_date = request_date;
    this.request_type = request_type;
    this.message = message;
    this.state = state;
    this.num_votes = num_votes;
    this.target_empire_id = target_empire_id;
    this.amount = amount;
    this.png_image = png_image;
    this.new_name = new_name;
    this.vote = copyOf(vote);
  }

  private AllianceRequest(Builder builder) {
    this(builder.id, builder.alliance_id, builder.request_empire_id, builder.request_date, builder.request_type, builder.message, builder.state, builder.num_votes, builder.target_empire_id, builder.amount, builder.png_image, builder.new_name, builder.vote);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AllianceRequest)) return false;
    AllianceRequest o = (AllianceRequest) other;
    return equals(id, o.id)
        && equals(alliance_id, o.alliance_id)
        && equals(request_empire_id, o.request_empire_id)
        && equals(request_date, o.request_date)
        && equals(request_type, o.request_type)
        && equals(message, o.message)
        && equals(state, o.state)
        && equals(num_votes, o.num_votes)
        && equals(target_empire_id, o.target_empire_id)
        && equals(amount, o.amount)
        && equals(png_image, o.png_image)
        && equals(new_name, o.new_name)
        && equals(vote, o.vote);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = id != null ? id.hashCode() : 0;
      result = result * 37 + (alliance_id != null ? alliance_id.hashCode() : 0);
      result = result * 37 + (request_empire_id != null ? request_empire_id.hashCode() : 0);
      result = result * 37 + (request_date != null ? request_date.hashCode() : 0);
      result = result * 37 + (request_type != null ? request_type.hashCode() : 0);
      result = result * 37 + (message != null ? message.hashCode() : 0);
      result = result * 37 + (state != null ? state.hashCode() : 0);
      result = result * 37 + (num_votes != null ? num_votes.hashCode() : 0);
      result = result * 37 + (target_empire_id != null ? target_empire_id.hashCode() : 0);
      result = result * 37 + (amount != null ? amount.hashCode() : 0);
      result = result * 37 + (png_image != null ? png_image.hashCode() : 0);
      result = result * 37 + (new_name != null ? new_name.hashCode() : 0);
      result = result * 37 + (vote != null ? vote.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AllianceRequest> {

    public Integer id;
    public Integer alliance_id;
    public Integer request_empire_id;
    public Long request_date;
    public RequestType request_type;
    public String message;
    public RequestState state;
    public Integer num_votes;
    public Integer target_empire_id;
    public Float amount;
    public ByteString png_image;
    public String new_name;
    public List<AllianceRequestVote> vote;

    public Builder() {
    }

    public Builder(AllianceRequest message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.alliance_id = message.alliance_id;
      this.request_empire_id = message.request_empire_id;
      this.request_date = message.request_date;
      this.request_type = message.request_type;
      this.message = message.message;
      this.state = message.state;
      this.num_votes = message.num_votes;
      this.target_empire_id = message.target_empire_id;
      this.amount = message.amount;
      this.png_image = message.png_image;
      this.new_name = message.new_name;
      this.vote = copyOf(message.vote);
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder alliance_id(Integer alliance_id) {
      this.alliance_id = alliance_id;
      return this;
    }

    public Builder request_empire_id(Integer request_empire_id) {
      this.request_empire_id = request_empire_id;
      return this;
    }

    public Builder request_date(Long request_date) {
      this.request_date = request_date;
      return this;
    }

    public Builder request_type(RequestType request_type) {
      this.request_type = request_type;
      return this;
    }

    public Builder message(String message) {
      this.message = message;
      return this;
    }

    public Builder state(RequestState state) {
      this.state = state;
      return this;
    }

    public Builder num_votes(Integer num_votes) {
      this.num_votes = num_votes;
      return this;
    }

    /**
     * for KICK requests, this is the empire we're kicking
     */
    public Builder target_empire_id(Integer target_empire_id) {
      this.target_empire_id = target_empire_id;
      return this;
    }

    /**
     * for DEPOSIT_CASH and WITHDRAW_CASH, the amount of cash to deposit/withdraw
     */
    public Builder amount(Float amount) {
      this.amount = amount;
      return this;
    }

    /**
     * for CHANGE_IMAGE, the new image to use
     */
    public Builder png_image(ByteString png_image) {
      this.png_image = png_image;
      return this;
    }

    /**
     * for CHANGE_NAME, the new name you want
     */
    public Builder new_name(String new_name) {
      this.new_name = new_name;
      return this;
    }

    /**
     * the votes we've received for this request so far.
     */
    public Builder vote(List<AllianceRequestVote> vote) {
      this.vote = checkForNulls(vote);
      return this;
    }

    @Override
    public AllianceRequest build() {
      return new AllianceRequest(this);
    }
  }

  public enum RequestType
      implements ProtoEnum {
    JOIN(0),
    LEAVE(1),
    KICK(2),
    DEPOSIT_CASH(3),
    WITHDRAW_CASH(4),
    CHANGE_IMAGE(5),
    CHANGE_NAME(6);

    private final int value;

    private RequestType(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  public enum RequestState
      implements ProtoEnum {
    PENDING(0),
    ACCEPTED(1),
    REJECTED(2),
    WITHDRAWN(3);

    private final int value;

    private RequestState(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
