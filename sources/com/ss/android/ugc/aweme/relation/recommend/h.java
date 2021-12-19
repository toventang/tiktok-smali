package com.ss.android.ugc.aweme.relation.recommend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.i;
import com.bytedance.ext_power_list.m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.ab;
import h.z;
import java.util.List;

public final class h extends m<RecFriendsListViewModel> implements q {

    /* renamed from: j  reason: collision with root package name */
    public TextTitleBar f120428j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f120429k = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, null));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f120430l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f120431m;
    private final h.h n;

    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.relation.viewmodel.b, com.ss.android.ugc.aweme.relation.viewmodel.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(78374);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.relation.viewmodel.b invoke(com.ss.android.ugc.aweme.relation.viewmodel.b bVar) {
            h.f.b.l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(78372);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ext_power_list.m
    public final PowerList v() {
        return (PowerList) this.n.getValue();
    }

    public final f x() {
        return (f) this.f120429k.getValue();
    }

    /* renamed from: y */
    public final RecFriendsListViewModel u() {
        return (RecFriendsListViewModel) this.f120430l.getValue();
    }

    public final m z() {
        return (m) this.f120431m.getValue();
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    static final class d extends h.f.b.m implements h.f.a.a<m> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(78376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            return this.this$0.x().f120416a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<PowerList> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(78377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PowerList invoke() {
            return this.this$0.s().findViewById(R.id.d82);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<ad.b> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(78388);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                h.f.b.l.b();
            }
            return a2;
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void n() {
        super.n();
        u();
        RecFriendsListViewModel.a("background");
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(78373);
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

    public static final class c extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(78375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.relation.recommend.f] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.relation.recommend.f invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.relation.recommend.f> r1 = com.ss.android.ugc.aweme.relation.recommend.f.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.recommend.h.c.invoke():java.lang.Object");
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ TuxDualBallView $loadingBallView;

        static {
            Covode.recordClassIndex(78381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TuxDualBallView tuxDualBallView) {
            super(0);
            this.$loadingBallView = tuxDualBallView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            TuxDualBallView tuxDualBallView = this.$loadingBallView;
            h.f.b.l.b(tuxDualBallView, "");
            tuxDualBallView.setVisibility(0);
            this.$loadingBallView.b();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ext_power_list.m
    public final com.bytedance.ies.powerlist.page.config.c w() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34356a = 5;
        cVar.f34357b = false;
        return cVar.a(LoadingFooterCell.class);
    }

    public h() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        l lVar = new l(this);
        h.k.c a2 = ab.a(RecFriendsListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (h.f.b.l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), lVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (h.f.b.l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), lVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || h.f.b.l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), lVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f120430l = bVar;
        this.f120431m = h.i.a((h.f.a.a) new d(this));
        this.n = h.i.a((h.f.a.a) new e(this));
    }

    public static final /* synthetic */ TextTitleBar a(h hVar) {
        TextTitleBar textTitleBar = hVar.f120428j;
        if (textTitleBar == null) {
            h.f.b.l.a("titleBar");
        }
        return textTitleBar;
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f120432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f120433b;

        static {
            Covode.recordClassIndex(78378);
        }

        f(h hVar, androidx.fragment.app.e eVar) {
            this.f120432a = hVar;
            this.f120433b = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f120432a.u();
            RecFriendsListViewModel.a(this.f120433b);
            this.f120432a.u();
            RecFriendsListViewModel.a("click");
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.ext_power_list.l, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ TuxDualBallView $loadingBallView;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(78382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar, androidx.fragment.app.e eVar, TuxDualBallView tuxDualBallView) {
            super(1);
            this.this$0 = hVar;
            this.$activity = eVar;
            this.$loadingBallView = tuxDualBallView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ext_power_list.l lVar) {
            h.f.b.l.d(lVar, "");
            h.a(this.this$0.u(), new h.f.a.b<com.ss.android.ugc.aweme.relation.viewmodel.b, z>(this) {
                /* class com.ss.android.ugc.aweme.relation.recommend.h.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(78383);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.relation.viewmodel.b bVar) {
                    com.ss.android.ugc.aweme.relation.viewmodel.b bVar2 = bVar;
                    h.f.b.l.d(bVar2, "");
                    List b2 = i.a.b(bVar2);
                    if (b2 == null || b2.isEmpty()) {
                        new com.bytedance.tux.g.b(this.this$0.$activity).a(this.this$0.this$0.z().getToast()).b();
                        com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.relation.recommend.h.j.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f120438a;

                            static {
                                Covode.recordClassIndex(78384);
                            }

                            {
                                this.f120438a = r1;
                            }

                            public final void run() {
                                this.f120438a.this$0.this$0.u();
                                RecFriendsListViewModel.a(this.f120438a.this$0.$activity);
                            }
                        }, 1000);
                    } else {
                        TuxDualBallView tuxDualBallView = this.this$0.$loadingBallView;
                        h.f.b.l.b(tuxDualBallView, "");
                        tuxDualBallView.setVisibility(8);
                        this.this$0.$loadingBallView.c();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(78385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(h hVar, androidx.fragment.app.e eVar) {
            super(1);
            this.this$0 = hVar;
            this.$activity = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            h.f.b.l.d(th, "");
            h.a(this.this$0.u(), new h.f.a.b<com.ss.android.ugc.aweme.relation.viewmodel.b, z>(this) {
                /* class com.ss.android.ugc.aweme.relation.recommend.h.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(78386);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.relation.viewmodel.b bVar) {
                    com.ss.android.ugc.aweme.relation.viewmodel.b bVar2 = bVar;
                    h.f.b.l.d(bVar2, "");
                    List b2 = i.a.b(bVar2);
                    if (b2 == null || b2.isEmpty()) {
                        new com.bytedance.tux.g.b(this.this$0.$activity).a(this.this$0.this$0.z().getToast()).b();
                        com.ss.android.ugc.aweme.base.utils.m.a(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.relation.recommend.h.k.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f120439a;

                            static {
                                Covode.recordClassIndex(78387);
                            }

                            {
                                this.f120439a = r1;
                            }

                            public final void run() {
                                this.f120439a.this$0.this$0.u();
                                RecFriendsListViewModel.a(this.f120439a.this$0.$activity);
                            }
                        }, 1000);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$h  reason: collision with other inner class name */
    static final class View$OnClickListenerC3114h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f120436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f120437b;

        static {
            Covode.recordClassIndex(78380);
        }

        View$OnClickListenerC3114h(h hVar, androidx.fragment.app.e eVar) {
            this.f120436a = hVar;
            this.f120437b = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                String str = this.f120436a.x().f120417b;
                String str2 = "";
                h.f.b.l.d(str, str2);
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "version_update");
                int hashCode = str.hashCode();
                if (hashCode != 49) {
                    if (hashCode != 50) {
                        if (hashCode == 48503 && str.equals("1,2")) {
                            str2 = "facebook&contact";
                        }
                    } else if (str.equals("2")) {
                        str2 = "facebook";
                    }
                } else if (str.equals("1")) {
                    str2 = "contact";
                }
                r.a("confirm_rec_page", a2.a("platform", str2).a("result", "done").f66730a);
                this.f120436a.u();
                RecFriendsListViewModel.a(this.f120437b);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.m, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        MethodCollector.i(11426);
        String str = "";
        h.f.b.l.d(view, str);
        super.b(view);
        androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
        if (b2 == null) {
            MethodCollector.o(11426);
            return;
        }
        if (com.ss.android.ugc.aweme.relation.b.e()) {
            View findViewById = view.findViewById(R.id.dqe);
            h.f.b.l.b(findViewById, str);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            double b3 = (double) n.b(b2);
            Double.isNaN(b3);
            layoutParams.height = (int) (b3 * 0.9d);
        }
        PowerList v = v();
        v.setVisibility(0);
        View inflate = LayoutInflater.from(v.getContext()).inflate(R.layout.a2u, (ViewGroup) null);
        h.f.b.l.b(inflate, str);
        TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.title);
        h.f.b.l.b(tuxTextView, str);
        tuxTextView.setText(z().getTitle());
        TuxTextView tuxTextView2 = (TuxTextView) inflate.findViewById(R.id.dwk);
        h.f.b.l.b(tuxTextView2, str);
        tuxTextView2.setText(z().getSubTitle());
        ((TuxTextView) inflate.findViewById(R.id.title)).a(38.0f);
        v.a(0, inflate);
        v().a(RecommendFriendCell.class);
        ar_();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        v().setLayoutManager(linearLayoutManager);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.a7r);
        h.f.b.l.b(tuxIconView, str);
        tuxIconView.setVisibility(0);
        tuxIconView.setOnClickListener(new f(this, b2));
        View findViewById2 = view.findViewById(R.id.em8);
        h.f.b.l.b(findViewById2, str);
        TextTitleBar textTitleBar = (TextTitleBar) findViewById2;
        this.f120428j = textTitleBar;
        if (textTitleBar == null) {
            h.f.b.l.a("titleBar");
        }
        textTitleBar.setTitle(z().getTitle());
        v().a(new g(this, linearLayoutManager));
        TuxButton tuxButton = (TuxButton) view.findViewById(R.id.ux);
        h.f.b.l.b(tuxButton, str);
        tuxButton.setText(z().getButtonText());
        com.bytedance.ies.dmt.ui.f.c.a(tuxButton, 0.75f);
        tuxButton.setOnClickListener(new View$OnClickListenerC3114h(this, b2));
        TuxDualBallView tuxDualBallView = (TuxDualBallView) view.findViewById(R.id.chl);
        AssemViewModel.a(u(), i.f120440a, null, new k(this, b2), new i(tuxDualBallView), new j(this, b2, tuxDualBallView), 2);
        u().g();
        String str2 = x().f120417b;
        h.f.b.l.d(str2, str);
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "version_update");
        int hashCode = str2.hashCode();
        if (hashCode != 49) {
            if (hashCode != 50) {
                if (hashCode == 48503 && str2.equals("1,2")) {
                    str = "facebook&contact";
                }
            } else if (str2.equals("2")) {
                str = "facebook";
            }
        } else if (str2.equals("1")) {
            str = "contact";
        }
        r.a("show_rec_page", a2.a("platform", str).f66730a);
        com.ss.android.ugc.aweme.relation.b.b.b(2, com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue());
        com.ss.android.ugc.aweme.relation.b.b.b(1, com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue());
        MethodCollector.o(11426);
    }

    public static final class g extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f120434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f120435b;

        static {
            Covode.recordClassIndex(78379);
        }

        g(h hVar, LinearLayoutManager linearLayoutManager) {
            this.f120434a = hVar;
            this.f120435b = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            int k2 = this.f120435b.k();
            if (k2 == 0) {
                if (h.a(this.f120434a).getAlpha() == 1.0f) {
                    h.a(this.f120434a).setAlpha(0.0f);
                }
            } else if (k2 > 0 && h.a(this.f120434a).getAlpha() == 0.0f) {
                h.a(this.f120434a).setAlpha(1.0f);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
