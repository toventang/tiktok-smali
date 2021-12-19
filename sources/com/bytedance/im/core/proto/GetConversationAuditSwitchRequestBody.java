package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.RequestBody;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class GetConversationAuditSwitchRequestBody extends Message<GetConversationAuditSwitchRequestBody, Builder> {
    public static final ProtoAdapter<GetConversationAuditSwitchRequestBody> ADAPTER;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "conv_short_id")
    public final Long conv_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;

    static final class ProtoAdapter_GetConversationAuditSwitchRequestBody extends ProtoAdapter<GetConversationAuditSwitchRequestBody> {
        static {
            Covode.recordClassIndex(23423);
        }

        public ProtoAdapter_GetConversationAuditSwitchRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConversationAuditSwitchRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody redact(com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody.ProtoAdapter_GetConversationAuditSwitchRequestBody.redact(com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody):com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody");
        }

        public final int encodedSize(GetConversationAuditSwitchRequestBody getConversationAuditSwitchRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationAuditSwitchRequestBody.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationAuditSwitchRequestBody.conversation_type) + getConversationAuditSwitchRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationAuditSwitchRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, GetConversationAuditSwitchRequestBody getConversationAuditSwitchRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationAuditSwitchRequestBody.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationAuditSwitchRequestBody.conversation_type);
            protoWriter.writeBytes(getConversationAuditSwitchRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<GetConversationAuditSwitchRequestBody, Builder> {
        public Long conv_short_id;
        public Integer conversation_type;

        static {
            Covode.recordClassIndex(23422);
        }

        @Override // com.squareup.wire.Message.Builder
        public final GetConversationAuditSwitchRequestBody build() {
            return new GetConversationAuditSwitchRequestBody(this.conv_short_id, this.conversation_type, super.buildUnknownFields());
        }

        public final Builder conv_short_id(Long l2) {
            this.conv_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }
    }

    public static void registerAdapter() {
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2022, ADAPTER);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<GetConversationAuditSwitchRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conv_short_id = this.conv_short_id;
        builder.conversation_type = this.conversation_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "GetConversationAuditSwitchRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23421);
        ProtoAdapter_GetConversationAuditSwitchRequestBody protoAdapter_GetConversationAuditSwitchRequestBody = new ProtoAdapter_GetConversationAuditSwitchRequestBody();
        ADAPTER = protoAdapter_GetConversationAuditSwitchRequestBody;
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2022, protoAdapter_GetConversationAuditSwitchRequestBody);
    }

    public GetConversationAuditSwitchRequestBody(Long l2, Integer num) {
        this(l2, num, i.EMPTY);
    }

    public GetConversationAuditSwitchRequestBody(Long l2, Integer num, i iVar) {
        super(ADAPTER, iVar);
        this.conv_short_id = l2;
        this.conversation_type = num;
    }
}
