package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import k.i;

public final class MessagesInConversationResponseBody extends Message<MessagesInConversationResponseBody, Builder> {
    public static final ProtoAdapter<MessagesInConversationResponseBody> ADAPTER = new ProtoAdapter_MessagesInConversationResponseBody();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "messages")
    public final List<MessageBody> messages;
    @c(a = "next_cursor")
    public final Long next_cursor;

    static final class ProtoAdapter_MessagesInConversationResponseBody extends ProtoAdapter<MessagesInConversationResponseBody> {
        static {
            Covode.recordClassIndex(23610);
        }

        public ProtoAdapter_MessagesInConversationResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesInConversationResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.MessagesInConversationResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MessagesInConversationResponseBody redact(com.bytedance.im.core.proto.MessagesInConversationResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.MessagesInConversationResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.MessagesInConversationResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MessagesInConversationResponseBody.ProtoAdapter_MessagesInConversationResponseBody.redact(com.bytedance.im.core.proto.MessagesInConversationResponseBody):com.bytedance.im.core.proto.MessagesInConversationResponseBody");
        }

        public final int encodedSize(MessagesInConversationResponseBody messagesInConversationResponseBody) {
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesInConversationResponseBody.messages) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesInConversationResponseBody.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, messagesInConversationResponseBody.has_more) + messagesInConversationResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesInConversationResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.next_cursor(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, MessagesInConversationResponseBody messagesInConversationResponseBody) {
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesInConversationResponseBody.messages);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messagesInConversationResponseBody.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, messagesInConversationResponseBody.has_more);
            protoWriter.writeBytes(messagesInConversationResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<MessagesInConversationResponseBody, Builder> {
        public Boolean has_more;
        public List<MessageBody> messages = Internal.newMutableList();
        public Long next_cursor;

        static {
            Covode.recordClassIndex(23609);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessagesInConversationResponseBody build() {
            return new MessagesInConversationResponseBody(this.messages, this.next_cursor, this.has_more, super.buildUnknownFields());
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_cursor(Long l2) {
            this.next_cursor = l2;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23608);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessagesInConversationResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessagesInConversationResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.next_cursor = this.next_cursor;
        builder.has_more = this.has_more;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessagesInConversationResponseBody" + h.f38770a.b(this).toString();
    }

    public MessagesInConversationResponseBody(List<MessageBody> list, Long l2, Boolean bool) {
        this(list, l2, bool, i.EMPTY);
    }

    public MessagesInConversationResponseBody(List<MessageBody> list, Long l2, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.next_cursor = l2;
        this.has_more = bool;
    }
}
