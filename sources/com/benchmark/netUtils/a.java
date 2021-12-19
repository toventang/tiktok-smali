package com.benchmark.netUtils;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.benchmark.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.q;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.OkHttpClient;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f6306d;

    /* renamed from: a  reason: collision with root package name */
    public q f6307a;

    /* renamed from: b  reason: collision with root package name */
    public String f6308b;

    /* renamed from: c  reason: collision with root package name */
    public OkHttpClient f6309c;

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, String> f6310e;

    static {
        Covode.recordClassIndex(3026);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            MethodCollector.i(1467);
            if (f6306d == null) {
                f6306d = new a();
            }
            aVar = f6306d;
            MethodCollector.o(1467);
        }
        return aVar;
    }

    public final Map<String, String> b() {
        String str;
        ConnectivityManager connectivityManager;
        int i2;
        MethodCollector.i(1471);
        if (this.f6310e == null) {
            synchronized (a.class) {
                try {
                    if (this.f6310e == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("sdk_version", "2.6.0-mt_2");
                        linkedHashMap.put("device_type", b.f6095l.f6097b);
                        linkedHashMap.put("device_platform", "android");
                        linkedHashMap.put("status", String.valueOf(b.f6095l.f6098c));
                        linkedHashMap.put("aid", String.valueOf(b.f6095l.f6099d));
                        linkedHashMap.put("app_name", b.f6095l.f6100e);
                        linkedHashMap.put("app_version", b.f6095l.f6101f);
                        linkedHashMap.put("update_version_code", String.valueOf(b.f6095l.f6102g));
                        linkedHashMap.put("device_id", b.f6095l.f6103h);
                        linkedHashMap.put("user_id", b.f6095l.f6104i);
                        Context context = b.f6095l.f6096a;
                        if (!(context == null || (connectivityManager = (ConnectivityManager) a(context, "connectivity")) == null)) {
                            NetworkInfo a2 = a(connectivityManager);
                            if (a2 == null || a2.getType() != 1) {
                                TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
                                if (telephonyManager != null) {
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        if (!com.ss.android.ugc.aweme.lancet.d.a.f107198a.getAndSet(true)) {
                                            com.ss.android.ugc.aweme.lancet.d.a.a().a();
                                        }
                                        i2 = com.ss.android.ugc.aweme.lancet.d.a.a().f107202b.get();
                                        if (!com.ss.android.ugc.aweme.lancet.d.a.f107200c && i2 == -1) {
                                            i2 = 0;
                                        }
                                    } else {
                                        i2 = telephonyManager.getNetworkType();
                                    }
                                    switch (i2) {
                                        case 1:
                                        case 2:
                                        case 4:
                                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                                            str = "2G";
                                            break;
                                        case 3:
                                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                                        case 15:
                                            str = "3G";
                                            break;
                                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                                            str = "4G";
                                            break;
                                        default:
                                            str = "unknown";
                                            break;
                                    }
                                    linkedHashMap.put("net_status", str);
                                    this.f6310e = new LinkedHashMap(linkedHashMap);
                                }
                            } else {
                                str = "wifi";
                                linkedHashMap.put("net_status", str);
                                this.f6310e = new LinkedHashMap(linkedHashMap);
                            }
                        }
                        str = "unknown";
                        linkedHashMap.put("net_status", str);
                        this.f6310e = new LinkedHashMap(linkedHashMap);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1471);
                    throw th;
                }
            }
        }
        Map<String, String> map = this.f6310e;
        MethodCollector.o(1471);
        return map;
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public final <T> T a(Class<T> cls) {
        return (T) this.f6307a.a(cls);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(1469);
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
                    MethodCollector.o(1469);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static boolean a(String str, String str2, String str3) {
        try {
            return RetrofitUtils.a(str, str2, str3);
        } catch (Exception unused) {
            return false;
        }
    }
}
