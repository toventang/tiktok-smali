package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum SendMessageStatus implements WireEnum {
    SEND_SUCCEED(0),
    USER_NOT_IN_CONVERSATION(1),
    CHECK_CONV_NOT_PASS(2),
    CHECK_MSG_NOT_PASS(3),
    CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE(4),
    USER_HAS_BEEN_BLOCKED(5);
    
    public static final ProtoAdapter<SendMessageStatus> ADAPTER = new ProtoAdapter_SendMessageStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_SendMessageStatus extends EnumAdapter<SendMessageStatus> {
        static {
            Covode.recordClassIndex(23754);
        }

        ProtoAdapter_SendMessageStatus() {
            super(SendMessageStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final SendMessageStatus fromValue(int i2) {
            return SendMessageStatus.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23753);
    }

    public static SendMessageStatus fromValue(int i2) {
        if (i2 == 0) {
            return SEND_SUCCEED;
        }
        if (i2 == 1) {
            return USER_NOT_IN_CONVERSATION;
        }
        if (i2 == 2) {
            return CHECK_CONV_NOT_PASS;
        }
        if (i2 == 3) {
            return CHECK_MSG_NOT_PASS;
        }
        if (i2 == 4) {
            return CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE;
        }
        if (i2 != 5) {
            return null;
        }
        return USER_HAS_BEEN_BLOCKED;
    }

    private SendMessageStatus(int i2) {
        this.value = i2;
    }
}
