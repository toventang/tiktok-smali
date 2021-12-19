package com.bytedance.im.core.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum StatusCode implements WireEnum {
    OK(0),
    INVALID_TOKEN(1),
    EXPIRED_TOKEN(100),
    INVALID_TICKET(2),
    CONVERSATION_NOT_FOUND(3),
    INVALID_REQUEST(4),
    INVALID_CMD(5),
    SERVER_ERR(6),
    USER_FORBIDDEN(11),
    DEVICE_NOT_BIND(7),
    MESSAGE_ILLEGAL(8),
    USER_ILLEGAL(9),
    USER_NOT_FRIENDS(10),
    USER_SILENCE(12),
    USER_NOT_IN_GROUP(13),
    USER_BANNED_TO_POST(14),
    INTERNAL_ERROR(500),
    MESSAGE_TARGET_CONVERSATION_NOT_EXIST(15),
    DEGRADATION_ERROR(16),
    RECALL_TIMEOUT(17),
    TOUCH_LIMIT(18),
    CALLBACK_DENY(19);
    
    public static final ProtoAdapter<StatusCode> ADAPTER = new ProtoAdapter_StatusCode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_StatusCode extends EnumAdapter<StatusCode> {
        static {
            Covode.recordClassIndex(23778);
        }

        ProtoAdapter_StatusCode() {
            super(StatusCode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final StatusCode fromValue(int i2) {
            return StatusCode.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23777);
    }

    public static StatusCode fromValue(int i2) {
        if (i2 == 100) {
            return EXPIRED_TOKEN;
        }
        if (i2 == 500) {
            return INTERNAL_ERROR;
        }
        switch (i2) {
            case 0:
                return OK;
            case 1:
                return INVALID_TOKEN;
            case 2:
                return INVALID_TICKET;
            case 3:
                return CONVERSATION_NOT_FOUND;
            case 4:
                return INVALID_REQUEST;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return INVALID_CMD;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return SERVER_ERR;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return DEVICE_NOT_BIND;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return MESSAGE_ILLEGAL;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return USER_ILLEGAL;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return USER_NOT_FRIENDS;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                return USER_FORBIDDEN;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                return USER_SILENCE;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                return USER_NOT_IN_GROUP;
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                return USER_BANNED_TO_POST;
            case 15:
                return MESSAGE_TARGET_CONVERSATION_NOT_EXIST;
            case 16:
                return DEGRADATION_ERROR;
            case 17:
                return RECALL_TIMEOUT;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return TOUCH_LIMIT;
            case 19:
                return CALLBACK_DENY;
            default:
                return null;
        }
    }

    private StatusCode(int i2) {
        this.value = i2;
    }
}
