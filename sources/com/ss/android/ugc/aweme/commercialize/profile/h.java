package com.ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.profile.i;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;

public final class h extends com.ss.android.ugc.aweme.base.ui.e implements com.ss.android.ugc.aweme.profile.ui.d.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f75171c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h.h f75172a = h.i.a((h.f.a.a) new f(this));

    /* renamed from: b  reason: collision with root package name */
    public Aweme f75173b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f75174d = h.i.a((h.f.a.a) new C1712h(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f75175j = h.i.a((h.f.a.a) new j(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f75176k = h.i.a((h.f.a.a) new k(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f75177l = h.i.a((h.f.a.a) new e(this));

    /* renamed from: m  reason: collision with root package name */
    private final h.h f75178m = h.i.a((h.f.a.a) new i(this));
    private final h.h n = h.i.a((h.f.a.a) new d(this));
    private final h.h o = h.i.a((h.f.a.a) new g(this));
    private DataCenter p;
    private com.ss.android.ugc.aweme.arch.widgets.base.e q;
    private HashMap r;

    static {
        Covode.recordClassIndex(46364);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public final View a(int i2) {
        if (this.r == null) {
            this.r = new HashMap();
        }
        View view = (View) this.r.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.r.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final ConstraintLayout a() {
        return (ConstraintLayout) this.f75175j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.a
    public final void a(String str) {
    }

    public final TextView b() {
        return (TextView) this.f75176k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.e
    public final void e() {
        HashMap hashMap = this.r;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.ui.e, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        e();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46365);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.a
    public final Fragment c() {
        return this;
    }

    static final class d extends h.f.b.m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46368);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.a(R.id.qb);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.a(R.id.fi);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.db_);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.a(R.id.cnt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$h  reason: collision with other inner class name */
    static final class C1712h extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1712h(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.a(R.id.dqn);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<DampScrollableLayout> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DampScrollableLayout invoke() {
            return this.this$0.a(R.id.dti);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.a(R.id.em8);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.cva);
        }
    }

    public static final class c implements ScrollableLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f75179a;

        static {
            Covode.recordClassIndex(46367);
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final void a(float f2, float f3) {
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final boolean an_() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(h hVar) {
            this.f75179a = hVar;
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final void b(int i2, int i3) {
            Rect c2 = o.c(this.f75179a.a());
            Rect c3 = o.c((TextView) this.f75179a.f75172a.getValue());
            if (c2.bottom > c3.bottom && this.f75179a.b().getAlpha() == 0.0f) {
                this.f75179a.b().animate().alpha(1.0f).setDuration(350).start();
            } else if (c2.bottom < c3.bottom && this.f75179a.b().getAlpha() == 1.0f) {
                this.f75179a.b().animate().alpha(0.0f).setDuration(350).start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.a
    public final void a(boolean z) {
        setUserVisibleHint(z);
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f75180a;

        static {
            Covode.recordClassIndex(46376);
        }

        l(h.f.a.a aVar) {
            this.f75180a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75180a.invoke();
        }
    }

    static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f75181a;

        static {
            Covode.recordClassIndex(46377);
        }

        m(h hVar) {
            this.f75181a = hVar;
        }

        static final class a extends h.f.b.m implements h.f.a.b<View, z> {
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(46378);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.h$m$a$a  reason: collision with other inner class name */
            static final class C1713a extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {

                /* renamed from: a  reason: collision with root package name */
                public static final C1713a f75182a = new C1713a();

                static {
                    Covode.recordClassIndex(46379);
                }

                C1713a() {
                    super(1);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                    com.bytedance.tux.dialog.b.b bVar2 = bVar;
                    h.f.b.l.d(bVar2, "");
                    bVar2.a(R.string.a7y, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
                    return z.f158842a;
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(View view) {
                AwemeRawAd awemeRawAd;
                h.f.b.l.d(view, "");
                Aweme aweme = this.this$0.f75181a.f75173b;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", awemeRawAd).b("refer", "hint").b();
                androidx.fragment.app.e activity = this.this$0.f75181a.getActivity();
                if (activity != null) {
                    h.f.b.l.b(activity, "");
                    com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(activity).a(R.string.op).b(R.string.oq), C1713a.f75182a).a().b().show();
                }
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<View, z> {
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(46380);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(View view) {
                Activity activity;
                h.f.b.l.d(view, "");
                Aweme aweme = this.this$0.f75181a.f75173b;
                if (!(aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null)) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(awemeRawAd, "");
                    if (awemeRawAd.isReportEnable()) {
                        IReportService a2 = com.ss.android.ugc.aweme.compliance.api.a.a();
                        Context context = this.this$0.f75181a.getContext();
                        if (context != null) {
                            activity = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
                        } else {
                            activity = null;
                        }
                        a2.b(activity, com.ss.android.ugc.aweme.report.b.a(aweme, "homepage_ad", "ad"));
                    }
                }
                return z.f158842a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$d[] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new a.b().a(new a.d().c(R.raw.icon_info_circle).a(R.string.op).a(new a(this)), new a.d().c(R.raw.icon_flag).a(R.string.fcr).a(new b(this))).b().show(this.f75181a.getFragmentManager(), "new_fake_author_more_sheet");
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<i, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(46366);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i iVar) {
            i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            iVar2.f75183a = this.this$0.f75173b;
            iVar2.f75184b = this.this$0;
            iVar2.f75185c = null;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.a
    public final void a(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        ((View) this.n.getValue()).setOnClickListener(new l(aVar));
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        AwemeRawAd awemeRawAd;
        super.setUserVisibleHint(z);
        o.a((Activity) getActivity());
        if (z) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null && Build.VERSION.SDK_INT >= 23) {
                Window window = activity.getWindow();
                h.f.b.l.b(window, "");
                View decorView = window.getDecorView();
                h.f.b.l.b(decorView, "");
                int systemUiVisibility = decorView.getSystemUiVisibility();
                Window window2 = activity.getWindow();
                h.f.b.l.b(window2, "");
                View decorView2 = window2.getDecorView();
                h.f.b.l.b(decorView2, "");
                decorView2.setSystemUiVisibility(systemUiVisibility | 8192);
            }
        } else {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null && Build.VERSION.SDK_INT >= 23) {
                Window window3 = activity2.getWindow();
                h.f.b.l.b(window3, "");
                View decorView3 = window3.getDecorView();
                h.f.b.l.b(decorView3, "");
                decorView3.setSystemUiVisibility(1024);
            }
        }
        DataCenter dataCenter = this.p;
        if (dataCenter != null) {
            dataCenter.a("AD_PROFILE_VISIBILITY_CHANGED", Boolean.valueOf(z));
        }
        if (!z) {
            Aweme aweme = this.f75173b;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "close", awemeRawAd).b();
            AwemeService.b().a(this.f75173b);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        User author;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("aweme_id");
        } else {
            str = null;
        }
        this.f75173b = com.ss.android.ugc.aweme.commercialize.e.a.b.d(str);
        DataCenter a2 = DataCenter.a(ae.a(this, (ad.b) null), this);
        this.p = a2;
        if (a2 != null) {
            a2.a("AD_PROFILE_PARAMS", (Object) new i.a().a(new b(this)).f75479a);
        }
        ViewGroup.LayoutParams layoutParams = a().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = com.ss.android.ugc.aweme.adaptation.c.d(getContext());
            a().setLayoutParams(marginLayoutParams);
        }
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aK(this.f75173b) && !com.ss.android.ugc.aweme.commercialize.e.a.b.aL(this.f75173b)) {
            ((ViewGroup) this.f75177l.getValue()).setVisibility(8);
        }
        TextView b2 = b();
        Aweme aweme = this.f75173b;
        if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
            str2 = author.getNickname();
        }
        b2.setText(str2);
        ((DampScrollableLayout) this.f75178m.getValue()).a(new c(this));
        ((View) this.o.getValue()).setOnClickListener(new m(this));
        com.ss.android.ugc.aweme.arch.widgets.base.e a3 = com.ss.android.ugc.aweme.arch.widgets.base.e.a(this, (View) this.f75174d.getValue());
        this.q = a3;
        if (a3 != null) {
            a3.a(this.p);
        }
        com.ss.android.ugc.aweme.arch.widgets.base.e eVar = this.q;
        if (eVar != null) {
            boolean z = false;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aK(this.f75173b)) {
                eVar.b(R.id.fi, new AdNewFakeBottomDescBarWidget(false));
            } else {
                Aweme aweme2 = this.f75173b;
                if (!(aweme2 == null || aweme2.getAwemeRawAd() == null)) {
                    AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.h(awemeRawAd) && !TextUtils.isEmpty(awemeRawAd.getWebUrl()) && ((!com.ss.android.ugc.aweme.commercialize.e.a.b.g(awemeRawAd) && !com.ss.android.ugc.aweme.commercialize.e.a.b.aN(aweme2) && com.ss.android.ugc.aweme.commercialize.e.a.b.i(awemeRawAd) && com.ss.android.ugc.aweme.commercialize.e.a.b.aQ(aweme2)) || ((!com.ss.android.ugc.aweme.commercialize.e.a.b.g(awemeRawAd) && !com.ss.android.ugc.aweme.commercialize.e.a.b.aN(aweme2) && !com.ss.android.ugc.aweme.commercialize.e.a.b.i(awemeRawAd) && com.ss.android.ugc.aweme.commercialize.e.a.b.aQ(aweme2)) || (com.ss.android.ugc.aweme.commercialize.e.a.b.g(awemeRawAd) && com.ss.android.ugc.aweme.commercialize.e.a.b.aQ(aweme2))))) {
                        z = true;
                    }
                }
                if (z) {
                    eVar.b(R.id.fn, new AdNewFakePopUpWebPageWidget());
                } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aL(this.f75173b)) {
                    eVar.b(R.id.fi, new AdNewFakeBottomDescBarWidget(true));
                    eVar.b(R.id.fn, new AdNewFakePopUpWebPageWidget());
                }
            }
            eVar.b(R.id.azd, new AdNewFakeUserProfileHeaderWidget());
            eVar.b(R.id.dti, new AdNewFakeUserProfileDetailFragmentWidget());
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ao6, viewGroup, false);
    }
}
