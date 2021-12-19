package com.bytedance.android.livesdk.browser.c;

import com.bytedance.android.livesdk.livesetting.hybrid.TTLiveWebviewMonitorConfigSlardarAndroidSetting;
import com.bytedance.android.monitor.webview.a;
import com.bytedance.android.monitor.webview.c;
import com.bytedance.android.monitor.webview.i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f14318a;

    static {
        Covode.recordClassIndex(7930);
    }

    public static void a() {
        if (!f14318a) {
            f14318a = true;
            c.a d2 = i.f23764a.d();
            c.a a2 = d2.a(new a() {
                /* class com.bytedance.android.livesdk.browser.c.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(7931);
                }

                @Override // com.bytedance.android.monitor.webview.a
                public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
                    com.bytedance.android.live.core.d.c.b(str, i2, jSONObject, jSONObject2);
                }
            });
            a2.f23689a = "99999";
            a2.f23698j = TTLiveWebviewMonitorConfigSlardarAndroidSetting.INSTANCE.getValue();
            a2.f23690b = com.bytedance.android.monitor.webview.f.a();
            i.f23764a.b(d2);
        }
    }
}
