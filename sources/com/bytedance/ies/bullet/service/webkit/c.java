package com.bytedance.ies.bullet.service.webkit;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.web.WebChromeClientDispatcher;
import com.bytedance.ies.bullet.service.base.web.b;
import com.bytedance.ies.bullet.service.base.web.e;
import com.bytedance.ies.bullet.service.base.web.i;
import com.bytedance.ies.bullet.service.base.web.p;
import com.bytedance.ies.bullet.service.base.web.q;
import com.bytedance.webx.g;
import h.f.b.l;
import h.f.b.m;
import h.h;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public final b f33017a;

    /* renamed from: b  reason: collision with root package name */
    public final q f33018b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f33019c;

    /* renamed from: d  reason: collision with root package name */
    private final p f33020d = new p();

    /* renamed from: e  reason: collision with root package name */
    private final WebChromeClientDispatcher f33021e = new WebChromeClientDispatcher();

    /* renamed from: f  reason: collision with root package name */
    private final h f33022f = h.i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(19707);
    }

    @Override // com.bytedance.ies.bullet.service.base.web.i
    public final p b() {
        return this.f33020d;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.i
    public final WebChromeClientDispatcher c() {
        return this.f33021e;
    }

    static final class a extends m implements h.f.a.a<a> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(19708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.this$0.f33017a);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.i
    public final b d() {
        return (a) this.f33022f.getValue();
    }

    @Override // com.bytedance.ies.bullet.service.base.web.i
    public final void e() {
        this.f33020d.f32654a.clear();
        this.f33021e.f32641a.clear();
    }

    @Override // com.bytedance.ies.bullet.service.base.web.i
    public final WebView a() {
        WebView webView = this.f33019c;
        if (webView != null) {
            return webView;
        }
        throw new IllegalStateException("You must call 'createWebView' or 'setWebView' first.".toString());
    }

    @Override // com.bytedance.ies.bullet.service.base.web.i
    public final i a(Context context) {
        WebView webView;
        MethodCollector.i(11521);
        l.c(context, "");
        e eVar = (e) e.a.a().a(com.bytedance.ies.bullet.service.base.web.e.class);
        WebView webView2 = null;
        if (eVar != null) {
            webView2 = eVar.a(context, (String) null);
        }
        this.f33019c = webView2;
        if (webView2 == null) {
            try {
                webView = ((com.bytedance.webx.e.a.e) g.a("webx_webkit", com.bytedance.webx.e.a.e.class)).a(context);
            } catch (Throwable unused) {
                webView = new WebView(context);
            }
            this.f33019c = webView;
        }
        WebView webView3 = this.f33019c;
        if (webView3 != null) {
            p pVar = this.f33020d;
            if (com.ss.android.ugc.tiktok.security.c.b.a() && pVar != null) {
                WebSettings settings = webView3.getSettings();
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
            webView3.setWebViewClient(com.example.a.c.a(pVar));
            webView3.setWebChromeClient(this.f33021e);
        }
        MethodCollector.o(11521);
        return this;
    }

    public c(b bVar, q qVar) {
        l.c(bVar, "");
        l.c(qVar, "");
        this.f33017a = bVar;
        this.f33018b = qVar;
    }
}
