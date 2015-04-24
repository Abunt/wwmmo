// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

/**
 *
 * Represents a request to colonize a planet. PUT this to /colonies to colonize.
 */
public final class ColonizeRequest extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_PLANET_INDEX = 0;

  /**
   * The index of the planet you want to colonize
   */
  @ProtoField(tag = 1, type = INT32)
  public Integer planet_index;

  public ColonizeRequest() {
  }

  public ColonizeRequest(Integer planet_index) {
    this.planet_index = planet_index;
  }

  private ColonizeRequest(Builder builder) {
    this(builder.planet_index);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ColonizeRequest)) return false;
    return equals(planet_index, ((ColonizeRequest) other).planet_index);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = planet_index != null ? planet_index.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<ColonizeRequest> {

    public Integer planet_index;

    public Builder() {
    }

    public Builder(ColonizeRequest message) {
      super(message);
      if (message == null) return;
      this.planet_index = message.planet_index;
    }

    /**
     * The index of the planet you want to colonize
     */
    public Builder planet_index(Integer planet_index) {
      this.planet_index = planet_index;
      return this;
    }

    @Override
    public ColonizeRequest build() {
      return new ColonizeRequest(this);
    }
  }
}
