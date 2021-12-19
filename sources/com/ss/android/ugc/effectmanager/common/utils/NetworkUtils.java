package com.ss.android.ugc.effectmanager.common.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class NetworkUtils {
    static {
        Covode.recordClassIndex(95346);
    }

    public static NetworkInfo com_ss_android_ugc_effectmanager_common_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo com_ss_android_ugc_effectmanager_common_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = com_ss_android_ugc_effectmanager_common_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo((ConnectivityManager) com_ss_android_ugc_effectmanager_common_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity"));
            if (com_ss_android_ugc_effectmanager_common_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_android_ugc_effectmanager_common_utils_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            EPLog.e("NetworkUtils", "isNetworkAvailable: " + e2.toString());
            return false;
        }
    }

    public static <T> String toJson(List<T> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (list == null || list.isEmpty()) {
            sb.append("]");
            return sb.toString();
        }
        for (T t : list) {
            sb.append("\"");
            sb.append(t.toString());
            sb.append("\"");
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public static String filterUrl(String str, String str2) {
        Pattern compile = Pattern.compile(".*(?=://)");
        Pattern compile2 = Pattern.compile("(?<=://)([^/]*)");
        URI create = URI.create(str);
        return compile2.matcher(compile.matcher(str2).replaceFirst(create.getScheme())).replaceFirst(create.getHost());
    }

    public static String buildRequestUrl(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (map.size() > 0) {
            sb.append("?");
            int i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    if (i2 == 0) {
                        sb.append(key).append("=").append(value);
                    } else {
                        sb.append("&").append(key).append("=").append(value);
                    }
                }
                i2++;
            }
        }
        return new String(sb);
    }

    public static Object com_ss_android_ugc_effectmanager_common_utils_NetworkUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(1328);
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
                    MethodCollector.o(1328);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static String encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Encoding not supported: ".concat(String.valueOf(str)), e2);
        }
    }
}
