package com.ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;

public enum TypeEnum {
    START_WITH(0),
    CONTAINS(1),
    REGEX_MATCHES(2),
    REGEX_CONTAINS_MATCH_IN(3),
    EQUAL(4);
    
    public static final a Companion = new a((byte) 0);
    private final int type;

    public static final boolean isRegex(int i2) {
        return a.a(i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72264);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(int i2) {
            if (i2 == TypeEnum.REGEX_MATCHES.getType() || i2 == TypeEnum.REGEX_CONTAINS_MATCH_IN.getType()) {
                return true;
            }
            return false;
        }
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(72263);
    }

    private TypeEnum(int i2) {
        this.type = i2;
    }
}
