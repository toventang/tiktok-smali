package com.ss.android.push.window.oppo;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class e {
    static {
        Covode.recordClassIndex(37127);
    }

    public static int a(Context context) {
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

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8609);
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
                    MethodCollector.o(8609);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
