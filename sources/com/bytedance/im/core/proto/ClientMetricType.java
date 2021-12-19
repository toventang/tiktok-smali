package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ClientMetricType implements WireEnum {
    COUNTER(0),
    TIMER(1);
    
    public static final ProtoAdapter<ClientMetricType> ADAPTER = new ProtoAdapter_ClientMetricType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_ClientMetricType extends EnumAdapter<ClientMetricType> {
        static {
            Covode.recordClassIndex(23277);
        }

        ProtoAdapter_ClientMetricType() {
            super(ClientMetricType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final ClientMetricType fromValue(int i2) {
            return ClientMetricType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23276);
    }

    public static ClientMetricType fromValue(int i2) {
        if (i2 == 0) {
            return COUNTER;
        }
        if (i2 != 1) {
            return null;
        }
        return TIMER;
    }

    private ClientMetricType(int i2) {
        this.value = i2;
    }
}
