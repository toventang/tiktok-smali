package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import d.a.d.a.c;
import d.a.d.a.d;
import d.a.d.a.f;
import d.a.d.a.g;
import d.a.d.a.h;
import d.a.d.a.i;
import d.a.e.b;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f153970a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(102677);
    }

    public static String b(String str) {
        int a2;
        if (str == null || (a2 = p.a((CharSequence) str, d.f156619a)) < 0) {
            return null;
        }
        String substring = str.substring(0, a2);
        l.a((Object) substring, "");
        return substring;
    }

    public static boolean c(String str) {
        if (str == null) {
            return false;
        }
        boolean g2 = d.g(str);
        if (!g2 && d.f(str)) {
            b.a("FileUtils", "remove file: " + str + " failed!", null);
            a(str, str + "_dirty", true);
        }
        return g2;
    }

    public static long a(String str) {
        f c2;
        long j2;
        if (str == null || (c2 = d.c(str)) == null) {
            return 0;
        }
        if (c2.f156631g == i.Directory) {
            List<f> a2 = d.a(str);
            if (a2 == null) {
                return 0;
            }
            long j3 = 0;
            for (T t : a2) {
                if (t.f156631g == i.Directory) {
                    j2 = a(t.f156626b.f156633a);
                } else {
                    Long l2 = t.f156630f;
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = 0;
                    }
                }
                j3 += j2;
            }
            return j3;
        }
        Long l3 = c2.f156630f;
        if (l3 != null) {
            return l3.longValue();
        }
        return 0;
    }

    public static boolean a(h hVar) {
        if (hVar == null) {
            return false;
        }
        boolean c2 = d.c(hVar);
        if (!c2 && d.b(hVar)) {
            b.a("FileUtils", "remove file: " + hVar.f156633a + " failed!", null);
            a(hVar.f156633a, hVar.f156633a + "_dirty", true);
        }
        return c2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|18|19|20|21) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = ""
            h.f.b.l.c(r4, r0)
            h.f.b.l.c(r5, r0)
            boolean r0 = h.m.p.a(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0015
            boolean r0 = h.m.p.a(r5)
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            return r3
        L_0x0016:
            java.lang.String r0 = "_tmp"
            java.lang.String r2 = a(r5, r0)
            r1 = 1
            if (r2 == 0) goto L_0x0025
            boolean r0 = h.m.p.a(r2)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r3
        L_0x0026:
            d.a.d.a.d.g(r2)     // Catch:{ Exception -> 0x003a }
            d.a.d.a.d.b(r4, r2)     // Catch:{ Exception -> 0x003a }
            boolean r0 = a(r2, r5, r3)     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0033
            return r1
        L_0x0033:
            d.a.d.a.d.g(r2)     // Catch:{ Exception -> 0x003a }
            d.a.d.a.d.g(r5)     // Catch:{ Exception -> 0x003a }
            return r3
        L_0x003a:
            r0 = move-exception
            d.a.d.a.d.g(r2)     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            d.a.d.a.d.g(r5)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.k.b(java.lang.String, java.lang.String):boolean");
    }

    public static String a(String str, String str2) {
        l.c(str2, "");
        if (str == null) {
            return null;
        }
        if (p.c(str, d.f156619a, false)) {
            return p.b(str, 1) + str2 + d.f156619a;
        }
        return str + str2;
    }

    public static boolean a(String str, String str2, boolean z) {
        l.c(str2, "");
        if (str == null) {
            return false;
        }
        if (d.a(str, str2)) {
            return true;
        }
        if (z) {
            return d.a(new h(str), new h(str2));
        }
        return false;
    }

    public static long a(c cVar, g gVar, long j2, m<? super Integer, ? super Long, z> mVar) {
        l.c(cVar, "");
        l.c(gVar, "");
        byte[] bArr = new byte[8192];
        int a2 = cVar.a(bArr, 8192);
        long j3 = 0;
        while (a2 > 0) {
            gVar.a(bArr, 0, a2);
            j3 += (long) a2;
            if (j3 < j2 && j2 > 0 && mVar != null) {
                mVar.invoke(Integer.valueOf((int) ((((float) j3) / ((float) j2)) * 100.0f)), Long.valueOf(j2));
            }
            a2 = cVar.a(bArr, 8192);
        }
        if (mVar != null) {
            mVar.invoke(100, Long.valueOf(j2));
        }
        gVar.c();
        gVar.a();
        return j3;
    }

    public static String b(c cVar, g gVar, long j2, m<? super Integer, ? super Long, z> mVar) {
        l.c(cVar, "");
        l.c(gVar, "");
        d.a.c.f fVar = new d.a.c.f();
        byte[] bArr = new byte[8192];
        int a2 = cVar.a(bArr, 8192);
        long j3 = 0;
        while (a2 > 0) {
            gVar.a(bArr, 0, a2);
            j3 += (long) a2;
            fVar.a(bArr, a2);
            if (j3 < j2 && j2 > 0 && mVar != null) {
                mVar.invoke(Integer.valueOf((int) ((((float) j3) / ((float) j2)) * 100.0f)), Long.valueOf(j2));
            }
            a2 = cVar.a(bArr, 8192);
        }
        if (mVar != null) {
            mVar.invoke(100, Long.valueOf(j2));
        }
        byte[] b2 = fVar.b();
        gVar.c();
        gVar.a();
        return d.a.c.c.a(b2);
    }
}
