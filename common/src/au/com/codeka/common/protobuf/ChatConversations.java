// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class ChatConversations extends Message {
  private static final long serialVersionUID = 0L;

  public static final List<ChatConversation> DEFAULT_CONVERSATIONS = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED, messageType = ChatConversation.class)
  public List<ChatConversation> conversations;

  public ChatConversations() {
  }

  public ChatConversations(List<ChatConversation> conversations) {
    this.conversations = copyOf(conversations);
  }

  private ChatConversations(Builder builder) {
    this(builder.conversations);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ChatConversations)) return false;
    return equals(conversations, ((ChatConversations) other).conversations);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = conversations != null ? conversations.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<ChatConversations> {

    public List<ChatConversation> conversations;

    public Builder() {
    }

    public Builder(ChatConversations message) {
      super(message);
      if (message == null) return;
      this.conversations = copyOf(message.conversations);
    }

    public Builder conversations(List<ChatConversation> conversations) {
      this.conversations = checkForNulls(conversations);
      return this;
    }

    @Override
    public ChatConversations build() {
      return new ChatConversations(this);
    }
  }
}
