package com.bytedance.helios.sdk.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.m.p;
import h.w;
import java.lang.reflect.Field;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f31015a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static String f31016b;

    private h() {
    }

    static {
        Covode.recordClassIndex(18012);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[SYNTHETIC, Splitter:B:17:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r6 = 2028(0x7ec, float:2.842E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            r5 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x004f }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x004f }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "/proc/"
            r1.<init>(r0)     // Catch:{ all -> 0x004f }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x004f }
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "/cmdline"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004f }
            r2.<init>(r0)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "iso-8859-1"
            r3.<init>(r2, r0)     // Catch:{ all -> 0x004f }
            r4.<init>(r3)     // Catch:{ all -> 0x004f }
            int r0 = r4.read()     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r1.<init>()     // Catch:{ all -> 0x0050 }
        L_0x0039:
            if (r0 <= 0) goto L_0x0044
            char r0 = (char) r0     // Catch:{ all -> 0x0050 }
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            int r0 = r4.read()     // Catch:{ all -> 0x0050 }
            goto L_0x0039
        L_0x0044:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0050 }
            r4.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r0
        L_0x004f:
            r4 = r5
        L_0x0050:
            if (r4 == 0) goto L_0x0055
            r4.close()     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.utils.h.a():java.lang.String");
    }

    public static boolean a(Context context) {
        l.c(context, "");
        String b2 = b(context);
        if (b2 != null && !p.a((CharSequence) b2, (CharSequence) ":", false)) {
            return l.a((Object) b2, (Object) context.getPackageName());
        }
        return false;
    }

    private static String b(Context context) {
        boolean z;
        String str = f31016b;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            Object a2 = a(context, "activity");
            if (a2 != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a2).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str2 = runningAppProcessInfo.processName;
                        f31016b = str2;
                        return str2;
                    }
                }
                String a3 = a();
                f31016b = a3;
                return a3;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2010);
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
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2010);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
