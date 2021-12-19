package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SendType implements WireEnum {
    BY_CONVERSATION(0),
    BY_USER(1);
    
    public static final ProtoAdapter<SendType> ADAPTER = new ProtoAdapter_SendType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_SendType extends EnumAdapter<SendType> {
        static {
            Covode.recordClassIndex(23756);
        }

        ProtoAdapter_SendType() {
            super(SendType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final SendType fromValue(int i2) {
            return SendType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23755);
    }

    public static SendType fromValue(int i2) {
        if (i2 == 0) {
            return BY_CONVERSATION;
        }
        if (i2 != 1) {
            return null;
        }
        return BY_USER;
    }

    private SendType(int i2) {
        this.value = i2;
    }
}
