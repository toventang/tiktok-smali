package com.ss.ttm.a;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static long[] f151886a;

    /* renamed from: b  reason: collision with root package name */
    private static long f151887b;

    static {
        Covode.recordClassIndex(101279);
    }

    public static long[] a() {
        if (f151886a == null) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            f151886a = new long[]{c(), ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())};
        }
        return f151886a;
    }

    private static long c() {
        if (f151887b == 0) {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            f151887b = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        }
        return f151887b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long b() {
        /*
            r4 = 1996(0x7cc, float:2.797E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.lang.String r0 = "/proc/meminfo"
            r3 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0021, all -> 0x0033 }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0021, all -> 0x0033 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0021, all -> 0x0033 }
            r0 = 8
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x0021, all -> 0x0033 }
            java.lang.String r0 = r2.readLine()     // Catch:{ Exception -> 0x001f }
            if (r0 == 0) goto L_0x001b
            r3 = r0
        L_0x001b:
            r2.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x0042
        L_0x001f:
            r0 = move-exception
            goto L_0x0023
        L_0x0021:
            r0 = move-exception
            r2 = r3
        L_0x0023:
            r0.printStackTrace()     // Catch:{ all -> 0x0027 }
            goto L_0x0038
        L_0x0027:
            r1 = move-exception
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ Exception -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0034
        L_0x0033:
            r1 = move-exception
        L_0x0034:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        L_0x0038:
            if (r2 == 0) goto L_0x0042
            r2.close()
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0042:
            r0 = 58
            int r2 = r3.indexOf(r0)
            r0 = 107(0x6b, float:1.5E-43)
            int r1 = r3.indexOf(r0)
            int r0 = r2 + 1
            java.lang.String r0 = r3.substring(r0, r1)
            java.lang.String r0 = r0.trim()
            int r0 = java.lang.Integer.parseInt(r0)
            long r0 = (long) r0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.a.d.b():long");
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) a(context, "activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1985);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(1985);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
