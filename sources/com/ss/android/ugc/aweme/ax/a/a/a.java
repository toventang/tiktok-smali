package com.ss.android.ugc.aweme.ax.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ax.a.n;
import com.ss.android.ugc.aweme.ax.a.o;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements ValueCallback<String> {

    /* renamed from: a  reason: collision with root package name */
    static final String f67660a = "javascript:var result = {};var timing = window.performance && window.performance.timing;result.dom_ready = timing.domComplete - timing.domInteractive;";

    /* renamed from: m  reason: collision with root package name */
    public static long f67661m;

    /* renamed from: b  reason: collision with root package name */
    public boolean f67662b;

    /* renamed from: c  reason: collision with root package name */
    public b f67663c = new b();

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<WebView> f67664d;

    /* renamed from: e  reason: collision with root package name */
    public WebView f67665e;

    /* renamed from: f  reason: collision with root package name */
    public n f67666f;

    /* renamed from: g  reason: collision with root package name */
    public String f67667g;

    /* renamed from: h  reason: collision with root package name */
    public int f67668h;

    /* renamed from: i  reason: collision with root package name */
    public int f67669i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f67670j = new Handler();

    /* renamed from: k  reason: collision with root package name */
    public long f67671k;

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f67672l = new Runnable() {
        /* class com.ss.android.ugc.aweme.ax.a.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(41659);
        }

        public final void run() {
            if (a.this.f67664d != null && a.this.f67664d.get() != null) {
                if (a.this.f67663c.f67684j == 100) {
                    a.this.a(true, false);
                } else if (a.this.f67663c.f67684j > a.this.f67668h) {
                    a aVar = a.this;
                    aVar.f67668h = aVar.f67663c.f67684j;
                    a.this.f67669i = 0;
                    a.this.f67670j.postDelayed(this, 1000);
                } else {
                    a.this.f67669i++;
                    if (a.this.f67669i < 3) {
                        a.this.f67670j.postDelayed(this, 1000);
                        return;
                    }
                    a aVar2 = a.this;
                    int i2 = Build.VERSION.SDK_INT;
                    if (aVar2.f67665e != null) {
                        try {
                            aVar2.f67665e.evaluateJavascript(a.f67660a, null);
                            aVar2.f67665e.evaluateJavascript("javascript:result", new ValueCallback<String>() {
                                /* class com.ss.android.ugc.aweme.ax.a.a.a.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(41660);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(String str) {
                                    try {
                                        if (new JSONObject(str).getLong("dom_ready") <= 0) {
                                            a.this.f67663c.y = -4;
                                            a.this.f67663c.p = true;
                                        }
                                        a.this.a(true, false);
                                    } catch (JSONException unused) {
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    };
    private List<String> n;
    private boolean o;
    private String p;
    private long q;

    static {
        Covode.recordClassIndex(41658);
    }

    public final void d() {
        if (this.f67663c.y != 0) {
            if (TextUtils.equals(this.f67663c.B, this.f67663c.f67683i)) {
                this.f67663c.p = true;
                a(true, false);
                return;
            }
            this.f67663c.t++;
        }
    }

    public final JSONObject a() {
        boolean z;
        b bVar = this.f67663c;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isBlank", Boolean.toString(bVar.f67675a));
            jSONObject.put("pageFinish", Boolean.toString(bVar.q));
            jSONObject.put("mainFrameError", Boolean.toString(bVar.p));
            jSONObject.put("webViewType", bVar.f67681g);
            if (bVar.v > 0) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("isOfflineCache", Boolean.toString(z));
            jSONObject.put("errUrl", bVar.B);
            jSONObject.put("errType", Integer.toString(bVar.y));
            jSONObject.put("errCode", Integer.toString(bVar.z.intValue()));
            jSONObject.put("errMsg", bVar.A);
            jSONObject.put("useCache", Boolean.toString(a(bVar)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final JSONObject b() {
        b bVar = this.f67663c;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ttweb_isBlank", bVar.f67675a);
            jSONObject.put("ttweb_pageFinish", bVar.q);
            jSONObject.put("ttweb_originalUrl", bVar.f67682h);
            jSONObject.put("ttweb_pageUrl", bVar.f67683i);
            jSONObject.put("ttweb_webviewType", bVar.f67681g);
            jSONObject.put("ttweb_mainFrameError", bVar.p);
            jSONObject.put("ttweb_errUrl", bVar.B);
            jSONObject.put("ttweb_errType", bVar.y);
            jSONObject.put("ttweb_errCode", bVar.z);
            jSONObject.put("ttweb_errMsg", bVar.A);
            jSONObject.put("ttweb_useCache", a(bVar));
            if (f67661m > 0) {
                jSONObject.put("ttweb_initToLoadUrl", bVar.f67685k - f67661m);
                jSONObject.put("ttweb_initToPageStart", bVar.f67686l - f67661m);
                jSONObject.put("ttweb_initToPageFinish", bVar.f67687m - f67661m);
            }
            jSONObject.put("ttweb_detectDuration", bVar.f67676b);
            jSONObject.put("ttweb_attachedWindowToLoadUrl", bVar.f67685k - bVar.f67679e);
            jSONObject.put("ttweb_loadUrlToAttachedWindow", bVar.f67679e - bVar.f67685k);
            jSONObject.put("ttweb_loadUrlToPageFinish", bVar.f67687m - bVar.f67685k);
            jSONObject.put("ttweb_loadUrlToPageStart", bVar.f67686l - bVar.f67685k);
            jSONObject.put("ttweb_attachedWindowToDetachWindow", bVar.f67680f - bVar.f67679e);
            jSONObject.put("ttweb_pageStartToPageFinish", bVar.f67687m - bVar.f67686l);
            jSONObject.put("ttweb_loadUrlToDetachWindow", bVar.f67680f - bVar.f67685k);
            jSONObject.put("ttweb_loadResCount", bVar.r);
            jSONObject.put("ttweb_requestResCount", bVar.s);
            jSONObject.put("ttweb_loadResErrorCount", bVar.t);
            jSONObject.put("ttweb_ttNetResCount", bVar.u);
            jSONObject.put("ttweb_offlineResCount", bVar.v);
            jSONObject.put("ttweb_TTWebViewData", this.p);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final JSONObject c() {
        b bVar = this.f67663c;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("detectDuration", bVar.f67676b);
            jSONObject.put("attachedWindowToLoadUrl", bVar.f67685k - bVar.f67679e);
            jSONObject.put("loadUrlToAttachedWindow", bVar.f67679e - bVar.f67685k);
            jSONObject.put("loadUrlToPageFinish", bVar.f67687m - bVar.f67685k);
            jSONObject.put("loadUrlToPageStart", bVar.f67686l - bVar.f67685k);
            jSONObject.put("attachedWindowToDetachWindow", bVar.f67680f - bVar.f67679e);
            jSONObject.put("pageStartToPageFinish", bVar.f67687m - bVar.f67686l);
            jSONObject.put("loadUrlToDetachWindow", bVar.f67680f - bVar.f67685k);
            jSONObject.put("loadResCount", bVar.r);
            jSONObject.put("requestResCount", bVar.s);
            jSONObject.put("loadResErrorCount", bVar.t);
            jSONObject.put("ttNetResCount", bVar.u);
            jSONObject.put("offlineResCount", bVar.v);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            return true;
        }
        return false;
    }

    public static boolean a(String str) {
        if (b(str)) {
            return false;
        }
        if (TextUtils.equals("about:blank", str)) {
            return true;
        }
        if (str == null || str.length() <= 9 || !str.substring(0, 10).equalsIgnoreCase("javascript")) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals("null", str2) && !TextUtils.equals("{}", str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("detailGetWebViewData")) {
                    this.p = jSONObject.getString("detailGetWebViewData");
                    this.q = SystemClock.uptimeMillis();
                }
                if (jSONObject.has("detailClearWebViewData")) {
                    SystemClock.uptimeMillis();
                }
                if (jSONObject.has("detailEnableDomData")) {
                    SystemClock.uptimeMillis();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final boolean a(b bVar) {
        if (!(this.n == null || bVar == null || TextUtils.isEmpty(bVar.f67682h))) {
            for (String str : this.n) {
                if (bVar.f67682h.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(boolean z, boolean z2) {
        if (!this.f67662b) {
            this.f67662b = true;
            if (!this.f67663c.p) {
                if (z || !z2) {
                    this.f67663c.q = true;
                }
            }
        }
    }

    public final void a(String str, ValueCallback<String> valueCallback) {
        if (this.f67665e != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (this.o) {
                this.f67665e.evaluateJavascript("ttwebview:/*" + str + "*/;", valueCallback);
            }
        }
    }

    public a(WebView webView, List<String> list, n nVar, o oVar) {
        boolean z;
        String str;
        this.f67664d = new WeakReference<>(webView);
        this.f67665e = webView;
        this.n = list;
        this.f67666f = nVar;
        if (oVar == null || !oVar.g()) {
            z = false;
        } else {
            z = true;
        }
        this.o = z;
        if (oVar != null) {
            str = oVar.f();
        } else {
            str = "";
        }
        this.f67667g = str;
    }
}
