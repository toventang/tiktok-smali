package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ActionType implements WireEnum {
    UNKNOWN_ACTION(0),
    FAVORITE(1),
    PIN(2),
    UNREAD(3);
    
    public static final ProtoAdapter<ActionType> ADAPTER = new ProtoAdapter_ActionType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_ActionType extends EnumAdapter<ActionType> {
        static {
            Covode.recordClassIndex(23184);
        }

        ProtoAdapter_ActionType() {
            super(ActionType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ActionType fromValue(int i2) {
            return ActionType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23183);
    }

    public static ActionType fromValue(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ACTION;
        }
        if (i2 == 1) {
            return FAVORITE;
        }
        if (i2 == 2) {
            return PIN;
        }
        if (i2 != 3) {
            return null;
        }
        return UNREAD;
    }

    private ActionType(int i2) {
        this.value = i2;
    }
}
