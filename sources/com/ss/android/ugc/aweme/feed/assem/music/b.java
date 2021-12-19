package com.ss.android.ugc.aweme.feed.assem.music;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.gg;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.feed.assem.base.a<b> {
    static final /* synthetic */ h.k.i[] u = {new y(b.class, "musicCoverVM", "getMusicCoverVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicCoverVM;", 0), new y(b.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0)};
    public ValueAnimator A;
    public long B;
    public final double C;
    public final double D;
    public final int E;
    private final h.h.d F;
    private final h.h.d G;
    private final h.h H;
    private final h.h I;
    private final float J;
    private SparseArray K;
    public SmartCircleImageView v;
    public SmartCircleImageView w;
    public PeriscopeLayout x;
    public FrameLayout y;
    public com.ss.android.ugc.aweme.cp.e z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$b  reason: collision with other inner class name */
    public static final class C2240b extends h.f.b.m implements h.f.a.b<m, m> {
        public static final C2240b INSTANCE = new C2240b();

        static {
            Covode.recordClassIndex(58316);
        }

        public C2240b() {
            super(1);
        }

        public final m invoke(m mVar) {
            h.f.b.l.c(mVar, "");
            return mVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<a, a> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58318);
        }

        public d() {
            super(1);
        }

        public final a invoke(a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58319);
        }

        public e() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58322);
        }

        public h() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    static {
        Covode.recordClassIndex(58314);
    }

    private final VideoPlayViewModel J() {
        return (VideoPlayViewModel) this.I.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.t0;
    }

    public final VideoMusicCoverVM F() {
        return (VideoMusicCoverVM) this.F.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.K == null) {
            this.K = new SparseArray();
        }
        View view = (View) this.K.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.K.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public final VideoMusicBaseVM H() {
        return (VideoMusicBaseVM) this.G.a(this, u[1]);
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58320);
        }

        public f() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58321);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final i INSTANCE = new i();

        static {
            Covode.recordClassIndex(58323);
        }

        public i() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final j INSTANCE = new j();

        static {
            Covode.recordClassIndex(58324);
        }

        public j() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58315);
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

    public static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public final com.ss.android.ugc.aweme.cp.e I() {
        if (this.z == null) {
            this.z = new com.ss.android.ugc.aweme.cp.e();
        }
        com.ss.android.ugc.aweme.cp.e eVar = this.z;
        if (eVar == null) {
            h.f.b.l.a("musicCoverViewScaleHelper");
        }
        return eVar;
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        VideoMusicCoverVM F2;
        super.x();
        a(F2, c.f92302a, e.f92304a, com.bytedance.assem.arch.viewModel.l.a(F().f25686c), null, l.f92293a);
        f.a.a(this, F(), f.f92305a, (com.bytedance.assem.arch.viewModel.k) null, m.f92295a, 6);
        f.a.a(this, F(), g.f92306a, (com.bytedance.assem.arch.viewModel.k) null, n.f92296a, 6);
        f.a.a(this, F(), h.f92307a, (com.bytedance.assem.arch.viewModel.k) null, o.f92297a, 6);
        f.a.a(this, F(), d.f92303a, (com.bytedance.assem.arch.viewModel.k) null, k.f92290a, 6);
    }

    public b() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoMusicCoverVM.class);
        this.F = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), C2240b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        i.c cVar2 = i.c.f25720a;
        h.k.c a3 = ab.a(VideoMusicBaseVM.class);
        this.G = com.bytedance.ext_power_list.k.a(this, a3, cVar2 == null ? i.c.f25720a : cVar2, new c(a3), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), d.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.H = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, f.INSTANCE, g.INSTANCE, e.INSTANCE);
        this.I = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, i.INSTANCE, j.INSTANCE, h.INSTANCE);
        this.C = 49.0d;
        this.D = 27.0d;
        this.E = 64;
        this.J = 80.0f;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    public static void a(SmartImageView smartImageView) {
        v a2 = com.bytedance.lighten.a.r.a(2131233114);
        a2.E = smartImageView;
        a2.c();
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        this.y = (FrameLayout) B().findViewById(R.id.cpu);
        this.w = (SmartCircleImageView) B().findViewById(R.id.cpt);
        this.v = (SmartCircleImageView) B().findViewById(R.id.d0c);
        this.x = (PeriscopeLayout) B().findViewById(R.id.cwj);
        SmartCircleImageView smartCircleImageView = this.w;
        if (smartCircleImageView != null) {
            smartCircleImageView.setOnTouchListener(new com.bytedance.ies.dmt.ui.widget.b());
        }
        com.ss.android.ugc.aweme.cp.e I2 = I();
        I2.f78259a = B().findViewById(R.id.cr0);
        I2.f78261c = this.y;
        I2.f78262d = this.w;
        I2.f78260b = this.x;
        I2.f78263e = this.v;
        I2.f78264f = s();
        f.a.b(this, (VideoViewModel) this.H.getValue(), i.f92308a, com.bytedance.assem.arch.viewModel.l.a(), p.f92298a, 4);
        f.a.b(this, J(), j.f92309a, com.bytedance.assem.arch.viewModel.l.a(), q.f92299a, 4);
        f.a.b(this, J(), k.f92310a, com.bytedance.assem.arch.viewModel.l.a(), r.f92300a, 4);
        f.a.b(this, J(), l.f92311a, com.bytedance.assem.arch.viewModel.l.a(), s.f92301a, 4);
    }

    static final class p extends h.f.b.m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f92298a = new p();

        static {
            Covode.recordClassIndex(58333);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.H().i();
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<b, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f92290a = new k();

        static {
            Covode.recordClassIndex(58325);
        }

        k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, Boolean bool) {
            final b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar2, "");
            if (booleanValue) {
                SmartCircleImageView smartCircleImageView = bVar2.w;
                if (smartCircleImageView != null) {
                    smartCircleImageView.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.feed.assem.music.b.k.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(58326);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            new com.ss.android.ugc.aweme.tux.a.i.a(bVar2.ar_()).a(R.string.fh3).a();
                        }
                    });
                }
            } else {
                SmartCircleImageView smartCircleImageView2 = bVar2.w;
                if (smartCircleImageView2 != null) {
                    smartCircleImageView2.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.feed.assem.music.b.k.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(58327);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                                VideoMusicBaseVM H = bVar2.H();
                                h.f.b.l.b(view, "");
                                Context context = view.getContext();
                                h.f.b.l.b(context, "");
                                H.a(context, view.getId());
                            }
                        }
                    });
                }
            }
            bVar2.I().c();
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<b, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92295a = new m();

        static {
            Covode.recordClassIndex(58330);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, Boolean bool) {
            ValueAnimator valueAnimator;
            b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar2, "");
            if (booleanValue) {
                PeriscopeLayout periscopeLayout = bVar2.x;
                if (periscopeLayout != null) {
                    periscopeLayout.b();
                }
                if (!(bVar2.y == null || (valueAnimator = bVar2.A) == null)) {
                    valueAnimator.end();
                }
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.m<b, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f92296a = new n();

        static {
            Covode.recordClassIndex(58331);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, Boolean bool) {
            ValueAnimator valueAnimator;
            b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar2, "");
            if (booleanValue) {
                if (!(bVar2.y == null || (valueAnimator = bVar2.A) == null)) {
                    valueAnimator.end();
                }
                PeriscopeLayout periscopeLayout = bVar2.x;
                if (periscopeLayout != null) {
                    periscopeLayout.c();
                }
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f92300a = new r();

        static {
            Covode.recordClassIndex(58335);
        }

        r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            long j2;
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            VideoMusicCoverVM F = bVar2.F();
            if (F.f92276k && !VideoMusicCoverVM.h()) {
                F.f92276k = false;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicCoverVM.a aVar2 = new VideoMusicCoverVM.a(F);
                if (gg.f90139a) {
                    j2 = 300;
                } else {
                    j2 = 0;
                }
                handler.postDelayed(aVar2, j2);
            }
            return z.f158842a;
        }
    }

    static final class s extends h.f.b.m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f92301a = new s();

        static {
            Covode.recordClassIndex(58336);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            long j2;
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            VideoMusicCoverVM F = bVar2.F();
            if (F.f92276k && !VideoMusicCoverVM.h()) {
                F.f92276k = false;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicCoverVM.c cVar = new VideoMusicCoverVM.c(F);
                if (gg.f90139a) {
                    j2 = 300;
                } else {
                    j2 = 0;
                }
                handler.postDelayed(cVar, j2);
            }
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92299a = new q();

        static {
            Covode.recordClassIndex(58334);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            long j2;
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            VideoMusicCoverVM F = bVar2.F();
            if (!F.f92276k && !VideoMusicCoverVM.h()) {
                com.ss.android.ugc.aweme.power.c a2 = com.ss.android.ugc.aweme.power.c.a();
                h.f.b.l.b(a2, "");
                if (!a2.b()) {
                    F.f92276k = true;
                    Handler handler = new Handler(Looper.getMainLooper());
                    VideoMusicCoverVM.b bVar3 = new VideoMusicCoverVM.b(F);
                    if (gg.f90139a) {
                        j2 = 300;
                    } else {
                        j2 = 0;
                    }
                    handler.postDelayed(bVar3, j2);
                }
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<b, Music, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92297a = new o();

        static {
            Covode.recordClassIndex(58332);
        }

        o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2  */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.assem.music.b r7, com.ss.android.ugc.aweme.music.model.Music r8) {
            /*
            // Method dump skipped, instructions count: 278
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.b.o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static final class l extends h.f.b.m implements h.f.a.q<b, Boolean, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f92293a = new l();

        static {
            Covode.recordClassIndex(58328);
        }

        l() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(b bVar, Boolean bool, Boolean bool2) {
            PeriscopeLayout periscopeLayout;
            final b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            h.f.b.l.d(bVar2, "");
            if (booleanValue && bVar2.y != null) {
                if (bVar2.A != null) {
                    ValueAnimator valueAnimator = bVar2.A;
                    if (valueAnimator != null) {
                        valueAnimator.end();
                    }
                } else {
                    bVar2.A = ValueAnimator.ofFloat(0.0f, 360.0f);
                    ValueAnimator valueAnimator2 = bVar2.A;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setDuration(8000L);
                    }
                    ValueAnimator valueAnimator3 = bVar2.A;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setRepeatMode(1);
                    }
                    ValueAnimator valueAnimator4 = bVar2.A;
                    if (valueAnimator4 != null) {
                        valueAnimator4.setInterpolator(new LinearInterpolator());
                    }
                    ValueAnimator valueAnimator5 = bVar2.A;
                    if (valueAnimator5 != null) {
                        valueAnimator5.setRepeatCount(-1);
                    }
                    ValueAnimator valueAnimator6 = bVar2.A;
                    if (valueAnimator6 != null) {
                        valueAnimator6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.ss.android.ugc.aweme.feed.assem.music.b.l.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(58329);
                            }

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (System.currentTimeMillis() - bVar2.B > ((long) bVar2.E)) {
                                    bVar2.B = System.currentTimeMillis();
                                    FrameLayout frameLayout = bVar2.y;
                                    if (frameLayout != null) {
                                        h.f.b.l.b(valueAnimator, "");
                                        Object animatedValue = valueAnimator.getAnimatedValue();
                                        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                                        frameLayout.setRotation(((Float) animatedValue).floatValue());
                                    }
                                }
                            }
                        });
                    }
                }
                ValueAnimator valueAnimator7 = bVar2.A;
                if (valueAnimator7 != null) {
                    com.ss.android.ugc.aweme.base.ui.a.a.a(valueAnimator7, com.ss.android.ugc.aweme.base.ui.a.c.f68345a);
                }
            }
            if (booleanValue2 && (periscopeLayout = bVar2.x) != null) {
                periscopeLayout.a();
            }
            return z.f158842a;
        }
    }

    public static void a(SmartImageView smartImageView, UrlModel urlModel, int i2, int i3) {
        v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).a(i2, i3);
        a2.K = true;
        v a3 = a2.a("VideoMusicCoverView");
        a3.E = smartImageView;
        a3.c();
    }
}
