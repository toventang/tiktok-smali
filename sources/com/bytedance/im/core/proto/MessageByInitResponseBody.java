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

public final class MessageByInitResponseBody extends Message<MessageByInitResponseBody, Builder> {
    public static final ProtoAdapter<MessageByInitResponseBody> ADAPTER = new ProtoAdapter_MessageByInitResponseBody();
    public static final Long DEFAULT_CMD_INDEX = 0L;
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Long DEFAULT_NEXT_INIT_VERSION = 0L;
    public static final Long DEFAULT_USER_CURSOR = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "cmd_index")
    public final Long cmd_index;
    @c(a = "has_more")
    public final Boolean has_more;
    @c(a = "messages")
    public final List<ConversationMessage> messages;
    @c(a = "next_init_version")
    public final Long next_init_version;
    @c(a = "user_cursor")
    public final Long user_cursor;
    @c(a = "version")
    public final Long version;

    static final class ProtoAdapter_MessageByInitResponseBody extends ProtoAdapter<MessageByInitResponseBody> {
        static {
            Covode.recordClassIndex(23592);
        }

        public ProtoAdapter_MessageByInitResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageByInitResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.MessageByInitResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.MessageByInitResponseBody redact(com.bytedance.im.core.proto.MessageByInitResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.MessageByInitResponseBody$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.ConversationMessage> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationMessage> r0 = com.bytedance.im.core.proto.ConversationMessage.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.MessageByInitResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.MessageByInitResponseBody.ProtoAdapter_MessageByInitResponseBody.redact(com.bytedance.im.core.proto.MessageByInitResponseBody):com.bytedance.im.core.proto.MessageByInitResponseBody");
        }

        public final int encodedSize(MessageByInitResponseBody messageByInitResponseBody) {
            return ConversationMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, messageByInitResponseBody.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(2, messageByInitResponseBody.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, messageByInitResponseBody.next_init_version) + ProtoAdapter.INT64.encodedSizeWithTag(4, messageByInitResponseBody.version) + ProtoAdapter.INT64.encodedSizeWithTag(5, messageByInitResponseBody.user_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(6, messageByInitResponseBody.cmd_index) + messageByInitResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageByInitResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.messages.add(ConversationMessage.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.next_init_version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.user_cursor(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.cmd_index(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MessageByInitResponseBody messageByInitResponseBody) {
            ConversationMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messageByInitResponseBody.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, messageByInitResponseBody.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messageByInitResponseBody.next_init_version);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, messageByInitResponseBody.version);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, messageByInitResponseBody.user_cursor);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, messageByInitResponseBody.cmd_index);
            protoWriter.writeBytes(messageByInitResponseBody.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "MessageByInitResponseBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<MessageByInitResponseBody, Builder> {
        public Long cmd_index;
        public Boolean has_more;
        public List<ConversationMessage> messages = Internal.newMutableList();
        public Long next_init_version;
        public Long user_cursor;
        public Long version;

        static {
            Covode.recordClassIndex(23591);
        }

        @Override // com.squareup.wire.Message.Builder
        public final MessageByInitResponseBody build() {
            Boolean bool = this.has_more;
            if (bool != null && this.next_init_version != null) {
                return new MessageByInitResponseBody(this.messages, this.has_more, this.next_init_version, this.version, this.user_cursor, this.cmd_index, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "has_more", this.next_init_version, "next_init_version");
        }

        public final Builder cmd_index(Long l2) {
            this.cmd_index = l2;
            return this;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder next_init_version(Long l2) {
            this.next_init_version = l2;
            return this;
        }

        public final Builder user_cursor(Long l2) {
            this.user_cursor = l2;
            return this;
        }

        public final Builder version(Long l2) {
            this.version = l2;
            return this;
        }

        public final Builder messages(List<ConversationMessage> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23590);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.MessageByInitResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<MessageByInitResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.has_more = this.has_more;
        builder.next_init_version = this.next_init_version;
        builder.version = this.version;
        builder.user_cursor = this.user_cursor;
        builder.cmd_index = this.cmd_index;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public MessageByInitResponseBody(List<ConversationMessage> list, Boolean bool, Long l2, Long l3, Long l4, Long l5) {
        this(list, bool, l2, l3, l4, l5, i.EMPTY);
    }

    public MessageByInitResponseBody(List<ConversationMessage> list, Boolean bool, Long l2, Long l3, Long l4, Long l5, i iVar) {
        super(ADAPTER, iVar);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.has_more = bool;
        this.next_init_version = l2;
        this.version = l3;
        this.user_cursor = l4;
        this.cmd_index = l5;
    }
}
