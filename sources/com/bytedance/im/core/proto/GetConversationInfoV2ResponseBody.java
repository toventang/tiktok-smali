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

public final class GetConversationInfoV2ResponseBody extends Message<GetConversationInfoV2ResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationInfoV2ResponseBody> ADAPTER = new ProtoAdapter_GetConversationInfoV2ResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "conversation_info")
    public final ConversationInfoV2 conversation_info;

    static final class ProtoAdapter_GetConversationInfoV2ResponseBody extends ProtoAdapter<GetConversationInfoV2ResponseBody> {
        static {
            Covode.recordClassIndex(23450);
        }

        public ProtoAdapter_GetConversationInfoV2ResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationInfoV2ResponseBody.class);
        }

        public final int encodedSize(GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            return ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, getConversationInfoV2ResponseBody.conversation_info) + getConversationInfoV2ResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody redact(com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = r2.conversation_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r1 = com.bytedance.im.core.proto.ConversationInfoV2.ADAPTER
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = r2.conversation_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = (com.bytedance.im.core.proto.ConversationInfoV2) r0
                r2.conversation_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody.ProtoAdapter_GetConversationInfoV2ResponseBody.redact(com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody):com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoV2ResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_info(ConversationInfoV2.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, getConversationInfoV2ResponseBody.conversation_info);
            protoWriter.writeBytes(getConversationInfoV2ResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationInfoV2ResponseBody, Builder> {
        public ConversationInfoV2 conversation_info;

        static {
            Covode.recordClassIndex(23449);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationInfoV2ResponseBody build() {
            return new GetConversationInfoV2ResponseBody(this.conversation_info, super.buildUnknownFields());
        }

        public final Builder conversation_info(ConversationInfoV2 conversationInfoV2) {
            this.conversation_info = conversationInfoV2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23448);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationInfoV2ResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_info = this.conversation_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationInfoV2ResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConversationInfoV2ResponseBody(ConversationInfoV2 conversationInfoV2) {
        this(conversationInfoV2, i.EMPTY);
    }

    public GetConversationInfoV2ResponseBody(ConversationInfoV2 conversationInfoV2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_info = conversationInfoV2;
    }
}
