package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum UserActionType implements WireEnum {
    ENTER_CONVERSATION(1),
    EXIT_CONVERSATION(2);
    
    public static final ProtoAdapter<UserActionType> ADAPTER = new ProtoAdapter_UserActionType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_UserActionType extends EnumAdapter<UserActionType> {
        static {
            Covode.recordClassIndex(23823);
        }

        ProtoAdapter_UserActionType() {
            super(UserActionType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final UserActionType fromValue(int i2) {
            return UserActionType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23822);
    }

    public static UserActionType fromValue(int i2) {
        if (i2 == 1) {
            return ENTER_CONVERSATION;
        }
        if (i2 != 2) {
            return null;
        }
        return EXIT_CONVERSATION;
    }

    private UserActionType(int i2) {
        this.value = i2;
    }
}
