package com.ss.android.ugc.aweme.base.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public class f implements l.b {

    /* renamed from: a  reason: collision with root package name */
    public l.a f68429a;

    /* renamed from: b  reason: collision with root package name */
    private NetworkInfo f68430b;

    static {
        Covode.recordClassIndex(42131);
    }

    @Override // com.bytedance.common.utility.l.b
    public final l.a a() {
        return this.f68429a;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f68431a = new f((byte) 0);

        static {
            Covode.recordClassIndex(42132);
        }
    }

    private f() {
        this.f68429a = l.a.NONE;
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(d.a(), "connectivity"));
            this.f68430b = a2;
            b(a2);
            l.f26949a = this;
        } catch (Exception unused) {
        }
    }

    public final boolean c() {
        boolean z;
        MethodCollector.i(861);
        synchronized (f.class) {
            try {
                NetworkInfo networkInfo = this.f68430b;
                if (networkInfo == null || !networkInfo.isAvailable()) {
                    z = false;
                } else {
                    z = true;
                }
            } finally {
                MethodCollector.o(861);
            }
        }
        return z;
    }

    public final boolean b() {
        boolean z;
        MethodCollector.i(860);
        synchronized (f.class) {
            try {
                NetworkInfo networkInfo = this.f68430b;
                z = true;
                if (networkInfo == null || !networkInfo.isAvailable() || 1 != this.f68430b.getType()) {
                    z = false;
                }
            } finally {
                MethodCollector.o(860);
            }
        }
        return z;
    }

    /* synthetic */ f(byte b2) {
        this();
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public final void a(NetworkInfo networkInfo) {
        MethodCollector.i(864);
        synchronized (f.class) {
            try {
                this.f68430b = networkInfo;
                b(networkInfo);
            } finally {
                MethodCollector.o(864);
            }
        }
    }

    private static int a(TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT < 29) {
            return telephonyManager.getNetworkType();
        }
        if (!com.ss.android.ugc.aweme.lancet.d.a.f107198a.getAndSet(true)) {
            com.ss.android.ugc.aweme.lancet.d.a.a().a();
        }
        int i2 = com.ss.android.ugc.aweme.lancet.d.a.a().f107202b.get();
        if (com.ss.android.ugc.aweme.lancet.d.a.f107200c || i2 != -1) {
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable()) {
            this.f68429a = l.a.NONE;
            return;
        }
        int type = networkInfo.getType();
        if (1 == type) {
            this.f68429a = l.a.WIFI;
        } else if (type == 0) {
            switch (a((TelephonyManager) a(d.a(), "phone"))) {
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                    this.f68429a = l.a.MOBILE_3G;
                    this.f68429a = l.a.MOBILE_4G;
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    this.f68429a = l.a.MOBILE_4G;
                    break;
            }
            this.f68429a = l.a.MOBILE;
        } else {
            this.f68429a = l.a.MOBILE;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(852);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(852);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
