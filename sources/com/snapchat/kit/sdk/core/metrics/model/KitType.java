package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum KitType implements WireEnum {
    UNKNOWN_KIT_TYPE(0),
    BITMOJI_KIT(1),
    CREATIVE_KIT(2),
    LOGIN_KIT(3),
    STORY_KIT(4);
    
    public static final ProtoAdapter<KitType> ADAPTER = new ProtoAdapter_KitType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_KitType extends EnumAdapter<KitType> {
        static {
            Covode.recordClassIndex(35711);
        }

        ProtoAdapter_KitType() {
            super(KitType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final KitType fromValue(int i2) {
            return KitType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35710);
    }

    public static KitType fromValue(int i2) {
        if (i2 == 0) {
            return UNKNOWN_KIT_TYPE;
        }
        if (i2 == 1) {
            return BITMOJI_KIT;
        }
        if (i2 == 2) {
            return CREATIVE_KIT;
        }
        if (i2 == 3) {
            return LOGIN_KIT;
        }
        if (i2 != 4) {
            return null;
        }
        return STORY_KIT;
    }

    private KitType(int i2) {
        this.value = i2;
    }
}
