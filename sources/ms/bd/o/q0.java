package ms.bd.o;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import ms.bd.o.b;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
public final class q0 extends b.a {
    static {
        Covode.recordClassIndex(105944);
    }

    q0() {
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13720);
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
                    MethodCollector.o(13720);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // ms.bd.o.b.a
    public final Object a(long j2, String str, Object obj) {
        MethodCollector.i(13658);
        JSONArray jSONArray = new JSONArray();
        Context applicationContext = a.f159493a.f159494b.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        try {
            DhcpInfo dhcpInfo = ((WifiManager) a(applicationContext, (String) h.a(16777217, 0, 0, "dbd541", new byte[]{98, 105, 17, 72}))).getDhcpInfo();
            jSONArray.put((dhcpInfo.dns1 & 255) + ((String) h.a(16777217, 0, 0, "398184", new byte[]{108})) + ((dhcpInfo.dns1 >> 8) & 255) + ((String) h.a(16777217, 0, 0, "e57eb4", new byte[]{58})) + ((dhcpInfo.dns1 >> 16) & 255) + ((String) h.a(16777217, 0, 0, "81e19a", new byte[]{103})) + ((dhcpInfo.dns1 >> 24) & 255));
            jSONArray.put((dhcpInfo.dns2 & 255) + ((String) h.a(16777217, 0, 0, "a08bbf", new byte[]{62})) + ((dhcpInfo.dns2 >> 8) & 255) + ((String) h.a(16777217, 0, 0, "fdb0af", new byte[]{57})) + ((dhcpInfo.dns2 >> 16) & 255) + ((String) h.a(16777217, 0, 0, "980f85", new byte[]{102})) + ((dhcpInfo.dns2 >> 24) & 255));
        } catch (Throwable unused) {
            h.a(16777217, 0, 0, "a37fa5", new byte[]{125, 56, 76, 45, 90, 46});
        }
        String jSONArray2 = jSONArray.toString();
        MethodCollector.o(13658);
        return jSONArray2;
    }
}
