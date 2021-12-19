package com.ss.android.ugc.tiktok.seclink.impl;

import com.bytedance.covode.number.Covode;

public enum TypeEnum {
    START_WITH(0),
    CONTAINS(1),
    REGEX_MATCHES(2),
    REGEX_CONTAINS_MATCH_IN(3),
    EQUAL(4);
    
    public static final a Companion = new a((byte) 0);
    private final int type;

    public static final class a {
        static {
            Covode.recordClassIndex(98144);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(98143);
    }

    public static final boolean isRegex(int i2) {
        if (i2 == REGEX_MATCHES.getType() || i2 == REGEX_CONTAINS_MATCH_IN.getType()) {
            return true;
        }
        return false;
    }

    private TypeEnum(int i2) {
        this.type = i2;
    }
}
