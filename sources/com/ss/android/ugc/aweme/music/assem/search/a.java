package com.ss.android.ugc.aweme.music.assem.search;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.b;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.music.assem.list.s;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.search.SearchMusicActivity;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.Objects;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public final int f111267j = 5;

    /* renamed from: k  reason: collision with root package name */
    public boolean f111268k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f111269l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f111270m = new com.bytedance.assem.arch.extensions.i(bQ_(), new e(this, null));
    private final com.bytedance.assem.arch.viewModel.b n;
    private final com.bytedance.assem.arch.viewModel.b o;

    public static final class b extends m implements h.f.a.b<s, s> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(71491);
        }

        public b() {
            super(1);
        }

        public final s invoke(s sVar) {
            l.c(sVar, "");
            return sVar;
        }
    }

    public static final class d extends m implements h.f.a.b<d, d> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(71493);
        }

        public d() {
            super(1);
        }

        public final d invoke(d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(71489);
    }

    public final OriginMusicArg u() {
        return (OriginMusicArg) this.f111270m.getValue();
    }

    public final OriginMusicListViewModel v() {
        return (OriginMusicListViewModel) this.n.getValue();
    }

    public final MusicSearchViewModel w() {
        return (MusicSearchViewModel) this.o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$a  reason: collision with other inner class name */
    public static final class C2849a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2849a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(71492);
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

    public static final class e extends m implements h.f.a.a<OriginMusicArg> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(71494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.assem.arch.core.a aVar, String str) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.assem.search.a.e.invoke():java.lang.Object");
        }
    }

    static final class f extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(71495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((androidx.fragment.app.e) ar_);
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    static final class g extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(71496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            Context ar_ = this.this$0.ar_();
            Objects.requireNonNull(ar_, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ad.b a2 = dagger.hilt.android.internal.b.a.a((androidx.fragment.app.e) ar_);
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    public final void x() {
        String str;
        if (this.f111269l && this.f111268k) {
            MusicSearchViewModel w = w();
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage");
            com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(w, ab.a(com.ss.android.ugc.aweme.music.assem.h.class));
            if (bVar != null) {
                str = bVar.f111133a;
            } else {
                str = null;
            }
            r.a("homepage_music_search_show", a2.a("user_id", str).f66730a);
            this.f111269l = false;
        }
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        com.bytedance.assem.arch.viewModel.b bVar2;
        i.d dVar = i.d.f25721a;
        f fVar = new f(this);
        h.k.c a2 = ab.a(OriginMusicListViewModel.class);
        C2849a aVar = new C2849a(a2);
        b bVar3 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), fVar, bVar3, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), fVar, bVar3, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), fVar, bVar3, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.n = bVar;
        i.d dVar2 = i.d.f25721a;
        g gVar = new g(this);
        h.k.c a3 = ab.a(MusicSearchViewModel.class);
        c cVar = new c(a3);
        d dVar3 = d.INSTANCE;
        if (l.a(dVar2, i.a.f25718a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), gVar, dVar3, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar2, i.d.f25721a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), gVar, dVar3, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar2 == null || l.a(dVar2, i.b.f25719a)) {
            bVar2 = new com.bytedance.assem.arch.viewModel.b(a3, cVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), gVar, dVar3, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.o = bVar2;
    }

    static final class j extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(71500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                this.this$0.f111268k = t.booleanValue();
                this.this$0.x();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        ((LinearLayout) view.findViewById(R.id.cgi)).setOnClickListener(new h(this));
        f.a.a(this, v(), b.f111272a, com.bytedance.assem.arch.viewModel.l.a(), new i(this, view), 4);
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.music.assem.h.class), c.f111273a, new j(this));
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f111271a;

        static {
            Covode.recordClassIndex(71497);
        }

        h(a aVar) {
            this.f111271a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) this.f111271a);
            if (a2 != null && a2.getContext() != null) {
                Intent intent = new Intent(a2.getContext(), SearchMusicActivity.class);
                intent.putExtra("is_me", this.f111271a.u().isMe());
                intent.putExtra("user_id", this.f111271a.u().getUserId());
                intent.putExtra("sec_user_id", this.f111271a.u().getSecUserID());
                intent.putExtra("previous_page", this.f111271a.u().getPreviousPage());
                intent.putExtra("pinned_music_list", this.f111271a.v().f111154k);
                a aVar = this.f111271a;
                C2850a aVar2 = new C2850a(this);
                l.c(aVar, "");
                l.c(aVar, "");
                l.c(intent, "");
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(aVar);
                if (b2 != null) {
                    l.c(b2, "");
                    Fragment a3 = b2.getSupportFragmentManager().a("AssemContainerBridge");
                    if (!(a3 instanceof com.bytedance.assem.arch.core.b)) {
                        a3 = null;
                    }
                    com.bytedance.assem.arch.core.b bVar = (com.bytedance.assem.arch.core.b) a3;
                    if (bVar == null) {
                        bVar = new com.bytedance.assem.arch.core.b();
                        n a4 = b2.getSupportFragmentManager().a();
                        a4.a(bVar, "AssemContainerBridge");
                        a4.c();
                    }
                    if (bVar.isAdded()) {
                        bVar.a(aVar, intent, 1, null, aVar2);
                    } else {
                        bVar.f25553c.add(new b.a(b2, aVar, bVar, intent, aVar2));
                    }
                }
                this.f111271a.w();
                r.a("enter_search", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "personal_homepage").f66730a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.music.assem.search.a$h$a  reason: collision with other inner class name */
        static final class C2850a extends m implements q<Integer, Integer, Intent, z> {
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(71498);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2850a(h hVar) {
                super(3);
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(Integer num, Integer num2, Intent intent) {
                Serializable serializable;
                num.intValue();
                Intent intent2 = intent;
                if (num2.intValue() == -1) {
                    if (intent2 == null || (serializable = intent2.getSerializableExtra("pinned_music_list")) == null) {
                        serializable = new PinnedMusicList();
                    }
                    Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.music.model.PinnedMusicList");
                    this.this$0.f111271a.v().a((PinnedMusicList) serializable);
                }
                return z.f158842a;
            }
        }
    }

    static final class i extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {
        final /* synthetic */ View $view;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(71499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, View view) {
            super(2);
            this.this$0 = aVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2 = aVar;
            l.d(pVar, "");
            l.d(aVar2, "");
            com.ss.android.ugc.aweme.music.assem.b bVar = (com.ss.android.ugc.aweme.music.assem.b) com.bytedance.assem.arch.service.d.a(this.this$0.w(), ab.a(com.ss.android.ugc.aweme.music.assem.h.class));
            if (bVar != null && bVar.f111137e) {
                if (aVar2.f25631b.intValue() >= this.this$0.f111267j) {
                    LinearLayout linearLayout = (LinearLayout) this.$view.findViewById(R.id.cgi);
                    l.b(linearLayout, "");
                    linearLayout.setVisibility(0);
                    this.this$0.f111269l = true;
                    this.this$0.x();
                } else {
                    this.this$0.f111269l = false;
                    LinearLayout linearLayout2 = (LinearLayout) this.$view.findViewById(R.id.cgi);
                    l.b(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                }
            }
            return z.f158842a;
        }
    }
}
