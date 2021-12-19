package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.ResponseBody;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class GetConversationAuditUnreadResponseBody extends Message<GetConversationAuditUnreadResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationAuditUnreadResponseBody> ADAPTER;
    public static final Long DEFAULT_UNREAD_COUNT = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "last_apply_info")
    public final ConversationApplyInfo last_apply_info;
    @c(a = "unread_count")
    public final Long unread_count;

    static final class ProtoAdapter_GetConversationAuditUnreadResponseBody extends ProtoAdapter<GetConversationAuditUnreadResponseBody> {
        static {
            Covode.recordClassIndex(23432);
        }

        public ProtoAdapter_GetConversationAuditUnreadResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditUnreadResponseBody.class);
        }

        public final int encodedSize(GetConversationAuditUnreadResponseBody getConversationAuditUnreadResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationAuditUnreadResponseBody.unread_count) + ConversationApplyInfo.ADAPTER.encodedSizeWithTag(2, getConversationAuditUnreadResponseBody.last_apply_info) + getConversationAuditUnreadResponseBody.unknownFields().size();
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody redact(com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = r2.last_apply_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationApplyInfo> r1 = com.bytedance.im.core.proto.ConversationApplyInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = r2.last_apply_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = (com.bytedance.im.core.proto.ConversationApplyInfo) r0
                r2.last_apply_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody.ProtoAdapter_GetConversationAuditUnreadResponseBody.redact(com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody):com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationAuditUnreadResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.unread_count(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.last_apply_info(ConversationApplyInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationAuditUnreadResponseBody getConversationAuditUnreadResponseBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationAuditUnreadResponseBody.unread_count);
            ConversationApplyInfo.ADAPTER.encodeWithTag(protoWriter, 2, getConversationAuditUnreadResponseBody.last_apply_info);
            protoWriter.writeBytes(getConversationAuditUnreadResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationAuditUnreadResponseBody, Builder> {
        public ConversationApplyInfo last_apply_info;
        public Long unread_count;

        static {
            Covode.recordClassIndex(23431);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationAuditUnreadResponseBody build() {
            return new GetConversationAuditUnreadResponseBody(this.unread_count, this.last_apply_info, super.buildUnknownFields());
        }

        public final Builder last_apply_info(ConversationApplyInfo conversationApplyInfo) {
            this.last_apply_info = conversationApplyInfo;
            return this;
        }

        public final Builder unread_count(Long l2) {
            this.unread_count = l2;
            return this;
        }
    }

    public static void registerAdapter() {
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2028, ADAPTER);
    }

    static {
        Covode.recordClassIndex(23430);
        ProtoAdapter_GetConversationAuditUnreadResponseBody protoAdapter_GetConversationAuditUnreadResponseBody = new ProtoAdapter_GetConversationAuditUnreadResponseBody();
        ADAPTER = protoAdapter_GetConversationAuditUnreadResponseBody;
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2028, protoAdapter_GetConversationAuditUnreadResponseBody);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationAuditUnreadResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationAuditUnreadResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.unread_count = this.unread_count;
        builder.last_apply_info = this.last_apply_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationAuditUnreadResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConversationAuditUnreadResponseBody(Long l2, ConversationApplyInfo conversationApplyInfo) {
        this(l2, conversationApplyInfo, i.EMPTY);
    }

    public GetConversationAuditUnreadResponseBody(Long l2, ConversationApplyInfo conversationApplyInfo, i iVar) {
        super(ADAPTER, iVar);
        this.unread_count = l2;
        this.last_apply_info = conversationApplyInfo;
    }
}
