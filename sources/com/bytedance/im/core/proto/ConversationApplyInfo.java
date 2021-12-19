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
import java.util.Map;
import k.i;

public final class ConversationApplyInfo extends Message<ConversationApplyInfo, Builder> {
    public static final ProtoAdapter<ConversationApplyInfo> ADAPTER = new ProtoAdapter_ConversationApplyInfo();
    public static final Long DEFAULT_APPLY_ID = 0L;
    public static final ApplyStatusCode DEFAULT_APPLY_STATUS = ApplyStatusCode.APPLYING;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_INVITE_USER_ID = 0L;
    public static final Long DEFAULT_MODIFY_TIME = 0L;
    public static final Long DEFAULT_MODIFY_USER = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    @c(a = "apply_id")
    public final Long apply_id;
    @c(a = "apply_reason")
    public final String apply_reason;
    @c(a = "apply_status")
    public final ApplyStatusCode apply_status;
    @c(a = "conv_short_id")
    public final Long conv_short_id;
    @c(a = "conversation_type")
    public final Integer conversation_type;
    @c(a = "create_time")
    public final Long create_time;
    @c(a = "ext")
    public final Map<String, String> ext;
    @c(a = "invite_user_id")
    public final Long invite_user_id;
    @c(a = "modify_time")
    public final Long modify_time;
    @c(a = "modify_user")
    public final Long modify_user;
    @c(a = "sec_invite_uid")
    public final String sec_invite_uid;
    @c(a = "sec_uid")
    public final String sec_uid;
    @c(a = "user_id")
    public final Long user_id;

    static final class ProtoAdapter_ConversationApplyInfo extends ProtoAdapter<ConversationApplyInfo> {
        private final ProtoAdapter<Map<String, String>> ext;

        static {
            Covode.recordClassIndex(23292);
        }

