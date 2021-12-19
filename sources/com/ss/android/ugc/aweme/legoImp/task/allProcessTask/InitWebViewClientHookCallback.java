package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import android.content.Context;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.example.a.c;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImp.task.q;
import java.util.List;

public final class InitWebViewClientHookCallback implements w {
    static {
        Covode.recordClassIndex(69199);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return q.f107989a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        c.f46463a = a.f107962a;
    }

    static final class a implements com.example.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107962a = new a();

        static {
            Covode.recordClassIndex(69200);
        }

        a() {
        }

        @Override // com.example.a.a
        public final boolean a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            String str2;
            String str3;
            String str4;
            com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
            if (renderProcessGoneDetail.didCrash()) {
                str = "crash";
            } else {
                str = "system kill";
            }
            cVar.a("exit_type", str);
            cVar.a("renderer_priority", Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            cVar.a("WebView", webView.getClass().getCanonicalName());
            if (webView.getOriginalUrl() != null) {
                str2 = webView.getOriginalUrl();
            } else {
                str2 = "original_url is null";
            }
            cVar.a("original_url", str2);
            if (webView.getUrl() != null) {
                str3 = webView.getUrl();
            } else {
                str3 = "url is null";
            }
            cVar.a("url", str3);
            if (webView.getTitle() != null) {
                str4 = webView.getTitle();
            } else {
                str4 = "title is null";
            }
            cVar.a("title", str4);
            boolean didCrash = renderProcessGoneDetail.didCrash();
            b.a("aweme_webview_render_exception", didCrash ? 1 : 0, cVar.a());
            return true;
        }
    }
}
