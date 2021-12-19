package com.bytedance.ies.powerpermissions;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f34461a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(20611);
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static Intent b(Context context) {
        l.c(context, "");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        return intent;
    }

    public static boolean a(Context context) {
        l.c(context, "");
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24) {
            return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        if (!e()) {
            return true;
        }
        Object c2 = c(context, "appops");
        if (c2 != null) {
            try {
                Method method = c2.getClass().getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
                Object obj = c2.getClass().getDeclaredField("OP_POST_NOTIFICATION").get(Integer.TYPE);
                if (obj != null) {
                    Object invoke = method.invoke(c2, Integer.valueOf(((Integer) obj).intValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName());
                    if (invoke != null) {
                        if (((Integer) invoke).intValue() == 0) {
                            z = true;
                        }
                        return z;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
                throw new w("null cannot be cast to non-null type");
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                return true;
            }
        } else {
            throw new w("null cannot be cast to non-null type");
        }
    }

    public static void b(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    public static boolean a(Context context, Intent intent) {
        l.c(context, "");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        l.a((Object) queryIntentActivities, "");
        if (!queryIntentActivities.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        com.bytedance.ies.powerpermissions.d.a a2;
        l.c(context, "");
        l.c(str, "");
        if (!e()) {
            return true;
        }
        if (a.b(str) && (a2 = a.a(str)) != null) {
            return a2.a((Activity) context);
        }
        if (b.a(context, str) == 0) {
            return true;
        }
        return false;
    }

    public static boolean a(Activity activity, String str) {
        boolean z;
        com.bytedance.ies.powerpermissions.d.a a2;
        l.c(activity, "");
        l.c(str, "");
        if (!e()) {
            return false;
        }
        if (!a.b(str) || (a2 = a.a(str)) == null) {
            if (activity.checkSelfPermission(str) == -1) {
                z = true;
            } else {
                z = false;
            }
            boolean shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            boolean a3 = com.bytedance.ies.powerpermissions.b.a.a(str);
            if (!z || shouldShowRequestPermissionRationale || !a3) {
                return false;
            }
            return true;
        } else if (!a2.b(activity) || !com.bytedance.ies.powerpermissions.b.a.a(str)) {
            return false;
        } else {
            return true;
        }
    }

    public static void b(Context context, String str) {
        l.c(context, "");
        l.c(str, "");
        com.bytedance.ies.powerpermissions.d.a a2 = a.a(str);
        if (a2 != null) {
            Intent a3 = a2.a(context);
            if (a3 == null) {
                a3 = b(context);
            }
            b(context, a3);
            return;
        }
        b(context, b(context));
    }

    private static Object c(Context context, String str) {
        Object obj;
        MethodCollector.i(8080);
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
                            c.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8080);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
