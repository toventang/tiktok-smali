package ms.bd.o;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import ms.bd.o.b;

/* access modifiers changed from: package-private */
public final class r0 extends b.a {
    static {
        Covode.recordClassIndex(105947);
    }

    r0() {
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13421);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                    MethodCollector.o(13421);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        MethodCollector.i(13344);
        Boolean bool = Boolean.FALSE;
        Context applicationContext = a.f159493a.f159494b.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        TelephonyManager telephonyManager = (TelephonyManager) a(applicationContext, (String) h.a(16777217, 0, 0, "285c48", new byte[]{51, 50, 73, 25, 14}));
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            bool = Boolean.TRUE;
        }
        MethodCollector.o(13344);
        return bool;
    }
}
