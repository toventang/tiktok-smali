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

public final class GetConversationApplyResponseBody extends Message<GetConversationApplyResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationApplyResponseBody> ADAPTER = new ProtoAdapter_GetConversationApplyResponseBody();
    private static final long serialVersionUID = 0;
    @c(a = "apply_info")
    public final ConversationApplyInfo apply_info;

    static final class ProtoAdapter_GetConversationApplyResponseBody extends ProtoAdapter<GetConversationApplyResponseBody> {
        static {
            Covode.recordClassIndex(23414);
        }

        public ProtoAdapter_GetConversationApplyResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationApplyResponseBody.class);
        }

        public final int encodedSize(GetConversationApplyResponseBody getConversationApplyResponseBody) {
            return ConversationApplyInfo.ADAPTER.encodedSizeWithTag(1, getConversationApplyResponseBody.apply_info) + getConversationApplyResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationApplyResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationApplyResponseBody redact(com.bytedance.im.core.proto.GetConversationApplyResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationApplyResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = r2.apply_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationApplyInfo> r1 = com.bytedance.im.core.proto.ConversationApplyInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = r2.apply_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = (com.bytedance.im.core.proto.ConversationApplyInfo) r0
                r2.apply_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationApplyResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationApplyResponseBody.ProtoAdapter_GetConversationApplyResponseBody.redact(com.bytedance.im.core.proto.GetConversationApplyResponseBody):com.bytedance.im.core.proto.GetConversationApplyResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationApplyResponseBody decode(ProtoReader protoReader) {
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
                    builder.apply_info(ConversationApplyInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationApplyResponseBody getConversationApplyResponseBody) {
            ConversationApplyInfo.ADAPTER.encodeWithTag(protoWriter, 1, getConversationApplyResponseBody.apply_info);
            protoWriter.writeBytes(getConversationApplyResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationApplyResponseBody, Builder> {
        public ConversationApplyInfo apply_info;

        static {
            Covode.recordClassIndex(23413);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationApplyResponseBody build() {
            return new GetConversationApplyResponseBody(this.apply_info, super.buildUnknownFields());
        }

        public final Builder apply_info(ConversationApplyInfo conversationApplyInfo) {
            this.apply_info = conversationApplyInfo;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23412);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationApplyResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationApplyResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.apply_info = this.apply_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationApplyResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConversationApplyResponseBody(ConversationApplyInfo conversationApplyInfo) {
        this(conversationApplyInfo, i.EMPTY);
    }

    public GetConversationApplyResponseBody(ConversationApplyInfo conversationApplyInfo, i iVar) {
        super(ADAPTER, iVar);
        this.apply_info = conversationApplyInfo;
    }
}
