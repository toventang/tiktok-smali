package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.a.c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import k.i;

public final class SendMessageResponseBody extends Message<SendMessageResponseBody, Builder> {
    public static final ProtoAdapter<SendMessageResponseBody> ADAPTER = new ProtoAdapter_SendMessageResponseBody();
    public static final Long DEFAULT_CHECK_CODE = 0L;
    public static final Boolean DEFAULT_IS_ASYNC_SEND = false;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    private static final long serialVersionUID = 0;
    @c(a = "check_code")
    public final Long check_code;
    @c(a = "check_message")
    public final String check_message;
    @c(a = "client_message_id")
    public final String client_message_id;
    @c(a = "conversation")
    public final ConversationInfoV2 conversation;
    @c(a = "extra_info")
    public final String extra_info;
    @c(a = "filtered_content")
    public final String filtered_content;
    @c(a = "is_async_send")
    public final Boolean is_async_send;
    @c(a = "new_ticket")
    public final String new_ticket;
    @c(a = "server_message_id")
    public final Long server_message_id;
    @c(a = "status")
    public final Integer status;

    static final class ProtoAdapter_SendMessageResponseBody extends ProtoAdapter<SendMessageResponseBody> {
        static {
            Covode.recordClassIndex(23752);
        }

        public ProtoAdapter_SendMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMessageResponseBody.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.SendMessageResponseBody$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.SendMessageResponseBody redact(com.bytedance.im.core.proto.SendMessageResponseBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.SendMessageResponseBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = r2.conversation
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ConversationInfoV2> r1 = com.bytedance.im.core.proto.ConversationInfoV2.ADAPTER
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = r2.conversation
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ConversationInfoV2 r0 = (com.bytedance.im.core.proto.ConversationInfoV2) r0
                r2.conversation = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.SendMessageResponseBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.SendMessageResponseBody.ProtoAdapter_SendMessageResponseBody.redact(com.bytedance.im.core.proto.SendMessageResponseBody):com.bytedance.im.core.proto.SendMessageResponseBody");
        }

        public final int encodedSize(SendMessageResponseBody sendMessageResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, sendMessageResponseBody.server_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, sendMessageResponseBody.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(3, sendMessageResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(4, sendMessageResponseBody.client_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, sendMessageResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, sendMessageResponseBody.check_message) + ProtoAdapter.STRING.encodedSizeWithTag(7, sendMessageResponseBody.filtered_content) + ProtoAdapter.BOOL.encodedSizeWithTag(8, sendMessageResponseBody.is_async_send) + ProtoAdapter.STRING.encodedSizeWithTag(9, sendMessageResponseBody.new_ticket) + ConversationInfoV2.ADAPTER.encodedSizeWithTag(10, sendMessageResponseBody.conversation) + sendMessageResponseBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendMessageResponseBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.server_message_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.extra_info(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.status(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.client_message_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.check_code(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.check_message(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.filtered_content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.is_async_send(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.new_ticket(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.conversation(ConversationInfoV2.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SendMessageResponseBody sendMessageResponseBody) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, sendMessageResponseBody.server_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendMessageResponseBody.extra_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sendMessageResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sendMessageResponseBody.client_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, sendMessageResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, sendMessageResponseBody.check_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, sendMessageResponseBody.filtered_content);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, sendMessageResponseBody.is_async_send);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, sendMessageResponseBody.new_ticket);
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 10, sendMessageResponseBody.conversation);
            protoWriter.writeBytes(sendMessageResponseBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SendMessageResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String client_message_id;
        public ConversationInfoV2 conversation;
        public String extra_info;
        public String filtered_content;
        public Boolean is_async_send;
        public String new_ticket;
        public Long server_message_id;
        public Integer status;

        static {
            Covode.recordClassIndex(23751);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SendMessageResponseBody build() {
            return new SendMessageResponseBody(this.server_message_id, this.extra_info, this.status, this.client_message_id, this.check_code, this.check_message, this.filtered_content, this.is_async_send, this.new_ticket, this.conversation, super.buildUnknownFields());
        }

        public final Builder check_code(Long l2) {
            this.check_code = l2;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
        }

        public final Builder conversation(ConversationInfoV2 conversationInfoV2) {
            this.conversation = conversationInfoV2;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder filtered_content(String str) {
            this.filtered_content = str;
            return this;
        }

        public final Builder is_async_send(Boolean bool) {
            this.is_async_send = bool;
            return this;
        }

        public final Builder new_ticket(String str) {
            this.new_ticket = str;
            return this;
        }

        public final Builder server_message_id(Long l2) {
            this.server_message_id = l2;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SendMessageResponseBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23750);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SendMessageResponseBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SendMessageResponseBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.server_message_id = this.server_message_id;
        builder.extra_info = this.extra_info;
        builder.status = this.status;
        builder.client_message_id = this.client_message_id;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.filtered_content = this.filtered_content;
        builder.is_async_send = this.is_async_send;
        builder.new_ticket = this.new_ticket;
        builder.conversation = this.conversation;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SendMessageResponseBody(Long l2, String str, Integer num, String str2, Long l3, String str3, String str4, Boolean bool, String str5, ConversationInfoV2 conversationInfoV2) {
        this(l2, str, num, str2, l3, str3, str4, bool, str5, conversationInfoV2, i.EMPTY);
    }

    public SendMessageResponseBody(Long l2, String str, Integer num, String str2, Long l3, String str3, String str4, Boolean bool, String str5, ConversationInfoV2 conversationInfoV2, i iVar) {
        super(ADAPTER, iVar);
        this.server_message_id = l2;
        this.extra_info = str;
        this.status = num;
        this.client_message_id = str2;
        this.check_code = l3;
        this.check_message = str3;
        this.filtered_content = str4;
        this.is_async_send = bool;
        this.new_ticket = str5;
        this.conversation = conversationInfoV2;
    }
}
