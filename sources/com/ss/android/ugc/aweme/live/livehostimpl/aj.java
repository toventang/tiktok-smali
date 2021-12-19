package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdkapi.d.c;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.sdk.webview.h;
import com.ss.android.token.d;
import com.ss.android.ugc.aweme.i18n.xbridge.c.a;
import com.ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.utils.dc;
import java.util.List;
import java.util.Map;

public final class aj implements k {

    /* renamed from: a  reason: collision with root package name */
    private volatile h f108459a;

    static {
        Covode.recordClassIndex(69501);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final void c() {
        a.a();
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final String b() {
        d();
        String str = this.f108459a.f60221b;
        if (!TextUtils.isEmpty(str)) {
            return dc.a("offlineX", str, "tiktok_live_lynx");
        }
        return null;
    }

    private void d() {
        if (this.f108459a == null) {
            this.f108459a = new h(LiveHostOuterService.q().f()).a(LiveHostOuterService.q().e()).a(c.a());
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final List<String> a() {
        return LiveHostOuterService.q().d();
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final Map<String, String> b(String str) {
        return d.a(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final List<String> a(String str) {
        return NetworkUtils.getShareCookie(CookieManager.getInstance(), str);
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final void a(String str, Context context) {
        com.ss.android.ugc.aweme.ecommerce.service.a.a().prefetchSchema(str, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final WebResourceResponse a(WebView webView, String str) {
        d();
        return this.f108459a.a(webView, str);
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final Object a(Context context, Object obj) {
        ILiveHostOuterService q = LiveHostOuterService.q();
        if (q instanceof com.bytedance.android.livesdkapi.host.a.a) {
            return ((com.bytedance.android.livesdkapi.host.a.a) q).a(context, obj);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.k
    public final Object a(Object obj, Context context, Object obj2, View view, Object obj3) {
        ILiveHostOuterService q = LiveHostOuterService.q();
        if (q instanceof com.bytedance.android.livesdkapi.host.a.a) {
            return ((com.bytedance.android.livesdkapi.host.a.a) q).a(obj, context, obj2, view, obj3);
        }
        return null;
    }
}
