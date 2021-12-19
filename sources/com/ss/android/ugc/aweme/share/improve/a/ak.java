package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.crossplatform.a.c;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ak implements h {

    /* renamed from: a  reason: collision with root package name */
    private final c f123631a;

    /* renamed from: b  reason: collision with root package name */
    private final a f123632b;

    /* renamed from: c  reason: collision with root package name */
    private final WebView f123633c;

    static {
        Covode.recordClassIndex(81155);
    }

    public ak() {
        this(null, null, null, 7);
    }

    public ak(c cVar) {
        this(cVar, null, null, 6);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.fan;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "refresh";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return 2131232639;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return ch_();
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        l.d(context, "");
        l.d(sharePackage, "");
        c cVar = this.f123631a;
        if (cVar != null) {
            cVar.g();
            return;
        }
        a aVar = this.f123632b;
        if (aVar != null) {
            WebView webView = aVar.f35513d;
            if (webView != null) {
                webView.reload();
                return;
            }
            return;
        }
        WebView webView2 = this.f123633c;
        if (webView2 != null) {
            webView2.reload();
        }
    }

    private ak(c cVar, a aVar, WebView webView) {
        this.f123631a = cVar;
        this.f123632b = aVar;
        this.f123633c = webView;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ak(c cVar, a aVar, WebView webView, int i2) {
        this((i2 & 1) != 0 ? null : cVar, (i2 & 2) != 0 ? null : aVar, (i2 & 4) != 0 ? null : webView);
    }
}
