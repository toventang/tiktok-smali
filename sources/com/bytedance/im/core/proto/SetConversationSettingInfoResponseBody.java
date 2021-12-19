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

public final class SetConversationSettingInfoResponseBody extends Message<SetConversationSettingInfoResponseBody, Builder> {
    public static final ProtoAdapter<SetConversationSettingInfoResponseBody> ADAPTER = new ProtoAdapter_SetConversationSettingInfoResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "extra_info")
    public final String extra_info;
    @c(a = "setting_info")
    public final ConversationSettingInfo setting_info;
    @c(a = "status")
    public final Integer status;

    static final class ProtoAdapter_SetConversationSettingInfoResponseBody extends ProtoAdapter<SetConversationSettingInfoResponseBody> {
        static {
            Covode.recordClassIndex(23774);
        }

        public ProtoAdapter_SetConversationSettingInfoResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SetConversationSettingInfoResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody redact(com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = r2.setting_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationSettingInfo> r1 = com.bytedance.im.core.proto.ConversationSettingInfo.ADAPTER
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = r2.setting_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationSettingInfo r0 = (com.bytedance.im.core.proto.ConversationSettingInfo) r0
                r2.setting_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody.ProtoAdapter_SetConversationSettingInfoResponseBody.redact(com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody):com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody");
        }

        public final int encodedSize(SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
            return ConversationSettingInfo.ADAPTER.encodedSizeWithTag(1, setConversationSettingInfoResponseBody.setting_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, setConversationSettingInfoResponseBody.status) + ProtoAdapter.INT64.encodedSizeWithTag(3, setConversationSettingInfoResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(4, setConversationSettingInfoResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(5, setConversationSettingInfoResponseBody.extra_info) + setConversationSettingInfoResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SetConversationSettingInfoResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.setting_info(ConversationSettingInfo.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.status(ProtoAdapter.INT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SetConversationSettingInfoResponseBody setConversationSettingInfoResponseBody) {
            ConversationSettingInfo.ADAPTER.encodeWithTag(protoWriter, 1, setConversationSettingInfoResponseBody.setting_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, setConversationSettingInfoResponseBody.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, setConversationSettingInfoResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, setConversationSettingInfoResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, setConversationSettingInfoResponseBody.extra_info);
            protoWriter.writeBytes(setConversationSettingInfoResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SetConversationSettingInfoResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public ConversationSettingInfo setting_info;
        public Integer status;

        static {
            Covode.recordClassIndex(23773);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SetConversationSettingInfoResponseBody build() {
            return new SetConversationSettingInfoResponseBody(this.setting_info, this.status, this.check_code, this.check_message, this.extra_info, super.buildUnknownFields());
        }

        public final Builder check_code(Long l2) {
            this.check_code = l2;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder setting_info(ConversationSettingInfo conversationSettingInfo) {
            this.setting_info = conversationSettingInfo;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23772);
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SetConversationSettingInfoResponseBody" + h.f38770a.b(this).toString();
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SetConversationSettingInfoResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.setting_info = this.setting_info;
        builder.status = this.status;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.extra_info = this.extra_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SetConversationSettingInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l2, String str, String str2) {
        this(conversationSettingInfo, num, l2, str, str2, i.EMPTY);
    }

    public SetConversationSettingInfoResponseBody(ConversationSettingInfo conversationSettingInfo, Integer num, Long l2, String str, String str2, i iVar) {
        super(ADAPTER, iVar);
        this.setting_info = conversationSettingInfo;
        this.status = num;
        this.check_code = l2;
        this.check_message = str;
        this.extra_info = str2;
    }
}
