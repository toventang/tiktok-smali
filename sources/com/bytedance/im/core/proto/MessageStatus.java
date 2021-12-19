package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum MessageStatus implements WireEnum {
    AVAILABLE(0),
    NOT_EXIST(1),
    INVISIBLE(2),
    RECALLED(3),
    DELETED(4);
    
    public static final ProtoAdapter<MessageStatus> ADAPTER = new ProtoAdapter_MessageStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_MessageStatus extends EnumAdapter<MessageStatus> {
        static {
            Covode.recordClassIndex(23599);
        }

        ProtoAdapter_MessageStatus() {
            super(MessageStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final MessageStatus fromValue(int i2) {
            return MessageStatus.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23598);
    }

    public static MessageStatus fromValue(int i2) {
        if (i2 == 0) {
            return AVAILABLE;
        }
        if (i2 == 1) {
            return NOT_EXIST;
        }
        if (i2 == 2) {
            return INVISIBLE;
        }
        if (i2 == 3) {
            return RECALLED;
        }
        if (i2 != 4) {
            return null;
        }
        return DELETED;
    }

    private MessageStatus(int i2) {
        this.value = i2;
    }
}
