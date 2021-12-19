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

public final class ConversationRecentMessage extends Message<ConversationRecentMessage, Builder> {
    public static final ProtoAdapter<ConversationRecentMessage> ADAPTER = new ProtoAdapter_ConversationRecentMessage();
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "badge_count")
    public final Integer badge_count;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "ext_messages")
    public final List<MessageBody> ext_messages;
    @c(a = "messages")
    public final List<MessageBody> messages;
    @c(a = "version")
    public final Long version;

    static final class ProtoAdapter_ConversationRecentMessage extends ProtoAdapter<ConversationRecentMessage> {
        static {
            Covode.recordClassIndex(23336);
        }

        public ProtoAdapter_ConversationRecentMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationRecentMessage.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ConversationRecentMessage$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationRecentMessage redact(com.bytedance.im.core.proto.ConversationRecentMessage r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ConversationRecentMessage$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                java.util.List<com.bytedance.im.core.proto.MessageBody> r1 = r2.ext_messages
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.MessageBody> r0 = com.bytedance.im.core.proto.MessageBody.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationRecentMessage r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationRecentMessage.ProtoAdapter_ConversationRecentMessage.redact(com.bytedance.im.core.proto.ConversationRecentMessage):com.bytedance.im.core.proto.ConversationRecentMessage");
        }

        public final int encodedSize(ConversationRecentMessage conversationRecentMessage) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationRecentMessage.conversation_short_id) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(2, conversationRecentMessage.messages) + ProtoAdapter.INT64.encodedSizeWithTag(3, conversationRecentMessage.version) + ProtoAdapter.INT32.encodedSizeWithTag(4, conversationRecentMessage.badge_count) + ProtoAdapter.STRING.encodedSizeWithTag(5, conversationRecentMessage.conversation_id) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(6, conversationRecentMessage.ext_messages) + conversationRecentMessage.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationRecentMessage decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.messages.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.version(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.badge_count(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.ext_messages.add(MessageBody.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationRecentMessage conversationRecentMessage) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationRecentMessage.conversation_short_id);
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, conversationRecentMessage.messages);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, conversationRecentMessage.version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, conversationRecentMessage.badge_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, conversationRecentMessage.conversation_id);
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, conversationRecentMessage.ext_messages);
            protoWriter.writeBytes(conversationRecentMessage.unknownFields());
        }
    }

    static {
        Covode.recordClassIndex(23334);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationRecentMessage" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationRecentMessage$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationRecentMessage, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.messages = Internal.copyOf("messages", this.messages);
        builder.version = this.version;
        builder.badge_count = this.badge_count;
        builder.conversation_id = this.conversation_id;
        builder.ext_messages = Internal.copyOf("ext_messages", this.ext_messages);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public static final class Builder extends Message.Builder<ConversationRecentMessage, Builder> {
        public Integer badge_count;
        public String conversation_id;
        public Long conversation_short_id;
        public List<MessageBody> ext_messages = Internal.newMutableList();
        public List<MessageBody> messages = Internal.newMutableList();
        public Long version;

        static {
            Covode.recordClassIndex(23335);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationRecentMessage build() {
            Long l2 = this.conversation_short_id;
            if (l2 != null && this.version != null && this.conversation_id != null) {
                return new ConversationRecentMessage(this.conversation_short_id, this.messages, this.version, this.badge_count, this.conversation_id, this.ext_messages, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(l2, "conversation_short_id", this.version, "version", this.conversation_id, "conversation_id");
        }

        public final Builder badge_count(Integer num) {
            this.badge_count = num;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder version(Long l2) {
            this.version = l2;
            return this;
        }

        public final Builder ext_messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.ext_messages = list;
            return this;
        }

        public final Builder messages(List<MessageBody> list) {
            Internal.checkElementsNotNull(list);
            this.messages = list;
            return this;
        }
    }

    public ConversationRecentMessage(Long l2, List<MessageBody> list, Long l3, Integer num, String str, List<MessageBody> list2) {
        this(l2, list, l3, num, str, list2, i.EMPTY);
    }

    public ConversationRecentMessage(Long l2, List<MessageBody> list, Long l3, Integer num, String str, List<MessageBody> list2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l2;
        this.messages = Internal.immutableCopyOf("messages", list);
        this.version = l3;
        this.badge_count = num;
        this.conversation_id = str;
        this.ext_messages = Internal.immutableCopyOf("ext_messages", list2);
    }
}
