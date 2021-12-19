package com.ss.android.ugc.aweme.crossplatform.business;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.f.b;
import org.json.JSONException;
import org.json.JSONObject;

public class DouPlusMonitorBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public boolean f78619a;

    /* renamed from: b  reason: collision with root package name */
    private long f78620b;

    static {
        Covode.recordClassIndex(48810);
    }

    private String a() {
        return this.f78617k.f78742b.r;
    }

    DouPlusMonitorBusiness(e eVar) {
        super(eVar);
    }

    public final void b(String str) {
        if (b.a(a(), str)) {
            this.f78619a = false;
        }
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (b.a(a(), str)) {
                this.f78619a = true;
                this.f78620b = System.currentTimeMillis();
                return;
            }
            this.f78619a = false;
        }
    }

    public final void a(int i2, String str, WebView webView) {
        if (this.f78619a) {
            this.f78619a = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f78620b;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("duration", currentTimeMillis);
                jSONObject2.put("error_status", i2);
                jSONObject2.put("error_message", str);
            } catch (JSONException unused) {
            }
            n.a("douplus_delivery_show", 0, jSONObject, jSONObject2);
            int i3 = Build.VERSION.SDK_INT;
            if (this.f78617k.f78742b.s && webView != null) {
                webView.evaluateJavascript("ttwebview:/*getTTLogEventResult*/;", new f(this, i2, str, webView));
            }
        }
    }
}
