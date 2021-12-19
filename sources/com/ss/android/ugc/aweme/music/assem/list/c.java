package com.ss.android.ugc.aweme.music.assem.list;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.cell.MusicCell;
import com.ss.android.ugc.aweme.music.assem.list.cell.MusicFooterCell;
import com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.ui.aq;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.List;

public final class c extends com.bytedance.ext_power_list.m<OriginMusicListViewModel> implements com.ss.android.ugc.aweme.music.assem.list.cell.b, p {

    /* renamed from: m  reason: collision with root package name */
    public static final h f111181m = new h((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public boolean f111182j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f111183k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f111184l;
    private final h.h n = h.i.a((h.f.a.a) new y(this));
    private final com.bytedance.assem.arch.viewModel.b o;
    private final com.bytedance.assem.arch.viewModel.b p;
    private final com.bytedance.assem.arch.extensions.i q;
    private final com.bytedance.assem.arch.viewModel.b r;
    private final h.h s;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.video.e, com.ss.android.ugc.aweme.music.assem.video.e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(71373);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.video.e invoke(com.ss.android.ugc.aweme.music.assem.video.e eVar) {
            h.f.b.l.c(eVar, "");
            return eVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.music.assem.a, com.ss.android.ugc.aweme.music.assem.a> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(71375);
        }

        public d() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.music.assem.a invoke(com.ss.android.ugc.aweme.music.assem.a aVar) {
            h.f.b.l.c(aVar, "");
            return aVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<s, s> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(71377);
        }

        public f() {
            super(1);
        }

        public final s invoke(s sVar) {
            h.f.b.l.c(sVar, "");
            return sVar;
        }
    }

    static {
        Covode.recordClassIndex(71371);
    }

    private final OriginMusicArg F() {
        return (OriginMusicArg) this.q.getValue();
    }

    /* renamed from: A */
    public final OriginMusicListViewModel u() {
        return (OriginMusicListViewModel) this.r.getValue();
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.s.getValue();
    }

    public final DmtStatusView x() {
        return (DmtStatusView) this.n.getValue();
    }

    public final MusicPlayViewModel y() {
        return (MusicPlayViewModel) this.o.getValue();
    }

    public final LegacyCommunicateViewModel z() {
        return (LegacyCommunicateViewModel) this.p.getValue();
    }

    public static final class h {
        static {
            Covode.recordClassIndex(71379);
        }

        private h() {
        }

        public /* synthetic */ h(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.p
    public final boolean D() {
        return this.f111184l;
    }

    static final class i implements h.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111185a;

        static {
            Covode.recordClassIndex(71380);
        }

        i(c cVar) {
            this.f111185a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.a
        public final void l() {
            this.f111185a.u().a(com.bytedance.ies.powerlist.page.e.Next);
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.this$0.s().findViewById(R.id.e_o);
        }
    }

    private static boolean G() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.b
    public final com.ss.android.ugc.aweme.music.assem.list.cell.a B() {
        return new com.ss.android.ugc.aweme.music.assem.list.cell.a(v(), new i(this));
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.p
    public final View E() {
        if (this.f25594h) {
            return v();
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34357b = false;
        cVar.f34356a = 2;
        cVar.f34358c = MusicFooterCell.class;
        return cVar;
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71372);
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

    /* renamed from: com.ss.android.ugc.aweme.music.assem.list.c$c  reason: collision with other inner class name */
    public static final class C2846c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2846c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<OriginMusicArg> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(71378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.music.assem.OriginMusicArg] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.music.assem.OriginMusicArg invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.music.assem.OriginMusicArg> r1 = com.ss.android.ugc.aweme.music.assem.OriginMusicArg.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.list.c.g.invoke():java.lang.Object");
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71388);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f25594h) {
                this.this$0.x().f();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.p
    public final boolean C() {
        if (!this.f25594h) {
            return false;
        }
        if (v().getChildCount() > 0) {
            v().b(0);
        }
        u().l();
        return true;
    }

    static final class k extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            PowerList powerList = (PowerList) this.this$0.s().findViewById(R.id.drv);
            c cVar = this.this$0;
            RecyclerView.a adapter = powerList.getAdapter();
            if (adapter != null) {
                PowerStub g2 = ((PowerAdapter) adapter).g();
                if (g2 != null) {
                    com.bytedance.ies.powerlist.a.b e2 = g2.e();
                    if (!e2.a().containsKey(c.class)) {
                        e2.a().put(c.class, cVar);
                    } else {
                        throw new RuntimeException("already contains control type :" + c.class);
                    }
                }
                powerList.a(MusicCell.class);
                return powerList;
            }
            throw new h.w("null cannot be cast to non-null type");
        }
    }

    public c() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        com.bytedance.assem.arch.viewModel.b bVar3;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(MusicPlayViewModel.class);
        a aVar = new a(a2);
        b bVar4 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.c(this, true), u.c.f25670a, bVar4, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.c(this, false), u.c.f25670a, bVar4, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), u.c.f25670a, bVar4, com.bytedance.assem.arch.extensions.u.b(this), com.bytedance.assem.arch.extensions.u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.o = bVar;
        i.d dVar2 = i.d.f25721a;
        h.k.c a3 = ab.a(LegacyCommunicateViewModel.class);
        C2846c cVar = new C2846c(a3);
        d dVar3 = d.INSTANCE;
        if (h.f.b.l.a(dVar2, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.c(this, true), u.c.f25670a, dVar3, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.d(this, true));
        } else if (h.f.b.l.a(dVar2, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.c(this, false), u.c.f25670a, dVar3, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.d(this, false));
        } else if (dVar2 == null || h.f.b.l.a(dVar2, i.b.f25719a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), u.c.f25670a, dVar3, com.bytedance.assem.arch.extensions.u.b(this), com.bytedance.assem.arch.extensions.u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.p = bVar2;
        this.f111183k = true;
        this.f111184l = true;
        this.q = new com.bytedance.assem.arch.extensions.i(bQ_(), new g(this, null));
        i.d dVar4 = i.d.f25721a;
        h.k.c a4 = ab.a(OriginMusicListViewModel.class);
        e eVar = new e(a4);
        f fVar = f.INSTANCE;
        if (h.f.b.l.a(dVar4, i.a.f25718a)) {
            bVar3 = new com.bytedance.assem.arch.viewModel.b(a4, eVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.c(this, true), u.c.f25670a, fVar, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, true), com.bytedance.assem.arch.extensions.u.d(this, true));
        } else if (h.f.b.l.a(dVar4, i.d.f25721a)) {
            bVar3 = new com.bytedance.assem.arch.viewModel.b(a4, eVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.b((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.c(this, false), u.c.f25670a, fVar, com.bytedance.assem.arch.extensions.u.a((com.bytedance.assem.arch.core.a) this, false), com.bytedance.assem.arch.extensions.u.d(this, false));
        } else if (dVar4 == null || h.f.b.l.a(dVar4, i.b.f25719a)) {
            bVar3 = new com.bytedance.assem.arch.viewModel.b(a4, eVar, u.j.f25671a, com.bytedance.assem.arch.extensions.u.a((androidx.lifecycle.m) this, false), com.bytedance.assem.arch.extensions.u.a((ag) this, false), u.c.f25670a, fVar, com.bytedance.assem.arch.extensions.u.b(this), com.bytedance.assem.arch.extensions.u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.r = bVar3;
        this.s = h.i.a((h.f.a.a) new k(this));
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111186a;

        static {
            Covode.recordClassIndex(71381);
        }

        j(c cVar) {
            this.f111186a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f111186a.u().l();
        }
    }

    static final class s extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f111182j = bool.booleanValue();
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || !t.booleanValue())) {
                this.this$0.C();
            }
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            if (!this.this$0.f25594h || this.this$0.v().getChildCount() <= 0) {
                this.this$0.x().h();
            } else {
                this.this$0.x().d();
            }
            this.this$0.f111183k = false;
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            this.this$0.f111183k = false;
            this.this$0.y().a(true);
            c.a(this.this$0.u(), new h.f.a.b<s, z>(this) {
                /* class com.ss.android.ugc.aweme.music.assem.list.c.o.AnonymousClass1 */
                final /* synthetic */ o this$0;

                static {
                    Covode.recordClassIndex(71387);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(s sVar) {
                    s sVar2 = sVar;
                    h.f.b.l.d(sVar2, "");
                    List b2 = i.a.b(sVar2);
                    if (b2 == null || b2.isEmpty()) {
                        this.this$0.this$0.x().g();
                    } else {
                        this.this$0.this$0.x().d();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        TuxTextView tuxTextView;
        String str;
        String str2;
        h.f.b.l.d(view, "");
        super.b(view);
        if (ar_() != null) {
            DmtStatusView.a a2 = DmtStatusView.a.a(ar_());
            try {
                Context ar_ = ar_();
                TuxTextView tuxTextView2 = null;
                if (ar_ == null) {
                    tuxTextView = null;
                } else {
                    tuxTextView = new TuxTextView(ar_, null, 0, 6);
                    tuxTextView.setTuxFont(51);
                    tuxTextView.setGravity(17);
                    tuxTextView.setTextColor(androidx.core.content.b.c(ar_, R.color.c4));
                    tuxTextView.setText(R.string.cyv);
                    tuxTextView.setOnClickListener(new j(this));
                }
                boolean isMe = F().isMe();
                Context ar_2 = ar_();
                if (ar_2 != null) {
                    TuxTextView tuxTextView3 = new TuxTextView(ar_2, null, 0, 6);
                    tuxTextView3.setTuxFont(51);
                    tuxTextView3.setGravity(17);
                    if (isMe) {
                        str = ar_2.getString(R.string.ddl);
                    } else {
                        str = ar_2.getString(R.string.dnr);
                    }
                    h.f.b.l.b(str, "");
                    if (isMe) {
                        str2 = ar_2.getString(R.string.ddk);
                    } else {
                        str2 = ar_2.getString(R.string.dnq, "@" + z().f111104k);
                    }
                    h.f.b.l.b(str2, "");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h.m.p.b("\n            " + str + "\n            " + str2 + "\n            "));
                    spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.b(33, false), 0, str.length(), 18);
                    Resources system = Resources.getSystem();
                    h.f.b.l.a((Object) system, "");
                    spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.d(h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()))), 0, str.length(), 18);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(ar_2, R.color.bx)), 0, str.length(), 18);
                    tuxTextView3.setTextColor(androidx.core.content.b.c(ar_2, R.color.c4));
                    tuxTextView3.setText(spannableStringBuilder);
                    tuxTextView3.setLineSpacing(com.bytedance.common.utility.n.b(ar_2, 12.0f), 1.0f);
                    tuxTextView2 = tuxTextView3;
                }
                a2.b(tuxTextView2).c(tuxTextView);
                int b2 = (int) com.bytedance.common.utility.n.b(ar_(), 24.0f);
                x().setPadding(b2, 0, b2, 0);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            x().setBuilder(a2);
        }
        if (F().getBottomBarHeight() > 0) {
            v().setPadding(0, 0, 0, F().getBottomBarHeight());
        }
        da.a.a("origin_music_new_fragment").a(v());
        ar_();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.b(1);
        v().setLayoutManager(wrapLinearLayoutManager);
        f.a.a(this, u(), e.f111246a, com.bytedance.assem.arch.viewModel.l.a(), new r(this), 4);
        f.a.a(this, u(), l.f111253a, com.bytedance.assem.arch.viewModel.l.a(), v.f111187a, 4);
        f.a.a(this, u(), m.f111254a, com.bytedance.assem.arch.viewModel.l.a(), new w(this), 4);
        f.a.a(this, u(), n.f111255a, com.bytedance.assem.arch.viewModel.l.a(), new x(this), 4);
        f.a.a(this, u(), o.f111256a, (com.bytedance.assem.arch.viewModel.k) null, new l(this), 6);
        f.a.a(this, u(), f.f111247a, com.bytedance.assem.arch.viewModel.l.a(), new m(this), 4);
        AssemViewModel.a(u(), g.f111248a, null, new n(this), new p(this), new o(this), 2);
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class), h.f111249a, new q(this));
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class), i.f111250a, new s(this));
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = G();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            new com.ss.android.ugc.aweme.tux.a.i.a(ar_()).a(R.string.de8).a();
        } else if (z().f111105l) {
            u().l();
        }
        f.a.a(this, z(), j.f111251a, com.bytedance.assem.arch.viewModel.l.a(), new t(this), 4);
        f.a.a(this, z(), k.f111252a, com.bytedance.assem.arch.viewModel.l.a(), new u(this), 4);
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, Boolean, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(pVar, "");
            this.this$0.f111184l = booleanValue;
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Object>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71384);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar) {
            com.bytedance.assem.arch.core.p pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            h.f.b.l.d(aVar, "");
            if (!pVar2.f25594h || this.this$0.v().getChildCount() <= 0) {
                this.this$0.x().h();
            } else {
                this.this$0.x().d();
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d> list) {
            aq.b bVar;
            List<? extends com.ss.android.ugc.aweme.music.assem.list.cell.d> list2 = list;
            h.f.b.l.d(pVar, "");
            this.this$0.y().k();
            if (list2 == null || list2.isEmpty()) {
                if (this.this$0.f111183k && (bVar = this.this$0.z().f111103j) != null) {
                    bVar.a();
                }
                this.this$0.f111183k = false;
            } else {
                this.this$0.v().setVisibility(0);
            }
            return z.f158842a;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Object>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar) {
            h.f.b.l.d(pVar, "");
            if (this.this$0.x() == null || !this.this$0.f111182j) {
                this.this$0.u().l();
            } else {
                this.this$0.x().setVisibility(4);
            }
            return z.f158842a;
        }
    }

    static final class u extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Object>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Object> aVar) {
            h.f.b.l.d(pVar, "");
            this.this$0.x().g();
            aq.b bVar = this.this$0.z().f111103j;
            if (bVar != null && this.this$0.f111183k) {
                bVar.a();
            }
            this.this$0.f111183k = false;
            return z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            com.bytedance.assem.arch.core.p pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            h.f.b.l.d(aVar, "");
            if (pVar2.f25594h) {
                this.this$0.v().postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.music.assem.list.c.w.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ w f111188a;

                    static {
                        Covode.recordClassIndex(71396);
                    }

                    {
                        this.f111188a = r1;
                    }

                    public final void run() {
                        this.f111188a.this$0.v().b(0);
                    }
                }, 50);
            }
            return z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(71397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(c cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            com.bytedance.assem.arch.core.p pVar2 = pVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(pVar2, "");
            h.f.b.l.d(aVar2, "");
            if (pVar2.f25594h) {
                if (aVar2.f25631b.booleanValue()) {
                    RecyclerView.i layoutManager = this.this$0.v().getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager) || ((LinearLayoutManager) layoutManager).l() <= 1) {
                        this.this$0.v().b(0);
                    }
                } else {
                    this.this$0.v().b(0);
                }
            }
            return z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.music.p>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f111187a = new v();

        static {
            Covode.recordClassIndex(71394);
        }

        v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.music.p> aVar) {
            Fragment a2;
            com.bytedance.assem.arch.core.p pVar2 = pVar;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.music.p> aVar2 = aVar;
            h.f.b.l.d(pVar2, "");
            h.f.b.l.d(aVar2, "");
            T t = aVar2.f25631b;
            if (t != null) {
                if (t.f111561a) {
                    int i2 = d.f111244a[t.f111562b.ordinal()];
                    if (i2 == 1) {
                        Fragment a3 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                        if (a3 != null) {
                            new com.bytedance.tux.g.b(a3).e(R.string.dp_).b();
                        }
                    } else if (i2 != 2) {
                        Fragment a4 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                        if (a4 != null) {
                            new com.bytedance.tux.g.b(a4).a(a4.getString(R.string.dpa)).b();
                        }
                    } else {
                        Fragment a5 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                        if (a5 != null) {
                            new com.bytedance.tux.g.b(a5).a(a5.getString(R.string.dpb, Integer.valueOf(t.f111563c))).b();
                        }
                    }
                } else {
                    int i3 = d.f111245b[t.f111562b.ordinal()];
                    if (i3 == 1) {
                        Fragment a6 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2);
                        if (a6 != null) {
                            new com.bytedance.tux.g.b(a6).e(R.string.dpd).b();
                        }
                    } else if (i3 == 2 && (a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar2)) != null) {
                        new com.bytedance.tux.g.b(a2).a(a2.getString(R.string.dpc)).b();
                    }
                }
            }
            return z.f158842a;
        }
    }
}
