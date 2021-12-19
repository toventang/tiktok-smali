package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FriendMessageType implements WireEnum {
    SendApply(1),
    DeleteFriend(2),
    AddFriend(3);
    
    public static final ProtoAdapter<FriendMessageType> ADAPTER = new ProtoAdapter_FriendMessageType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_FriendMessageType extends EnumAdapter<FriendMessageType> {
        static {
            Covode.recordClassIndex(23396);
        }

        ProtoAdapter_FriendMessageType() {
            super(FriendMessageType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final FriendMessageType fromValue(int i2) {
            return FriendMessageType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23395);
    }

    public static FriendMessageType fromValue(int i2) {
        if (i2 == 1) {
            return SendApply;
        }
        if (i2 == 2) {
            return DeleteFriend;
        }
        if (i2 != 3) {
            return null;
        }
        return AddFriend;
    }

    private FriendMessageType(int i2) {
        this.value = i2;
    }
}
