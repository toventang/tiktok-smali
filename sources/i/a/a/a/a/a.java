package i.a.a.a.a;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f158843a;

    static {
        Covode.recordClassIndex(105396);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A[SYNTHETIC, Splitter:B:21:0x006d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.a.a.a.a.a():java.lang.String");
    }

    public static boolean a(Context context) {
        String b2 = b(context);
        if (b2 == null || b2.contains(":") || !b2.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    private static String b(Context context) {
        String str = f158843a;
        if (!m.a(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) a(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (Logger.debug()) {
                        com.bytedance.android.live.core.c.a.a(3, "Process", "processName = " + runningAppProcessInfo.processName);
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f158843a = str2;
                    return str2;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        String a2 = a();
        f158843a = a2;
        return a2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10299);
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
                    MethodCollector.o(10299);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
