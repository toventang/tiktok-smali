package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum NetworkType implements WireEnum {
    UNKNOWN(0),
    WIFI(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    MOBILE_4G(4),
    MOBILE_5G(5);
    
    public static final ProtoAdapter<NetworkType> ADAPTER = new ProtoAdapter_NetworkType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_NetworkType extends EnumAdapter<NetworkType> {
        static {
            Covode.recordClassIndex(23652);
        }

        ProtoAdapter_NetworkType() {
            super(NetworkType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final NetworkType fromValue(int i2) {
            return NetworkType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23651);
    }

    public static NetworkType fromValue(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return WIFI;
        }
        if (i2 == 2) {
            return MOBILE_2G;
        }
        if (i2 == 3) {
            return MOBILE_3G;
        }
        if (i2 == 4) {
            return MOBILE_4G;
        }
        if (i2 != 5) {
            return null;
        }
        return MOBILE_5G;
    }

    private NetworkType(int i2) {
        this.value = i2;
    }
}
