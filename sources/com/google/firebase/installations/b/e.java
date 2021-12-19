package com.google.firebase.installations.b;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.b.b;

public abstract class e {

    public static abstract class a {
        static {
            Covode.recordClassIndex(33850);
        }

        public abstract a a(long j2);

        public abstract a a(b bVar);

        public abstract a a(String str);

        public abstract e a();
    }

    static {
        Covode.recordClassIndex(33849);
    }

    public abstract String a();

    public abstract long b();

    public abstract b c();

    public static a d() {
        return new b.a().a(0);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR;

        static {
            Covode.recordClassIndex(33851);
        }
    }
}
