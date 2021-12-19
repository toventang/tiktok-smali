package com.ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.Locale;
import java.util.Objects;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f112480a = new o();

    private o() {
    }

    static {
        Covode.recordClassIndex(72291);
    }

    public static boolean a(String str) {
        if (str != null && !p.a((CharSequence) str)) {
            Locale locale = Locale.getDefault();
            l.b(locale, "");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            l.b(lowerCase, "");
            if (p.e((CharSequence) lowerCase, (CharSequence) "application/json") || p.e((CharSequence) lowerCase, (CharSequence) "text/plain")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (h.m.p.a((java.lang.CharSequence) r1) == false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(com.bytedance.retrofit2.u<?> r7) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.monitor.o.a(com.bytedance.retrofit2.u):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(okhttp3.Response r6) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.monitor.o.a(okhttp3.Response):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        h.e.c.a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r3, java.io.InputStream r4) {
        /*
            boolean r0 = a(r3)
            r3 = 0
            if (r0 == 0) goto L_0x002f
            if (r4 == 0) goto L_0x0018
            java.nio.charset.Charset r0 = h.m.d.f158808a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r4, r0)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r0 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r1, r0)
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            r0 = r2
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = h.e.q.a(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0024
        L_0x0023:
            r0 = r3
        L_0x0024:
            h.e.c.a(r2, r3)
            return r0
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            h.e.c.a(r2, r1)
            throw r0
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.monitor.o.a(java.lang.String, java.io.InputStream):java.lang.String");
    }
}
