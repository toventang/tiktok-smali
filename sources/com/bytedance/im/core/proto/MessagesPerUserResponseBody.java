package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class MessagesPerUserResponseBody extends Message<MessagesPerUserResponseBody, Builder> {
    public static final ProtoAdapter<MessagesPerUserResponseBody> ADAPTER = new ProtoAdapter_MessagesPerUserResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CMD_INDEX = 0L;
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Long DEFAULT_NEXT_INTERVAL = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_badge_count")
    public final List<ConversationBadgeCountInfo> conversation_badge_count;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "messages")
    public final List<MessageBody> messages;
    @c(a = "next_cmd_index")
    public final Long next_cmd_index;
    @c(a = "next_conversation_version")
    public final Long next_conversation_version;
    @c(a = "next_cursor")
    public final Long next_cursor;
    @c(a = "next_interval")
    public final Long next_interval;

    static final class ProtoAdapter_MessagesPerUserResponseBody extends ProtoAdapter<MessagesPerUserResponseBody> {
        static {
            Covode.recordClassIndex(23622);
        }

        public ProtoAdapter_MessagesPerUserResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesPerUserResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.MessagesPerUserResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MessagesPerUserResponseBody redact(com.bytedance.im.core.proto.MessagesPerUserResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.MessagesPerUserResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                java.util.List<com.bytedance.im.core.proto.ConversationBadgeCountInfo> r1 = r2.conversation_badge_count
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationBadgeCountInfo> r0 = com.bytedance.im.core.proto.ConversationBadgeCountInfo.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.MessagesPerUserResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MessagesPerUserResponseBody.ProtoAdapter_MessagesPerUserResponseBody.redact(com.bytedance.im.core.proto.MessagesPerUserResponseBody):com.bytedance.im.core.proto.MessagesPerUserResponseBody");
        }

        public final int encodedSize(MessagesPerUserResponseBody messagesPerUserResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserResponseBody.messages) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesPerUserResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, messagesPerUserResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(4, messagesPerUserResponseBody.next_interval) + ProtoAdapter.INT64.encodedSizeWithTag(5, messagesPerUserResponseBody.next_conversation_version) + ConversationBadgeCountInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, messagesPerUserResponseBody.conversation_badge_count) + ProtoAdapter.INT64.encodedSizeWithTag(7, messagesPerUserResponseBody.next_cmd_index) + messagesPerUserResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.next_interval(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.next_conversation_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.conversation_badge_count.add(ConversationBadgeCountInfo.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.next_cmd_index(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessagesPerUserResponseBody messagesPerUserResponseBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserResponseBody.messages);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messagesPerUserResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, messagesPerUserResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messagesPerUserResponseBody.next_interval);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, messagesPerUserResponseBody.next_conversation_version);
            ConversationBadgeCountInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, messagesPerUserResponseBody.conversation_badge_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, messagesPerUserResponseBody.next_cmd_index);
            protoWriter.writeBytes(messagesPerUserResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MessagesPerUserResponseBody, Builder> {
        public List<ConversationBadgeCountInfo> conversation_badge_count = Internal.newMutableList();
        public Boolean has_more;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_cmd_index;
        public Long next_conversation_version;
        public Long next_cursor;
        public Long next_interval;

        static {
            Covode.recordClassIndex(23621);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessagesPerUserResponseBody build() {
            return new MessagesPerUserResponseBody(this.messages, this.next_cursor, this.has_more, this.next_interval, this.next_conversation_version, this.conversation_badge_count, this.next_cmd_index, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cmd_index(Long l2) {
            this.next_cmd_index = l2;
            return this;
        }

        public final Builder next_conversation_version(Long l2) {
            this.next_conversation_version = l2;
            return this;
        }

        public final Builder next_cursor(Long l2) {
            this.next_cursor = l2;
            return this;
        }

        public final Builder next_interval(Long l2) {
            this.next_interval = l2;
            return this;
        }

        public final Builder conversation_badge_count(List<ConversationBadgeCountInfo> list) {
            Internal.checkElementsNotNull(list);
            this.conversation_badge_count = list;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessagesPerUserResponseBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23620);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessagesPerUserResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessagesPerUserResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.next_interval = this.next_interval;
        builder.next_conversation_version = this.next_conversation_version;
        builder.conversation_badge_count = Internal.copyOf("conversation_badge_count", this.conversation_badge_count);
        builder.next_cmd_index = this.next_cmd_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MessagesPerUserResponseBody(List<MessageBody> list, Long l2, Boolean bool, Long l3, Long l4, List<ConversationBadgeCountInfo> list2, Long l5) {
        this(list, l2, bool, l3, l4, list2, l5, i.EMPTY);
    }

    public MessagesPerUserResponseBody(List<MessageBody> list, Long l2, Boolean bool, Long l3, Long l4, List<ConversationBadgeCountInfo> list2, Long l5, i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.next_cursor = l2;
        this.has_more = bool;
        this.next_interval = l3;
        this.next_conversation_version = l4;
        this.conversation_badge_count = Internal.immutableCopyOf("conversation_badge_count", list2);
        this.next_cmd_index = l5;
    }
}
