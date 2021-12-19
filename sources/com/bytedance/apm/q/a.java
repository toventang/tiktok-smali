package com.bytedance.apm.q;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f25225a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f25226b;

    static {
        Covode.recordClassIndex(14695);
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static Application a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        return (Application) c(context);
    }

    public static boolean b(Context context) {
        boolean z;
        Boolean bool = f25226b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f25226b = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC, Splitter:B:21:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(int r5) {
        /*
            java.lang.String r0 = com.bytedance.apm.q.a.f25225a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = com.bytedance.apm.q.a.f25225a
            return r0
        L_0x000b:
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0044 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0044 }
            r2.<init>(r0)     // Catch:{ all -> 0x0044 }
            r3.<init>(r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0045 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0045 }
        L_0x0039:
            com.bytedance.apm.q.a.f25225a = r1     // Catch:{ all -> 0x0045 }
            r3.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0043:
            return r1
        L_0x0044:
            r3 = r4
        L_0x0045:
            if (r3 == 0) goto L_0x004f
            r3.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.q.a.a(int):java.lang.String");
    }
}
