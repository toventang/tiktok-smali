package com.ss.bytertc.engine.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class GetDeviceHelper {
    static {
        Covode.recordClassIndex(101047);
    }

    public static String getGpuName() {
        String gPURendererFallback;
        if (Build.VERSION.SDK_INT >= 22) {
            gPURendererFallback = GPUUtil.getGPURenderer();
        } else {
            gPURendererFallback = GPUUtil.getGPURendererFallback();
        }
        if (gPURendererFallback == null) {
            return "null-null";
        }
        return gPURendererFallback;
    }

    public static int getTotalMemory(Context context) {
        MethodCollector.i(10489);
        if (context == null) {
            MethodCollector.o(10489);
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) com_ss_bytertc_engine_utils_GetDeviceHelper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity");
        if (activityManager == null) {
            MethodCollector.o(10489);
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        double d2 = (double) memoryInfo.totalMem;
        Double.isNaN(d2);
        int ceil = (int) Math.ceil((((d2 * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
        MethodCollector.o(10489);
        return ceil;
    }

    public static Object com_ss_bytertc_engine_utils_GetDeviceHelper_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(10491);
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
                    MethodCollector.o(10491);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
