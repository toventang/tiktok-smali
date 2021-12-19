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
import com.squareup.wire.internal.Internal;
import java.util.List;
import java.util.Map;
import k.i;

public final class SendMessageP2PRequestBody extends Message<SendMessageP2PRequestBody, Builder> {
    public static final ProtoAdapter<SendMessageP2PRequestBody> ADAPTER = new ProtoAdapter_SendMessageP2PRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final SendType DEFAULT_SEND_TYPE = SendType.BY_CONVERSATION;
    private static final long serialVersionUID = 0;
    @c(a = "client_message_id")
    public final String client_message_id;
    @c(a = "content")
    public final String content;
    @c(a = "conversation_id")
    public final String conversation_id;
    @c(a = "conversation_short_id")
    public final Long conversation_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "invisible_user")
    public final List<Long> invisible_user;
    @c(a = "message_type")
    public final Integer message_type;
    @c(a = "send_type")
    public final SendType send_type;
    @c(a = "visible_user")
    public final List<Long> visible_user;

    static final class ProtoAdapter_SendMessageP2PRequestBody extends ProtoAdapter<SendMessageP2PRequestBody> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23746);
        }

        public ProtoAdapter_SendMessageP2PRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMessageP2PRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.SendMessageP2PRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.SendMessageP2PRequestBody redact(com.bytedance.im.core.proto.SendMessageP2PRequestBody r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.SendMessageP2PRequestBody$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.SendMessageP2PRequestBody r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.SendMessageP2PRequestBody.ProtoAdapter_SendMessageP2PRequestBody.redact(com.bytedance.im.core.proto.SendMessageP2PRequestBody):com.bytedance.im.core.proto.SendMessageP2PRequestBody");
        }

        public final int encodedSize(SendMessageP2PRequestBody sendMessageP2PRequestBody) {
            return SendType.ADAPTER.encodedSizeWithTag(1, sendMessageP2PRequestBody.send_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, sendMessageP2PRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, sendMessageP2PRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(4, sendMessageP2PRequestBody.conversation_short_id) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(5, sendMessageP2PRequestBody.visible_user) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(6, sendMessageP2PRequestBody.invisible_user) + ProtoAdapter.INT32.encodedSizeWithTag(7, sendMessageP2PRequestBody.message_type) + ProtoAdapter.STRING.encodedSizeWithTag(8, sendMessageP2PRequestBody.content) + this.ext.encodedSizeWithTag(9, sendMessageP2PRequestBody.ext) + ProtoAdapter.STRING.encodedSizeWithTag(10, sendMessageP2PRequestBody.client_message_id) + sendMessageP2PRequestBody.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendMessageP2PRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                builder.send_type(SendType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 2:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.visible_user.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.invisible_user.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.message_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.client_message_id(ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SendMessageP2PRequestBody sendMessageP2PRequestBody) {
            SendType.ADAPTER.encodeWithTag(protoWriter, 1, sendMessageP2PRequestBody.send_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendMessageP2PRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sendMessageP2PRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, sendMessageP2PRequestBody.conversation_short_id);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 5, sendMessageP2PRequestBody.visible_user);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 6, sendMessageP2PRequestBody.invisible_user);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, sendMessageP2PRequestBody.message_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, sendMessageP2PRequestBody.content);
            this.ext.encodeWithTag(protoWriter, 9, sendMessageP2PRequestBody.ext);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, sendMessageP2PRequestBody.client_message_id);
            protoWriter.writeBytes(sendMessageP2PRequestBody.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SendMessageP2PRequestBody, Builder> {
        public String client_message_id;
        public String content;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();
        public List<Long> invisible_user = Internal.newMutableList();
        public Integer message_type;
        public SendType send_type;
        public List<Long> visible_user = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23745);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SendMessageP2PRequestBody build() {
            return new SendMessageP2PRequestBody(this.send_type, this.conversation_id, this.conversation_type, this.conversation_short_id, this.visible_user, this.invisible_user, this.message_type, this.content, this.ext, this.client_message_id, super.buildUnknownFields());
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l2) {
            this.conversation_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder send_type(SendType sendType) {
            this.send_type = sendType;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }

        public final Builder invisible_user(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.invisible_user = list;
            return this;
        }

        public final Builder visible_user(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.visible_user = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SendMessageP2PRequestBody" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23744);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SendMessageP2PRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SendMessageP2PRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.send_type = this.send_type;
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.visible_user = Internal.copyOf("visible_user", this.visible_user);
        builder.invisible_user = Internal.copyOf("invisible_user", this.invisible_user);
        builder.message_type = this.message_type;
        builder.content = this.content;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.client_message_id = this.client_message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SendMessageP2PRequestBody(SendType sendType, String str, Integer num, Long l2, List<Long> list, List<Long> list2, Integer num2, String str2, Map<String, String> map, String str3) {
        this(sendType, str, num, l2, list, list2, num2, str2, map, str3, i.EMPTY);
    }

    public SendMessageP2PRequestBody(SendType sendType, String str, Integer num, Long l2, List<Long> list, List<Long> list2, Integer num2, String str2, Map<String, String> map, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.send_type = sendType;
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.visible_user = Internal.immutableCopyOf("visible_user", list);
        this.invisible_user = Internal.immutableCopyOf("invisible_user", list2);
        this.message_type = num2;
        this.content = str2;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.client_message_id = str3;
    }
}
