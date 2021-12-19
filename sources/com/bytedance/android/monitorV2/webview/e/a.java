package com.bytedance.android.monitorV2.webview.e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f24204a = "webview_monitor_js_file_v2/slardar_sdk.js";

    /* renamed from: b  reason: collision with root package name */
    private static String f24205b = "webview_monitor_js_file_v2/slardar_bridge.js";

    /* renamed from: c  reason: collision with root package name */
    private static String f24206c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f24207d = "";

    /* renamed from: e  reason: collision with root package name */
    private static String f24208e = "";

    /* renamed from: f  reason: collision with root package name */
    private static String f24209f = " javascript:( ";

    /* renamed from: g  reason: collision with root package name */
    private static String f24210g = " )() ";

    /* renamed from: h  reason: collision with root package name */
    private static String f24211h = " function(){ ";

    /* renamed from: i  reason: collision with root package name */
    private static String f24212i = " } ";

    static {
        Covode.recordClassIndex(14246);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|(2:16|17)) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (0 != 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance().getExceptionHandler();
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
        com.bytedance.android.monitorV2.HybridMultiMonitor.getInstance().getExceptionHandler();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(3960);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.webview.e.a.a(android.content.Context, java.lang.String, boolean):java.lang.String");
    }

    public static String a(Context context, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(f24206c)) {
            if (TextUtils.isEmpty(str)) {
                f24206c = a(context, f24204a, true);
            } else {
                f24206c = a(context, str, false);
            }
        }
        if (TextUtils.isEmpty(f24207d)) {
            f24207d = a(context, f24205b, true);
        }
        f24208e = str2;
        if (str2 == null) {
            str2 = "";
        }
        f24208e = str2;
        if (!z) {
            f24206c = "";
            f24208e = "";
            f24207d = "";
        }
        return f24209f + f24211h + f24206c + f24207d + f24208e + f24212i + f24210g;
    }
}
