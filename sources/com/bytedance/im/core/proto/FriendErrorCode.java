package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum FriendErrorCode implements WireEnum {
    FRIEND_SUCCESS(0),
    FRIEND_DUPLICATE_APPLY(1),
    FRIEND_SEND_APPLY_LIMIT(2),
    FRIEND_RECEIVE_APPLY_LIMIT(3),
    FRIEND_ALREADY_FRIEND(4),
    FRIEND_INTERNAL_ERR(500);
    
    public static final ProtoAdapter<FriendErrorCode> ADAPTER = new ProtoAdapter_FriendErrorCode();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_FriendErrorCode extends EnumAdapter<FriendErrorCode> {
        static {
            Covode.recordClassIndex(23394);
        }

        ProtoAdapter_FriendErrorCode() {
            super(FriendErrorCode.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final FriendErrorCode fromValue(int i2) {
            return FriendErrorCode.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23393);
    }

    public static FriendErrorCode fromValue(int i2) {
        if (i2 == 0) {
            return FRIEND_SUCCESS;
        }
        if (i2 == 1) {
            return FRIEND_DUPLICATE_APPLY;
        }
        if (i2 == 2) {
            return FRIEND_SEND_APPLY_LIMIT;
        }
        if (i2 == 3) {
            return FRIEND_RECEIVE_APPLY_LIMIT;
        }
        if (i2 == 4) {
            return FRIEND_ALREADY_FRIEND;
        }
        if (i2 != 500) {
            return null;
        }
        return FRIEND_INTERNAL_ERR;
    }

    private FriendErrorCode(int i2) {
        this.value = i2;
    }
}
