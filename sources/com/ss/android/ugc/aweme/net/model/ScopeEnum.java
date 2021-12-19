package com.ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;

public enum ScopeEnum {
    ALL(0),
    LOCAL_TEST(1),
    IN_HOUSE(2),
    OFFLINE(3),
    ONLINE(4);
    
    public static final a Companion = new a((byte) 0);
    private final int scope;

    public static final boolean isValidScope(int i2) {
        return a.a(i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72262);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(int i2) {
            if (i2 == ScopeEnum.ALL.getScope() || i2 == ScopeEnum.ONLINE.getScope()) {
                return true;
            }
            return false;
        }
    }

    public final int getScope() {
        return this.scope;
    }

    static {
        Covode.recordClassIndex(72261);
    }

    private ScopeEnum(int i2) {
        this.scope = i2;
    }
}
