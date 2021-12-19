package com.snapchat.kit.sdk.core.metrics.model;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum LoginRoute implements WireEnum {
    UNKNOWN_LOGIN_ROUTE(0),
    LOGIN_ROUTE(1),
    VERIFY_ROUTE(2);
    
    public static final ProtoAdapter<LoginRoute> ADAPTER = new ProtoAdapter_LoginRoute();
    private final int value;

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    static final class ProtoAdapter_LoginRoute extends EnumAdapter<LoginRoute> {
        static {
            Covode.recordClassIndex(35725);
        }

        ProtoAdapter_LoginRoute() {
            super(LoginRoute.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.squareup.wire.EnumAdapter
        public final LoginRoute fromValue(int i2) {
            return LoginRoute.fromValue(i2);
        }
    }

    static {
        Covode.recordClassIndex(35724);
    }

    public static LoginRoute fromValue(int i2) {
        if (i2 == 0) {
            return UNKNOWN_LOGIN_ROUTE;
        }
        if (i2 == 1) {
            return LOGIN_ROUTE;
        }
        if (i2 != 2) {
            return null;
        }
        return VERIFY_ROUTE;
    }

    private LoginRoute(int i2) {
        this.value = i2;
    }
}
