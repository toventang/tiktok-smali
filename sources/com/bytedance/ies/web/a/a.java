package com.bytedance.ies.web.a;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.covode.number.Covode;
import com.example.a.c;
import com.ss.android.ugc.tiktok.security.c.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public String f35510a = "_fetchQueue";

    /* renamed from: b  reason: collision with root package name */
    public String f35511b = "_handleMessageFromToutiao";

    /* renamed from: c  reason: collision with root package name */
    public String f35512c = "javascript:ToutiaoJSBridge";

    /* renamed from: d  reason: collision with root package name */
    public WebView f35513d;

    /* renamed from: e  reason: collision with root package name */
    public String f35514e;

    /* renamed from: f  reason: collision with root package name */
    public List<String> f35515f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f35516g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f35517h;

    /* renamed from: i  reason: collision with root package name */
    Map<String, d> f35518i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public f f35519j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f35520k;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.ies.web.a.a.a f35521l;

    /* renamed from: m  reason: collision with root package name */
    private Handler f35522m = new Handler(Looper.getMainLooper()) {
        /* class com.bytedance.ies.web.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(21237);
        }

        public final void handleMessage(Message message) {
            if (message.obj instanceof h) {
                a aVar = a.this;
                h hVar = (h) message.obj;
                WebView webView = aVar.f35513d;
                if (webView != null && hVar != null && TextUtils.equals("call", hVar.f35530a) && aVar.f35518i != null && !aVar.f35518i.isEmpty()) {
                    String url = webView.getUrl();
                    if (!aVar.f35520k && !aVar.e(url)) {
                        String str = hVar.f35532c;
                        if (aVar.f35516g == null || !aVar.f35516g.contains(str)) {
                            String str2 = hVar.f35532c;
                            if (aVar.f35517h == null || !aVar.f35517h.contains(str2)) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("code", -1);
                                    if (!TextUtils.isEmpty(hVar.f35536g)) {
                                        aVar.a(hVar.f35536g, hVar.f35531b, jSONObject);
                                        return;
                                    } else {
                                        aVar.a(hVar.f35531b, jSONObject);
                                        return;
                                    }
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            }
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        d dVar = aVar.f35518i.get(hVar.f35532c);
                        if (dVar != null) {
                            dVar.call(hVar, jSONObject2);
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    if (!hVar.f35538i) {
                        return;
                    }
                    if (!TextUtils.isEmpty(hVar.f35536g)) {
                        aVar.a(hVar.f35536g, hVar.f35531b, jSONObject2);
                    } else {
                        aVar.a(hVar.f35531b, jSONObject2);
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(21236);
    }

    @Override // com.bytedance.ies.web.a.e
    public final void a(List<String> list, h hVar, JSONObject jSONObject) {
        this.f35517h = list;
        if (!TextUtils.isEmpty(hVar.f35536g)) {
            a(hVar.f35536g, hVar.f35531b, jSONObject);
        } else {
            a(hVar.f35531b, jSONObject);
        }
    }

    public final void a() {
        this.f35513d = null;
        Handler handler = this.f35522m;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f35519j = null;
        this.f35518i = null;
    }

    public final a a(String str) {
        this.f35514e = str;
        return this;
    }

    public final a b(List<String> list) {
        this.f35516g = list;
        return this;
    }

    public final a c(List<String> list) {
        this.f35517h = list;
        return this;
    }

    public static a a(WebView webView) {
        return new a(webView);
    }

    public final a a(WebChromeClient webChromeClient) {
        WebView webView = this.f35513d;
        if (webView != null) {
            webView.setWebChromeClient(webChromeClient);
        }
        return this;
    }

    private void a(JSONObject jSONObject) {
        WebView webView = this.f35513d;
        if (webView != null) {
            i.a(webView, this.f35512c + "." + this.f35511b + "(" + jSONObject.toString() + ")");
        }
    }

    private a(WebView webView) {
        this.f35513d = webView;
        if (webView != null) {
            if ((webView instanceof b) && !((b) webView).f35527a) {
                this.f35513d.setWebChromeClient(new WebChromeClient());
            }
            try {
                this.f35513d.getSettings().setJavaScriptEnabled(true);
            } catch (Exception unused) {
            }
        }
    }

    public final a a(WebViewClient webViewClient) {
        if (this.f35513d == null) {
            return this;
        }
        if (webViewClient instanceof c) {
            ((c) webViewClient).f35529d = this;
        }
        WebView webView = this.f35513d;
        if (b.a() && webViewClient != null) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        webView.setWebViewClient(c.a(webViewClient));
        return this;
    }

    public final boolean b(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f35514e)) {
            if (!this.f35514e.equals(Uri.parse(str).getScheme().toLowerCase()) || !c(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        if (str == null || !str.startsWith(this.f35514e)) {
            return false;
        }
        String str2 = this.f35514e + "://private/setresult/";
        try {
            if (str.equals(this.f35514e + "://dispatch_message/")) {
                WebView webView = this.f35513d;
                if (webView != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    webView.evaluateJavascript(this.f35512c + "." + this.f35510a + "()", new ValueCallback<String>() {
                        /* class com.bytedance.ies.web.a.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(21238);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str) {
                            String str2 = str;
                            try {
                                a.this.d(new JSONObject("{a=" + str2 + "}").optString("a", ""));
                            } catch (JSONException unused) {
                            }
                        }
                    });
                }
                return true;
            }
            if (str.startsWith(str2)) {
                int i3 = Build.VERSION.SDK_INT;
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public final boolean e(String str) {
        String str2;
        List<String> list;
        int indexOf;
        if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 27 || (indexOf = str.indexOf(92)) == -1) {
                str2 = Uri.parse(str).getHost();
            } else {
                str2 = Uri.parse(str.substring(0, indexOf)).getHost();
            }
            if (!(str2 == null || (list = this.f35515f) == null)) {
                if (!list.isEmpty()) {
                    for (int i2 = 0; i2 < this.f35515f.size(); i2++) {
                        String str3 = this.f35515f.get(i2);
                        if (!str2.equals(str3)) {
                            if (!str2.endsWith(".".concat(String.valueOf(str3)))) {
                            }
                        }
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final a a(List<String> list) {
        this.f35515f = list;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                h hVar = new h();
                hVar.f35530a = jSONObject.getString("__msg_type");
                String str2 = null;
                hVar.f35531b = jSONObject.optString("__callback_id", null);
                hVar.f35532c = jSONObject.optString("func");
                hVar.f35533d = jSONObject.optJSONObject("params");
                hVar.f35534e = jSONObject.optInt("JSSDK");
                hVar.f35535f = jSONObject.optString("namespace");
                hVar.f35536g = jSONObject.optString("__iframe_url");
                if (!TextUtils.isEmpty(hVar.f35530a) && !TextUtils.isEmpty(hVar.f35532c)) {
                    Thread.currentThread();
                    f fVar = this.f35519j;
                    if (fVar == null || !fVar.a(hVar)) {
                        Message obtain = Message.obtain();
                        obtain.obj = hVar;
                        this.f35522m.sendMessage(obtain);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        WebView webView = this.f35513d;
                        if (webView != null) {
                            str2 = webView.getUrl();
                        }
                        this.f35519j.a(hVar, jSONObject2, str2, this);
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final a a(String str, d dVar) {
        if (!TextUtils.isEmpty(str) && dVar != null) {
            this.f35518i.put(str, dVar);
        }
        return this;
    }

    public final void b(String str, JSONObject jSONObject) {
        com.bytedance.ies.web.a.a.a aVar = this.f35521l;
        if (aVar == null || aVar.a(str, jSONObject, 2) == null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("__msg_type", "event");
                    jSONObject2.put("__event_id", str);
                    if (jSONObject != null) {
                        jSONObject2.put("__params", jSONObject);
                    }
                    a(jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        com.bytedance.ies.web.a.a.a aVar = this.f35521l;
        if (aVar == null || aVar.a(str, jSONObject, 1) == null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("__msg_type", "callback");
                jSONObject2.put("__callback_id", str);
                if (jSONObject != null) {
                    jSONObject2.put("__params", jSONObject);
                }
                a(jSONObject2);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str2);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            WebView webView = this.f35513d;
            if (webView != null) {
                i.a(webView, com.a.a("javascript:(function(){   const iframe = document.querySelector('iframe[src=\"%s\"');   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, '%s');   }})()", new Object[]{str, jSONObject2.toString(), str}));
            }
        } catch (Exception unused) {
        }
    }
}
