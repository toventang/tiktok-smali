package com.bytedance.android.monitor.webview.e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f23728a = "webview_monitor_js_file/slardar_sdk.js";

    /* renamed from: b  reason: collision with root package name */
    private static String f23729b = "webview_monitor_js_file/slardar_bridge.js";

    /* renamed from: c  reason: collision with root package name */
    private static String f23730c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f23731d = "";

    /* renamed from: e  reason: collision with root package name */
    private static String f23732e = "";

    /* renamed from: f  reason: collision with root package name */
    private static String f23733f = " javascript:( ";

    /* renamed from: g  reason: collision with root package name */
    private static String f23734g = " )() ";

    /* renamed from: h  reason: collision with root package name */
    private static String f23735h = " function(){ ";

    /* renamed from: i  reason: collision with root package name */
    private static String f23736i = " } ";

    static {
        Covode.recordClassIndex(14066);
    }

    public static String a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(f23730c)) {
            if (TextUtils.isEmpty(str)) {
                f23730c = a(context, f23728a, true);
            } else {
                f23730c = a(context, str, false);
            }
        }
        if (TextUtils.isEmpty(f23731d)) {
            f23731d = a(context, f23729b, true);
        }
        f23732e = str2;
        if (str2 == null) {
            str2 = "";
        }
        f23732e = str2;
        return f23733f + f23735h + f23730c + f23731d + f23732e + f23736i + f23734g;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|(2:16|17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.bytedance.android.monitor.HybridMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (0 != 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        com.bytedance.android.monitor.HybridMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (0 != 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        com.bytedance.android.monitor.HybridMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10147);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r6, java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.webview.e.a.a(android.content.Context, java.lang.String, boolean):java.lang.String");
    }
}
