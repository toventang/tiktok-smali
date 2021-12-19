package com.ss.android.ugc.aweme.feed.assem.digg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bb;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.w;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.f.b.z;
import h.z;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new y(a.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0)};
    public static final l w = new l((byte) 0);
    private final h.h A;
    private com.ss.android.ugc.aweme.cp.d B;
    private final m C;
    private SparseArray D;
    public Drawable v;
    private final h.h.d x;
    private final h.h y;
    private final h.h z;

    public static final class b extends h.f.b.m implements h.f.a.b<k, k> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58208);
        }

        public b() {
            super(1);
        }

        public final k invoke(k kVar) {
            h.f.b.l.c(kVar, "");
            return kVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58209);
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
            Covode.recordClassIndex(58212);
        }

        public f() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<bb, bb> {
        public static final i INSTANCE = new i();

        static {
            Covode.recordClassIndex(58215);
        }

        public i() {
            super(1);
        }

        public final bb invoke(bb bbVar) {
            h.f.b.l.c(bbVar, "");
            return bbVar;
        }
    }

    static {
        Covode.recordClassIndex(58206);
    }

    private final VideoViewModel H() {
        return (VideoViewModel) this.y.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.t2;
    }

    public final VideoDiggVM F() {
        return (VideoDiggVM) this.x.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.D == null) {
            this.D = new SparseArray();
        }
        View view = (View) this.D.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.D.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class l {
        static {
            Covode.recordClassIndex(58218);
        }

        private l() {
        }

        public /* synthetic */ l(byte b2) {
            this();
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58210);
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
            Covode.recordClassIndex(58211);
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
            Covode.recordClassIndex(58213);
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
            Covode.recordClassIndex(58214);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
        public static final j INSTANCE = new j();

        static {
            Covode.recordClassIndex(58216);
        }

        public j() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(58217);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92222a;

        static {
            Covode.recordClassIndex(58219);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$m$a  reason: collision with other inner class name */
        static final class C2236a extends h.f.b.m implements h.f.a.m<Boolean, Aweme, z> {
            final /* synthetic */ View $v;
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(58220);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2236a(m mVar, View view) {
                super(2);
                this.this$0 = mVar;
                this.$v = view;
            }

            private static boolean a() {
                try {
                    return f.a.f68431a.c();
                } catch (Exception unused) {
                    return false;
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Boolean bool, Aweme aweme) {
                String str;
                String str2;
                String str3;
                String str4;
                Aweme aweme2;
                Aweme aweme3 = aweme;
                if (bool.booleanValue()) {
                    ((DiggAnimationView) this.this$0.f92222a.B().findViewById(R.id.am1)).a(this.$v);
                    this.this$0.f92222a.ar_();
                    if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                        com.ss.android.ugc.aweme.lancet.j.f107229h = a();
                    }
                    if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f92222a.ar_()).a(R.string.de8).a();
                    } else if (aweme3 == null) {
                        com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDiggAssem", "handleDiggClick:" + String.valueOf(this.this$0.f92222a.ar_()) + ",aweme: null");
                    } else {
                        com.ss.android.ugc.aweme.feed.helper.l.a();
                        ImageView imageView = (ImageView) this.this$0.f92222a.B().findViewById(R.id.am1);
                        VideoItemParams videoItemParams = (VideoItemParams) this.this$0.f92222a.F().g();
                        String str5 = null;
                        if (videoItemParams != null) {
                            str = videoItemParams.mEventType;
                        } else {
                            str = null;
                        }
                        com.ss.android.ugc.aweme.feed.helper.l.b(imageView, str, ac.e(aweme3), ac.a(aweme3));
                        VideoDiggVM F = this.this$0.f92222a.F();
                        DataCenter j2 = F.j();
                        if (j2 != null) {
                            j2.a("handle_digg_click", aweme3);
                        }
                        z.d dVar = new z.d();
                        z.a aVar = new z.a();
                        boolean z = true;
                        if (!F.f92217m && aweme3.getUserDigg() == 0) {
                            DataCenter j3 = F.j();
                            if (j3 != null) {
                                j3.a("video_digg", (Object) 5);
                            }
                            F.f92216l++;
                            dVar.element = F.a(true, aweme3);
                            F.a("click_like");
                            aVar.element = true;
                        } else if (!F.f92217m || aweme3.getUserDigg() == 0) {
                            if (aweme3.getUserDigg() != 1) {
                                z = false;
                            }
                            F.f92217m = z;
                            dVar.element = F.a(F.f92217m, aweme3);
                            if (F.f92217m) {
                                F.f92216l++;
                            } else {
                                F.f92216l--;
                            }
                            aVar.element = F.f92217m;
                        } else {
                            DataCenter j4 = F.j();
                            if (j4 != null) {
                                j4.a("video_digg", (Object) 6);
                            }
                            F.f92216l--;
                            dVar.element = F.a(false, aweme3);
                            com.ss.android.ugc.aweme.base.utils.f fVar = f.a.f68431a;
                            h.f.b.l.b(fVar, "");
                            if (!fVar.c()) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(F.i()).a(R.string.de8).a();
                            } else {
                                Context i2 = F.i();
                                if (i2 == null || (str2 = FeedParamProvider.a.a(i2).getSearchResultId()) == null) {
                                    str2 = "";
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = ac.e(aweme3);
                                    h.f.b.l.b(str2, "");
                                }
                                if (aweme3.playlist_info != null) {
                                    str3 = aweme3.playlist_info.getMixId();
                                } else {
                                    str3 = "";
                                }
                                com.ss.android.ugc.aweme.metrics.y yVar = new com.ss.android.ugc.aweme.metrics.y("like_cancel");
                                String str6 = F.p;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                com.ss.android.ugc.aweme.metrics.y a2 = yVar.a(str6);
                                Context i3 = F.i();
                                if (i3 == null || (str4 = FeedParamProvider.a.a(i3).getSearchId()) == null) {
                                    str4 = "";
                                }
                                com.ss.android.ugc.aweme.metrics.y yVar2 = (com.ss.android.ugc.aweme.metrics.y) a2.l(str4).f(str2);
                                yVar2.f109623e = F.k().f92239a;
                                yVar2.f109619a = ((FeedBaseViewModel) F).o;
                                com.ss.android.ugc.aweme.metrics.y o = yVar2.g(aweme3).o(F.k().f92242d);
                                o.r = F.k().f92243e;
                                o.s = F.k().f92244f;
                                o.X = str3;
                                VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                                if (videoItemParams2 != null) {
                                    aweme2 = videoItemParams2.mAweme;
                                } else {
                                    aweme2 = null;
                                }
                                o.a(w.a(aweme2, "like_cancel", F.p)).f();
                                if (!TextUtils.equals("opus", F.p)) {
                                    F.i();
                                    com.ss.android.ugc.aweme.common.r.a("like_cancel", F.p, aweme3.getAid(), 0, F.h());
                                } else if (F.r) {
                                    F.i();
                                    com.ss.android.ugc.aweme.common.r.a("like_cancel", "personal_homepage", aweme3.getAid(), 0, F.h());
                                } else {
                                    F.i();
                                    com.ss.android.ugc.aweme.common.r.a("like_cancel", "others_homepage", aweme3.getAid(), 0, F.h());
                                }
                                if (aweme3.getAwemeType() != 34) {
                                    String aid = aweme3.getAid();
                                    h.f.b.l.b(aid, "");
                                    F.a(aid, 0, aweme3);
                                } else {
                                    com.ss.android.ugc.aweme.commercialize.g.a().g(F.i(), aweme3);
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "like_cancel", aweme3.getAwemeRawAd()).c();
                                }
                            }
                            aVar.element = false;
                        }
                        F.a(new VideoDiggVM.d(F, dVar, aweme3, aVar));
                        Context i4 = F.i();
                        if (i4 != null) {
                            str5 = i4.getString(R.string.kx);
                        }
                        Context i5 = F.i();
                        if (i5 != null) {
                            com.ss.android.ugc.aweme.feed.x.a.a(i5, str5, false, 0);
                        }
                    }
                } else {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f92222a.ar_()).a(R.string.hfj).a();
                }
                return h.z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(a aVar) {
            this.f92222a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92222a.F().a(new C2236a(this, view));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final void a() {
        super.a();
        F().a((Context) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.a$a  reason: collision with other inner class name */
    public static final class C2235a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2235a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    private final com.ss.android.ugc.aweme.cp.d I() {
        if (this.B == null) {
            this.B = new com.ss.android.ugc.aweme.cp.d();
        }
        com.ss.android.ugc.aweme.cp.d dVar = this.B;
        if (dVar == null) {
            h.f.b.l.b();
        }
        return dVar;
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.core.a
    public final void f() {
        super.f();
        com.ss.android.ugc.aweme.framework.a.a.b("VideoDiggAssem", "onCreate: ".concat(String.valueOf(this)));
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, F(), b.f92231a, com.bytedance.assem.arch.viewModel.l.a(), n.f92223a, 4);
        f.a.a(this, F(), c.f92232a, (com.bytedance.assem.arch.viewModel.k) null, o.f92224a, 6);
        f.a.a(this, F(), d.f92233a, com.bytedance.assem.arch.viewModel.l.a(), p.f92225a, 4);
    }

    public a() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoDiggVM.class);
        this.x = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new C2235a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.y = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
        this.z = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
        this.A = new com.bytedance.ext_power_list.g(ab.a(VideoEventDispatchViewModel.class), this, j.INSTANCE, k.INSTANCE, i.INSTANCE);
        this.C = new m(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(VideoItemParams videoItemParams) {
        b(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        super.b(videoItemParams);
        F().a(ar_());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        h.f.b.l.d(videoItemParams2, "");
        com.ss.android.ugc.aweme.framework.a.a.b("VideoDiggAssem", "onBind: " + this + ", item: " + videoItemParams2);
        ((DiggAnimationView) B().findViewById(R.id.am1)).setImageDrawable(this.v);
        com.ss.android.ugc.aweme.cp.d I = I();
        if (I != null) {
            I.c();
        }
        h.f.b.l.d("VideoDiggAssem OnBind", "");
        com.ss.android.ugc.aweme.launcher.service.mob.a aVar = com.ss.android.ugc.aweme.launcher.service.mob.a.f107296a;
        Aweme aweme = videoItemParams2.mAweme;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        aVar.a(str);
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        Drawable drawable;
        Resources resources;
        h.f.b.l.d(view, "");
        com.ss.android.ugc.aweme.framework.a.a.b("VideoDiggAssem", "onViewCreated: ".concat(String.valueOf(this)));
        Context ar_ = ar_();
        if (ar_ == null || (resources = ar_.getResources()) == null) {
            drawable = null;
        } else {
            drawable = resources.getDrawable(R.drawable.azy);
        }
        this.v = drawable;
        if (com.ss.android.ugc.aweme.im.service.c.k.a()) {
            TuxTextView tuxTextView = (TuxTextView) B().findViewById(R.id.am4);
            h.f.b.l.b(tuxTextView, "");
            com.bytedance.tux.h.i.a((View) tuxTextView, (Integer) null, (Integer) null, (Integer) null, (Integer) 12, false, 23);
        }
        com.ss.android.ugc.aweme.cp.d I = I();
        I.f78255a = s();
        I.f78256b = (FrameLayout) B().findViewById(R.id.am3);
        I.f78257c = (DiggAnimationView) B().findViewById(R.id.am1);
        I.f78258d = (TuxTextView) B().findViewById(R.id.am4);
        Drawable d2 = com.ss.android.ugc.aweme.cp.d.d();
        if (d2 != null) {
            this.v = d2;
        }
        ((FrameLayout) B().findViewById(R.id.am3)).setOnClickListener(this.C);
        ((TuxTextView) B().findViewById(R.id.am4)).setOnClickListener(this.C);
        ((LinearLayout) B().findViewById(R.id.am7)).setOnClickListener(this.C);
        f.a.b(this, H(), e.f92234a, com.bytedance.assem.arch.viewModel.l.a(), r.f92227a, 4);
        f.a.b(this, (VideoPlayViewModel) this.z.getValue(), f.f92235a, com.bytedance.assem.arch.viewModel.l.a(), s.f92228a, 4);
        f.a.b(this, H(), g.f92236a, com.bytedance.assem.arch.viewModel.l.a(), t.f92229a, 4);
        f.a.b(this, H(), h.f92237a, com.bytedance.assem.arch.viewModel.l.a(), u.f92230a, 4);
        f.a.b(this, (VideoEventDispatchViewModel) this.A.getValue(), i.f92238a, com.bytedance.assem.arch.viewModel.l.a(), q.f92226a, 4);
    }

    static final class t extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends VideoItemParams>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f92229a = new t();

        static {
            Covode.recordClassIndex(58227);
        }

        t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends VideoItemParams> aVar2) {
            Aweme aweme;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends VideoItemParams> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (aVar4 != null) {
                VideoDiggVM F = aVar3.F();
                T t = aVar4.f25631b;
                if (t != null) {
                    aweme = t.mAweme;
                } else {
                    aweme = null;
                }
                F.b(aweme);
            }
            return h.z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends VideoItemParams>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f92230a = new u();

        static {
            Covode.recordClassIndex(58228);
        }

        u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends VideoItemParams> aVar2) {
            Aweme aweme;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends VideoItemParams> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (aVar4 != null) {
                VideoDiggVM F = aVar3.F();
                T t = aVar4.f25631b;
                if (t != null) {
                    aweme = t.mAweme;
                } else {
                    aweme = null;
                }
                F.b(aweme);
            }
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f92225a = new p();

        static {
            Covode.recordClassIndex(58223);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (aVar4 != null) {
                if (aVar4.f25631b.booleanValue()) {
                    com.ss.android.ugc.aweme.feed.x.s.a(aVar3.B().findViewById(R.id.am1));
                } else {
                    ((DiggAnimationView) aVar3.B().findViewById(R.id.am1)).g();
                }
                aVar3.F().a(VideoDiggVM.i.f92219a);
            }
            return h.z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<a, com.ss.android.ugc.aweme.feed.i.r, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92226a = new q();

        static {
            Covode.recordClassIndex(58224);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.ss.android.ugc.aweme.feed.i.r rVar) {
            Aweme aweme;
            a aVar2 = aVar;
            com.ss.android.ugc.aweme.feed.i.r rVar2 = rVar;
            h.f.b.l.d(aVar2, "");
            VideoDiggVM F = aVar2.F();
            if (rVar2 != null) {
                String str = rVar2.f93490a;
                VideoItemParams videoItemParams = (VideoItemParams) F.g();
                if (videoItemParams != null) {
                    aweme = videoItemParams.mAweme;
                } else {
                    aweme = null;
                }
                if (TextUtils.equals(str, ac.e(aweme))) {
                    F.a(new VideoDiggVM.f(F, F.f92216l));
                }
            }
            return h.z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<a, Boolean, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f92223a = new n();

        static {
            Covode.recordClassIndex(58221);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, Boolean bool) {
            a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(aVar2, "");
            if (booleanValue) {
                ((DiggAnimationView) aVar2.B().findViewById(R.id.am1)).setTag(com.ss.android.ugc.aweme.aq.a.a.f66964a, false);
                ((DiggAnimationView) aVar2.B().findViewById(R.id.am1)).setImageDrawable(aVar2.v);
            } else {
                ((DiggAnimationView) aVar2.B().findViewById(R.id.am1)).setImageDrawable(aVar2.v);
            }
            return h.z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Aweme>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f92227a = new r();

        static {
            Covode.recordClassIndex(58225);
        }

        r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Aweme> aVar2) {
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends Aweme> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (aVar4 != null) {
                VideoDiggVM F = aVar3.F();
                T t = aVar4.f25631b;
                if (!(F.i() == null || t == null)) {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.ax(t)) {
                        F.d(new VideoDiggVM.g(F));
                    } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aX(t)) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(F.i()).a(R.string.cw6).a();
                    } else if (!F.f92217m && t.getUserDigg() == 0) {
                        F.f92216l++;
                        F.b(new VideoDiggVM.h(F, F.a(true, (Aweme) t), t));
                        F.a("click_double_like");
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Aweme>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f92228a = new s();

        static {
            Covode.recordClassIndex(58226);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Aweme> aVar2) {
            long diggCount;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends Aweme> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (aVar4 != null) {
                VideoDiggVM F = aVar3.F();
                T t = aVar4.f25631b;
                if (t != null && t.isAd()) {
                    boolean z = true;
                    if (t.getUserDigg() != 1) {
                        z = false;
                    }
                    F.f92217m = z;
                    if (t.getStatistics() == null) {
                        diggCount = 0;
                    } else {
                        AwemeStatistics statistics = t.getStatistics();
                        h.f.b.l.b(statistics, "");
                        diggCount = statistics.getDiggCount();
                    }
                    F.f92216l = diggCount;
                    if (F.f92216l < 0) {
                        F.f92216l = 0;
                    }
                    F.a(new VideoDiggVM.k(F, F.f92216l, t));
                }
            }
            return h.z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<a, l, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92224a = new o();

        static {
            Covode.recordClassIndex(58222);
        }

        o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(a aVar, l lVar) {
            Aweme aweme;
            a aVar2 = aVar;
            l lVar2 = lVar;
            h.f.b.l.d(aVar2, "");
            Thread currentThread = Thread.currentThread();
            h.f.b.l.b(currentThread, "");
            currentThread.getName();
            if (lVar2 != null) {
                if (!lVar2.f92251c) {
                    TuxTextView tuxTextView = (TuxTextView) aVar2.B().findViewById(R.id.am4);
                    h.f.b.l.b(tuxTextView, "");
                    tuxTextView.setVisibility(4);
                } else {
                    try {
                        TuxTextView tuxTextView2 = (TuxTextView) aVar2.B().findViewById(R.id.am4);
                        h.f.b.l.b(tuxTextView2, "");
                        tuxTextView2.setVisibility(0);
                        TuxTextView tuxTextView3 = (TuxTextView) aVar2.B().findViewById(R.id.am4);
                        h.f.b.l.b(tuxTextView3, "");
                        tuxTextView3.setText(lVar2.f92249a);
                    } catch (NullPointerException e2) {
                        TuxTextView tuxTextView4 = (TuxTextView) aVar2.B().findViewById(R.id.am4);
                        h.f.b.l.b(tuxTextView4, "");
                        VideoItemParams videoItemParams = (VideoItemParams) aVar2.F().g();
                        if (videoItemParams != null) {
                            aweme = videoItemParams.mAweme;
                        } else {
                            aweme = null;
                        }
                        tuxTextView4.setText(VideoDiggVM.a(0, aweme));
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                        e2.printStackTrace();
                    }
                }
                DiggAnimationView diggAnimationView = (DiggAnimationView) aVar2.B().findViewById(R.id.am1);
                h.f.b.l.b(diggAnimationView, "");
                diggAnimationView.setSelected(lVar2.f92250b);
            }
            return h.z.f158842a;
        }
    }
}
