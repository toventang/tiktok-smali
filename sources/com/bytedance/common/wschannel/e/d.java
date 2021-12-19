package com.bytedance.common.wschannel.e;

import android.app.ActivityManager;
import android.app.Service;
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
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.c.c;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f27214a;

    static {
        Covode.recordClassIndex(16044);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[SYNTHETIC, Splitter:B:18:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r6 = 9784(0x2638, float:1.371E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.e.d.a():java.lang.String");
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
        String str = f27214a;
        if (!m.a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    Logger.debug();
                    String str2 = runningAppProcessInfo.processName;
                    f27214a = str2;
                    return str2;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String a2 = a();
        f27214a = a2;
        return a2;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    hexString = "0".concat(String.valueOf(hexString));
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9781);
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
                    MethodCollector.o(9781);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static boolean a(Context context, Class<? extends Service> cls) {
        if (!(context == null || cls == null)) {
            try {
                for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) a(context, "activity")).getRunningServices(Integer.MAX_VALUE)) {
                    if (!(runningServiceInfo == null || runningServiceInfo.service == null || !TextUtils.equals(cls.getName(), runningServiceInfo.service.getClassName()))) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
