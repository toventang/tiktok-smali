package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.work.g;
import androidx.work.impl.b.e;
import androidx.work.impl.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4633a = g.a("Alarms");

    static {
        Covode.recordClassIndex(1827);
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }

    static void a(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) a(context, "alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.b(context, str), 536870912);
        if (service != null && alarmManager != null) {
            g.a();
            com.a.a("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i2)});
            alarmManager.cancel(service);
        }
    }

    private static void a(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) a(context, "alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.b(context, str), 1073741824);
        if (alarmManager != null) {
            int i3 = Build.VERSION.SDK_INT;
            alarmManager.setExact(0, j2, service);
        }
    }

    public static void a(Context context, f fVar, String str, long j2) {
        e l2 = fVar.f4701c.l();
        androidx.work.impl.b.d a2 = l2.a(str);
        if (a2 != null) {
            a(context, str, a2.f4572b);
            a(context, str, a2.f4572b, j2);
            return;
        }
        int a3 = new androidx.work.impl.utils.a(context).a();
        l2.a(new androidx.work.impl.b.d(str, a3));
        a(context, str, a3, j2);
    }
}
