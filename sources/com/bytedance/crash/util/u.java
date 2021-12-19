package com.bytedance.crash.util;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.j.f;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class u {
    static {
        Covode.recordClassIndex(16402);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.util.u$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f28020a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 16403(0x4013, float:2.2985E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.crash.j.f$b[] r0 = com.bytedance.crash.j.f.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.crash.util.u.AnonymousClass1.f28020a = r2
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.j.f.b.WIFI     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.crash.util.u.AnonymousClass1.f28020a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.j.f.b.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.crash.util.u.AnonymousClass1.f28020a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.j.f.b.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.crash.util.u.AnonymousClass1.f28020a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.j.f.b.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.crash.util.u.AnonymousClass1.f28020a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.j.f.b.MOBILE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = com.bytedance.crash.util.u.AnonymousClass1.f28020a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bytedance.crash.j.f$b r0 = com.bytedance.crash.j.f.b.MOBILE_5G     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.u.AnonymousClass1.<clinit>():void");
        }
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static boolean b(Context context) {
        NetworkInfo a2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a(context, "connectivity");
            if (connectivityManager == null || (a2 = a(connectivityManager)) == null || !a2.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    public static String a(f.b bVar) {
        try {
            switch (AnonymousClass1.f28020a[bVar.ordinal()]) {
                case 1:
                    return "wifi";
                case 2:
                    return "2g";
                case 3:
                    return "3g";
                case 4:
                    return "4g";
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return "mobile";
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return "5g";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static f.b a(Context context) {
        int i2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a(context, "connectivity");
            if (connectivityManager == null) {
                return f.b.NONE;
            }
            NetworkInfo a2 = a(connectivityManager);
            if (a2 == null || !a2.isAvailable()) {
                return f.b.NONE;
            }
            int type = a2.getType();
            if (1 == type) {
                return f.b.WIFI;
            }
            if (type != 0) {
                return f.b.MOBILE;
            }
            TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
            if (Build.VERSION.SDK_INT >= 29) {
                if (!com.ss.android.ugc.aweme.lancet.d.a.f107198a.getAndSet(true)) {
                    com.ss.android.ugc.aweme.lancet.d.a.a().a();
                }
                i2 = com.ss.android.ugc.aweme.lancet.d.a.a().f107202b.get();
                if (!com.ss.android.ugc.aweme.lancet.d.a.f107200c && i2 == -1) {
                    return f.b.MOBILE;
                }
            } else {
                i2 = telephonyManager.getNetworkType();
            }
            if (i2 != 3) {
                if (i2 == 20) {
                    return f.b.MOBILE_5G;
                }
                if (!(i2 == 5 || i2 == 6)) {
                    switch (i2) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            break;
                        default:
                            switch (i2) {
                                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                case 15:
                                    break;
                                case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                    return f.b.MOBILE_4G;
                                default:
                                    return f.b.MOBILE;
                            }
                    }
                }
            }
            return f.b.MOBILE_3G;
        } catch (Throwable unused) {
            return f.b.MOBILE;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10298);
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
                    MethodCollector.o(10298);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
