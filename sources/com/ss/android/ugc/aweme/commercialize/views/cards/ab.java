package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.h;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.ss.android.ugc.aweme.commercialize.abtest.CommerceAdLandpageBulletConfig;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.commercialize.views.cards.ae;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.crossplatform.view.j;
import com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.i;
import h.m.p;
import java.util.List;
import java.util.Objects;

public final class ab extends com.bytedance.ies.uikit.a.b implements ae {

    /* renamed from: c  reason: collision with root package name */
    public static final a f76035c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f76036a;

    /* renamed from: b  reason: collision with root package name */
    public ae.a f76037b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f76038d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f76039e;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f76040j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f76041k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f76042l;

    /* renamed from: m  reason: collision with root package name */
    private String f76043m;
    private final com.ss.android.ugc.aweme.commercialize.j.a n;
    private final com.ss.android.ugc.aweme.bullet.module.ad.d o;
    private SparseArray p;

    static {
        Covode.recordClassIndex(46901);
    }

    private final CrossPlatformWebView g() {
        return (CrossPlatformWebView) this.f76039e.getValue();
    }

    private final View h() {
        return (View) this.f76041k.getValue();
    }

    private final ImageView i() {
        return (ImageView) this.f76042l.getValue();
    }

    public final CommonBizWebView a() {
        return (CommonBizWebView) this.f76040j.getValue();
    }

