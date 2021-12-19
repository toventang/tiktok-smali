package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum NewMessageNotifyType implements WireEnum {
    PER_USER(1),
    PER_CONVERSATION(2);
    
    public static final ProtoAdapter<NewMessageNotifyType> ADAPTER = new ProtoAdapter_NewMessageNotifyType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_NewMessageNotifyType extends EnumAdapter<NewMessageNotifyType> {
        static {
            Covode.recordClassIndex(23657);
        }

        ProtoAdapter_NewMessageNotifyType() {
            super(NewMessageNotifyType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final NewMessageNotifyType fromValue(int i2) {
            return NewMessageNotifyType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23656);
    }

    public static NewMessageNotifyType fromValue(int i2) {
        if (i2 == 1) {
            return PER_USER;
        }
        if (i2 != 2) {
            return null;
        }
        return PER_CONVERSATION;
    }

    private NewMessageNotifyType(int i2) {
        this.value = i2;
    }
}
