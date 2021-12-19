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

public final class GetConversationAuditSwitchResponseBody extends Message<GetConversationAuditSwitchResponseBody, Builder> {
    public static final ProtoAdapter<GetConversationAuditSwitchResponseBody> ADAPTER;
    public static final Boolean DEFAULT_SWITCH_STATUS = false;
    private static final long serialVersionUID = 0;
    @c(a = "switch_status")
    public final Boolean switch_status;

    static final class ProtoAdapter_GetConversationAuditSwitchResponseBody extends ProtoAdapter<GetConversationAuditSwitchResponseBody> {
        static {
            Covode.recordClassIndex(23426);
        }

        public ProtoAdapter_GetConversationAuditSwitchResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditSwitchResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody redact(com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody.ProtoAdapter_GetConversationAuditSwitchResponseBody.redact(com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody):com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody");
        }

        public final int encodedSize(GetConversationAuditSwitchResponseBody getConversationAuditSwitchResponseBody) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, getConversationAuditSwitchResponseBody.switch_status) + getConversationAuditSwitchResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationAuditSwitchResponseBody decode(ProtoReader protoReader) {
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
                    builder.switch_status(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationAuditSwitchResponseBody getConversationAuditSwitchResponseBody) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, getConversationAuditSwitchResponseBody.switch_status);
            protoWriter.writeBytes(getConversationAuditSwitchResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationAuditSwitchResponseBody, Builder> {
        public Boolean switch_status;

        static {
            Covode.recordClassIndex(23425);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationAuditSwitchResponseBody build() {
            return new GetConversationAuditSwitchResponseBody(this.switch_status, super.buildUnknownFields());
        }

        public final Builder switch_status(Boolean bool) {
            this.switch_status = bool;
            return this;
        }
    }

    public static void registerAdapter() {
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2022, ADAPTER);
    }

    static {
        Covode.recordClassIndex(23424);
        ProtoAdapter_GetConversationAuditSwitchResponseBody protoAdapter_GetConversationAuditSwitchResponseBody = new ProtoAdapter_GetConversationAuditSwitchResponseBody();
        ADAPTER = protoAdapter_GetConversationAuditSwitchResponseBody;
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2022, protoAdapter_GetConversationAuditSwitchResponseBody);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationAuditSwitchResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.switch_status = this.switch_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationAuditSwitchResponseBody" + h.f38770a.b(this).toString();
    }

    public GetConversationAuditSwitchResponseBody(Boolean bool) {
        this(bool, i.EMPTY);
    }

    public GetConversationAuditSwitchResponseBody(Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.switch_status = bool;
    }
}
