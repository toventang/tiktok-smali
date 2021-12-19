package com.ss.android.ugc.aweme.feed.assem.vpainfobar;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.vpainfobar.VPAInfoBarVM;
import com.ss.android.ugc.aweme.feed.i.af;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new y(a.class, "vpaInfoVM", "getVpaInfoVM()Lcom/ss/android/ugc/aweme/feed/assem/vpainfobar/VPAInfoBarVM;", 0)};
    private SparseArray A;
    final h.h v = h.i.a((h.f.a.a) new f(this));
    final h.h w = h.i.a((h.f.a.a) new m(this));
    private final h.h x = h.i.a((h.f.a.a) new k(this));
    private final h.h.d y;
    private final h.h z;

    public static final class b extends h.f.b.m implements h.f.a.b<f, f> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58713);
        }

        public b() {
            super(1);
        }

        public final f invoke(f fVar) {
            h.f.b.l.c(fVar, "");
            return fVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58714);
        }

        public c() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    static {
        Covode.recordClassIndex(58711);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.tr;
    }

    public final TextView F() {
        return (TextView) this.x.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.A == null) {
            this.A = new SparseArray();
        }
        View view = (View) this.A.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.A.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public final VPAInfoBarVM H() {
        return (VPAInfoBarVM) this.y.a(this, u[0]);
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58715);
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
            Covode.recordClassIndex(58716);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.B().findViewById(R.id.boz);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.B().findViewById(R.id.czr);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.B().findViewById(R.id.fku);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpainfobar.a$a  reason: collision with other inner class name */
    public static final class C2252a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2252a(h.k.c cVar) {
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
        f.a.a(this, H(), b.f92633a, (com.bytedance.assem.arch.viewModel.k) null, g.f92626a, 6);
        f.a.a(this, H(), c.f92634a, (com.bytedance.assem.arch.viewModel.k) null, h.f92627a, 6);
        f.a.a(this, H(), d.f92635a, (com.bytedance.assem.arch.viewModel.k) null, i.f92629a, 6);
    }

    public a() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VPAInfoBarVM.class);
        this.y = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new C2252a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.z = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        B().setVisibility(H().h());
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        f.a.b(this, (VideoViewModel) this.z.getValue(), e.f92636a, (com.bytedance.assem.arch.viewModel.k) null, j.f92631a, 6);
        B().setVisibility(8);
    }

    public final com.ss.android.ugc.aweme.app.f.d a(com.ss.android.ugc.aweme.app.f.d dVar) {
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mEventType);
        Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme;
        h.f.b.l.b(aweme, "");
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme.getAid());
        Aweme aweme2 = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme;
        h.f.b.l.b(aweme2, "");
        a3.a("author_id", aweme2.getAuthorUid()).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mAweme, ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this)).mPageType)));
        return dVar;
    }

    static final class g extends h.f.b.m implements h.f.a.m<a, SpannableString, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f92626a = new g();

        static {
            Covode.recordClassIndex(58718);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, SpannableString spannableString) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            ((TextView) aVar2.v.getValue()).setText(spannableString);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f92631a = new j();

        static {
            Covode.recordClassIndex(58723);
        }

        j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            VPAInfoBarVM H = aVar3.H();
            H.a(new VPAInfoBarVM.b(H));
            return z.f158842a;
        }
    }

    static final class l implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92632a;

        static {
            Covode.recordClassIndex(58725);
        }

        l(a aVar) {
            this.f92632a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.compliance.api.a.e().a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.feed.assem.vpainfobar.a.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(58726);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    com.ss.android.ugc.d.a.c.a(new af());
                    com.ss.android.ugc.aweme.feed.cache.e.m();
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f92632a.ar_()).a(R.string.bw_).a();
                    return z.f158842a;
                }
            }, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.feed.assem.vpainfobar.a.l.AnonymousClass2 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(58727);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f92632a.ar_()).a(R.string.bw9).a();
                    return z.f158842a;
                }
            });
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<a, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f92627a = new h();

        static {
            Covode.recordClassIndex(58719);
        }

        h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Integer num) {
            final a aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(aVar2, "");
            aVar2.B().setVisibility(intValue);
            if (intValue == 0) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                h.f.b.l.b(dVar, "");
                r.a("vpa_notify_show", aVar2.a(dVar).f66730a);
                ((View) aVar2.w.getValue()).setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.ugc.aweme.feed.assem.vpainfobar.a.h.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(58720);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        SmartRouter.buildRoute(aVar2.ar_(), com.ss.android.ugc.aweme.compliance.api.a.e().b()).open();
                        a aVar = aVar2;
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        h.f.b.l.b(dVar, "");
                        r.a("enter_vpa_notify", aVar.a(dVar).f66730a);
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<a, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92629a = new i();

        static {
            Covode.recordClassIndex(58721);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Integer num) {
            final a aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(aVar2, "");
            aVar2.F().setVisibility(intValue);
            if (intValue == 0) {
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                h.f.b.l.b(dVar, "");
                r.a("opt_out_show", aVar2.a(dVar).f66730a);
                aVar2.F().setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.ugc.aweme.feed.assem.vpainfobar.a.i.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(58722);
                    }

                    public final void onClick(View view) {
                        String str;
                        String str2;
                        ClickAgent.onClick(view);
                        a aVar = aVar2;
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        h.f.b.l.b(dVar, "");
                        r.a("opt_out_click", aVar.a(dVar).f66730a);
                        a aVar2 = aVar2;
                        a.C0731a aVar3 = new a.C0731a(aVar2.ar_());
                        aVar3.E = true;
                        a.C0731a a2 = aVar3.a(R.string.bw8);
                        StringBuilder sb = new StringBuilder();
                        Context ar_ = aVar2.ar_();
                        if (ar_ != null) {
                            str = ar_.getString(R.string.bw5);
                        } else {
                            str = null;
                        }
                        StringBuilder append = sb.append(str).append("\n\n");
                        Context ar_2 = aVar2.ar_();
                        if (ar_2 != null) {
                            str2 = ar_2.getString(R.string.bw6);
                        } else {
                            str2 = null;
                        }
                        a2.f33402b = append.append(str2).toString();
                        a.C0731a b2 = a2.a(R.string.bw7, (DialogInterface.OnClickListener) new l(aVar2), false).b(R.string.a73, (DialogInterface.OnClickListener) null, false);
                        b2.F = true;
                        b2.a().c();
                    }
                });
            }
            return z.f158842a;
        }
    }
}
