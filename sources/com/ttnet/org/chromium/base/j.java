package com.ttnet.org.chromium.base;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static String f155249a;

    static {
        Covode.recordClassIndex(103313);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r6 = 13296(0x33f0, float:1.8632E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x004b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x004b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x004b }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004b }
            r2.<init>(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch:{ all -> 0x004b }
            r4.<init>(r3)     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r1.<init>()     // Catch:{ all -> 0x004c }
        L_0x0035:
            int r0 = r4.read()     // Catch:{ all -> 0x004c }
            if (r0 <= 0) goto L_0x0040
            char r0 = (char) r0     // Catch:{ all -> 0x004c }
            r1.append(r0)     // Catch:{ all -> 0x004c }
            goto L_0x0035
        L_0x0040:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004c }
            r4.close()     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        L_0x004b:
            r4 = r5
        L_0x004c:
            if (r4 == 0) goto L_0x0051
            r4.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.j.a():java.lang.String");
    }

    public static boolean a(Context context) {
        String b2 = b(context);
        if (b2 == null || b2.contains(":") || !b2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    private static String b(Context context) {
        String str = f155249a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (g.a()) {
                        String str2 = runningAppProcessInfo.processName;
                    }
                    String str3 = runningAppProcessInfo.processName;
                    f155249a = str3;
                    return str3;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String a2 = a();
        f155249a = a2;
        return a2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13223);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(13223);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