        public ProtoAdapter_ConversationApplyInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationApplyInfo.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.squareup.wire.Message$Builder, com.bytedance.im.core.proto.ConversationApplyInfo$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.ConversationApplyInfo redact(com.bytedance.im.core.proto.ConversationApplyInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.ConversationApplyInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.ConversationApplyInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.ConversationApplyInfo.ProtoAdapter_ConversationApplyInfo.redact(com.bytedance.im.core.proto.ConversationApplyInfo):com.bytedance.im.core.proto.ConversationApplyInfo");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationApplyInfo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.conv_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.apply_status(ApplyStatusCode.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            builder.apply_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.create_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.modify_time(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.modify_user(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.sec_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            builder.invite_user_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.sec_invite_uid(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            builder.ext.putAll(this.ext.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            builder.apply_reason(ProtoAdapter.STRING.decode(protoReader));
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

        public final int encodedSize(ConversationApplyInfo conversationApplyInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationApplyInfo.user_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationApplyInfo.conv_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationApplyInfo.conversation_type) + ApplyStatusCode.ADAPTER.encodedSizeWithTag(4, conversationApplyInfo.apply_status) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationApplyInfo.apply_id) + ProtoAdapter.INT64.encodedSizeWithTag(6, conversationApplyInfo.create_time) + ProtoAdapter.INT64.encodedSizeWithTag(7, conversationApplyInfo.modify_time) + ProtoAdapter.INT64.encodedSizeWithTag(8, conversationApplyInfo.modify_user) + ProtoAdapter.STRING.encodedSizeWithTag(9, conversationApplyInfo.sec_uid) + ProtoAdapter.INT64.encodedSizeWithTag(10, conversationApplyInfo.invite_user_id) + ProtoAdapter.STRING.encodedSizeWithTag(11, conversationApplyInfo.sec_invite_uid) + this.ext.encodedSizeWithTag(12, conversationApplyInfo.ext) + ProtoAdapter.STRING.encodedSizeWithTag(13, conversationApplyInfo.apply_reason) + conversationApplyInfo.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ConversationApplyInfo conversationApplyInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationApplyInfo.user_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationApplyInfo.conv_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationApplyInfo.conversation_type);
            ApplyStatusCode.ADAPTER.encodeWithTag(protoWriter, 4, conversationApplyInfo.apply_status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationApplyInfo.apply_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, conversationApplyInfo.create_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, conversationApplyInfo.modify_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, conversationApplyInfo.modify_user);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, conversationApplyInfo.sec_uid);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, conversationApplyInfo.invite_user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, conversationApplyInfo.sec_invite_uid);
            this.ext.encodeWithTag(protoWriter, 12, conversationApplyInfo.ext);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, conversationApplyInfo.apply_reason);
            protoWriter.writeBytes(conversationApplyInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ConversationApplyInfo" + h.f38770a.b(this).toString();
    }

    public static final class Builder extends Message.Builder<ConversationApplyInfo, Builder> {
        public Long apply_id;
        public String apply_reason;
        public ApplyStatusCode apply_status;
        public Long conv_short_id;
        public Integer conversation_type;
        public Long create_time;
        public Map<String, String> ext = Internal.newMutableMap();
        public Long invite_user_id;
        public Long modify_time;
        public Long modify_user;
        public String sec_invite_uid;
        public String sec_uid;
        public Long user_id;

        static {
            Covode.recordClassIndex(23291);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ConversationApplyInfo build() {
            return new ConversationApplyInfo(this.user_id, this.conv_short_id, this.conversation_type, this.apply_status, this.apply_id, this.create_time, this.modify_time, this.modify_user, this.sec_uid, this.invite_user_id, this.sec_invite_uid, this.ext, this.apply_reason, super.buildUnknownFields());
        }

        public final Builder apply_id(Long l2) {
            this.apply_id = l2;
            return this;
        }

        public final Builder apply_reason(String str) {
            this.apply_reason = str;
            return this;
        }

        public final Builder apply_status(ApplyStatusCode applyStatusCode) {
            this.apply_status = applyStatusCode;
            return this;
        }

        public final Builder conv_short_id(Long l2) {
            this.conv_short_id = l2;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder create_time(Long l2) {
            this.create_time = l2;
            return this;
        }

        public final Builder invite_user_id(Long l2) {
            this.invite_user_id = l2;
            return this;
        }

        public final Builder modify_time(Long l2) {
            this.modify_time = l2;
            return this;
        }

        public final Builder modify_user(Long l2) {
            this.modify_user = l2;
            return this;
        }

        public final Builder sec_invite_uid(String str) {
            this.sec_invite_uid = str;
            return this;
        }

        public final Builder sec_uid(String str) {
            this.sec_uid = str;
            return this;
        }

        public final Builder user_id(Long l2) {
            this.user_id = l2;
            return this;
        }

        public final Builder ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ext = map;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23290);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ConversationApplyInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ConversationApplyInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.conv_short_id = this.conv_short_id;
        builder.conversation_type = this.conversation_type;
        builder.apply_status = this.apply_status;
        builder.apply_id = this.apply_id;
        builder.create_time = this.create_time;
        builder.modify_time = this.modify_time;
        builder.modify_user = this.modify_user;
        builder.sec_uid = this.sec_uid;
        builder.invite_user_id = this.invite_user_id;
        builder.sec_invite_uid = this.sec_invite_uid;
        builder.ext = Internal.copyOf("ext", this.ext);
        builder.apply_reason = this.apply_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public ConversationApplyInfo(Long l2, Long l3, Integer num, ApplyStatusCode applyStatusCode, Long l4, Long l5, Long l6, Long l7, String str, Long l8, String str2, Map<String, String> map, String str3) {
        this(l2, l3, num, applyStatusCode, l4, l5, l6, l7, str, l8, str2, map, str3, i.EMPTY);
    }

    public ConversationApplyInfo(Long l2, Long l3, Integer num, ApplyStatusCode applyStatusCode, Long l4, Long l5, Long l6, Long l7, String str, Long l8, String str2, Map<String, String> map, String str3, i iVar) {
        super(ADAPTER, iVar);
        this.user_id = l2;
        this.conv_short_id = l3;
        this.conversation_type = num;
        this.apply_status = applyStatusCode;
        this.apply_id = l4;
        this.create_time = l5;
        this.modify_time = l6;
        this.modify_user = l7;
        this.sec_uid = str;
        this.invite_user_id = l8;
        this.sec_invite_uid = str2;
        this.ext = Internal.immutableCopyOf("ext", map);
        this.apply_reason = str3;
    }
}
