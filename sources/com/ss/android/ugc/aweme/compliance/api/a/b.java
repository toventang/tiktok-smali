package com.ss.android.ugc.aweme.compliance.api.a;

import com.bytedance.covode.number.Covode;

public enum b {
    NOT_LOGIN("-1"),
    NORMAL("0"),
    CHILD_US("1"),
    CHILD_OTHERS("2"),
    UNKNOWN("");
    
    public static final a Companion = new a((byte) 0);
    private final String userType;

    public static final class a {
        static {
            Covode.recordClassIndex(47309);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getUserType() {
        return this.userType;
    }

    static {
        Covode.recordClassIndex(47308);
    }

    private b(String str) {
        this.userType = str;
    }
}
