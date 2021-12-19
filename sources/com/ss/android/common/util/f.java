package com.ss.android.common.util;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
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
import com.ss.android.ugc.aweme.net.a.a;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static String f59384a = ":push";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f59385b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f59386c;

    /* renamed from: d  reason: collision with root package name */
    private static String f59387d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f59388e = true;

    static {
        Covode.recordClassIndex(36676);
    }

    public static String b() {
        return a.a().a("ro.build.version.emui");
    }

    public static boolean c() {
        if (!f59386c) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f59385b = true;
                    f59386c = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f59386c = true;
        }
        return f59385b;
    }

    public static boolean d() {
        if (!m.a(Build.DISPLAY) && Build.DISPLAY.indexOf("Flyme") >= 0) {
            return true;
        }
        if (m.a(Build.USER) || !Build.USER.equals("flyme")) {
            return false;
        }
        return true;
    }

    public static boolean a() {
        try {
            if ((m.a(Build.BRAND) || !Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("huawei")) && (m.a(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("huawei"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[SYNTHETIC, Splitter:B:18:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String e() {
        /*
            r6 = 4067(0xfe3, float:5.699E-42)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.util.f.e():java.lang.String");
    }

    public static boolean a(Context context) {
        String b2 = b(context);
        if (b2 == null || b2.contains(":") || !b2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static String b(Context context) {
        if (TextUtils.isEmpty(c.a())) {
            c.f107192a = c(context);
        }
        return c.f107192a;
    }

    private static String c(Context context) {
        String str = f59387d;
        if (!m.a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) c(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    Logger.debug();
                    String str2 = runningAppProcessInfo.processName;
                    f59387d = str2;
                    return str2;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String e3 = e();
        f59387d = e3;
        return e3;
    }

    public static Intent a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return launchIntentForPackage;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean b(Context context, String str) {
        if (context == null || m.a(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 16777216) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static Object c(Context context, String str) {
        Object obj;
        MethodCollector.i(4047);
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
                    MethodCollector.o(4047);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static boolean a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        if (intent == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536)) == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }
}
