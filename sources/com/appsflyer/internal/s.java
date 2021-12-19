package com.appsflyer.internal;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class s {
    static {
        Covode.recordClassIndex(2762);
    }

    s() {
    }

    public static final class d {

        /* renamed from: ι  reason: contains not printable characters */
        public static final s f297 = new s();

        static {
            Covode.recordClassIndex(2764);
        }
    }

    public static NetworkInfo com_appsflyer_internal_s_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m196(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r1.getType() == 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r1.getType() == 0) goto L_0x006b;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.internal.s.a m195(android.content.Context r11) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.s.m195(android.content.Context):com.appsflyer.internal.s$a");
    }

    public static NetworkInfo com_appsflyer_internal_s_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo(ConnectivityManager connectivityManager, int i2) {
        try {
            return connectivityManager.getNetworkInfo(i2);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static NetworkInfo com_appsflyer_internal_s_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getNetworkInfo(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static Object com_appsflyer_internal_s_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(2186);
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
                    MethodCollector.o(2186);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static final class a {

        /* renamed from: ı  reason: contains not printable characters */
        public final String f294;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String f295;

        /* renamed from: ι  reason: contains not printable characters */
        public final String f296;

        static {
            Covode.recordClassIndex(2763);
        }

        a(String str, String str2, String str3) {
            this.f294 = str;
            this.f295 = str2;
            this.f296 = str3;
        }
    }
}
