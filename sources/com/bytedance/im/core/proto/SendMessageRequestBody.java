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

public final class SendMessageRequestBody extends Message<SendMessageRequestBody, Builder> {
    public static final ProtoAdapter<SendMessageRequestBody> ADAPTER = new ProtoAdapter_SendMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_IGNORE_BADGE_COUNT = false;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    private static final long serialVersionUID = 0;
    @c(a = "client_ext")
    public final Map<String, String> client_ext;
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
    @c(a = "ignore_badge_count")
    public final Boolean ignore_badge_count;
    @c(a = "mentioned_users")
    public final List<Long> mentioned_users;
    @c(a = "message_type")
    public final Integer message_type;
    @c(a = "ref_msg_info")
    public final ReferencedMessageInfo ref_msg_info;
    @c(a = "ticket")
    public final String ticket;

    static final class ProtoAdapter_SendMessageRequestBody extends ProtoAdapter<SendMessageRequestBody> {
        private final ProtoAdapter<Map<String, String>> client_ext;
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23749);
        }

        public ProtoAdapter_SendMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendMessageRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            this.client_ext = ProtoAdapter.newMapAdapter(protoAdapter2, protoAdapter2);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.SendMessageRequestBody$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.SendMessageRequestBody redact(com.bytedance.im.core.proto.SendMessageRequestBody r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.SendMessageRequestBody$Builder r2 = r4.newBuilder()
                com.bytedance.im.core.proto.ReferencedMessageInfo r0 = r2.ref_msg_info
                if (r0 == 0) goto L_0x0014
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.ReferencedMessageInfo> r1 = com.bytedance.im.core.proto.ReferencedMessageInfo.ADAPTER
                com.bytedance.im.core.proto.ReferencedMessageInfo r0 = r2.ref_msg_info
                java.lang.Object r0 = r1.redact(r0)
                com.bytedance.im.core.proto.ReferencedMessageInfo r0 = (com.bytedance.im.core.proto.ReferencedMessageInfo) r0
                r2.ref_msg_info = r0
            L_0x0014:
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.SendMessageRequestBody r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.SendMessageRequestBody.ProtoAdapter_SendMessageRequestBody.redact(com.bytedance.im.core.proto.SendMessageRequestBody):com.bytedance.im.core.proto.SendMessageRequestBody");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendMessageRequestBody decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.content(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.message_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.ticket(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.client_message_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.mentioned_users.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.ignore_badge_count(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.ref_msg_info(ReferencedMessageInfo.ADAPTER.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            builder.client_ext.putAll(this.client_ext.decode(protoReader));
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

        public final int encodedSize(SendMessageRequestBody sendMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendMessageRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendMessageRequestBody.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, sendMessageRequestBody.content) + this.ext.encodedSizeWithTag(5, sendMessageRequestBody.ext) + ProtoAdapter.INT32.encodedSizeWithTag(6, sendMessageRequestBody.message_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, sendMessageRequestBody.ticket) + ProtoAdapter.STRING.encodedSizeWithTag(8, sendMessageRequestBody.client_message_id) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(9, sendMessageRequestBody.mentioned_users) + ProtoAdapter.BOOL.encodedSizeWithTag(10, sendMessageRequestBody.ignore_badge_count) + ReferencedMessageInfo.ADAPTER.encodedSizeWithTag(11, sendMessageRequestBody.ref_msg_info) + this.client_ext.encodedSizeWithTag(12, sendMessageRequestBody.client_ext) + sendMessageRequestBody.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, SendMessageRequestBody sendMessageRequestBody) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendMessageRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendMessageRequestBody.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, sendMessageRequestBody.content);
            this.ext.encodeWithTag(protoWriter, 5, sendMessageRequestBody.ext);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, sendMessageRequestBody.message_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, sendMessageRequestBody.ticket);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, sendMessageRequestBody.client_message_id);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 9, sendMessageRequestBody.mentioned_users);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, sendMessageRequestBody.ignore_badge_count);
            ReferencedMessageInfo.ADAPTER.encodeWithTag(protoWriter, 11, sendMessageRequestBody.ref_msg_info);
            this.client_ext.encodeWithTag(protoWriter, 12, sendMessageRequestBody.client_ext);
            protoWriter.writeBytes(sendMessageRequestBody.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "SendMessageRequestBody" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<SendMessageRequestBody, Builder> {
        public Map<String, String> client_ext = Internal.newMutableMap();
        public String client_message_id;
        public String content;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> ext = Internal.newMutableMap();
        public Boolean ignore_badge_count;
        public List<Long> mentioned_users = Internal.newMutableList();
        public Integer message_type;
        public ReferencedMessageInfo ref_msg_info;
        public String ticket;

        static {
            Covode.recordClassIndex(23748);
        }

        @Override // com.squareup.wire.Message.Builder
        public final SendMessageRequestBody build() {
            return new SendMessageRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.content, this.ext, this.message_type, this.ticket, this.client_message_id, this.mentioned_users, this.ignore_badge_count, this.ref_msg_info, this.client_ext, super.buildUnknownFields());
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

        public final Builder ignore_badge_count(Boolean bool) {
            this.ignore_badge_count = bool;
            return this;
        }

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder ref_msg_info(ReferencedMessageInfo referencedMessageInfo) {
            this.ref_msg_info = referencedMessageInfo;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }

        public final Builder client_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.client_ext = map;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }

        public final Builder mentioned_users(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.mentioned_users = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23747);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.SendMessageRequestBody$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<SendMessageRequestBody, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.content = this.content;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.message_type = this.message_type;
        builder.ticket = this.ticket;
        builder.client_message_id = this.client_message_id;
        builder.mentioned_users = Internal.copyOf("mentioned_users", this.mentioned_users);
        builder.ignore_badge_count = this.ignore_badge_count;
        builder.ref_msg_info = this.ref_msg_info;
        builder.client_ext = Internal.copyOf("client_ext", this.client_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public SendMessageRequestBody(String str, Integer num, Long l2, String str2, Map<String, String> map, Integer num2, String str3, String str4, List<Long> list, Boolean bool, ReferencedMessageInfo referencedMessageInfo, Map<String, String> map2) {
        this(str, num, l2, str2, map, num2, str3, str4, list, bool, referencedMessageInfo, map2, i.EMPTY);
    }

    public SendMessageRequestBody(String str, Integer num, Long l2, String str2, Map<String, String> map, Integer num2, String str3, String str4, List<Long> list, Boolean bool, ReferencedMessageInfo referencedMessageInfo, Map<String, String> map2, i iVar) {
        super(ADAPTER, iVar);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l2;
        this.content = str2;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.message_type = num2;
        this.ticket = str3;
        this.client_message_id = str4;
        this.mentioned_users = Internal.immutableCopyOf("mentioned_users", list);
        this.ignore_badge_count = bool;
        this.ref_msg_info = referencedMessageInfo;
        this.client_ext = Internal.immutableCopyOf("client_ext", map2);
    }
}
