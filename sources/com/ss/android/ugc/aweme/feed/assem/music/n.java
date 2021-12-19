package com.ss.android.ugc.aweme.feed.assem.music;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.experiment.gg;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM;
import com.ss.android.ugc.aweme.feed.experiment.ac;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;

public final class n extends com.ss.android.ugc.aweme.feed.assem.base.a<n> {
    static final /* synthetic */ h.k.i[] u = {new y(n.class, "musicTitleVM", "getMusicTitleVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicTitleVM;", 0), new y(n.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0)};
    private final h.h.d A;
    private final h.h B;
    private final h.h C;
    private LinearLayout D;
    private TextView E;
    private boolean F;
    private SparseArray G;
    public ImageView v;
    public TextView w;
    public MarqueeView x;
    public com.ss.android.ugc.aweme.cp.f y;
    private final h.h.d z;

    public static final class b extends h.f.b.m implements h.f.a.b<x, x> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58350);
        }

        public b() {
            super(1);
        }

        public final x invoke(x xVar) {
            h.f.b.l.c(xVar, "");
            return xVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<a, a> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58352);
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
            Covode.recordClassIndex(58353);
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
            Covode.recordClassIndex(58356);
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
        Covode.recordClassIndex(58348);
    }

    private final VideoPlayViewModel I() {
        return (VideoPlayViewModel) this.C.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.t8;
    }

    public final VideoMusicTitleVM F() {
        return (VideoMusicTitleVM) this.z.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.G == null) {
            this.G = new SparseArray();
        }
        View view = (View) this.G.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.G.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public final VideoMusicBaseVM H() {
        return (VideoMusicBaseVM) this.A.a(this, u[1]);
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58354);
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
            Covode.recordClassIndex(58355);
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
            Covode.recordClassIndex(58357);
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
            Covode.recordClassIndex(58358);
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
            Covode.recordClassIndex(58349);
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
            Covode.recordClassIndex(58351);
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

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, F(), o.f92328a, (com.bytedance.assem.arch.viewModel.k) null, l.f92319a, 6);
        f.a.a(this, F(), p.f92329a, (com.bytedance.assem.arch.viewModel.k) null, m.f92320a, 6);
        f.a.a(this, F(), q.f92330a, (com.bytedance.assem.arch.viewModel.k) null, C2241n.f92321a, 6);
        f.a.a(this, F(), r.f92331a, (com.bytedance.assem.arch.viewModel.k) null, o.f92322a, 6);
        f.a.a(this, F(), s.f92332a, (com.bytedance.assem.arch.viewModel.k) null, k.f92318a, 6);
    }

    public n() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoMusicTitleVM.class);
        this.z = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        i.c cVar2 = i.c.f25720a;
        h.k.c a3 = ab.a(VideoMusicBaseVM.class);
        this.A = com.bytedance.ext_power_list.k.a(this, a3, cVar2 == null ? i.c.f25720a : cVar2, new c(a3), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), d.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.B = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, f.INSTANCE, g.INSTANCE, e.INSTANCE);
        this.C = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, i.INSTANCE, j.INSTANCE, h.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    public final void a(String str) {
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(str);
        }
        MarqueeView marqueeView = this.x;
        if (marqueeView != null) {
            marqueeView.setText(str);
        }
    }

    static final class t implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f92327a;

        static {
            Covode.recordClassIndex(58369);
        }

        t(n nVar) {
            this.f92327a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            VideoMusicBaseVM H = this.f92327a.H();
            h.f.b.l.b(view, "");
            Context context = view.getContext();
            h.f.b.l.b(context, "");
            H.a(context, view.getId());
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        this.x = (MarqueeView) B().findViewById(R.id.crb);
        this.E = (TextView) B().findViewById(R.id.crd);
        this.w = (TextView) B().findViewById(R.id.cqq);
        this.v = (ImageView) B().findViewById(R.id.cqi);
        this.D = (LinearLayout) B().findViewById(R.id.cr_);
        this.F = com.bytedance.ies.abmock.b.a().a(true, "marquee_title_opt", false);
        t tVar = new t(this);
        TextView textView = this.E;
        if (textView != null) {
            textView.setOnClickListener(tVar);
        }
        MarqueeView marqueeView = this.x;
        if (marqueeView != null) {
            marqueeView.setOnClickListener(tVar);
        }
        ImageView imageView = this.v;
        if (imageView != null) {
            imageView.setOnClickListener(tVar);
        }
        if (!ac.a()) {
            TextView textView2 = this.E;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            MarqueeView marqueeView2 = this.x;
            if (marqueeView2 != null) {
                marqueeView2.setVisibility(8);
            }
        }
        f.a.b(this, (VideoViewModel) this.B.getValue(), t.f92333a, com.bytedance.assem.arch.viewModel.l.a(), p.f92323a, 4);
        f.a.b(this, I(), u.f92334a, com.bytedance.assem.arch.viewModel.l.a(), q.f92324a, 4);
        f.a.b(this, I(), v.f92335a, com.bytedance.assem.arch.viewModel.l.a(), r.f92325a, 4);
        f.a.b(this, I(), w.f92336a, com.bytedance.assem.arch.viewModel.l.a(), s.f92326a, 4);
    }

    static final class k extends h.f.b.m implements h.f.a.m<n, Music, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f92318a = new k();

        static {
            Covode.recordClassIndex(58359);
        }

        k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, Music music) {
            final n nVar2 = nVar;
            final Music music2 = music;
            h.f.b.l.d(nVar2, "");
            n.a(nVar2.F(), new h.f.a.b<x, z>() {
                /* class com.ss.android.ugc.aweme.feed.assem.music.n.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(58360);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Removed duplicated region for block: B:66:0x0108  */
                /* JADX WARNING: Removed duplicated region for block: B:72:0x0125  */
                /* JADX WARNING: Removed duplicated region for block: B:75:0x012d  */
                /* JADX WARNING: Removed duplicated region for block: B:78:0x013c  */
                @Override // h.f.a.b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.assem.music.x r16) {
                    /*
                    // Method dump skipped, instructions count: 703
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.music.n.k.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }
            });
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<n, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f92319a = new l();

        static {
            Covode.recordClassIndex(58361);
        }

        l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, Boolean bool) {
            MarqueeView marqueeView;
            n nVar2 = nVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(nVar2, "");
            if (booleanValue && (marqueeView = nVar2.x) != null) {
                marqueeView.a();
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<n, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92320a = new m();

        static {
            Covode.recordClassIndex(58362);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, Boolean bool) {
            MarqueeView marqueeView;
            n nVar2 = nVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(nVar2, "");
            if (booleanValue && (marqueeView = nVar2.x) != null) {
                marqueeView.b();
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$n  reason: collision with other inner class name */
    static final class C2241n extends h.f.b.m implements h.f.a.m<n, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2241n f92321a = new C2241n();

        static {
            Covode.recordClassIndex(58363);
        }

        C2241n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, Boolean bool) {
            MarqueeView marqueeView;
            n nVar2 = nVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(nVar2, "");
            if (booleanValue && (marqueeView = nVar2.x) != null) {
                marqueeView.c();
            }
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<n, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f92323a = new p();

        static {
            Covode.recordClassIndex(58365);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            nVar2.H().i();
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<n, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92322a = new o();

        static {
            Covode.recordClassIndex(58364);
        }

        o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, Boolean bool) {
            n nVar2 = nVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(nVar2, "");
            if (booleanValue) {
                nVar2.s().setVisibility(8);
            } else {
                nVar2.s().setVisibility(0);
            }
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<n, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92324a = new q();

        static {
            Covode.recordClassIndex(58366);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            long j2;
            n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.d(aVar, "");
            VideoMusicTitleVM F = nVar2.F();
            if (!F.f92283k) {
                F.f92283k = true;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicTitleVM.b bVar = new VideoMusicTitleVM.b(F);
                if (gg.f90139a) {
                    j2 = 300;
                } else {
                    j2 = 0;
                }
                handler.postDelayed(bVar, j2);
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<n, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f92325a = new r();

        static {
            Covode.recordClassIndex(58367);
        }

        r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            long j2;
            n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.d(aVar, "");
            VideoMusicTitleVM F = nVar2.F();
            if (F.f92283k) {
                F.f92283k = false;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicTitleVM.a aVar2 = new VideoMusicTitleVM.a(F);
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

    static final class s extends h.f.b.m implements h.f.a.m<n, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f92326a = new s();

        static {
            Covode.recordClassIndex(58368);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(n nVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            long j2;
            n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.d(aVar, "");
            VideoMusicTitleVM F = nVar2.F();
            if (F.f92283k && !com.bytedance.ies.abmock.b.a().a(true, "anim_opt", false)) {
                F.f92283k = false;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicTitleVM.c cVar = new VideoMusicTitleVM.c(F);
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
}
