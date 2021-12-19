package com.bytedance.android.monitorV2.webview;

import android.webkit.WebView;
import com.bytedance.android.monitorV2.k.c;
import com.bytedance.android.monitorV2.webview.b.b;
import com.bytedance.android.monitorV2.webview.b.e;
import com.bytedance.android.monitorV2.webview.b.f;
import com.bytedance.android.monitorV2.webview.b.g;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface d extends c, b, com.bytedance.android.monitorV2.webview.b.c, e, f, g {
    static {
        Covode.recordClassIndex(14242);
    }

    void a(WebView webView);

    void b(WebView webView);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f24191a;

        /* renamed from: b  reason: collision with root package name */
        e f24192b;

        /* renamed from: c  reason: collision with root package name */
        c f24193c;

        /* renamed from: d  reason: collision with root package name */
        com.bytedance.android.monitorV2.webview.b.d f24194d;

        /* renamed from: e  reason: collision with root package name */
        String[] f24195e;

        /* renamed from: f  reason: collision with root package name */
        String[] f24196f;

        /* renamed from: g  reason: collision with root package name */
        com.bytedance.android.monitorV2.a.e f24197g;

        /* renamed from: h  reason: collision with root package name */
        b f24198h;

        /* renamed from: i  reason: collision with root package name */
        String f24199i = "";

        /* renamed from: j  reason: collision with root package name */
        boolean f24200j = true;

        /* renamed from: k  reason: collision with root package name */
        boolean f24201k;

        /* renamed from: l  reason: collision with root package name */
        boolean f24202l;

        /* renamed from: m  reason: collision with root package name */
        String f24203m = "loc_after_detach";
        boolean n = true;
        String o = "";
        String p = "";
        com.bytedance.android.monitorV2.webview.b.c q;
        int r = 100;
        String s = "";
        JSONObject t = new JSONObject();

        static {
            Covode.recordClassIndex(14243);
        }

        public final a a() {
            this.f24201k = true;
            return this;
        }

        a() {
        }

        public final a a(String str) {
            this.s = str;
            return this;
        }

        public final a a(b bVar) {
            this.f24198h = bVar;
            this.f24197g = new com.bytedance.android.monitorV2.b(bVar);
            return this;
        }

        public final a a(String... strArr) {
            this.f24195e = strArr;
            return this;
        }
    }
}
