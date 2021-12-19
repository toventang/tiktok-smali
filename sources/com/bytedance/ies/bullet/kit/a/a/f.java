package com.bytedance.ies.bullet.kit.a.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.i;
import h.f.b.l;
import h.m.p;
import java.io.InputStream;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f32208a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(18890);
    }

    private static void a(InputStream inputStream) {
        l.c(inputStream, "");
        try {
            inputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String a(Uri uri) {
        l.c(uri, "");
        if (!uri.isHierarchical()) {
            String uri2 = uri.toString();
            l.a((Object) uri2, "");
            return uri2;
        }
        try {
            String builder = uri.buildUpon().clearQuery().toString();
            l.a((Object) builder, "");
            return builder;
        } catch (Throwable unused) {
            String uri3 = uri.toString();
            l.a((Object) uri3, "");
            return uri3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r2 == null) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double a(java.io.File r7) {
        /*
            r6 = 10490(0x28fa, float:1.47E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            java.lang.String r0 = ""
            h.f.b.l.c(r7, r0)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x003e
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto L_0x003e
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002a }
            r1.<init>(r7)     // Catch:{ Exception -> 0x002a }
            int r0 = r1.available()     // Catch:{ Exception -> 0x0027, all -> 0x0024 }
            a(r1)
            goto L_0x003f
        L_0x0024:
            r0 = move-exception
            r2 = r1
            goto L_0x0032
        L_0x0027:
            r0 = move-exception
            r2 = r1
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            r0.printStackTrace()     // Catch:{ all -> 0x002f }
            goto L_0x0039
        L_0x002f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0035
        L_0x0032:
            a(r2)
        L_0x0035:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            a(r2)
        L_0x003e:
            r0 = 0
        L_0x003f:
            double r4 = (double) r0
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r2
            int r0 = h.g.a.a(r4)
            double r0 = (double) r0
            java.lang.Double.isNaN(r0)
            double r0 = r0 / r2
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.a.a.f.a(java.io.File):double");
    }

    public static boolean a(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    public static GeckoConfig a(i iVar, String str) {
        l.c(iVar, "");
        l.c(str, "");
        GeckoConfig geckoConfig = iVar.n.get(str);
        if (geckoConfig == null) {
            return iVar.f32632m;
        }
        return geckoConfig;
    }

    public static String a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        if (str2.length() == 0) {
            return str;
        }
        return str + '/' + p.a(str2, (CharSequence) "/");
    }
}
