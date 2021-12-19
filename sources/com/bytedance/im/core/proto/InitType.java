package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum InitType implements WireEnum {
    TYPE_BY_CONVERSATION(1),
    TYPE_BY_USER(2),
    TYPE_BY_RANK(3);
    
    public static final ProtoAdapter<InitType> ADAPTER = new ProtoAdapter_InitType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_InitType extends EnumAdapter<InitType> {
        static {
            Covode.recordClassIndex(23543);
        }

        ProtoAdapter_InitType() {
            super(InitType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final InitType fromValue(int i2) {
            return InitType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23542);
    }

    public static InitType fromValue(int i2) {
        if (i2 == 1) {
            return TYPE_BY_CONVERSATION;
        }
        if (i2 == 2) {
            return TYPE_BY_USER;
        }
        if (i2 != 3) {
            return null;
        }
        return TYPE_BY_RANK;
    }

    private InitType(int i2) {
        this.value = i2;
    }
}
