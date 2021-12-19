package com.ss.android.websocket.internal.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum Version implements WireEnum {
    V1(1);
    
    public static final ProtoAdapter<Version> ADAPTER = ProtoAdapter.newEnumAdapter(Version.class);
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(99673);
    }

    public static Version fromValue(int i2) {
        if (i2 != 1) {
            return null;
        }
        return V1;
    }

    private Version(int i2) {
        this.value = i2;
    }
}
