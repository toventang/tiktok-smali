package com.ss.android.ugc.aweme.commercialize.preview.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.e.a;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.preview.c.a;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.ss.android.ugc.aweme.commercialize.preview.ui.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@com.bytedance.ies.powerpage.a.a
public final class AdsPreviewFragment extends b implements com.ss.android.ugc.aweme.commercialize.preview.a.a {

    /* renamed from: a  reason: collision with root package name */
    public AdsPreviewStateManager f75047a;

    /* renamed from: b  reason: collision with root package name */
    public String f75048b;

    /* renamed from: c  reason: collision with root package name */
    public TuxDualBallView f75049c;

    /* renamed from: d  reason: collision with root package name */
    private TuxStatusView f75050d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f75051e;

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f75057a = new f();

        static {
            Covode.recordClassIndex(46277);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(46269);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.a.a
    public final void c() {
        TuxStatusView tuxStatusView = this.f75050d;
        if (tuxStatusView != null) {
            tuxStatusView.a();
        }
    }

    private static boolean g() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final AdsPreviewStateManager f() {
        AdsPreviewStateManager adsPreviewStateManager = this.f75047a;
        if (adsPreviewStateManager == null) {
            l.a("adsPreviewStateManager");
        }
        return adsPreviewStateManager;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f75051e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class a implements TuxStatusView.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdsPreviewFragment f75052a;

        static {
            Covode.recordClassIndex(46270);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.b
        public final void a() {
            TuxDualBallView tuxDualBallView = this.f75052a.f75049c;
            if (tuxDualBallView != null) {
                tuxDualBallView.b();
            }
            TuxDualBallView tuxDualBallView2 = this.f75052a.f75049c;
            if (tuxDualBallView2 != null) {
                tuxDualBallView2.setVisibility(0);
            }
        }

        @Override // com.bytedance.tux.status.TuxStatusView.b
        public final void b() {
            TuxDualBallView tuxDualBallView = this.f75052a.f75049c;
            if (tuxDualBallView != null) {
                tuxDualBallView.c();
            }
            TuxDualBallView tuxDualBallView2 = this.f75052a.f75049c;
            if (tuxDualBallView2 != null) {
                tuxDualBallView2.setVisibility(8);
            }
        }

        a(AdsPreviewFragment adsPreviewFragment) {
            this.f75052a = adsPreviewFragment;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.a.a
    public final void d() {
        f.a.b.b a2 = t.b((long) com.ss.android.ugc.aweme.commercialize.preview.experiment.a.a().getDelayTimeInMillisecond(), TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this), f.f75057a);
        l.b(a2, "");
        AdsPreviewStateManager adsPreviewStateManager = this.f75047a;
        if (adsPreviewStateManager == null) {
            l.a("adsPreviewStateManager");
        }
        f.a.j.a.a(a2, adsPreviewStateManager.f75035b);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.a.a
    public final void a() {
        Context context = getContext();
        TuxStatusView tuxStatusView = this.f75050d;
        if (context != null && tuxStatusView != null) {
            TuxStatusView.c cVar = new TuxStatusView.c();
            String string = context.getResources().getString(R.string.qc);
            l.b(string, "");
            cVar.a(string);
            String string2 = context.getResources().getString(R.string.qb);
            l.b(string2, "");
            cVar.a((CharSequence) string2);
            cVar.a(com.bytedance.tux.c.c.a(c.C1709c.INSTANCE));
            cVar.f45362j = new h(context, cVar, context, this);
            tuxStatusView.setStatus(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.a.a
    public final void b() {
        Context context = getContext();
        TuxStatusView tuxStatusView = this.f75050d;
        if (context != null && tuxStatusView != null) {
            TuxStatusView.c cVar = new TuxStatusView.c();
            String string = context.getResources().getString(R.string.q_);
            l.b(string, "");
            cVar.a(string);
            String string2 = context.getResources().getString(R.string.q9);
            l.b(string2, "");
            cVar.a((CharSequence) string2);
            cVar.a(com.bytedance.tux.c.c.a(c.b.INSTANCE));
            cVar.f45362j = new g(context, cVar, context, context, this);
            tuxStatusView.setStatus(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.a.a
    public final void e() {
        getContext();
        if (!j.f107226e || !j.b() || j.c()) {
            j.f107226e = g();
        }
        if (!j.f107226e) {
            Context context = getContext();
            TuxStatusView tuxStatusView = this.f75050d;
            if (context != null && tuxStatusView != null) {
                TuxStatusView.c cVar = new TuxStatusView.c();
                String string = context.getResources().getString(R.string.q6);
                l.b(string, "");
                cVar.a(string);
                String string2 = context.getResources().getString(R.string.q5);
                l.b(string2, "");
                cVar.a((CharSequence) string2);
                cVar.a(com.bytedance.tux.c.c.a(c.a.INSTANCE));
                cVar.f45362j = new c(context, cVar, context, this);
                tuxStatusView.setStatus(cVar);
                return;
            }
            return;
        }
        Context context2 = getContext();
        TuxStatusView tuxStatusView2 = this.f75050d;
        if (context2 != null && tuxStatusView2 != null) {
            TuxStatusView.c cVar2 = new TuxStatusView.c();
            String string3 = context2.getResources().getString(R.string.q_);
            l.b(string3, "");
            cVar2.a(string3);
            String string4 = context2.getResources().getString(R.string.q9);
            l.b(string4, "");
            cVar2.a((CharSequence) string4);
            cVar2.a(com.bytedance.tux.c.c.a(c.b.INSTANCE));
            cVar2.f45362j = new d(context2, cVar2, context2, context2, this);
            tuxStatusView2.setStatus(cVar2);
        }
    }

    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdsPreviewFragment f75053a;

        static {
            Covode.recordClassIndex(46271);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AdsPreviewFragment adsPreviewFragment) {
            this.f75053a = adsPreviewFragment;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            androidx.fragment.app.e activity = this.f75053a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final class c extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ TuxStatusView.c $this_apply$inlined;
        final /* synthetic */ Context $this_with;
        final /* synthetic */ AdsPreviewFragment this$0;

        static {
            Covode.recordClassIndex(46272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, TuxStatusView.c cVar, Context context2, AdsPreviewFragment adsPreviewFragment) {
            super(1);
            this.$this_with = context;
            this.$this_apply$inlined = cVar;
            this.$context$inlined = context2;
            this.this$0 = adsPreviewFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(TuxButton tuxButton) {
            invoke(tuxButton);
            return z.f158842a;
        }

        public final void invoke(TuxButton tuxButton) {
            l.d(tuxButton, "");
            tuxButton.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f75054a;

                static {
                    Covode.recordClassIndex(46273);
                }

                {
                    this.f75054a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f75054a.this$0.f().a();
                }
            });
            tuxButton.setText(this.$this_with.getResources().getString(R.string.q4));
            tuxButton.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise));
            tuxButton.setButtonSize(3);
            tuxButton.setButtonVariant(1);
        }
    }

    public static final class d extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ Context $context$inlined$1;
        final /* synthetic */ TuxStatusView.c $this_apply$inlined;
        final /* synthetic */ Context $this_with;
        final /* synthetic */ AdsPreviewFragment this$0;

        static {
            Covode.recordClassIndex(46274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Context context, TuxStatusView.c cVar, Context context2, Context context3, AdsPreviewFragment adsPreviewFragment) {
            super(1);
            this.$this_with = context;
            this.$this_apply$inlined = cVar;
            this.$context$inlined = context2;
            this.$context$inlined$1 = context3;
            this.this$0 = adsPreviewFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(TuxButton tuxButton) {
            invoke(tuxButton);
            return z.f158842a;
        }

        public final void invoke(TuxButton tuxButton) {
            l.d(tuxButton, "");
            tuxButton.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f75055a;

                static {
                    Covode.recordClassIndex(46275);
                }

                {
                    this.f75055a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    SmartRouter.buildRoute(this.f75055a.$context$inlined$1, "//aweme/scan").withParam("finishAfterScan", true).open();
                    androidx.fragment.app.e activity = this.f75055a.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
            tuxButton.setText(this.$this_with.getResources().getString(R.string.q8));
            tuxButton.setButtonSize(3);
            tuxButton.setButtonVariant(0);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdsPreviewFragment f75056a;

        static {
            Covode.recordClassIndex(46276);
        }

        e(AdsPreviewFragment adsPreviewFragment) {
            this.f75056a = adsPreviewFragment;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            AwemeService.b().a();
            SmartRouter.buildRoute(this.f75056a.getContext(), "//main").addFlags(268468224).open();
            androidx.fragment.app.e activity = this.f75056a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final class g extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ Context $context$inlined$1;
        final /* synthetic */ TuxStatusView.c $this_apply$inlined;
        final /* synthetic */ Context $this_with;
        final /* synthetic */ AdsPreviewFragment this$0;

        static {
            Covode.recordClassIndex(46278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(Context context, TuxStatusView.c cVar, Context context2, Context context3, AdsPreviewFragment adsPreviewFragment) {
            super(1);
            this.$this_with = context;
            this.$this_apply$inlined = cVar;
            this.$context$inlined = context2;
            this.$context$inlined$1 = context3;
            this.this$0 = adsPreviewFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(TuxButton tuxButton) {
            invoke(tuxButton);
            return z.f158842a;
        }

        public final void invoke(TuxButton tuxButton) {
            l.d(tuxButton, "");
            tuxButton.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f75058a;

                static {
                    Covode.recordClassIndex(46279);
                }

                {
                    this.f75058a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    SmartRouter.buildRoute(this.f75058a.$context$inlined$1, "//aweme/scan").withParam("finishAfterScan", true).open();
                    androidx.fragment.app.e activity = this.f75058a.this$0.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
            tuxButton.setText(this.$this_with.getResources().getString(R.string.q8));
            tuxButton.setButtonSize(3);
            tuxButton.setButtonVariant(0);
        }
    }

    public static final class h extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ Context $context$inlined;
        final /* synthetic */ TuxStatusView.c $this_apply$inlined;
        final /* synthetic */ Context $this_with;
        final /* synthetic */ AdsPreviewFragment this$0;

        static {
            Covode.recordClassIndex(46280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(Context context, TuxStatusView.c cVar, Context context2, AdsPreviewFragment adsPreviewFragment) {
            super(1);
            this.$this_with = context;
            this.$this_apply$inlined = cVar;
            this.$context$inlined = context2;
            this.this$0 = adsPreviewFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(TuxButton tuxButton) {
            invoke(tuxButton);
            return z.f158842a;
        }

        public final void invoke(TuxButton tuxButton) {
            l.d(tuxButton, "");
            tuxButton.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f75059a;

                static {
                    Covode.recordClassIndex(46281);
                }

                {
                    this.f75059a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f75059a.this$0.f().a();
                    r.onEventV3("ads_interface_preview_ad_click_ttuser");
                }
            });
            tuxButton.setText(this.$this_with.getResources().getString(R.string.qa));
            tuxButton.setButtonSize(3);
            tuxButton.setButtonVariant(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        androidx.fragment.app.e activity;
        Window window;
        View decorView;
        super.onCreate(bundle);
        i lifecycle = getLifecycle();
        AdsPreviewStateManager adsPreviewStateManager = this.f75047a;
        if (adsPreviewStateManager == null) {
            l.a("adsPreviewStateManager");
        }
        lifecycle.a(adsPreviewStateManager);
        AdsPreviewStateManager adsPreviewStateManager2 = this.f75047a;
        if (adsPreviewStateManager2 == null) {
            l.a("adsPreviewStateManager");
        }
        String str = this.f75048b;
        String str2 = "";
        l.d(this, str2);
        adsPreviewStateManager2.f75036c = this;
        f.a.b.b a2 = adsPreviewStateManager2.f75034a.c().a(f.a.e.b.a.f157188a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new AdsPreviewStateManager.b(adsPreviewStateManager2), AdsPreviewStateManager.c.f75041a);
        l.b(a2, str2);
        f.a.j.a.a(a2, adsPreviewStateManager2.f75035b);
        if (str != null) {
            Uri parse = Uri.parse(str);
            l.b(parse, str2);
            String path = parse.getPath();
            if (path == null) {
                path = str2;
            }
            adsPreviewStateManager2.f75037d = path;
            String queryParameter = parse.getQueryParameter("token");
            if (queryParameter != null) {
                str2 = queryParameter;
            }
            adsPreviewStateManager2.f75038e = str2;
            if (adsPreviewStateManager2.f75037d.length() == 0 || adsPreviewStateManager2.f75038e.length() == 0) {
                adsPreviewStateManager2.a(a.d.f75012a);
            } else {
                adsPreviewStateManager2.a(a.e.f75013a);
            }
        } else {
            adsPreviewStateManager2.a(a.d.f75012a);
        }
        a.C1099a.a(this).a(R.color.f159928l).f44923a.d();
        if (!(Build.VERSION.SDK_INT < 23 || (activity = getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.setSystemUiVisibility(8192);
        }
        r.onEventV3("ads_interface_qrcode_preview_scan");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((TextTitleBar) view.findViewById(R.id.elv)).setOnTitleBarClickListener(new b(this));
        this.f75049c = (TuxDualBallView) view.findViewById(R.id.chl);
        TuxStatusView tuxStatusView = (TuxStatusView) view.findViewById(R.id.e_c);
        tuxStatusView.a(new a(this));
        this.f75050d = tuxStatusView;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a0n, viewGroup, false);
    }
}
