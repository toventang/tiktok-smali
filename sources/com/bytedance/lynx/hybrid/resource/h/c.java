package com.bytedance.lynx.hybrid.resource.h;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.b.f;
import com.bytedance.lynx.hybrid.resource.c.b;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.e;
import com.bytedance.lynx.hybrid.resource.g;
import com.bytedance.lynx.hybrid.resource.h;
import com.bytedance.lynx.hybrid.resource.j;
import h.f.b.l;
import h.q;
import h.r;
import h.w;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f41201a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static int f41202b;

    private c() {
    }

    static {
        Covode.recordClassIndex(25237);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f41203a;

        /* renamed from: b  reason: collision with root package name */
        public int f41204b;

        static {
            Covode.recordClassIndex(25238);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f41203a == aVar.f41203a && this.f41204b == aVar.f41204b;
        }

        public final int hashCode() {
            long j2 = this.f41203a;
            return (((int) (j2 ^ (j2 >>> 32))) * 31) + this.f41204b;
        }

        public final String toString() {
            return "LoadPerfParams(startTime=" + this.f41203a + ", perfFrequency=" + this.f41204b + ")";
        }

        public a(long j2, int i2) {
            this.f41203a = j2;
            this.f41204b = i2;
        }
    }

    private static String a(Uri uri, com.bytedance.lynx.hybrid.resource.config.c cVar) {
        String str;
        boolean z;
        try {
            String queryParameter = uri.getQueryParameter("accessKey");
            if (queryParameter == null) {
                queryParameter = "";
            }
            str = q.m223constructorimpl(queryParameter);
        } catch (Throwable th) {
            str = q.m223constructorimpl(r.a(th));
        }
        String accessKey = cVar.f41098j.getAccessKey();
        if (q.m228isFailureimpl(str)) {
            str = accessKey;
        }
        String str2 = (String) str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return cVar.f41098j.getAccessKey();
        }
        return str2;
    }

    private static j a(Uri uri, com.bytedance.lynx.hybrid.resource.config.j jVar, com.bytedance.lynx.hybrid.resource.config.c cVar, a aVar) {
        j jVar2 = new j(uri, false, null, aVar.f41203a, 1022);
        jVar2.d(jVar.o);
        jVar2.f41220h = b.a(cVar, jVar2.f41131m, jVar);
        jVar2.f41214b = b.a(jVar);
        return jVar2;
    }

    private static void a(String str, Uri uri, com.bytedance.lynx.hybrid.resource.config.j jVar, g gVar) {
        String str2;
        String b2;
        Object obj;
        Object obj2;
        if (jVar.f41111g.length() <= 0) {
            String str3 = "";
            if (!l.a((Object) jVar.o, (Object) "web")) {
                try {
                    String queryParameter = uri.getQueryParameter("channel");
                    if (queryParameter == null) {
                        queryParameter = str3;
                    }
                    obj = q.m223constructorimpl(queryParameter);
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                boolean r0 = q.m228isFailureimpl(obj);
                Object obj3 = obj;
                if (r0) {
                    obj3 = str3;
                }
                jVar.a((String) obj3);
                try {
                    String queryParameter2 = uri.getQueryParameter("bundle");
                    if (queryParameter2 == null) {
                        queryParameter2 = str3;
                    }
                    obj2 = q.m223constructorimpl(queryParameter2);
                } catch (Throwable th2) {
                    obj2 = q.m223constructorimpl(r.a(th2));
                }
                boolean r02 = q.m228isFailureimpl(obj2);
                Object obj4 = obj2;
                if (r02) {
                    obj4 = str3;
                }
                jVar.b((String) obj4);
            }
            if (jVar.f41111g.length() <= 0) {
                com.bytedance.lynx.hybrid.resource.d.a a2 = a.a(str, gVar, jVar);
                if (a2 == null || (str2 = a2.a()) == null) {
                    str2 = str3;
                }
                jVar.a(str2);
                if (!(a2 == null || (b2 = a2.b()) == null)) {
                    str3 = b2;
                }
                jVar.b(str3);
            }
        }
    }

    private static com.bytedance.lynx.hybrid.resource.config.j a(String str, Uri uri, com.bytedance.lynx.hybrid.resource.config.j jVar, com.bytedance.lynx.hybrid.resource.config.c cVar, g gVar) {
        if (jVar.t.length() == 0) {
            jVar.f(a(uri, cVar));
        }
        a(str, uri, jVar, gVar);
        jVar.q = cVar.f41092d;
        GeckoConfig a2 = f.a(cVar, jVar.t);
        if (!cVar.f41094f || !(a2.getGeckoDepender() instanceof h)) {
            return jVar;
        }
        e geckoDepender = a2.getGeckoDepender();
        if (geckoDepender != null) {
            return ((h) geckoDepender).a(uri, jVar);
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final com.bytedance.lynx.hybrid.resource.d.g a(boolean z, long j2, String str, Uri uri, com.bytedance.lynx.hybrid.resource.config.j jVar, g gVar) {
        l.c(str, "");
        l.c(uri, "");
        l.c(jVar, "");
        l.c(gVar, "");
        com.bytedance.lynx.hybrid.resource.config.c resourceConfig = gVar.getResourceConfig();
        int i2 = resourceConfig.f41090b;
        if (i2 > 0) {
            f41202b = (f41202b + 1) % i2;
        }
        a aVar = new a(j2, f41202b);
        com.bytedance.lynx.hybrid.resource.config.j a2 = a(str, uri, jVar, resourceConfig, gVar);
        return new com.bytedance.lynx.hybrid.resource.d.g(str, a(uri, a2, resourceConfig, aVar), a2, z);
    }
}
