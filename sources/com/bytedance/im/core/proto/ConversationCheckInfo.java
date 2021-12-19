package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class ConversationCheckInfo extends Message<ConversationCheckInfo, Builder> {
    public static final ProtoAdapter<ConversationCheckInfo> ADAPTER = new ProtoAdapter_ConversationCheckInfo();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;

    static final class ProtoAdapter_ConversationCheckInfo extends ProtoAdapter<ConversationCheckInfo> {
        static {
            Covode.recordClassIndex(23298);
        }

        public ProtoAdapter_ConversationCheckInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationCheckInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.ConversationCheckInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationCheckInfo redact(com.bytedance.im.core.proto.ConversationCheckInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationCheckInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationCheckInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationCheckInfo.ProtoAdapter_ConversationCheckInfo.redact(com.bytedance.im.core.proto.ConversationCheckInfo):com.bytedance.im.core.proto.ConversationCheckInfo");
        }

        public final int encodedSize(ConversationCheckInfo conversationCheckInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationCheckInfo.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, conversationCheckInfo.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationCheckInfo.conversation_type) + conversationCheckInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationCheckInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationCheckInfo conversationCheckInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationCheckInfo.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, conversationCheckInfo.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationCheckInfo.conversation_type);
            protoWriter.writeBytes(conversationCheckInfo.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<ConversationCheckInfo, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(23297);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationCheckInfo build() {
            return new ConversationCheckInfo(this.conversation_short_id, this.conversation_id, this.conversation_type, super.buildUnknownFields());
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23296);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationCheckInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationCheckInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationCheckInfo" + h.f38770a.b(this).toString();
    }

    public ConversationCheckInfo(Long l2, String str, Integer num) {
        this(l2, str, num, i.EMPTY);
    }

    public ConversationCheckInfo(Long l2, String str, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_short_id = l2;
        this.conversation_id = str;
        this.conversation_type = num;
    }
}
