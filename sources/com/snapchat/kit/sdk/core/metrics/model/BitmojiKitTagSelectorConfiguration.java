package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitTagSelectorConfiguration implements WireEnum {
    TAG_SELECTOR_VISIBLE(0),
    TAG_SELECTOR_HIDDEN(1);
    
    public static final ProtoAdapter<BitmojiKitTagSelectorConfiguration> ADAPTER = new ProtoAdapter_BitmojiKitTagSelectorConfiguration();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_BitmojiKitTagSelectorConfiguration extends EnumAdapter<BitmojiKitTagSelectorConfiguration> {
        static {
            Covode.recordClassIndex(35687);
        }

        ProtoAdapter_BitmojiKitTagSelectorConfiguration() {
            super(BitmojiKitTagSelectorConfiguration.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final BitmojiKitTagSelectorConfiguration fromValue(int i2) {
            return BitmojiKitTagSelectorConfiguration.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35686);
    }

    public static BitmojiKitTagSelectorConfiguration fromValue(int i2) {
        if (i2 == 0) {
            return TAG_SELECTOR_VISIBLE;
        }
        if (i2 != 1) {
            return null;
        }
        return TAG_SELECTOR_HIDDEN;
    }

    private BitmojiKitTagSelectorConfiguration(int i2) {
        this.value = i2;
    }
}
