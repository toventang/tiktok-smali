package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitPermissionUpdateStatus implements WireEnum {
    UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS(0),
    BITMOJI_PERMISSION_ON(1),
    BITMOJI_PERMISSION_OFF(2),
    BITMOJI_REAUTH_ERROR(3);
    
    public static final ProtoAdapter<BitmojiKitPermissionUpdateStatus> ADAPTER = new ProtoAdapter_BitmojiKitPermissionUpdateStatus();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_BitmojiKitPermissionUpdateStatus extends EnumAdapter<BitmojiKitPermissionUpdateStatus> {
        static {
            Covode.recordClassIndex(35650);
        }

        ProtoAdapter_BitmojiKitPermissionUpdateStatus() {
            super(BitmojiKitPermissionUpdateStatus.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BitmojiKitPermissionUpdateStatus fromValue(int i2) {
            return BitmojiKitPermissionUpdateStatus.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35649);
    }

    public static BitmojiKitPermissionUpdateStatus fromValue(int i2) {
        if (i2 == 0) {
            return UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS;
        }
        if (i2 == 1) {
            return BITMOJI_PERMISSION_ON;
        }
        if (i2 == 2) {
            return BITMOJI_PERMISSION_OFF;
        }
        if (i2 != 3) {
            return null;
        }
        return BITMOJI_REAUTH_ERROR;
    }

    private BitmojiKitPermissionUpdateStatus(int i2) {
        this.value = i2;
    }
}
