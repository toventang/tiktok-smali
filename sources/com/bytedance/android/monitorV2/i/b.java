package com.bytedance.android.monitorV2.i;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23998a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f23999b = Log.isLoggable("HBMonitorSDK_V2", 3);

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f24000c = Log.isLoggable("HBMonitorSDK_Logcat", 3);

    /* renamed from: d  reason: collision with root package name */
    private static boolean f24001d = false;

    static {
        Covode.recordClassIndex(14147);
    }

    private static boolean a() {
        if (f23998a || f23999b) {
            return true;
        }
        return false;
    }

    public static String a(WebView webView) {
        if (webView == null) {
            return "null";
        }
        return webView.getClass().toString();
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "HBMonitorSDK_V2";
        }
        if (!str.startsWith("HBMonitorSDK_V2")) {
            return "HBMonitorSDK_V2_".concat(String.valueOf(str));
        }
        return str;
    }

    public static void a(String str, String str2) {
        if (a()) {
            String a2 = a(str);
            while (str2.length() > 3000) {
                if (f24000c || !a.a(a2, str2.substring(0, 3000))) {
                    str2.substring(0, 3000);
                }
                str2 = str2.substring(3000);
            }
            if (!f24000c) {
                a.a(a2, str2);
            }
        }
    }

    public static void b(String str, String str2) {
        String a2 = a(str);
        while (str2.length() > 3000) {
            if (f24000c || !a.b(a2, str2.substring(0, 3000))) {
                str2.substring(0, 3000);
            }
            str2 = str2.substring(3000);
        }
        if (!f24000c) {
            a.b(a2, str2);
        }
    }

    public static void c(String str, String str2) {
        String a2 = a(str);
        while (str2.length() > 3000) {
            if (f24000c || !a.c(a2, str2.substring(0, 3000))) {
                str2.substring(0, 3000);
            }
            str2 = str2.substring(3000);
        }
        if (!f24000c) {
            a.c(a2, str2);
        }
    }
}
