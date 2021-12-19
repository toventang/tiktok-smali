package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum KitPluginType implements WireEnum {
    NO_PLUGIN(0),
    UNITY(1);
    
    public static final ProtoAdapter<KitPluginType> ADAPTER = new ProtoAdapter_KitPluginType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_KitPluginType extends EnumAdapter<KitPluginType> {
        static {
            Covode.recordClassIndex(35709);
        }

        ProtoAdapter_KitPluginType() {
            super(KitPluginType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final KitPluginType fromValue(int i2) {
            return KitPluginType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35708);
    }

    public static KitPluginType fromValue(int i2) {
        if (i2 == 0) {
            return NO_PLUGIN;
        }
        if (i2 != 1) {
            return null;
        }
        return UNITY;
    }

    private KitPluginType(int i2) {
        this.value = i2;
    }
}
