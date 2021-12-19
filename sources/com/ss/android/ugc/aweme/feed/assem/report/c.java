package com.ss.android.ugc.aweme.feed.assem.report;

import android.content.Context;
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
import com.ss.android.ugc.aweme.feed.api.CancelVideoMaskApi;
import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.ss.android.ugc.aweme.utils.fe;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.z;

public final class c extends com.ss.android.ugc.aweme.feed.assem.base.a<c> {
    static final /* synthetic */ h.k.i[] u = {new y(c.class, "reportVM", "getReportVM()Lcom/ss/android/ugc/aweme/feed/assem/report/ReportVideoMaskVM;", 0)};
    private final h.h.d v;
    private final h.h w = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, C2245c.INSTANCE);
    private final h.h x = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
    private SparseArray y;

    public static final class b extends m implements h.f.a.b<h, h> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58472);
        }

        public b() {
            super(1);
        }

        public final h invoke(h hVar) {
            l.c(hVar, "");
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$c  reason: collision with other inner class name */
    public static final class C2245c extends m implements h.f.a.b<ck, ck> {
        public static final C2245c INSTANCE = new C2245c();

        static {
            Covode.recordClassIndex(58473);
        }

        public C2245c() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            l.c(ckVar, "");
            return ckVar;
        }
    }

    public static final class f extends m implements h.f.a.b<bd, bd> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58476);
        }

        public f() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            l.c(bdVar, "");
            return bdVar;
        }
    }

    static {
        Covode.recordClassIndex(58470);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.te;
    }

    public final ReportVideoMaskVM F() {
        return (ReportVideoMaskVM) this.v.a(this, u[0]);
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

    public static final class d extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58474);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58475);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58477);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58478);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58471);
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

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        ReportVideoMaskVM F;
        super.x();
        Thread currentThread = Thread.currentThread();
        l.b(currentThread, "");
        currentThread.getName();
        a(F, d.f92411a, e.f92412a, com.bytedance.assem.arch.viewModel.l.a(F().f25686c), null, i.f92405a);
    }

    public c() {
        h.k.c a2 = ab.a(ReportVideoMaskVM.class);
        this.v = com.bytedance.ext_power_list.k.a(this, a2, i.c.f25720a, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        Thread currentThread = Thread.currentThread();
        l.b(currentThread, "");
        currentThread.getName();
        B().setVisibility(8);
        f.a.b(this, (VideoViewModel) this.w.getValue(), f.f92413a, com.bytedance.assem.arch.viewModel.l.a(), j.f92409a, 4);
        f.a.b(this, (VideoPlayViewModel) this.x.getValue(), g.f92414a, com.bytedance.assem.arch.viewModel.l.a(), k.f92410a, 4);
    }

    static final class i extends m implements q<c, VideoMaskInfo, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92405a = new i();

        static {
            Covode.recordClassIndex(58479);
        }

        i() {
            super(3);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f92406a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ VideoMaskInfo f92407b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Context f92408c;

            static {
                Covode.recordClassIndex(58480);
            }

            a(c cVar, VideoMaskInfo videoMaskInfo, Context context) {
                this.f92406a = cVar;
                this.f92407b = videoMaskInfo;
                this.f92408c = context;
            }

            public final void onClick(View view) {
                Aweme aweme;
                VideoItemParams videoItemParams;
                Aweme aweme2;
                ClickAgent.onClick(view);
                ReportVideoMaskVM F = this.f92406a.F();
                Context context = this.f92408c;
                l.b(context, "");
                l.d(context, "");
                if (!fe.a(context)) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.de8).a();
                } else {
                    VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                    if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null || (videoItemParams = (VideoItemParams) F.g()) == null || (aweme2 = videoItemParams.mAweme) == null || aweme2.getReportMaskInfo() == null)) {
                        String aid = aweme.getAid();
                        l.b(aid, "");
                        CancelVideoMaskApi.a(aid, aweme.getReportMaskInfo().getMaskType(), aweme.getReportMaskInfo().getStatus()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new ReportVideoMaskVM.a(F, context));
                    }
                }
                this.f92406a.F().a("showpost_click");
                ReportVideoMaskVM F2 = this.f92406a.F();
                Context context2 = this.f92408c;
                l.b(context2, "");
                F2.a(context2, "play");
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(c cVar, VideoMaskInfo videoMaskInfo, Boolean bool) {
            String string;
            String string2;
            String string3;
            c cVar2 = cVar;
            VideoMaskInfo videoMaskInfo2 = videoMaskInfo;
            boolean booleanValue = bool.booleanValue();
            l.d(cVar2, "");
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            currentThread.getName();
            if (!booleanValue) {
                cVar2.B().setVisibility(8);
            } else if (cVar2.B().getVisibility() != 0) {
                Context context = cVar2.B().getContext();
                TuxTextView tuxTextView = (TuxTextView) cVar2.B().findViewById(R.id.title);
                if (tuxTextView != null) {
                    if (videoMaskInfo2 == null || (string3 = videoMaskInfo2.getTitle()) == null) {
                        string3 = context.getString(R.string.fcz);
                    }
                    tuxTextView.setText(string3);
                }
                TuxTextView tuxTextView2 = (TuxTextView) cVar2.B().findViewById(R.id.adh);
                l.b(tuxTextView2, "");
                if (videoMaskInfo2 == null || (string = videoMaskInfo2.getContent()) == null) {
                    string = context.getString(R.string.fcx);
                }
                tuxTextView2.setText(string);
                TuxTextView tuxTextView3 = (TuxTextView) cVar2.B().findViewById(R.id.button);
                if (tuxTextView3 != null) {
                    if (videoMaskInfo2 == null || (string2 = videoMaskInfo2.getCancelMaskLabel()) == null) {
                        string2 = context.getString(R.string.fcy);
                    }
                    tuxTextView3.setText(string2);
                    tuxTextView3.setOnClickListener(new a(cVar2, videoMaskInfo2, context));
                }
                cVar2.B().setVisibility(0);
                cVar2.F().a("reportlayer_show");
                ReportVideoMaskVM F = cVar2.F();
                l.b(context, "");
                F.a(context, "othershow");
            }
            return z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f92410a = new k();

        static {
            Covode.recordClassIndex(58482);
        }

        k() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            l.d(aVar, "");
            ReportVideoMaskVM F = cVar2.F();
            F.b(new ReportVideoMaskVM.c(F));
            return z.f158842a;
        }
    }

    static final class j extends m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f92409a = new j();

        static {
            Covode.recordClassIndex(58481);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            c cVar2 = cVar;
            l.d(cVar2, "");
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            currentThread.getName();
            ReportVideoMaskVM F = cVar2.F();
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            if (videoItemParams != null) {
                F.a(new ReportVideoMaskVM.b(videoItemParams, F));
            }
            return z.f158842a;
        }
    }
}
