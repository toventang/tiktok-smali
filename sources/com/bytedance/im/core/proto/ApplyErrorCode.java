package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ApplyErrorCode implements WireEnum {
    APPLY_SUCCESS(0),
    UPDATE_STATUS_ERR(1),
    CALLBACK_NOT_PASS(2),
    APPLY_NOT_EXIST(3),
    APPLY_PARAMS_ERR(4),
    CONV_SWITCH_CLOSED(5),
    USER_NO_PERMISSION(6),
    USER_ALREADY_IN_GROUP(7),
    CALLBACK_NO_NEED_AUDIT(8),
    APPLY_CONVERSATION_NOT_FOUND(9),
    CONVERSATION_IS_FULL(10),
    APPLY_INTERNAL_ERR(500);
    
    public static final ProtoAdapter<ApplyErrorCode> ADAPTER = new ProtoAdapter_ApplyErrorCode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_ApplyErrorCode extends EnumAdapter<ApplyErrorCode> {
        static {
            Covode.recordClassIndex(23186);
        }

        ProtoAdapter_ApplyErrorCode() {
            super(ApplyErrorCode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ApplyErrorCode fromValue(int i2) {
            return ApplyErrorCode.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23185);
    }

    public static ApplyErrorCode fromValue(int i2) {
        if (i2 == 500) {
            return APPLY_INTERNAL_ERR;
        }
        switch (i2) {
            case 0:
                return APPLY_SUCCESS;
            case 1:
                return UPDATE_STATUS_ERR;
            case 2:
                return CALLBACK_NOT_PASS;
            case 3:
                return APPLY_NOT_EXIST;
            case 4:
                return APPLY_PARAMS_ERR;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return CONV_SWITCH_CLOSED;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return USER_NO_PERMISSION;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return USER_ALREADY_IN_GROUP;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return CALLBACK_NO_NEED_AUDIT;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return APPLY_CONVERSATION_NOT_FOUND;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return CONVERSATION_IS_FULL;
            default:
                return null;
        }
    }

    private ApplyErrorCode(int i2) {
        this.value = i2;
    }
}
