package com.bytedance.android.monitor.g;

import com.a;
import com.bytedance.android.monitor.a.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class e extends b implements d {

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, String> f23514b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f23515c;

    /* renamed from: a  reason: collision with root package name */
    private String f23516a;

    private e() {
    }

    public static d b() {
        MethodCollector.i(3813);
        if (f23515c == null) {
            synchronized (e.class) {
                try {
                    if (f23515c == null) {
                        f23515c = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3813);
                    throw th;
                }
            }
        }
        d dVar = f23515c;
        MethodCollector.o(3813);
        return dVar;
    }

    static {
        Covode.recordClassIndex(13964);
        HashMap hashMap = new HashMap();
        f23514b = hashMap;
        hashMap.put("pv", a.a("tt%s_webview_timing_monitor_pv_service", new Object[]{"live"}));
        f23514b.put("overview", a.a("tt%s_webview_timing_monitor_overview_service", new Object[]{"live"}));
        f23514b.put("performance", a.a("tt%s_webview_timing_monitor_performance_service", new Object[]{"live"}));
        f23514b.put("resource", a.a("tt%s_webview_timing_monitor_resource_service", new Object[]{"live"}));
        f23514b.put("error", a.a("tt%s_webview_timing_monitor_error_service", new Object[]{"live"}));
        f23514b.put("diff", a.a("tt%s_webview_timing_monitor_diff_service", new Object[]{"live"}));
        f23514b.put("custom", a.a("tt%s_webview_timing_monitor_custom_service", new Object[]{"live"}));
        f23514b.put("newcustom", a.a("bd%s_hybrid_monitor_custom_service", new Object[]{"live"}));
    }

    @Override // com.bytedance.android.monitor.a.d
    public final String b(String str) {
        String str2 = f23514b.get(str);
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str2;
    }

    @Override // com.bytedance.android.monitor.a.d
    public final void a(String str) {
        this.f23516a = str;
        f23514b.clear();
        f23514b.put("pv", a.a("tt%s_webview_timing_monitor_pv_service", new Object[]{this.f23516a}));
        f23514b.put("overview", a.a("tt%s_webview_timing_monitor_overview_service", new Object[]{this.f23516a}));
        f23514b.put("performance", a.a("tt%s_webview_timing_monitor_performance_service", new Object[]{this.f23516a}));
        f23514b.put("resource", a.a("tt%s_webview_timing_monitor_resource_service", new Object[]{this.f23516a}));
        f23514b.put("error", a.a("tt%s_webview_timing_monitor_error_service", new Object[]{this.f23516a}));
        f23514b.put("diff", a.a("tt%s_webview_timing_monitor_diff_service", new Object[]{this.f23516a}));
        f23514b.put("custom", a.a("tt%s_webview_timing_monitor_custom_service", new Object[]{this.f23516a}));
        f23514b.put("newcustom", a.a("bd%s_hybrid_monitor_custom_service", new Object[]{this.f23516a}));
    }
}
