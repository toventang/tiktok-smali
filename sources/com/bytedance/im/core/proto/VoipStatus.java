package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum VoipStatus implements WireEnum {
    IDLE(0),
    CALLING(1),
    RINGING(2),
    ACCEPTED(3),
    ONTHECALL(4),
    TERMINATED(101),
    OCCUPIED(102),
    REFUSED(103),
    CANCELLED(104),
    UNAVAILABLE(105),
    RTCERROR(106),
    RTC_ENGINE_MISMATCH(107);
    
    public static final ProtoAdapter<VoipStatus> ADAPTER = new ProtoAdapter_VoipStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_VoipStatus extends EnumAdapter<VoipStatus> {
        static {
            Covode.recordClassIndex(23833);
        }

        ProtoAdapter_VoipStatus() {
            super(VoipStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final VoipStatus fromValue(int i2) {
            return VoipStatus.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23832);
    }

    public static VoipStatus fromValue(int i2) {
        if (i2 == 0) {
            return IDLE;
        }
        if (i2 == 1) {
            return CALLING;
        }
        if (i2 == 2) {
            return RINGING;
        }
        if (i2 == 3) {
            return ACCEPTED;
        }
        if (i2 == 4) {
            return ONTHECALL;
        }
        switch (i2) {
            case 101:
                return TERMINATED;
            case 102:
                return OCCUPIED;
            case 103:
                return REFUSED;
            case 104:
                return CANCELLED;
            case 105:
                return UNAVAILABLE;
            case 106:
                return RTCERROR;
            case 107:
                return RTC_ENGINE_MISMATCH;
            default:
                return null;
        }
    }

    private VoipStatus(int i2) {
        this.value = i2;
    }
}
