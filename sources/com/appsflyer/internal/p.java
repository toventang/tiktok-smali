package com.appsflyer.internal;

import android.content.ClipboardManager;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.AndroidUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class p {
    static {
        Covode.recordClassIndex(2753);
    }

    p() {
    }

    public static final class a {

        /* renamed from: Ι  reason: contains not printable characters */
        public static final p f280 = new p();

        static {
            Covode.recordClassIndex(2754);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Location m185(Context context) {
        try {
            com_appsflyer_internal_p_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "location");
            m186(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            m186(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"});
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m186(Context context, String[] strArr) {
        for (String str : strArr) {
            if (AndroidUtils.isPermissionAvailable(context, str)) {
                return true;
            }
        }
        return false;
    }

    public static Object com_appsflyer_internal_p_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(3544);
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
                    MethodCollector.o(3544);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
