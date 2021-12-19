package com.bytedance.android.monitor.h;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23519a;

    static {
        Covode.recordClassIndex(13966);
    }

    public static String a(WebView webView) {
        if (webView == null) {
            return "null";
        }
        return webView.getClass().toString();
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "HBMonitorSDK";
        }
        if (!str.startsWith("HBMonitorSDK")) {
            return "HBMonitorSDK_".concat(String.valueOf(str));
        }
        return str;
    }

    public static void b(String str, String str2) {
        a.a(a(str), str2);
    }

    public static void c(String str, String str2) {
        a.b(a(str), str2);
    }

    public static void a(String str, String str2) {
        if (f23519a) {
            a.a(a.a("d"), a(str), str2);
        }
    }
}
