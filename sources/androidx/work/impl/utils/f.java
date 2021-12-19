package androidx.work.impl.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import androidx.work.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f4790a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final String f4791b = g.a("WakeLocks");

    static {
        Covode.recordClassIndex(1881);
    }

    public static PowerManager.WakeLock a(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        String concat = "WorkManager: ".concat(String.valueOf(str));
        PowerManager.WakeLock newWakeLock = ((PowerManager) b(applicationContext, "power")).newWakeLock(1, concat);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f4790a;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, concat);
        }
        return newWakeLock;
    }

    private static Object b(Context context, String str) {
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
}
