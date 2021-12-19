package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ConversationOperationStatus implements WireEnum {
    OP_SUCCEED(0),
    REJECTED(1),
    PARTLY_REJECTED(2),
    APPLY_REJECTED(3),
    APPLY_SUCCEED(4),
    TOUCH_LIMITS(5);
    
    public static final ProtoAdapter<ConversationOperationStatus> ADAPTER = new ProtoAdapter_ConversationOperationStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_ConversationOperationStatus extends EnumAdapter<ConversationOperationStatus> {
        static {
            Covode.recordClassIndex(23324);
        }

        ProtoAdapter_ConversationOperationStatus() {
            super(ConversationOperationStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ConversationOperationStatus fromValue(int i2) {
            return ConversationOperationStatus.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23323);
    }

    public static ConversationOperationStatus fromValue(int i2) {
        if (i2 == 0) {
            return OP_SUCCEED;
        }
        if (i2 == 1) {
            return REJECTED;
        }
        if (i2 == 2) {
            return PARTLY_REJECTED;
        }
        if (i2 == 3) {
            return APPLY_REJECTED;
        }
        if (i2 == 4) {
            return APPLY_SUCCEED;
        }
        if (i2 != 5) {
            return null;
        }
        return TOUCH_LIMITS;
    }

    private ConversationOperationStatus(int i2) {
        this.value = i2;
    }
}
