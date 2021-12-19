package com.ss.android.ugc.aweme.mix.createmix;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.List;

public final class g extends com.ss.android.ugc.aweme.base.f.a implements com.bytedance.assem.arch.viewModel.h {

    /* renamed from: c  reason: collision with root package name */
    public static final c f109850c = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public DmtStatusView f109851a;

    /* renamed from: b  reason: collision with root package name */
    public TuxButton f109852b;

    /* renamed from: d  reason: collision with root package name */
    private NormalTitleBar f109853d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f109854e;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f109855j;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.createmix.viewmodel.a, com.ss.android.ugc.aweme.mix.createmix.viewmodel.a> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(70359);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.mix.createmix.viewmodel.a invoke(com.ss.android.ugc.aweme.mix.createmix.viewmodel.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70357);
    }

    public final MixCreateViewModel a() {
        return (MixCreateViewModel) this.f109854e.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public static final class c {
        static {
            Covode.recordClassIndex(70360);
        }

        private c() {
        }

        public static g a() {
            Bundle bundle = new Bundle();
            g gVar = new g();
            gVar.setArguments(bundle);
            return gVar;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$g  reason: collision with other inner class name */
    static final class C2814g extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2814g f109856a = new C2814g();

        static {
            Covode.recordClassIndex(70364);
        }

        C2814g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f109857a = new j();

        static {
            Covode.recordClassIndex(70367);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final androidx.lifecycle.m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final com.bytedance.tiktok.proxy.d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<com.bytedance.tiktok.proxy.d> getActualReceiverHolder() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f109855j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(70358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public g() {
        h.k.c a2 = ab.a(MixCreateViewModel.class);
        this.f109854e = new com.bytedance.assem.arch.viewModel.b(a2, new a(a2), u.j.f25671a, u.a((androidx.lifecycle.m) this, true), u.a((ag) this, true), u.c.f25670a, b.INSTANCE);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public static final class k implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f109858a;

        static {
            Covode.recordClassIndex(70368);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            h.f.b.l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(g gVar) {
            this.f109858a = gVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            androidx.fragment.app.i supportFragmentManager;
            h.f.b.l.d(view, "");
            androidx.fragment.app.e activity = this.f109858a.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.c();
            }
        }
    }

    public static final /* synthetic */ TuxButton a(g gVar) {
        TuxButton tuxButton = gVar.f109852b;
        if (tuxButton == null) {
            h.f.b.l.a("mBottomView");
        }
        return tuxButton;
    }

    static final class l extends h.f.b.m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            h.f.b.l.d(assembler2, "");
            assembler2.b(this.this$0, AnonymousClass1.f109859a);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.api.response.b, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.mix.api.response.b bVar) {
            com.ss.android.ugc.aweme.mix.api.response.b bVar2 = bVar;
            if (bVar2 == null || bVar2.status_code != 0) {
                if (this.this$0.getActivity() != null) {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.g21).b();
                }
            } else if (com.ss.android.ugc.aweme.mix.c.b.a() == 0) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.mix.b.e());
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70363);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            String message = th2.getMessage();
            if ((message == null || !message.equals("dark_post_failed")) && this.this$0.getActivity() != null) {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.g21).b();
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70366);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            if (this.this$0.getActivity() != null) {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.g21).b();
            }
            return z.f158842a;
        }
    }

    static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f109860a;

        static {
            Covode.recordClassIndex(70372);
        }

        n(g gVar) {
            this.f109860a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (com.ss.android.ugc.aweme.mix.c.b.a() != 1 || !this.f109860a.a().h()) {
                this.f109860a.a().i();
            } else {
                this.f109860a.a().a(com.ss.android.ugc.aweme.mix.createmix.viewmodel.b.CREATE_NAME);
            }
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.mix.api.response.b, z> {
        final /* synthetic */ String $secUid;
        final /* synthetic */ String $uid;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar, String str, String str2) {
            super(1);
            this.this$0 = gVar;
            this.$uid = str;
            this.$secUid = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 8
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.mix.api.response.b r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.mix.api.response.b r10 = (com.ss.android.ugc.aweme.mix.api.response.b) r10
                if (r10 == 0) goto L_0x004a
                int r0 = r10.status_code
                if (r0 != 0) goto L_0x004a
                com.bytedance.tux.g.b r1 = new com.bytedance.tux.g.b
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.this$0
                r1.<init>(r0)
                com.bytedance.tux.g.b r1 = r1.a()
                r0 = 2131830580(0x7f112734, float:1.9294161E38)
                com.bytedance.tux.g.b r0 = r1.e(r0)
                r0.b()
                com.ss.android.ugc.aweme.mix.services.IMixFeedService r1 = com.ss.android.ugc.aweme.mix.services.MixFeedService.k()
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.this$0
                androidx.fragment.app.e r2 = r0.getActivity()
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.this$0
                com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel r0 = r0.a()
                java.lang.String r5 = r0.f109869j
                java.lang.String r6 = r9.$uid
                java.lang.String r7 = r9.$secUid
                java.lang.String r3 = ""
                java.lang.String r4 = "from_profile_mix_list"
                java.lang.String r8 = ""
                com.ss.android.ugc.aweme.mix.services.IMixFeedService.a.a(r1, r2, r3, r4, r5, r6, r7, r8)
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.this$0
                androidx.fragment.app.e r0 = r0.getActivity()
                if (r0 == 0) goto L_0x0047
                r0.finish()
            L_0x0047:
                h.z r0 = h.z.f158842a
                return r0
            L_0x004a:
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.this$0
                androidx.fragment.app.e r0 = r0.getActivity()
                if (r0 == 0) goto L_0x0047
                com.bytedance.tux.g.b r1 = new com.bytedance.tux.g.b
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.this$0
                r1.<init>(r0)
                r0 = 2131829904(0x7f112490, float:1.929279E38)
                com.bytedance.tux.g.b r0 = r1.e(r0)
                r0.b()
                goto L_0x0047
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.createmix.g.h.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, List<? extends Aweme>, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            h.f.b.l.d(dVar, "");
            if (list2 == null || list2.size() != 0) {
                DmtStatusView dmtStatusView = this.this$0.f109851a;
                if (dmtStatusView == null) {
                    h.f.b.l.a("mStatusView");
                }
                dmtStatusView.a(true);
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.tiktok.proxy.d, Boolean, z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(70361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.tiktok.proxy.d dVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(dVar, "");
            CharSequence charSequence = null;
            if (!booleanValue) {
                TuxButton a2 = g.a(this.this$0);
                Context context = this.this$0.getContext();
                if (context != null) {
                    charSequence = context.getText(R.string.bba);
                }
                a2.setText(charSequence);
            } else if (com.ss.android.ugc.aweme.mix.c.b.a() == 1 || com.ss.android.ugc.aweme.mix.c.b.a() == 2) {
                TuxButton a3 = g.a(this.this$0);
                Context context2 = this.this$0.getContext();
                if (context2 != null) {
                    charSequence = context2.getText(R.string.dgt);
                }
                a3.setText(charSequence);
            } else {
                TuxButton a4 = g.a(this.this$0);
                Context context3 = this.this$0.getContext();
                if (context3 != null) {
                    charSequence = context3.getText(R.string.awh);
                }
                a4.setText(charSequence);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.cn5);
        h.f.b.l.b(findViewById, "");
        NormalTitleBar normalTitleBar = (NormalTitleBar) findViewById;
        this.f109853d = normalTitleBar;
        if (normalTitleBar == null) {
            h.f.b.l.a("mTitleBar");
        }
        normalTitleBar.setOnTitleBarClickListener(new k(this));
        com.bytedance.assem.arch.extensions.d.a(this, new l(this));
        View findViewById2 = view.findViewById(R.id.e_o);
        h.f.b.l.b(findViewById2, "");
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById2;
        this.f109851a = dmtStatusView;
        if (dmtStatusView == null) {
            h.f.b.l.a("mStatusView");
        }
        dmtStatusView.setBuilder(DmtStatusView.a.a(getContext()).a().a(new d.a(getContext()).a(2131233268).b(R.string.bnl).c(R.string.bnm).f33648a));
        DmtStatusView dmtStatusView2 = this.f109851a;
        if (dmtStatusView2 == null) {
            h.f.b.l.a("mStatusView");
        }
        dmtStatusView2.g();
        f.a.a(this, a(), k.f109864a, (com.bytedance.assem.arch.viewModel.k) null, new m(this), 6);
        View findViewById3 = view.findViewById(R.id.cmu);
        h.f.b.l.b(findViewById3, "");
        TuxButton tuxButton = (TuxButton) findViewById3;
        this.f109852b = tuxButton;
        if (tuxButton == null) {
            h.f.b.l.a("mBottomView");
        }
        tuxButton.setOnClickListener(new n(this));
        com.ss.android.ugc.aweme.account.b.a();
        IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
        h.f.b.l.b(e2, "");
        String curUserId = e2.getCurUserId();
        com.ss.android.ugc.aweme.account.b.a();
        IAccountUserService e3 = com.ss.android.ugc.aweme.account.b.f62864a.e();
        h.f.b.l.b(e3, "");
        String curSecUserId = e3.getCurSecUserId();
        AssemViewModel.a(a(), h.f109861a, null, new f(this), C2814g.f109856a, new e(this), 2);
        AssemViewModel.a(a(), i.f109862a, null, new i(this), j.f109857a, new h(this, curUserId, curSecUserId), 2);
        f.a.a(this, a(), j.f109863a, (com.bytedance.assem.arch.viewModel.k) null, new d(this), 6);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a17, viewGroup, false);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super com.bytedance.tiktok.proxy.d, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super com.bytedance.tiktok.proxy.d, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        h.a.a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
