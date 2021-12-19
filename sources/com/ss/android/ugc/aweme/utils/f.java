package com.ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.format.Formatter;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class f {
    static {
        Covode.recordClassIndex(93507);
    }

    public static String a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) a(context, "activity")).getMemoryInfo(memoryInfo);
        return Formatter.formatFileSize(context, memoryInfo.availMem);
    }

    public static String b(Context context) {
        int memoryClass;
        ActivityManager activityManager = (ActivityManager) a(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        } else {
            memoryClass = activityManager.getMemoryClass();
        }
        return Formatter.formatFileSize(context, (long) (memoryClass * 1024 * 1024));
    }

    public static String c(Context context) {
        return Formatter.formatFileSize(context, (long) (((ActivityManager) a(context, "activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPrivateDirty() * 1024));
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(7058);
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
                    MethodCollector.o(7058);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
