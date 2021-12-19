package com.ss.android.ugc.aweme.utils;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.l;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.d.c;
import java.lang.reflect.Field;
import java.util.List;

public class fg {
    static {
        Covode.recordClassIndex(93518);
    }

    public static void b(Context context) {
        if (context != null && !e(context)) {
            g(context);
        }
    }

    public static void c(Context context) {
        if (context != null && !f(context)) {
            g(context);
        }
    }

    public static boolean a(Context context) {
        try {
            if (Build.VERSION.SDK_INT > 19) {
                return l.a(context).a();
            }
            int d2 = d(context);
            if (d2 != 0) {
                if (d2 == 1) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean g(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            if (!a(intent, context)) {
                return false;
            }
            a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean f(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            if (!a(intent, context)) {
                return false;
            }
            a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static int d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a(context, "appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = a.f107166a;
                }
            }
            String packageName = applicationContext.getPackageName();
            int i2 = applicationInfo.uid;
            Reflect on = Reflect.on(appOpsManager);
            int intValue = ((Integer) on.field("OP_POST_NOTIFICATION", Integer.TYPE).get()).intValue();
            if (((Integer) on.call("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(intValue), Integer.valueOf(i2), packageName).get()).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean e(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 26 || c.a()) {
                c(context);
                return true;
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                return true;
            }
            a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static boolean a(Intent intent, Context context) {
        List<ResolveInfo> queryIntentActivities;
        if (context == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536)) == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(790);
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
                    MethodCollector.o(790);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
