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
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.e;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class j extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public CrossPlatformWebView f75208a;

    /* renamed from: b  reason: collision with root package name */
    String f75209b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f75210c;

    /* renamed from: d  reason: collision with root package name */
    private e f75211d;

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f75212e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f75213f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f75214g;

    static {
        Covode.recordClassIndex(46403);
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
            Covode.recordClassIndex(46405);
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
            Covode.recordClassIndex(46404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(CrossPlatformWebView crossPlatformWebView) {
            super(crossPlatformWebView);
            l.d(crossPlatformWebView, "");
        }
    }

    public j(Fragment fragment, boolean z) {
        l.d(fragment, "");
        this.f75212e = fragment;
        this.f75213f = z;
        this.f75214g = true;
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity == null) {
            l.b();
        }
        this.f75210c = activity;
        this.f75211d = new b();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        Objects.requireNonNull(aVar2.itemView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
        int f2 = (((i.f(this.f75210c) - i.b()) - ((int) this.f75210c.getResources().getDimension(R.dimen.a0s))) + 0) - n.a(40.0d);
        if (this.f75213f) {
            f2 -= (int) this.f75210c.getResources().getDimension(R.dimen.n5);
        }
        View view = aVar2.itemView;
        l.b(view, "");
        ((CrossPlatformWebView) view).setLayoutParams(new ViewGroup.LayoutParams(i.b(this.f75210c), f2));
        String str = this.f75209b;
        if (str != null) {
            ((CrossPlatformWebView) aVar2.itemView).a(1, n.a(80.0d));
            ((CrossPlatformWebView) aVar2.itemView).a(str, this.f75214g, true);
        }
    }

    private static RecyclerView.ViewHolder a(j jVar, ViewGroup viewGroup, int i2) {
        Bundle bundle;
        boolean a2;
        MethodCollector.i(3977);
        String str = "";
        l.d(viewGroup, str);
        jVar.f75208a = new CrossPlatformWebView(jVar.f75210c, (AttributeSet) null, 6);
        Fragment fragment = jVar.f75212e;
        if (fragment instanceof l) {
            bundle = ((l) fragment).a();
        } else {
            bundle = new Bundle();
        }
        String str2 = jVar.f75209b;
        if (str2 != null) {
            str = str2;
        }
        bundle.putString("url", str);
        CrossPlatformWebView crossPlatformWebView = jVar.f75208a;
        if (crossPlatformWebView == null) {
            l.b();
        }
        CommercializeWebViewHelper.a(crossPlatformWebView, jVar.f75211d, jVar.f75212e, jVar.f75210c, bundle);
        CrossPlatformWebView crossPlatformWebView2 = jVar.f75208a;
        if (crossPlatformWebView2 == null) {
            l.b();
        }
        a aVar = new a(crossPlatformWebView2);
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
        MethodCollector.o(3977);
        return aVar;
    }
}
