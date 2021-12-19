package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum VoipType implements WireEnum {
    VOIP_TYPE_NOT_USED(0),
    VOIP_TYPE_ALL(1),
    VOIP_TYPE_VIDEOONLY(2),
    VOIP_TYPE_AUDIOONLY(3);
    
    public static final ProtoAdapter<VoipType> ADAPTER = new ProtoAdapter_VoipType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_VoipType extends EnumAdapter<VoipType> {
        static {
            Covode.recordClassIndex(23837);
        }

        ProtoAdapter_VoipType() {
            super(VoipType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final VoipType fromValue(int i2) {
            return VoipType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23836);
    }

    public static VoipType fromValue(int i2) {
        if (i2 == 0) {
            return VOIP_TYPE_NOT_USED;
        }
        if (i2 == 1) {
            return VOIP_TYPE_ALL;
        }
        if (i2 == 2) {
            return VOIP_TYPE_VIDEOONLY;
        }
        if (i2 != 3) {
            return null;
        }
        return VOIP_TYPE_AUDIOONLY;
    }

    private VoipType(int i2) {
        this.value = i2;
    }
}
