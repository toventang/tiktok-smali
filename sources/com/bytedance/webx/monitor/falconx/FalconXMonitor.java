package com.bytedance.webx.monitor.falconx;

import android.webkit.WebView;
import com.bytedance.android.monitor.f.a;
import com.bytedance.android.monitor.l.d;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.falconx.e;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

public class FalconXMonitor {
    private static volatile FalconXMonitor instance;
    private boolean hasSetMonitor;

    static {
        Covode.recordClassIndex(28180);
    }

    public void beginMonitor() {
        if (!this.hasSetMonitor) {
            this.hasSetMonitor = true;
            e.f28806a = new e.a() {
                /* class com.bytedance.webx.monitor.falconx.FalconXMonitor.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28181);
                }

                @Override // com.bytedance.falconx.e.a
                public final void a(final WebView webView, final InterceptorModel interceptorModel, final boolean z) {
                    if (webView != null && interceptorModel != null) {
                        a.a().execute(new Runnable() {
                            /* class com.bytedance.webx.monitor.falconx.FalconXMonitor.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(28182);
                            }

                            public final void run() {
                                int i2;
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    if (z) {
                                        i2 = 0;
                                    } else {
                                        i2 = 1;
                                    }
                                    d.a(jSONObject, "is_custom_interceptor", i2);
                                    d.a(jSONObject, "resource_url", interceptorModel.url);
                                    d.a(jSONObject, "offline_rule", interceptorModel.offlineRule);
                                    d.a(jSONObject, "offline_status", interceptorModel.offlineStatus);
                                    d.a(jSONObject, "offline_duration", interceptorModel.offlineDuration);
                                    d.a(jSONObject, "channel", interceptorModel.channel);
                                    d.a(jSONObject, "mime_type", interceptorModel.mimeType);
                                    d.a(jSONObject, "error_code", interceptorModel.errCode);
                                    d.a(jSONObject, "package_version", interceptorModel.pkgVersion);
                                    d.a(jSONObject, "ac", interceptorModel.ac);
                                    i.f23764a.a(webView, "falconPerf", jSONObject);
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                        });
                    }
                }
            };
        }
    }

    public static FalconXMonitor getInstance() {
        MethodCollector.i(2408);
        if (instance == null) {
            synchronized (FalconXMonitor.class) {
                try {
                    if (instance == null) {
                        instance = new FalconXMonitor();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2408);
                    throw th;
                }
            }
        }
        FalconXMonitor falconXMonitor = instance;
        MethodCollector.o(2408);
        return falconXMonitor;
    }
}