    public final View b(int i2) {
        if (this.p == null) {
            this.p = new SparseArray();
        }
        View view = (View) this.p.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.p.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46902);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ab a(Bundle bundle) {
            l.d(bundle, "");
            ab abVar = new ab();
            abVar.setArguments(bundle);
            return abVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final m b() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final Fragment c() {
        return this;
    }

    static final class e extends h.f.b.m implements h.f.a.a<CommonBizWebView> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(46906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ab abVar) {
            super(0);
            this.this$0 = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CommonBizWebView invoke() {
            return this.this$0.b(R.id.a0o);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<ImageView> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(46907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ab abVar) {
            super(0);
            this.this$0 = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.b(R.id.a7h);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<CrossPlatformWebView> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(46908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ab abVar) {
            super(0);
            this.this$0 = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CrossPlatformWebView invoke() {
            return this.this$0.b(R.id.fm8);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(46909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ab abVar) {
            super(0);
            this.this$0 = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.b(R.id.fm9);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final View d() {
        if (this.f76038d) {
            return a().getWebView();
        }
        return a(g());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final boolean e() {
        if (this.f76038d) {
            com.ss.android.ugc.aweme.bullet.module.ad.d dVar = this.o;
            if (!dVar.f69361a || dVar.f69362b) {
                return false;
            }
            return true;
        }
        com.ss.android.ugc.aweme.commercialize.j.a aVar = this.n;
        if (!aVar.f74487a || aVar.f74488b) {
            return false;
        }
        return true;
    }

    public ab() {
        CommerceAdLandpageBulletConfig c2 = com.ss.android.ugc.aweme.commercialize.abtest.c.c();
        boolean z = false;
        if (c2 != null && c2.getTotalEnable()) {
            z = c2.getAdLandpageCardEnable();
        }
        this.f76038d = z;
        this.f76039e = i.a((h.f.a.a) new g(this));
        this.f76040j = i.a((h.f.a.a) new e(this));
        this.f76041k = i.a((h.f.a.a) new h(this));
        this.f76042l = i.a((h.f.a.a) new f(this));
        this.f76036a = 2131232523;
        this.f76043m = "";
        this.n = new com.ss.android.ugc.aweme.commercialize.j.a();
        this.o = new com.ss.android.ugc.aweme.bullet.module.ad.d();
    }

    public static final class d implements h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ab f76046a;

        static {
            Covode.recordClassIndex(46905);
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri) {
            l.d(uri, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri, Throwable th) {
            l.d(uri, "");
            l.d(th, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            l.d(view, "");
            l.d(uri, "");
            l.d(iVar, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
            l.d(iVar, "");
            l.d(uri, "");
            l.d(qVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(ab abVar) {
            this.f76046a = abVar;
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
            WebSettings settings;
            l.d(list, "");
            l.d(uri, "");
            l.d(iVar, "");
            SSWebView webView = this.f76046a.a().getWebView();
            if (webView != null && (settings = webView.getSettings()) != null) {
                settings.setTextZoom(100);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final void a(int i2) {
        if (i2 != 0) {
            this.f76036a = i2;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ab f76044a;

        static {
            Covode.recordClassIndex(46903);
        }

        b(ab abVar) {
            this.f76044a = abVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ae.a aVar = this.f76044a.f76037b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ab f76045a;

        static {
            Covode.recordClassIndex(46904);
        }

        c(ab abVar) {
            this.f76045a = abVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ae.a aVar = this.f76045a.f76037b;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    private static SingleWebView a(CrossPlatformWebView crossPlatformWebView) {
        SingleWebView a2 = ((j) crossPlatformWebView.a(j.class)).a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final void b(boolean z) {
        if (ab_()) {
            if (this.f76038d) {
                a().setCanScrollVertically(z);
            } else {
                a(g()).setCanScrollVertically(z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final void a(ae.a aVar) {
        l.d(aVar, "");
        this.f76037b = aVar;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (!(arguments == null || (string = arguments.getString("url", str)) == null)) {
            Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = p.b((CharSequence) string).toString();
            if (obj != null) {
                str = obj;
            }
        }
        this.f76043m = str;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final void a(String str) {
        if (TextUtils.isEmpty(str) || str == null) {
            return;
        }
        if (this.f76038d) {
            SSWebView webView = a().getWebView();
            if (webView != null) {
                webView.loadUrl(str);
                return;
            }
            return;
        }
        a(g()).loadUrl(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae
    public final void a(boolean z) {
        if (ab_()) {
            if (z) {
                h().setVisibility(8);
            } else {
                h().setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.ss.android.ugc.aweme.bullet.business.b bVar;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f76038d) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                CommonBizWebView a2 = a();
                d.b a3 = com.ss.android.ugc.aweme.bullet.b.a().a();
                com.ss.android.ugc.aweme.bullet.module.ad.d dVar = this.o;
                l.b(activity, "");
                a2.a(a3, dVar, new BulletActivityWrapper(activity), this, "ad_commerce");
            }
            com.ss.android.ugc.aweme.bullet.module.base.b rootContainer = a().getRootContainer();
            if (!(rootContainer == null || (bVar = rootContainer.z) == null)) {
                bVar.c();
            }
        } else {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                CommercializeWebViewHelper.a(g(), this.n, this, activity2, getArguments());
            }
            a(g()).setEnableScrollControl(true);
            a(g()).setCanScrollVertically(false);
            WebSettings settings = a(g()).getSettings();
            l.b(settings, "");
            settings.setTextZoom(100);
            SingleWebChromeClient singleWebChromeClient = a(g()).getSingleWebChromeClient();
            if (singleWebChromeClient != null) {
                singleWebChromeClient.f78880c = false;
            }
        }
        h().setOnClickListener(new b(this));
        i().setImageResource(this.f76036a);
        int i2 = this.f76036a;
        if (i2 == 2131231768) {
            i().setPadding(n.a(12.0d), n.a(4.0d), n.a(4.0d), n.a(7.0d));
        } else if (i2 == 2131232524) {
            ViewGroup.LayoutParams layoutParams = i().getLayoutParams();
            layoutParams.width = n.a(28.0d);
            layoutParams.height = n.a(28.0d);
            i().setLayoutParams(layoutParams);
            i().setPadding(n.a(8.0d), n.a(10.0d), n.a(8.0d), n.a(6.0d));
        } else if (i2 == 2131232526) {
            Drawable drawable = getResources().getDrawable(i2);
            int i3 = Build.VERSION.SDK_INT;
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            l.b(drawable, "");
            if (drawable != null && gb.a(getContext())) {
                i().setImageDrawable(drawable);
            }
            ViewGroup.LayoutParams layoutParams2 = i().getLayoutParams();
            int a4 = n.a(40.0d);
            layoutParams2.width = a4;
            layoutParams2.height = a4;
            i().setPadding(0, 0, 0, 0);
        } else if (i2 == 2131232525) {
            ImageView i4 = i();
            i4.getLayoutParams().width = n.a(36.0d);
            i4.getLayoutParams().height = n.a(36.0d);
            int a5 = n.a(12.0d);
            i4.setPadding(a5, a5, a5, a5);
        }
        i().setOnClickListener(new c(this));
        com.ss.android.ugc.aweme.utils.j.a(i());
        if (this.f76038d) {
            a().setVisibility(0);
            g().setVisibility(8);
            a().a(com.ss.android.ugc.aweme.bullet.utils.c.a(this.f76043m, h.a.n.a("ad_commerce"), getArguments(), new com.ss.android.ugc.aweme.bullet.module.base.g(com.bytedance.ies.ugc.appcontext.d.a())), getArguments(), new d(this));
            a().setEnableScrollControl(true);
            a().setCanScrollVertically(false);
            return;
        }
        CrossPlatformWebView.a(g(), this.f76043m, false, null, 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        if (!com.ss.android.ugc.aweme.experiment.e.f89880b || this.f76038d) {
            return com.a.a(layoutInflater, R.layout.a0m, viewGroup, false);
        }
        return ((X2CBaseInflate) com.ss.android.ugc.aweme.lego.f.b(X2CAdWebPage.class)).a(getContext(), R.layout.a0m);
    }
}
