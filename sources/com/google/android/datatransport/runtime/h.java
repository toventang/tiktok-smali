package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class h {
    static {
        Covode.recordClassIndex(30943);
    }

    public abstract String a();

    public abstract Integer b();

    public abstract g c();

    public abstract long d();

    public abstract long e();

    /* access modifiers changed from: protected */
    public abstract Map<String, String> f();

    public static a i() {
        a.C1198a aVar = new a.C1198a();
        aVar.f49384a = new HashMap();
        return aVar;
    }

    public final Map<String, String> g() {
        return Collections.unmodifiableMap(f());
    }

    public final a h() {
        return new a.C1198a().a(a()).a(b()).a(c()).a(d()).b(e()).a(new HashMap(f()));
    }

    public final String c(String str) {
        String str2 = f().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int a(String str) {
        String str2 = f().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long b(String str) {
        String str2 = f().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    public static abstract class a {
        static {
            Covode.recordClassIndex(30944);
        }

        public abstract a a(long j2);

        public abstract a a(g gVar);

        public abstract a a(Integer num);

        public abstract a a(String str);

        /* access modifiers changed from: protected */
        public abstract a a(Map<String, String> map);

        /* access modifiers changed from: protected */
        public abstract Map<String, String> a();

        public abstract a b(long j2);

        public abstract h b();

        public final a a(String str, int i2) {
            a().put(str, String.valueOf(i2));
            return this;
        }

        public final a a(String str, long j2) {
            a().put(str, String.valueOf(j2));
            return this;
        }

        public final a a(String str, String str2) {
            a().put(str, str2);
            return this;
        }
    }
}
