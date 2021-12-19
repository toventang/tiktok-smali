package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry;
import f.a.d.f;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g f44251a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewPreloadEntry f44252b;

    static {
        Covode.recordClassIndex(27116);
    }

    h(g gVar, WebViewPreloadEntry webViewPreloadEntry) {
        this.f44251a = gVar;
        this.f44252b = webViewPreloadEntry;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        g gVar = this.f44251a;
        WebViewPreloadEntry webViewPreloadEntry = this.f44252b;
        if (((Boolean) obj).booleanValue()) {
            gVar.a(webViewPreloadEntry.getUrl(), webViewPreloadEntry.getDelay(), webViewPreloadEntry.isNeedRender());
        }
    }
}
