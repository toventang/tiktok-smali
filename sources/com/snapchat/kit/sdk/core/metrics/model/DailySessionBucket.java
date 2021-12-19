package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum DailySessionBucket implements WireEnum {
    NO_SESSION_BUCKET(0),
    ONE_SESSION(1),
    TWO_SESSION(2),
    THREE_SESSION(3),
    FOUR_SESSION(4),
    FIVE_SESSION(5),
    SIX_SESSION(6),
    SEVEN_SESSION(7),
    EIGHT_SESSION(8),
    NINE_SESSION(9),
    TEN_OR_MORE_SESSION(10);
    
    public static final ProtoAdapter<DailySessionBucket> ADAPTER = new ProtoAdapter_DailySessionBucket();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_DailySessionBucket extends EnumAdapter<DailySessionBucket> {
        static {
            Covode.recordClassIndex(35701);
        }

        ProtoAdapter_DailySessionBucket() {
            super(DailySessionBucket.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final DailySessionBucket fromValue(int i2) {
            return DailySessionBucket.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35700);
    }

    public static DailySessionBucket fromValue(int i2) {
        switch (i2) {
            case 0:
                return NO_SESSION_BUCKET;
            case 1:
                return ONE_SESSION;
            case 2:
                return TWO_SESSION;
            case 3:
                return THREE_SESSION;
            case 4:
                return FOUR_SESSION;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return FIVE_SESSION;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return SIX_SESSION;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return SEVEN_SESSION;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return EIGHT_SESSION;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return NINE_SESSION;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return TEN_OR_MORE_SESSION;
            default:
                return null;
        }
    }

    private DailySessionBucket(int i2) {
        this.value = i2;
    }
}
