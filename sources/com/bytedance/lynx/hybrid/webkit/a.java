package com.bytedance.lynx.hybrid.webkit;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.j.b;
import com.bytedance.lynx.hybrid.j.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1006a f41257a = new C1006a((byte) 0);

    static {
        Covode.recordClassIndex(25281);
    }

    /* renamed from: com.bytedance.lynx.hybrid.webkit.a$a  reason: collision with other inner class name */
    public static final class C1006a {
        static {
            Covode.recordClassIndex(25282);
        }

        private C1006a() {
        }

        public /* synthetic */ C1006a(byte b2) {
            this();
        }

        public static void a(WebView webView, Map<String, ? extends Object> map) {
            String jSONObject;
            l.c(webView, "");
            if (map != null && !map.isEmpty() && (jSONObject = new JSONObject(map).toString()) != null) {
                Object tag = webView.getTag(R.id.bhe);
                if (tag == null) {
                    int i2 = Build.VERSION.SDK_INT;
                    GlobalProps globalProps = new GlobalProps();
                    globalProps.f41256a = jSONObject;
                    WebSettings settings = webView.getSettings();
                    l.a((Object) settings, "");
                    settings.setJavaScriptEnabled(true);
                    webView.addJavascriptInterface(globalProps, "__globalprops");
                    webView.setTag(R.id.bhe, globalProps);
                    c.a("injectGlobalProps:successfully set", b.D, "webkit");
                } else if (!(tag instanceof GlobalProps)) {
                    c.a("injectGlobalProps:type mismatch, current type is " + tag.getClass(), b.E, "webkit");
                } else {
                    c.a("injectGlobalProps:already set", b.D, "webkit");
                    ((GlobalProps) tag).f41256a = jSONObject;
                }
            }
        }
    }
}
