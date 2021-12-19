package com.d.a.a.a.g;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.d.a.a.a.b.k;
import com.d.a.a.a.b.l;
import com.d.a.a.a.c.d;
import com.d.a.a.a.c.e;
import com.d.a.a.a.e.b;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    WebView f46411f;

    /* renamed from: g  reason: collision with root package name */
    private Long f46412g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, k> f46413h;

    /* renamed from: i  reason: collision with root package name */
    private final String f46414i;

    static {
        Covode.recordClassIndex(28336);
    }

    public c(Map<String, k> map, String str) {
        this.f46413h = map;
        this.f46414i = str;
    }

    @Override // com.d.a.a.a.g.a
    public final void a() {
        MethodCollector.i(5849);
        super.a();
        WebView webView = new WebView(d.f46381a.f46382b);
        this.f46411f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f46411f);
        e.a(this.f46411f, this.f46414i);
        for (String str : this.f46413h.keySet()) {
            String externalForm = this.f46413h.get(str).f46353b.toExternalForm();
            WebView webView2 = this.f46411f;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                e.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f46412g = Long.valueOf(System.nanoTime());
        MethodCollector.o(5849);
    }

    @Override // com.d.a.a.a.g.a
    public final void a(l lVar, com.d.a.a.a.b.d dVar) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap(dVar.f46340d);
        for (String str : unmodifiableMap.keySet()) {
            b.a(jSONObject, str, unmodifiableMap.get(str));
        }
        a(lVar, dVar, jSONObject);
    }

    @Override // com.d.a.a.a.g.a
    public final void b() {
        super.b();
        new Handler().postDelayed(new Runnable() {
            /* class com.d.a.a.a.g.c.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private WebView f46416b;

            static {
                Covode.recordClassIndex(28337);
            }

            public final void run() {
                this.f46416b.destroy();
            }

            {
                this.f46416b = c.this.f46411f;
            }
        }, Math.max(4000 - (this.f46412g == null ? 4000 : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f46412g.longValue(), TimeUnit.NANOSECONDS)), (long) InteractFirstFrameTimeOutDurationSetting.DEFAULT));
        this.f46411f = null;
    }
}
