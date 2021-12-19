package com.bytedance.ies.bullet.service.webkit;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.web.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final b f33014a;

    /* renamed from: b  reason: collision with root package name */
    private String f33015b;

    static {
        Covode.recordClassIndex(19704);
    }

    public a(b bVar) {
        l.c(bVar, "");
        this.f33014a = bVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.b
    public final void a(Map<String, ? extends Object> map) {
        l.c(map, "");
        if (map.isEmpty()) {
            this.f33015b = null;
        } else {
            this.f33015b = new JSONObject(map).toString();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.b
    public final void a(WebView webView) {
        l.c(webView, "");
        if (this.f33015b != null) {
            Object tag = webView.getTag(R.id.c3s);
            if (tag == null) {
                int i2 = Build.VERSION.SDK_INT;
                GlobalProps globalProps = new GlobalProps();
                globalProps.f33013a = this.f33015b;
                WebSettings settings = webView.getSettings();
                l.a((Object) settings, "");
                settings.setJavaScriptEnabled(true);
                webView.addJavascriptInterface(globalProps, "__globalprops");
                webView.setTag(R.id.c3s, globalProps);
                this.f33014a.printLog("injectGlobalProps:successfully set", p.D, "webkit");
            } else if (!(tag instanceof GlobalProps)) {
                this.f33014a.printLog("injectGlobalProps:type mismatch, current type is " + tag.getClass(), p.E, "webkit");
            } else {
                this.f33014a.printLog("injectGlobalProps:already set", p.D, "webkit");
                ((GlobalProps) tag).f33013a = this.f33015b;
            }
        }
    }
}
