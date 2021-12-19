package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum VoipMode implements WireEnum {
    VOIP_MODE_DOUBLE(0),
    VOIP_MODE_MULTIPLAYER(1);
    
    public static final ProtoAdapter<VoipMode> ADAPTER = new ProtoAdapter_VoipMode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_VoipMode extends EnumAdapter<VoipMode> {
        static {
            Covode.recordClassIndex(23831);
        }

        ProtoAdapter_VoipMode() {
            super(VoipMode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final VoipMode fromValue(int i2) {
            return VoipMode.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23830);
    }

    public static VoipMode fromValue(int i2) {
        if (i2 == 0) {
            return VOIP_MODE_DOUBLE;
        }
        if (i2 != 1) {
            return null;
        }
        return VOIP_MODE_MULTIPLAYER;
    }

    private VoipMode(int i2) {
        this.value = i2;
    }
}
