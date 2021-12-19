package com.ss.android.ugc.aweme.feed.assem.generalmask;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM;
import com.ss.android.ugc.aweme.feed.i.ah;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;
import kotlinx.coroutines.bz;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new y(a.class, "generalVideoMaskVM", "getGeneralVideoMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/generalmask/GeneralVideoMaskVM;", 0)};
    private final h.h v = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
    private final h.h w = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
    private final h.h.d x;
    private SparseArray y;

    public static final class b extends h.f.b.m implements h.f.a.b<e, e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58255);
        }

        public b() {
            super(1);
        }

        public final e invoke(e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58256);
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
            Covode.recordClassIndex(58259);
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
        Covode.recordClassIndex(58253);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.s9;
    }

    public final GeneralVideoMaskVM F() {
        return (GeneralVideoMaskVM) this.x.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.y == null) {
            this.y = new SparseArray();
        }
        View view = (View) this.y.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.y.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58257);
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
            Covode.recordClassIndex(58258);
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
            Covode.recordClassIndex(58260);
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
            Covode.recordClassIndex(58261);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$a  reason: collision with other inner class name */
    public static final class C2237a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2237a(h.k.c cVar) {
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
        f.a.a(this, F(), b.f92259a, com.bytedance.assem.arch.viewModel.l.a(), new i(this), 4);
    }

    public a() {
        h.k.c a2 = ab.a(GeneralVideoMaskVM.class);
        this.x = com.bytedance.ext_power_list.k.a(this, a2, i.c.f25720a, new C2237a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92256a;

        static {
            Covode.recordClassIndex(58264);
        }

        j(a aVar) {
            this.f92256a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f92256a.ar_()).a(R.string.dqk).a();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ug.guide.a());
        }
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92257a;

        static {
            Covode.recordClassIndex(58265);
        }

        k(a aVar) {
            this.f92257a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            Video video;
            String str;
            ClickAgent.onClick(view);
            GeneralVideoMaskVM F = this.f92257a.F();
            F.a(GeneralVideoMaskVM.a.f92255a);
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            Audio audio = null;
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            if (aweme == null || !aweme.isAd()) {
                com.ss.android.ugc.aweme.video.i O = v.O();
                if (aweme != null) {
                    video = aweme.getVideo();
                    audio = aweme.getAudio();
                } else {
                    video = null;
                }
                O.a(video, audio, false, true);
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
                com.ss.android.ugc.aweme.ad.feed.b.e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
                if (a2 != null) {
                    a2.b();
                }
            } else {
                v.O().y();
            }
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            com.ss.android.ugc.d.a.c.a(new ah(false, str));
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.b(true));
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        B().setVisibility(8);
        TuxTextView tuxTextView = (TuxTextView) B().findViewById(R.id.button);
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new j(this));
        }
        TuxTextView tuxTextView2 = (TuxTextView) B().findViewById(R.id.a0s);
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(new k(this));
        }
        f.a.a(this, (VideoViewModel) this.v.getValue(), c.f92260a, (com.bytedance.assem.arch.viewModel.k) null, new l(this), 6);
        f.a.a(this, (VideoPlayViewModel) this.w.getValue(), d.f92261a, com.bytedance.assem.arch.viewModel.l.a(), m.f92258a, 4);
    }

    static final class l extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                com.bytedance.assem.arch.b.l.b(aVar3);
                aVar3.F();
                GeneralVideoMaskVM F = aVar3.F();
                F.a(new GeneralVideoMaskVM.b(F));
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92258a = new m();

        static {
            Covode.recordClassIndex(58267);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            h.f.b.l.d(aVar2, "");
            GeneralVideoMaskVM F = aVar3.F();
            F.b(new GeneralVideoMaskVM.f(F));
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.g, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.g gVar) {
            final a aVar2 = aVar;
            com.bytedance.assem.arch.extensions.g gVar2 = gVar;
            h.f.b.l.d(aVar2, "");
            h.f.b.l.d(gVar2, "");
            aVar2.F();
            if (gVar2.f25641a) {
                a.a(aVar2.F(), new h.f.a.b<e, z>() {
                    /* class com.ss.android.ugc.aweme.feed.assem.generalmask.a.i.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(58263);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(e eVar) {
                        String str;
                        String str2;
                        e eVar2 = eVar;
                        h.f.b.l.d(eVar2, "");
                        a aVar = aVar2;
                        VideoMaskInfo videoMaskInfo = eVar2.f92263b;
                        if (aVar.B().getVisibility() != 0) {
                            aVar.B().setVisibility(0);
                            TuxTextView tuxTextView = (TuxTextView) aVar.B().findViewById(R.id.title);
                            h.f.b.l.b(tuxTextView, "");
                            if (videoMaskInfo != null) {
                                str = videoMaskInfo.getTitle();
                            } else {
                                str = null;
                            }
                            tuxTextView.setText(str);
                            TuxTextView tuxTextView2 = (TuxTextView) aVar.B().findViewById(R.id.adh);
                            h.f.b.l.b(tuxTextView2, "");
                            if (videoMaskInfo != null) {
                                str2 = videoMaskInfo.getContent();
                            } else {
                                str2 = null;
                            }
                            tuxTextView2.setText(str2);
                            TuxTextView tuxTextView3 = (TuxTextView) aVar.B().findViewById(R.id.button);
                            if (tuxTextView3 != null) {
                                GeneralVideoMaskVM F = aVar.F();
                                bz unused = kotlinx.coroutines.i.a(F.aH_(), null, null, new GeneralVideoMaskVM.c(F, null), 3);
                                tuxTextView3.setText(R.string.d27);
                            }
                            TuxTextView tuxTextView4 = (TuxTextView) aVar.B().findViewById(R.id.a0s);
                            if (tuxTextView4 != null) {
                                GeneralVideoMaskVM F2 = aVar.F();
                                bz unused2 = kotlinx.coroutines.i.a(F2.aH_(), null, null, new GeneralVideoMaskVM.d(F2, null), 3);
                                tuxTextView4.setText(R.string.d28);
                            }
                            GeneralVideoMaskVM F3 = aVar.F();
                            bz unused3 = kotlinx.coroutines.i.a(F3.aH_(), null, null, new GeneralVideoMaskVM.e(F3, null), 3);
                        }
                        return z.f158842a;
                    }
                });
            } else {
                aVar2.B().setVisibility(8);
            }
            return z.f158842a;
        }
    }
}
