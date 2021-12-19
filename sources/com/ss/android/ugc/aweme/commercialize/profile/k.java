package com.ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.g;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.ss.android.ugc.aweme.bullet.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class k extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public CommonBizWebView f75215a;

    /* renamed from: b  reason: collision with root package name */
    public String f75216b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f75217c;

    /* renamed from: d  reason: collision with root package name */
    private e f75218d;

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f75219e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f75220f = false;

    /* renamed from: g  reason: collision with root package name */
    private g f75221g;

    static {
        Covode.recordClassIndex(46406);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return 1;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class b implements e {
        static {
            Covode.recordClassIndex(46408);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, int i2, String str, String str2) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str, Bitmap bitmap) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final boolean b(WebView webView, String str) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void c(WebView webView, String str) {
        }

        b() {
        }
    }

    public static final class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(46407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(CommonBizWebView commonBizWebView) {
            super(commonBizWebView);
            l.d(commonBizWebView, "");
        }
    }

    public k(Fragment fragment, g gVar) {
        l.d(fragment, "");
        l.d(gVar, "");
        this.f75219e = fragment;
        this.f75221g = gVar;
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity == null) {
            l.b();
        }
        this.f75217c = activity;
        this.f75218d = new b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        Objects.requireNonNull(aVar2.itemView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView");
        int f2 = (((i.f(this.f75217c) - i.b()) - ((int) this.f75217c.getResources().getDimension(R.dimen.a0s))) + 0) - n.a(40.0d);
        if (this.f75220f) {
            f2 -= (int) this.f75217c.getResources().getDimension(R.dimen.n5);
        }
        View view = aVar2.itemView;
        l.b(view, "");
        ((CommonBizWebView) view).setLayoutParams(new ViewGroup.LayoutParams(i.b(this.f75217c), f2));
        String str = this.f75216b;
        if (str != null) {
            ((BulletContainerView) aVar2.itemView).a(BulletService.f().a(this.f75217c), 1, 0, n.a(80.0d), 0, 0);
            CommonBizWebView.a((CommonBizWebView) aVar2.itemView, c.a(str));
        }
    }

    private static RecyclerView.ViewHolder a(k kVar, ViewGroup viewGroup, int i2) {
        Bundle bundle;
        boolean a2;
        MethodCollector.i(2225);
        String str = "";
        l.d(viewGroup, str);
        CommonBizWebView commonBizWebView = new CommonBizWebView(kVar.f75217c, (AttributeSet) null, 6);
        commonBizWebView.a(com.ss.android.ugc.aweme.bullet.b.a().a());
        commonBizWebView.setActivityWrapper(kVar.f75221g);
        commonBizWebView.setIsAutoReleasableWhenDetached(false);
        kVar.f75215a = commonBizWebView;
        Fragment fragment = kVar.f75219e;
        if (fragment instanceof l) {
            bundle = ((l) fragment).a();
        } else {
            bundle = new Bundle();
        }
        String str2 = kVar.f75216b;
        if (str2 != null) {
            str = str2;
        }
        bundle.putString("url", str);
        CommercializeWebViewHelper.a(new CrossPlatformWebView(kVar.f75217c, (AttributeSet) null, 6), kVar.f75218d, kVar.f75219e, kVar.f75217c, bundle);
        CommonBizWebView commonBizWebView2 = kVar.f75215a;
        if (commonBizWebView2 == null) {
            l.b();
        }
        a aVar = new a(commonBizWebView2);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(2225);
        return aVar;
    }
}
