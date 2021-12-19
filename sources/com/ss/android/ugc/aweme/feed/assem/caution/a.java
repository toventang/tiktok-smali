package com.ss.android.ugc.aweme.feed.assem.caution;

import android.text.SpannableString;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM;
import com.ss.android.ugc.aweme.feed.experiment.z;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new y(a.class, "topCautionVM", "getTopCautionVM()Lcom/ss/android/ugc/aweme/feed/assem/caution/VideoTopCautionVM;", 0)};
    public static final i v = new i((byte) 0);
    private final h.h.d w;
    private final h.h x = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
    private final h.h y = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
    private SparseArray z;

    public static final class b extends h.f.b.m implements h.f.a.b<g, g> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58052);
        }

        public b() {
            super(1);
        }

        public final g invoke(g gVar) {
            h.f.b.l.c(gVar, "");
            return gVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58053);
        }

        public c() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58056);
        }

        public f() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    static {
        Covode.recordClassIndex(58050);
    }

    private final VideoViewModel H() {
        return (VideoViewModel) this.x.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.to;
    }

    public final VideoTopCautionVM F() {
        return (VideoTopCautionVM) this.w.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.z == null) {
            this.z = new SparseArray();
        }
        View view = (View) this.z.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.z.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class i {
        static {
            Covode.recordClassIndex(58059);
        }

        private i() {
        }

        public /* synthetic */ i(byte b2) {
            this();
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58054);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58055);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58057);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58058);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.b.x
    public final void z() {
        super.z();
        com.ss.android.ugc.aweme.framework.a.a.a(2, "VideoTopCautionAssem", "onInActive");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$a  reason: collision with other inner class name */
    public static final class C2231a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2231a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, F(), b.f92086a, (com.bytedance.assem.arch.viewModel.k) null, j.f92080a, 6);
        f.a.a(this, F(), c.f92087a, (com.bytedance.assem.arch.viewModel.k) null, k.f92081a, 6);
    }

    public a() {
        h.k.c a2 = ab.a(VideoTopCautionVM.class);
        this.w = com.bytedance.ext_power_list.k.a(this, a2, i.c.f25720a, new C2231a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final /* synthetic */ boolean c(VideoItemParams videoItemParams) {
        return c(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final boolean b(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        if (z.f93100a) {
            return com.ss.android.ugc.aweme.feed.x.g.b(videoItemParams.mAweme);
        }
        return true;
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92082a;

        static {
            Covode.recordClassIndex(58062);
        }

        l(a aVar) {
            this.f92082a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            ClickAgent.onClick(view);
            VideoTopCautionVM F = this.f92082a.F();
            F.a(VideoTopCautionVM.a.f92078a);
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            String str = null;
            if (videoItemParams != null && videoItemParams.mAweme != null) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                    str = aweme.getAid();
                }
                r.a("tns_banner_dismiss_ktf", dVar.a("object_id", str).f66730a);
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        ViewGroup.LayoutParams layoutParams = B().getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin - com.ss.android.ugc.aweme.base.utils.i.b(), layoutParams2.rightMargin, layoutParams2.bottomMargin);
        }
        TuxIconView tuxIconView = (TuxIconView) B().findViewById(R.id.a2x);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new l(this));
        }
        B().setVisibility(8);
        f.a.a(this, H(), d.f92088a, (com.bytedance.assem.arch.viewModel.k) null, m.f92083a, 6);
        f.a.a(this, H(), e.f92089a, (com.bytedance.assem.arch.viewModel.k) null, n.f92084a, 6);
        f.a.a(this, (VideoPlayViewModel) this.y.getValue(), f.f92090a, (com.bytedance.assem.arch.viewModel.k) null, o.f92085a, 6);
    }

    static final class j extends h.f.b.m implements h.f.a.m<a, Boolean, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f92080a = new j();

        static {
            Covode.recordClassIndex(58060);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, Boolean bool) {
            int i2;
            a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(aVar2, "");
            View B = aVar2.B();
            if (booleanValue) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            B.setVisibility(i2);
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<a, SpannableString, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f92081a = new k();

        static {
            Covode.recordClassIndex(58061);
        }

        k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, SpannableString spannableString) {
            a aVar2 = aVar;
            SpannableString spannableString2 = spannableString;
            h.f.b.l.d(aVar2, "");
            TuxTextView tuxTextView = (TuxTextView) aVar2.B().findViewById(R.id.a2y);
            if (tuxTextView != null) {
                tuxTextView.setText(spannableString2);
            }
            return h.z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92083a = new m();

        static {
            Covode.recordClassIndex(58063);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            aVar3.F().a(VideoTopCautionVM.b.f92079a);
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f92084a = new n();

        static {
            Covode.recordClassIndex(58064);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            Aweme aweme;
            com.ss.android.ugc.aweme.shortvideo.i uploadMiscInfoStruct;
            KtfInfo ktfInfo;
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            VideoTopCautionVM F = aVar3.F();
            F.f92077k = true;
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) == null || (ktfInfo = uploadMiscInfoStruct.ktfInfo) == null)) {
                h.f.b.l.b(ktfInfo, "");
                ktfInfo.resetState();
            }
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Float>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92085a = new o();

        static {
            Covode.recordClassIndex(58065);
        }

        o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Float> aVar2) {
            T t;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends Float> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            VideoTopCautionVM F = aVar3.F();
            Aweme aweme = null;
            if (aVar4 != null) {
                t = aVar4.f25631b;
            } else {
                t = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            }
            if (com.ss.android.ugc.aweme.feed.x.g.b(aweme) && t != null && t.floatValue() > 2.0f && F.f92077k) {
                F.f92077k = false;
                F.b(new VideoTopCautionVM.c(F));
            }
            return h.z.f158842a;
        }
    }
}
