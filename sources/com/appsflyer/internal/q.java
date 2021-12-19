package com.appsflyer.internal;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class q {
    static {
        Covode.recordClassIndex(2755);
    }

    q() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Map<String, String> m187(Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) com_appsflyer_internal_q_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = context.getResources().getConfiguration().screenLayout & 15;
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put("size", String.valueOf(i2));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't aggregate screen stats: ", th);
        }
        return hashMap;
    }

    public static Object com_appsflyer_internal_q_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(1285);
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
                    MethodCollector.o(1285);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
