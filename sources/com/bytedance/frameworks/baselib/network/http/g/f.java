package com.bytedance.frameworks.baselib.network.http.g;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.c.c;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicInteger f29375a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private static String f29376b = null;

    static {
        Covode.recordClassIndex(17124);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[SYNTHETIC, Splitter:B:18:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r6 = 1863(0x747, float:2.61E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x004e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x004e }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x004e }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004e }
            r2.<init>(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch:{ all -> 0x004e }
            r4.<init>(r3)     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
        L_0x0035:
            int r0 = r4.read()     // Catch:{ all -> 0x004f }
            if (r0 <= 0) goto L_0x0040
            char r0 = (char) r0     // Catch:{ all -> 0x004f }
            r1.append(r0)     // Catch:{ all -> 0x004f }
            goto L_0x0035
        L_0x0040:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004f }
            r4.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        L_0x004e:
            r4 = r5
        L_0x004f:
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.g.f.a():java.lang.String");
    }

    public static boolean a(Context context) {
        Logger.debug();
        int i2 = f29375a.get();
        if (i2 == 1) {
            return true;
        }
        if (i2 != 2) {
            return b(context);
        }
        return false;
    }

    public static boolean b(Context context) {
        String c2 = c(context);
        if (c2 == null || c2.contains(":") || !c2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static String c(Context context) {
        if (TextUtils.isEmpty(c.a())) {
            c.f107192a = d(context);
        }
        return c.f107192a;
    }

    private static String d(Context context) {
        String str = f29376b;
        if (!m.a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    Logger.debug();
                    String str2 = runningAppProcessInfo.processName;
                    f29376b = str2;
                    return str2;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String a2 = a();
        f29376b = a2;
        return a2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1849);
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
                    MethodCollector.o(1849);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
