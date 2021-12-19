package com.ss.android.ugc.awemepushlib.f;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f145392a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static int f145393b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f145394c = Pattern.compile("^0-([\\d]+)$");

    static {
        Covode.recordClassIndex(95069);
    }

    public static boolean a() {
        if (TextUtils.equals(Build.MANUFACTURER.toLowerCase(), "oppo")) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return Settings.canDrawOverlays(context);
            } catch (Throwable unused) {
            }
        }
        try {
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke((AppOpsManager) a(context, "appops"), Integer.valueOf(AppOpsManager.class.getField("OP_SYSTEM_ALERT_WINDOW").getInt(null)), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9232);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                    MethodCollector.o(9232);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
