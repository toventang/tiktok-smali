package com.bytedance.android.livesdk.browser.c;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.b.h;
import com.bytedance.android.live.b.o;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface d {

    public interface c {
        static {
            Covode.recordClassIndex(7925);
        }

        WebViewClient a();

        void b();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.c.d$d  reason: collision with other inner class name */
    public interface AbstractC0310d {
        static {
            Covode.recordClassIndex(7926);
        }

        boolean a();

        f b();

        boolean c();
    }

    public interface e {
        static {
            Covode.recordClassIndex(7927);
        }

        void a(WebView webView, String str);
    }

    static {
        Covode.recordClassIndex(7922);
    }

    WebView a(Context context);

    com.bytedance.android.live.core.widget.a a(b bVar);

    com.bytedance.android.live.core.widget.a a(b bVar, o oVar);

    f a(Activity activity, e eVar);

    void a(Context context, a aVar);

    void a(WebView webView);

    void a(f fVar);

    void a(f fVar, String str);

    void a(f fVar, String str, JSONObject jSONObject);

    void a(com.bytedance.android.livesdk.browser.jsbridge.b bVar);

    void a(String str, JSONObject jSONObject);

    boolean a();

    boolean a(String str);

    void b(com.bytedance.android.livesdk.browser.jsbridge.b bVar);

    public static class b {
        public boolean A;
        public String B;
        public boolean C;
        public String D;
        public String E;
        public String F;
        public float G;
        public boolean H;
        public int I;
        public boolean J;

        /* renamed from: a  reason: collision with root package name */
        public String f14300a;

        /* renamed from: b  reason: collision with root package name */
        public int f14301b;

        /* renamed from: c  reason: collision with root package name */
        public int f14302c;

        /* renamed from: d  reason: collision with root package name */
        public int f14303d;

        /* renamed from: e  reason: collision with root package name */
        public int f14304e;

        /* renamed from: f  reason: collision with root package name */
        public int f14305f;

        /* renamed from: g  reason: collision with root package name */
        public int f14306g;

        /* renamed from: h  reason: collision with root package name */
        public int f14307h;

        /* renamed from: i  reason: collision with root package name */
        public int f14308i;

        /* renamed from: j  reason: collision with root package name */
        public int f14309j;

        /* renamed from: k  reason: collision with root package name */
        public int f14310k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f14311l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f14312m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public boolean t;
        public h u;
        public String v;
        public boolean w;
        public String x;
        public boolean y;
        public boolean z;

        static {
            Covode.recordClassIndex(7924);
        }

        public final b b(String str) {
            if (str != null) {
                this.F = str;
            }
            return this;
        }

        public final b a(int i2) {
            this.f14311l = false;
            this.f14304e = i2;
            this.f14305f = 0;
            this.f14306g = 0;
            this.f14307h = 0;
            this.f14308i = 0;
            return this;
        }

        private b(String str) {
            this.f14310k = -1;
            this.v = "";
            this.w = true;
            this.D = "";
            this.F = "bottom";
            this.f14300a = str;
        }

        public final b a(String str) {
            try {
                this.G = Float.parseFloat(str);
            } catch (Exception unused) {
                this.G = 0.0f;
            }
            return this;
        }

        /* synthetic */ b(String str, byte b2) {
            this(str);
        }

        public final b a(int i2, int i3, int i4, int i5) {
            this.f14311l = true;
            this.f14305f = i2;
            this.f14306g = i3;
            this.f14307h = i4;
            this.f14308i = i5;
            return this;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f14290a;

        /* renamed from: b  reason: collision with root package name */
        public String f14291b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14292c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f14293d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f14294e;

        /* renamed from: f  reason: collision with root package name */
        public String f14295f;

        /* renamed from: g  reason: collision with root package name */
        public String f14296g;

        /* renamed from: h  reason: collision with root package name */
        public String f14297h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f14298i;

        /* renamed from: j  reason: collision with root package name */
        public String f14299j;

        static {
            Covode.recordClassIndex(7923);
        }

        private a(String str) {
            this.f14298i = true;
            this.f14290a = str;
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }
    }

    public static class f implements com.bytedance.android.livesdk.browser.jsbridge.b {

        /* renamed from: a  reason: collision with root package name */
        public WebView f14313a;

        /* renamed from: b  reason: collision with root package name */
        public a f14314b;

        /* renamed from: c  reason: collision with root package name */
        public WebChromeClient f14315c;

        /* renamed from: d  reason: collision with root package name */
        public WebViewClient f14316d;

        /* renamed from: e  reason: collision with root package name */
        c f14317e;

        static {
            Covode.recordClassIndex(7928);
        }

        @Override // com.bytedance.android.livesdk.browser.jsbridge.b
        public final <T> void a(String str, T t) {
            a aVar = this.f14314b;
            if (aVar != null && aVar.a() != null) {
                this.f14314b.a().a(str, (Object) t);
            }
        }

        public f(WebView webView, a aVar, WebChromeClient webChromeClient, c cVar) {
            this.f14313a = webView;
            this.f14314b = aVar;
            this.f14315c = webChromeClient;
            this.f14316d = cVar.a();
            this.f14317e = cVar;
        }
    }
}
