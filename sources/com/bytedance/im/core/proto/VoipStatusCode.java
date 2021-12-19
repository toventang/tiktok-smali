package com.bytedance.im.core.proto;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.playerkit.model.v;

public enum VoipStatusCode implements WireEnum {
    SUCCESS(0),
    VOIP_PARAMS_ERROR(4),
    VOIP_STATUS_ERROR(18),
    VOIP_CANCEL_ERROR(19),
    VOIP_OTHER_RESPONSE_ERROR(20),
    VOIP_CALLBACK_ERROR(21);
    
    public static final ProtoAdapter<VoipStatusCode> ADAPTER = new ProtoAdapter_VoipStatusCode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_VoipStatusCode extends EnumAdapter<VoipStatusCode> {
        static {
            Covode.recordClassIndex(23835);
        }

        ProtoAdapter_VoipStatusCode() {
            super(VoipStatusCode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final VoipStatusCode fromValue(int i2) {
            return VoipStatusCode.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23834);
    }

    public static VoipStatusCode fromValue(int i2) {
        if (i2 == 0) {
            return SUCCESS;
        }
        if (i2 == 4) {
            return VOIP_PARAMS_ERROR;
        }
        switch (i2) {
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                return VOIP_STATUS_ERROR;
            case 19:
                return VOIP_CANCEL_ERROR;
            case v.U /*{ENCODED_INT: 20}*/:
                return VOIP_OTHER_RESPONSE_ERROR;
            case 21:
                return VOIP_CALLBACK_ERROR;
            default:
                return null;
        }
    }

    private VoipStatusCode(int i2) {
        this.value = i2;
    }
}
