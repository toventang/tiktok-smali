package org.chromium;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static String f159763a;

    static {
        Covode.recordClassIndex(106447);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[SYNTHETIC, Splitter:B:21:0x0074] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.f.a():java.lang.String");
    }

    private static boolean b(Context context) {
        String c2 = c(context);
        if (c2 == null || c2.contains(":") || !c2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static boolean a(Context context) {
        int q = c.a().q();
        if (d.a().loggerDebug()) {
            d.a().loggerD("Utils", "CronetAppProvider ProcessFlag: ".concat(String.valueOf(q)));
        }
        if (q == 1) {
            return true;
        }
        if (q != 2) {
            return b(context);
        }
        return false;
    }

    private static String c(Context context) {
        String str = f159763a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (d.a().loggerDebug()) {
                        d.a().loggerD("Process", "processName = " + runningAppProcessInfo.processName);
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f159763a = str2;
                    return str2;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String a2 = a();
        f159763a = a2;
        return a2;
    }

    public static List a(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i2 = 0; i2 < interfaces.length; i2++) {
                if (!arrayList.contains(interfaces[i2])) {
                    arrayList.add(interfaces[i2]);
                }
                for (Object obj : a(interfaces[i2])) {
                    if (!arrayList.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        return arrayList;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12593);
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
                    MethodCollector.o(12593);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
