package com.ss.android.ugc.aweme.video;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.j;
import java.lang.reflect.Field;

public class l {

    /* renamed from: d  reason: collision with root package name */
    private static final String f143435d = l.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static l f143436e = null;

    /* renamed from: a  reason: collision with root package name */
    public int f143437a = Integer.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public TelephonyManager f143438b;

    /* renamed from: c  reason: collision with root package name */
    public PhoneStateListener f143439c;

    static {
        Covode.recordClassIndex(93862);
    }

    public static synchronized l a(Context context) {
        l lVar;
        synchronized (l.class) {
            MethodCollector.i(3078);
            if (f143436e == null) {
                f143436e = new l(context);
            }
            lVar = f143436e;
            MethodCollector.o(3078);
        }
        return lVar;
    }

    private l(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            this.f143438b = (TelephonyManager) a(applicationContext, "phone");
        }
    }

    public final int b(Context context) {
        WifiInfo connectionInfo;
        try {
            if (j.f107228g == NetworkUtils.h.NONE || !j.b() || j.c()) {
                j.f107228g = NetworkUtils.getNetworkType(context);
            }
            if (j.f107228g == NetworkUtils.h.WIFI && (connectionInfo = ((WifiManager) a(context, "wifi")).getConnectionInfo()) != null) {
                this.f143437a = connectionInfo.getRssi();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return this.f143437a;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3086);
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
                    MethodCollector.o(3086);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
