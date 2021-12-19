package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum PreviewOperationStatus implements WireEnum {
    PREVIEW_OP_SUCCEED(0),
    PREVIEW_OP_PREVIEW_STATUS_NOT_OPEN(1),
    PREVIEW_OP_CALLBACK_NOT_PASS(2),
    PREVIEW_OP_CONVERSATION_NOT_FOUND(3);
    
    public static final ProtoAdapter<PreviewOperationStatus> ADAPTER = new ProtoAdapter_PreviewOperationStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_PreviewOperationStatus extends EnumAdapter<PreviewOperationStatus> {
        static {
            Covode.recordClassIndex(23676);
        }

        ProtoAdapter_PreviewOperationStatus() {
            super(PreviewOperationStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final PreviewOperationStatus fromValue(int i2) {
            return PreviewOperationStatus.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23675);
    }

    public static PreviewOperationStatus fromValue(int i2) {
        if (i2 == 0) {
            return PREVIEW_OP_SUCCEED;
        }
        if (i2 == 1) {
            return PREVIEW_OP_PREVIEW_STATUS_NOT_OPEN;
        }
        if (i2 == 2) {
            return PREVIEW_OP_CALLBACK_NOT_PASS;
        }
        if (i2 != 3) {
            return null;
        }
        return PREVIEW_OP_CONVERSATION_NOT_FOUND;
    }

    private PreviewOperationStatus(int i2) {
        this.value = i2;
    }
}
