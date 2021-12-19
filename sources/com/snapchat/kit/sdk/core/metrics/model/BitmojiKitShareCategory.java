package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitShareCategory implements WireEnum {
    UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY(0),
    POPULAR(1),
    SEARCH(2);
    
    public static final ProtoAdapter<BitmojiKitShareCategory> ADAPTER = new ProtoAdapter_BitmojiKitShareCategory();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_BitmojiKitShareCategory extends EnumAdapter<BitmojiKitShareCategory> {
        static {
            Covode.recordClassIndex(35668);
        }

        ProtoAdapter_BitmojiKitShareCategory() {
            super(BitmojiKitShareCategory.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BitmojiKitShareCategory fromValue(int i2) {
            return BitmojiKitShareCategory.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35667);
    }

    public static BitmojiKitShareCategory fromValue(int i2) {
        if (i2 == 0) {
            return UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY;
        }
        if (i2 == 1) {
            return POPULAR;
        }
        if (i2 != 2) {
            return null;
        }
        return SEARCH;
    }

    private BitmojiKitShareCategory(int i2) {
        this.value = i2;
    }
}
