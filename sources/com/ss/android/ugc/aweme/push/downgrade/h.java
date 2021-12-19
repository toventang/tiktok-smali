package com.ss.android.ugc.aweme.push.downgrade;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f118886a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile String f118887b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile String f118888c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f118889d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f118890e;

    static {
        Covode.recordClassIndex(77236);
    }

    public static String a(Context context) {
        f(context);
        return f118887b;
    }

    public static String b(Context context) {
        f(context);
        return f118888c;
    }

    public static boolean c(Context context) {
        d(context);
        return f118886a;
    }

    private static void d(Context context) {
        MethodCollector.i(7388);
        if (f118890e || f118886a) {
            MethodCollector.o(7388);
            return;
        }
        synchronized (h.class) {
            try {
                if (!f118890e && !f118886a) {
                    e(context);
                }
                f118890e = true;
            } finally {
                MethodCollector.o(7388);
            }
        }
    }

    private static void e(Context context) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) b(context, "activity")).getRunningAppProcesses();
            f(context);
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && !TextUtils.isEmpty(runningAppProcessInfo.processName)) {
                        if (TextUtils.equals(runningAppProcessInfo.processName, f118887b) || TextUtils.equals(runningAppProcessInfo.processName, f118888c)) {
                            f118886a = true;
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.getStackTraceString(th);
        }
    }

    private static void f(Context context) {
        MethodCollector.i(7529);
        if (!f118889d) {
            synchronized (h.class) {
                try {
                    if (!f118889d) {
                        String packageName = context.getPackageName();
                        f118887b = packageName + ":push";
                        f118888c = packageName + ":pushservice";
                        f118889d = true;
                    }
                } finally {
                    MethodCollector.o(7529);
                }
            }
            return;
        }
        MethodCollector.o(7529);
    }

    public static boolean a(Context context, String str) {
        f(context);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals(f118887b, str) || TextUtils.equals(f118888c, str)) {
            return true;
        }
        return false;
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(7458);
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
                    MethodCollector.o(7458);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
