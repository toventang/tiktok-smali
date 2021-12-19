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

public final class UpdateConversationAuditSwitchRequestBody extends Message<UpdateConversationAuditSwitchRequestBody, Builder> {
    public static final ProtoAdapter<UpdateConversationAuditSwitchRequestBody> ADAPTER;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Boolean DEFAULT_SWITCH_STATUS = false;
    private static final long serialVersionUID = 0;
    @c(a = "conv_short_id")
    public final Long conv_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "switch_status")
    public final Boolean switch_status;

    static final class ProtoAdapter_UpdateConversationAuditSwitchRequestBody extends ProtoAdapter<UpdateConversationAuditSwitchRequestBody> {
        static {
            Covode.recordClassIndex(23797);
        }

        public ProtoAdapter_UpdateConversationAuditSwitchRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationAuditSwitchRequestBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody redact(com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody.ProtoAdapter_UpdateConversationAuditSwitchRequestBody.redact(com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody):com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody");
        }

        public final int encodedSize(UpdateConversationAuditSwitchRequestBody updateConversationAuditSwitchRequestBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, updateConversationAuditSwitchRequestBody.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationAuditSwitchRequestBody.conversation_type) + ProtoAdapter.BOOL.encodedSizeWithTag(3, updateConversationAuditSwitchRequestBody.switch_status) + updateConversationAuditSwitchRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationAuditSwitchRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.switch_status(ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UpdateConversationAuditSwitchRequestBody updateConversationAuditSwitchRequestBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, updateConversationAuditSwitchRequestBody.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationAuditSwitchRequestBody.conversation_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, updateConversationAuditSwitchRequestBody.switch_status);
            protoWriter.writeBytes(updateConversationAuditSwitchRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<UpdateConversationAuditSwitchRequestBody, Builder> {
        public Long conv_short_id;
        public Integer conversation_type;
        public Boolean switch_status;

        static {
            Covode.recordClassIndex(23796);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpdateConversationAuditSwitchRequestBody build() {
            return new UpdateConversationAuditSwitchRequestBody(this.conv_short_id, this.conversation_type, this.switch_status, super.buildUnknownFields());
        }

        public final Builder conv_short_id(Long l2) {
            this.conv_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder switch_status(Boolean bool) {
            this.switch_status = bool;
            return this;
        }
    }

    public static void registerAdapter() {
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2023, ADAPTER);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpdateConversationAuditSwitchRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conv_short_id = this.conv_short_id;
        builder.conversation_type = this.conversation_type;
        builder.switch_status = this.switch_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UpdateConversationAuditSwitchRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23795);
        ProtoAdapter_UpdateConversationAuditSwitchRequestBody protoAdapter_UpdateConversationAuditSwitchRequestBody = new ProtoAdapter_UpdateConversationAuditSwitchRequestBody();
        ADAPTER = protoAdapter_UpdateConversationAuditSwitchRequestBody;
        RequestBody.ProtoAdapter_RequestBody.adapterMap.put(2023, protoAdapter_UpdateConversationAuditSwitchRequestBody);
    }

    public UpdateConversationAuditSwitchRequestBody(Long l2, Integer num, Boolean bool) {
        this(l2, num, bool, i.EMPTY);
    }

    public UpdateConversationAuditSwitchRequestBody(Long l2, Integer num, Boolean bool, i iVar) {
        super(ADAPTER, iVar);
        this.conv_short_id = l2;
        this.conversation_type = num;
        this.switch_status = bool;
    }
}
