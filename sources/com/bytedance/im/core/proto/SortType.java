package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SortType implements WireEnum {
    JOIN_TIME(1),
    CREATED_TIME(2),
    GROUP_NAME(3),
    ACTIVE_TIME(4);
    
    public static final ProtoAdapter<SortType> ADAPTER = new ProtoAdapter_SortType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_SortType extends EnumAdapter<SortType> {
        static {
            Covode.recordClassIndex(23776);
        }

        ProtoAdapter_SortType() {
            super(SortType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final SortType fromValue(int i2) {
            return SortType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23775);
    }

    public static SortType fromValue(int i2) {
        if (i2 == 1) {
            return JOIN_TIME;
        }
        if (i2 == 2) {
            return CREATED_TIME;
        }
        if (i2 == 3) {
            return GROUP_NAME;
        }
        if (i2 != 4) {
            return null;
        }
        return ACTIVE_TIME;
    }

    private SortType(int i2) {
        this.value = i2;
    }
}
