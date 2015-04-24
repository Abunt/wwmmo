// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;

/**
 *
 * A chat message, who it's from, the kind of message and whatnot.
 */
public final class ChatMessage extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_ID = 0;
  public static final String DEFAULT_MESSAGE = "";
  public static final String DEFAULT_EMPIRE_KEY = "";
  public static final Long DEFAULT_DATE_POSTED = 0L;
  public static final String DEFAULT_ALLIANCE_KEY = "";
  public static final String DEFAULT_MESSAGE_EN = "";
  public static final Integer DEFAULT_CONVERSATION_ID = 0;
  public static final Integer DEFAULT_PROFANITY_LEVEL = 0;
  public static final MessageAction DEFAULT_ACTION = MessageAction.Normal;

  @ProtoField(tag = 7, type = INT32)
  public Integer id;

  @ProtoField(tag = 1, type = STRING)
  public String message;

  @ProtoField(tag = 2, type = STRING)
  public String empire_key;

  @ProtoField(tag = 3, type = INT64)
  public Long date_posted;

  @ProtoField(tag = 4, type = STRING)
  public String alliance_key;

  /**
   * if the message was auto-translated to english, this will be the english
   * translation.
   */
  @ProtoField(tag = 5, type = STRING)
  public String message_en;

  @ProtoField(tag = 6, type = INT32)
  public Integer conversation_id;

  /**
   * "profanity" level, 0 == not profane, 1 == somewhat profane, 2 == very profane. Used in
   * conjunction with client-side filtering of chat messages.
   */
  @ProtoField(tag = 9, type = INT32)
  public Integer profanity_level;

  @ProtoField(tag = 8, type = ENUM)
  public MessageAction action;

  public ChatMessage() {
  }

  public ChatMessage(Integer id, String message, String empire_key, Long date_posted, String alliance_key, String message_en, Integer conversation_id, Integer profanity_level, MessageAction action) {
    this.id = id;
    this.message = message;
    this.empire_key = empire_key;
    this.date_posted = date_posted;
    this.alliance_key = alliance_key;
    this.message_en = message_en;
    this.conversation_id = conversation_id;
    this.profanity_level = profanity_level;
    this.action = action;
  }

  private ChatMessage(Builder builder) {
    this(builder.id, builder.message, builder.empire_key, builder.date_posted, builder.alliance_key, builder.message_en, builder.conversation_id, builder.profanity_level, builder.action);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ChatMessage)) return false;
    ChatMessage o = (ChatMessage) other;
    return equals(id, o.id)
        && equals(message, o.message)
        && equals(empire_key, o.empire_key)
        && equals(date_posted, o.date_posted)
        && equals(alliance_key, o.alliance_key)
        && equals(message_en, o.message_en)
        && equals(conversation_id, o.conversation_id)
        && equals(profanity_level, o.profanity_level)
        && equals(action, o.action);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = id != null ? id.hashCode() : 0;
      result = result * 37 + (message != null ? message.hashCode() : 0);
      result = result * 37 + (empire_key != null ? empire_key.hashCode() : 0);
      result = result * 37 + (date_posted != null ? date_posted.hashCode() : 0);
      result = result * 37 + (alliance_key != null ? alliance_key.hashCode() : 0);
      result = result * 37 + (message_en != null ? message_en.hashCode() : 0);
      result = result * 37 + (conversation_id != null ? conversation_id.hashCode() : 0);
      result = result * 37 + (profanity_level != null ? profanity_level.hashCode() : 0);
      result = result * 37 + (action != null ? action.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ChatMessage> {

    public Integer id;
    public String message;
    public String empire_key;
    public Long date_posted;
    public String alliance_key;
    public String message_en;
    public Integer conversation_id;
    public Integer profanity_level;
    public MessageAction action;

    public Builder() {
    }

    public Builder(ChatMessage message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.message = message.message;
      this.empire_key = message.empire_key;
      this.date_posted = message.date_posted;
      this.alliance_key = message.alliance_key;
      this.message_en = message.message_en;
      this.conversation_id = message.conversation_id;
      this.profanity_level = message.profanity_level;
      this.action = message.action;
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder message(String message) {
      this.message = message;
      return this;
    }

    public Builder empire_key(String empire_key) {
      this.empire_key = empire_key;
      return this;
    }

    public Builder date_posted(Long date_posted) {
      this.date_posted = date_posted;
      return this;
    }

    public Builder alliance_key(String alliance_key) {
      this.alliance_key = alliance_key;
      return this;
    }

    /**
     * if the message was auto-translated to english, this will be the english
     * translation.
     */
    public Builder message_en(String message_en) {
      this.message_en = message_en;
      return this;
    }

    public Builder conversation_id(Integer conversation_id) {
      this.conversation_id = conversation_id;
      return this;
    }

    /**
     * "profanity" level, 0 == not profane, 1 == somewhat profane, 2 == very profane. Used in
     * conjunction with client-side filtering of chat messages.
     */
    public Builder profanity_level(Integer profanity_level) {
      this.profanity_level = profanity_level;
      return this;
    }

    public Builder action(MessageAction action) {
      this.action = action;
      return this;
    }

    @Override
    public ChatMessage build() {
      return new ChatMessage(this);
    }
  }

  public enum MessageAction
      implements ProtoEnum {
    Normal(0),
    /**
     * a "normal" chat message, the default
     */
    ParticipantAdded(1),
    /**
     * a new participant was added
     */
    ParticipantLeft(2);

    private final int value;

    private MessageAction(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
