package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MessageDirection implements WireEnum {
    OLDER(1),
    NEWER(2),
    FROM_LATEST(3);
    
    public static final ProtoAdapter<MessageDirection> ADAPTER = new ProtoAdapter_MessageDirection();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_MessageDirection extends EnumAdapter<MessageDirection> {
        static {
            Covode.recordClassIndex(23594);
        }

        ProtoAdapter_MessageDirection() {
            super(MessageDirection.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MessageDirection fromValue(int i2) {
            return MessageDirection.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23593);
    }

    public static MessageDirection fromValue(int i2) {
        if (i2 == 1) {
            return OLDER;
        }
        if (i2 == 2) {
            return NEWER;
        }
        if (i2 != 3) {
            return null;
        }
        return FROM_LATEST;
    }

    private MessageDirection(int i2) {
        this.value = i2;
    }
}
