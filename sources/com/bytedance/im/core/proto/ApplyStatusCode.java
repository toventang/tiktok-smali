package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ApplyStatusCode implements WireEnum {
    APPLYING(1),
    AGREE(2),
    DENY(3),
    INVALID(4);
    
    public static final ProtoAdapter<ApplyStatusCode> ADAPTER = new ProtoAdapter_ApplyStatusCode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_ApplyStatusCode extends EnumAdapter<ApplyStatusCode> {
        static {
            Covode.recordClassIndex(23188);
        }

        ProtoAdapter_ApplyStatusCode() {
            super(ApplyStatusCode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ApplyStatusCode fromValue(int i2) {
            return ApplyStatusCode.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23187);
    }

    public static ApplyStatusCode fromValue(int i2) {
        if (i2 == 1) {
            return APPLYING;
        }
        if (i2 == 2) {
            return AGREE;
        }
        if (i2 == 3) {
            return DENY;
        }
        if (i2 != 4) {
            return null;
        }
        return INVALID;
    }

    private ApplyStatusCode(int i2) {
        this.value = i2;
    }
}
