package com.bytedance.android.monitor.webview;

import android.webkit.WebView;
import com.bytedance.android.monitor.k.b;
import com.bytedance.android.monitor.webview.b.d;
import com.bytedance.android.monitor.webview.b.e;
import com.bytedance.android.monitor.webview.b.f;
import com.bytedance.android.monitor.webview.b.g;
import com.bytedance.android.monitor.webview.b.h;
import com.bytedance.android.monitor.webview.b.i;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface c extends b, com.bytedance.android.monitor.webview.b.a, com.bytedance.android.monitor.webview.b.c, d, e, g, h, i {
    static {
        Covode.recordClassIndex(14052);
    }

    void a(WebView webView);

    void b(WebView webView);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23689a;

        /* renamed from: b  reason: collision with root package name */
        public d f23690b;

        /* renamed from: c  reason: collision with root package name */
        b f23691c;

        /* renamed from: d  reason: collision with root package name */
        f f23692d;

        /* renamed from: e  reason: collision with root package name */
        public String[] f23693e;

        /* renamed from: f  reason: collision with root package name */
        public String[] f23694f;

        /* renamed from: g  reason: collision with root package name */
        public String f23695g;

        /* renamed from: h  reason: collision with root package name */
        com.bytedance.android.monitor.b.e f23696h;

        /* renamed from: i  reason: collision with root package name */
        a f23697i;

        /* renamed from: j  reason: collision with root package name */
        public String f23698j = "";

        /* renamed from: k  reason: collision with root package name */
        public boolean f23699k = true;

        /* renamed from: l  reason: collision with root package name */
        public boolean f23700l = true;

        /* renamed from: m  reason: collision with root package name */
        public boolean f23701m = true;
        public boolean n = true;
        public boolean o = true;
        public boolean p;
        public boolean q;
        public boolean r;
        public String s = "loc_after_detach";
        boolean t = true;
        String u = "";
        String v = "";
        e w;
        int x = 100;
        public String y = "";
        public JSONObject z = new JSONObject();

        static {
            Covode.recordClassIndex(14053);
        }

        public final a a() {
            this.p = true;
            return this;
        }

        public final a b() {
            this.q = true;
            return this;
        }

        public final a d() {
            this.f23699k = true;
            return this;
        }

        public final a c() {
            this.s = "loc_after_detach";
            return this;
        }

        a() {
        }

        public final a a(String str) {
            this.y = str;
            return this;
        }

        public final a b(String str) {
            this.f23689a = str;
            return this;
        }

        public final a a(a aVar) {
            this.f23697i = aVar;
            this.f23696h = new com.bytedance.android.monitor.b(aVar);
            return this;
        }

        public final a a(String... strArr) {
            this.f23693e = strArr;
            return this;
        }
    }
}
