package com.bytedance.im.core.proto;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum AuthType implements WireEnum {
    UNKNOWN_AUTH(0),
    SESSION_AUTH(1),
    TOKEN_AUTH(2);
    
    public static final ProtoAdapter<AuthType> ADAPTER = new ProtoAdapter_AuthType();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_AuthType extends EnumAdapter<AuthType> {
        static {
            Covode.recordClassIndex(23196);
        }

        ProtoAdapter_AuthType() {
            super(AuthType.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final AuthType fromValue(int i2) {
            return AuthType.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(23195);
    }

    public static AuthType fromValue(int i2) {
        if (i2 == 0) {
            return UNKNOWN_AUTH;
        }
        if (i2 == 1) {
            return SESSION_AUTH;
        }
        if (i2 != 2) {
            return null;
        }
        return TOKEN_AUTH;
    }

    private AuthType(int i2) {
        this.value = i2;
    }
}
