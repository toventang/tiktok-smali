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

public final class VoipInfo extends Message<VoipInfo, Builder> {
    public static final ProtoAdapter<VoipInfo> ADAPTER = new ProtoAdapter_VoipInfo();
    public static final Long DEFAULT_CALLER_ID = 0L;
    public static final Long DEFAULT_CON_SHORT_ID = 0L;
    public static final Long DEFAULT_CREATED_TIME_MS = 0L;
    public static final Long DEFAULT_SRV_MSG_ID = 0L;
    public static final VoipStatus DEFAULT_STATUS = VoipStatus.IDLE;
    public static final Long DEFAULT_UPDATED_TIME_MS = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final VoipType DEFAULT_V_TYPE = VoipType.VOIP_TYPE_NOT_USED;
    private static final long serialVersionUID = 0;
    @c(a = "caller_id")
    public final Long caller_id;
    @c(a = "channel_id")
    public final String channel_id;
    @c(a = "con_short_id")
    public final Long con_short_id;
    @c(a = "created_time_ms")
    public final Long created_time_ms;
    @c(a = "device_id")
    public final String device_id;
    @c(a = "srv_msg_id")
    public final Long srv_msg_id;
    @c(a = "status")
    public final VoipStatus status;
    @c(a = "token")
    public final String token;
    @c(a = "updated_time_ms")
    public final Long updated_time_ms;
    @c(a = "user_id")
    public final Long user_id;
    @c(a = "v_type")
    public final VoipType v_type;

    static final class ProtoAdapter_VoipInfo extends ProtoAdapter<VoipInfo> {
        static {
            Covode.recordClassIndex(23829);
        }

        public ProtoAdapter_VoipInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, VoipInfo.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.im.core.proto.VoipInfo$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.im.core.proto.VoipInfo redact(com.bytedance.im.core.proto.VoipInfo r2) {
            /*
                r1 = this;
                com.bytedance.im.core.proto.VoipInfo$Builder r0 = r2.newBuilder()
                r0.clearUnknownFields()
                com.bytedance.im.core.proto.VoipInfo r0 = r0.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.proto.VoipInfo.ProtoAdapter_VoipInfo.redact(com.bytedance.im.core.proto.VoipInfo):com.bytedance.im.core.proto.VoipInfo");
        }

        public final int encodedSize(VoipInfo voipInfo) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, voipInfo.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, voipInfo.device_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, voipInfo.channel_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, voipInfo.token) + VoipStatus.ADAPTER.encodedSizeWithTag(5, voipInfo.status) + ProtoAdapter.INT64.encodedSizeWithTag(6, voipInfo.caller_id) + ProtoAdapter.INT64.encodedSizeWithTag(7, voipInfo.created_time_ms) + ProtoAdapter.INT64.encodedSizeWithTag(8, voipInfo.updated_time_ms) + ProtoAdapter.INT64.encodedSizeWithTag(9, voipInfo.con_short_id) + VoipType.ADAPTER.encodedSizeWithTag(10, voipInfo.v_type) + ProtoAdapter.INT64.encodedSizeWithTag(11, voipInfo.srv_msg_id) + voipInfo.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final VoipInfo decode(ProtoReader protoReader) {
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
                            builder.device_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.channel_id(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.token(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            try {
                                builder.status(VoipStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            builder.caller_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            builder.created_time_ms(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            builder.updated_time_ms(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            builder.con_short_id(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            try {
                                builder.v_type(VoipType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            builder.srv_msg_id(ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, VoipInfo voipInfo) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, voipInfo.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, voipInfo.device_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, voipInfo.channel_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, voipInfo.token);
            VoipStatus.ADAPTER.encodeWithTag(protoWriter, 5, voipInfo.status);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, voipInfo.caller_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, voipInfo.created_time_ms);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, voipInfo.updated_time_ms);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, voipInfo.con_short_id);
            VoipType.ADAPTER.encodeWithTag(protoWriter, 10, voipInfo.v_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, voipInfo.srv_msg_id);
            protoWriter.writeBytes(voipInfo.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<VoipInfo, Builder> {
        public Long caller_id;
        public String channel_id;
        public Long con_short_id;
        public Long created_time_ms;
        public String device_id;
        public Long srv_msg_id;
        public VoipStatus status;
        public String token;
        public Long updated_time_ms;
        public Long user_id;
        public VoipType v_type;

        static {
            Covode.recordClassIndex(23828);
        }

        @Override // com.squareup.wire.Message.Builder
        public final VoipInfo build() {
            return new VoipInfo(this.user_id, this.device_id, this.channel_id, this.token, this.status, this.caller_id, this.created_time_ms, this.updated_time_ms, this.con_short_id, this.v_type, this.srv_msg_id, super.buildUnknownFields());
        }

        public final Builder caller_id(Long l2) {
            this.caller_id = l2;
            return this;
        }

        public final Builder channel_id(String str) {
            this.channel_id = str;
            return this;
        }

        public final Builder con_short_id(Long l2) {
            this.con_short_id = l2;
            return this;
        }

        public final Builder created_time_ms(Long l2) {
            this.created_time_ms = l2;
            return this;
        }

        public final Builder device_id(String str) {
            this.device_id = str;
            return this;
        }

        public final Builder srv_msg_id(Long l2) {
            this.srv_msg_id = l2;
            return this;
        }

        public final Builder status(VoipStatus voipStatus) {
            this.status = voipStatus;
            return this;
        }

        public final Builder token(String str) {
            this.token = str;
            return this;
        }

        public final Builder updated_time_ms(Long l2) {
            this.updated_time_ms = l2;
            return this;
        }

        public final Builder user_id(Long l2) {
            this.user_id = l2;
            return this;
        }

        public final Builder v_type(VoipType voipType) {
            this.v_type = voipType;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "VoipInfo" + h.f38770a.b(this).toString();
    }

    static {
        Covode.recordClassIndex(23827);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.VoipInfo$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<VoipInfo, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.user_id = this.user_id;
        builder.device_id = this.device_id;
        builder.channel_id = this.channel_id;
        builder.token = this.token;
        builder.status = this.status;
        builder.caller_id = this.caller_id;
        builder.created_time_ms = this.created_time_ms;
        builder.updated_time_ms = this.updated_time_ms;
        builder.con_short_id = this.con_short_id;
        builder.v_type = this.v_type;
        builder.srv_msg_id = this.srv_msg_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public VoipInfo(Long l2, String str, String str2, String str3, VoipStatus voipStatus, Long l3, Long l4, Long l5, Long l6, VoipType voipType, Long l7) {
        this(l2, str, str2, str3, voipStatus, l3, l4, l5, l6, voipType, l7, i.EMPTY);
    }

    public VoipInfo(Long l2, String str, String str2, String str3, VoipStatus voipStatus, Long l3, Long l4, Long l5, Long l6, VoipType voipType, Long l7, i iVar) {
        super(ADAPTER, iVar);
        this.user_id = l2;
        this.device_id = str;
        this.channel_id = str2;
        this.token = str3;
        this.status = voipStatus;
        this.caller_id = l3;
        this.created_time_ms = l4;
        this.updated_time_ms = l5;
        this.con_short_id = l6;
        this.v_type = voipType;
        this.srv_msg_id = l7;
    }
}
