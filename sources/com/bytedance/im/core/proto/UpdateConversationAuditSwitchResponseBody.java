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

public final class UpdateConversationAuditSwitchResponseBody extends Message<UpdateConversationAuditSwitchResponseBody, Builder> {
    public static final ProtoAdapter<UpdateConversationAuditSwitchResponseBody> ADAPTER;
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Boolean DEFAULT_SWITCH_STATUS = false;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "status")
    public final Integer status;
    @c(a = "switch_status")
    public final Boolean switch_status;

    static final class ProtoAdapter_UpdateConversationAuditSwitchResponseBody extends ProtoAdapter<UpdateConversationAuditSwitchResponseBody> {
        static {
            Covode.recordClassIndex(23800);
        }

        public ProtoAdapter_UpdateConversationAuditSwitchResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateConversationAuditSwitchResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody redact(com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody.ProtoAdapter_UpdateConversationAuditSwitchResponseBody.redact(com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody):com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody");
        }

        public final int encodedSize(UpdateConversationAuditSwitchResponseBody updateConversationAuditSwitchResponseBody) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, updateConversationAuditSwitchResponseBody.switch_status) + ProtoAdapter.INT32.encodedSizeWithTag(2, updateConversationAuditSwitchResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, updateConversationAuditSwitchResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, updateConversationAuditSwitchResponseBody.check_message) + updateConversationAuditSwitchResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationAuditSwitchResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.switch_status(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, UpdateConversationAuditSwitchResponseBody updateConversationAuditSwitchResponseBody) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, updateConversationAuditSwitchResponseBody.switch_status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, updateConversationAuditSwitchResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, updateConversationAuditSwitchResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, updateConversationAuditSwitchResponseBody.check_message);
            protoWriter.writeBytes(updateConversationAuditSwitchResponseBody.unknownFields());
        }
    }

    public static void registerAdapter() {
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2023, ADAPTER);
    }

    public static final class Builder extends Message.Builder<UpdateConversationAuditSwitchResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public Integer status;
        public Boolean switch_status;

        static {
            Covode.recordClassIndex(23799);
        }

        @Override // com.squareup.wire.Message.Builder
        public final UpdateConversationAuditSwitchResponseBody build() {
            return new UpdateConversationAuditSwitchResponseBody(this.switch_status, this.status, this.check_code, this.check_message, super.buildUnknownFields());
        }

        public final Builder check_code(Long l2) {
            this.check_code = l2;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder switch_status(Boolean bool) {
            this.switch_status = bool;
            return this;
        }
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<UpdateConversationAuditSwitchResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.switch_status = this.switch_status;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "UpdateConversationAuditSwitchResponseBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23798);
        ProtoAdapter_UpdateConversationAuditSwitchResponseBody protoAdapter_UpdateConversationAuditSwitchResponseBody = new ProtoAdapter_UpdateConversationAuditSwitchResponseBody();
        ADAPTER = protoAdapter_UpdateConversationAuditSwitchResponseBody;
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2023, protoAdapter_UpdateConversationAuditSwitchResponseBody);
    }

    public UpdateConversationAuditSwitchResponseBody(Boolean bool, Integer num, Long l2, String str) {
        this(bool, num, l2, str, i.EMPTY);
    }

    public UpdateConversationAuditSwitchResponseBody(Boolean bool, Integer num, Long l2, String str, i iVar) {
        super(ADAPTER, iVar);
        this.switch_status = bool;
        this.status = num;
        this.check_code = l2;
        this.check_message = str;
    }
}
