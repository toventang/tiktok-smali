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

public final class AckConversationApplyResponseBody extends Message<AckConversationApplyResponseBody, Builder> {
    public static final ProtoAdapter<AckConversationApplyResponseBody> ADAPTER;
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @c(a = "apply_info")
    public final ConversationApplyInfo apply_info;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "status")
    public final Integer status;

    static final class ProtoAdapter_AckConversationApplyResponseBody extends ProtoAdapter<AckConversationApplyResponseBody> {
        static {
            Covode.recordClassIndex(23182);
        }

        public ProtoAdapter_AckConversationApplyResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, AckConversationApplyResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.AckConversationApplyResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.AckConversationApplyResponseBody redact(com.bytedance.im.core.proto.AckConversationApplyResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.AckConversationApplyResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = r2.apply_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationApplyInfo> r1 = com.bytedance.im.core.proto.ConversationApplyInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = r2.apply_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = (com.bytedance.im.core.proto.ConversationApplyInfo) r0
                r2.apply_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.AckConversationApplyResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.AckConversationApplyResponseBody.ProtoAdapter_AckConversationApplyResponseBody.redact(com.bytedance.im.core.proto.AckConversationApplyResponseBody):com.bytedance.im.core.proto.AckConversationApplyResponseBody");
        }

        public final int encodedSize(AckConversationApplyResponseBody ackConversationApplyResponseBody) {
            return ConversationApplyInfo.ADAPTER.encodedSizeWithTag(1, ackConversationApplyResponseBody.apply_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, ackConversationApplyResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, ackConversationApplyResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, ackConversationApplyResponseBody.check_message) + ackConversationApplyResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AckConversationApplyResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.apply_info(ConversationApplyInfo.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AckConversationApplyResponseBody ackConversationApplyResponseBody) {
            ConversationApplyInfo.ADAPTER.encodeWithTag(protoWriter, 1, ackConversationApplyResponseBody.apply_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, ackConversationApplyResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, ackConversationApplyResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ackConversationApplyResponseBody.check_message);
            protoWriter.writeBytes(ackConversationApplyResponseBody.unknownFields());
        }
    }

    public static void registerAdapter() {
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2025, ADAPTER);
    }

    public static final class Builder extends Message.Builder<AckConversationApplyResponseBody, Builder> {
        public ConversationApplyInfo apply_info;
        public Long check_code;
        public String check_message;
        public Integer status;

        static {
            Covode.recordClassIndex(23181);
        }

        @Override // com.squareup.wire.Message.Builder
        public final AckConversationApplyResponseBody build() {
            return new AckConversationApplyResponseBody(this.apply_info, this.status, this.check_code, this.check_message, super.buildUnknownFields());
        }

        public final Builder apply_info(ConversationApplyInfo conversationApplyInfo) {
            this.apply_info = conversationApplyInfo;
            return this;
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
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.AckConversationApplyResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<AckConversationApplyResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.apply_info = this.apply_info;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "AckConversationApplyResponseBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23180);
        ProtoAdapter_AckConversationApplyResponseBody protoAdapter_AckConversationApplyResponseBody = new ProtoAdapter_AckConversationApplyResponseBody();
        ADAPTER = protoAdapter_AckConversationApplyResponseBody;
        ResponseBody.ProtoAdapter_ResponseBody.adapterMap.put(2025, protoAdapter_AckConversationApplyResponseBody);
    }

    public AckConversationApplyResponseBody(ConversationApplyInfo conversationApplyInfo, Integer num, Long l2, String str) {
        this(conversationApplyInfo, num, l2, str, i.EMPTY);
    }

    public AckConversationApplyResponseBody(ConversationApplyInfo conversationApplyInfo, Integer num, Long l2, String str, i iVar) {
        super(ADAPTER, iVar);
        this.apply_info = conversationApplyInfo;
        this.status = num;
        this.check_code = l2;
        this.check_message = str;
    }
}
