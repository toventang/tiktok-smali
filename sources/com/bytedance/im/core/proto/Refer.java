package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum Refer implements WireEnum {
    REFER_NOT_USED(0),
    ANDROID(1),
    IOS(2),
    PC(3),
    SERVER(4);
    
    public static final ProtoAdapter<Refer> ADAPTER = new ProtoAdapter_Refer();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_Refer extends EnumAdapter<Refer> {
        static {
            Covode.recordClassIndex(23710);
        }

        ProtoAdapter_Refer() {
            super(Refer.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final Refer fromValue(int i2) {
            return Refer.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23709);
    }

    public static Refer fromValue(int i2) {
        if (i2 == 0) {
            return REFER_NOT_USED;
        }
        if (i2 == 1) {
            return ANDROID;
        }
        if (i2 == 2) {
            return IOS;
        }
        if (i2 == 3) {
            return PC;
        }
        if (i2 != 4) {
            return null;
        }
        return SERVER;
    }

    private Refer(int i2) {
        this.value = i2;
    }
}
