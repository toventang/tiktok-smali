package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.view.widget.j;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.List;

public class g extends a<com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b> {
    public static final a v = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    private boolean f136448l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f136449m = h.i.a((h.f.a.a) new r(this));
    private final h.h n = h.i.a((h.f.a.a) new h(this));
    private final h.h o = h.i.a((h.f.a.a) new i(this));
    public String q;
    public String r;
    public boolean s;
    public boolean t;
    public int u = -1;

    static {
        Covode.recordClassIndex(89112);
    }

    private final LiveData<com.ss.android.ugc.aweme.sticker.view.a.n> t() {
        return (LiveData) this.f136449m.getValue();
    }

    private final EffectCategoryModel u() {
        return (EffectCategoryModel) this.n.getValue();
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> p() {
        return (com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b) this.o.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89113);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(89121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> invoke() {
            return this.this$0.n();
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<LiveData<com.ss.android.ugc.aweme.sticker.view.a.n>> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(89131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveData<com.ss.android.ugc.aweme.sticker.view.a.n> invoke() {
            return this.this$0.g().f136202e;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public void k() {
        String str = this.r;
        if (str != null) {
            p().a(str);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<EffectCategoryModel> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(89120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EffectCategoryModel invoke() {
            return h.a.n.b((List) com.ss.android.ugc.aweme.sticker.repository.b.a(this.this$0.d().c().j()), this.this$0.f136430e);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public final void j() {
        if (getActivity() != null && m() && i().f136210f.f135209i) {
            q();
        }
    }

    public final void s() {
        com.ss.android.ugc.aweme.sticker.view.a.i iVar;
        if (this.f136429d != null && (iVar = g().f136198a) != null) {
            iVar.a(this.q);
        }
    }

    /* access modifiers changed from: protected */
    public com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b o() {
        return new com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b(d(), f(), p(), i().f136210f, g().f136201d, g().f136199b, g(), this.q, this.f136430e);
    }

    public final void r() {
        com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b bVar;
        List<T> list;
        String str = this.q;
        if (str != null && (bVar = (com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b) this.f136429d) != null && (list = bVar.f136367h) != null && !list.isEmpty()) {
            int k2 = b().k();
            int m2 = b().m();
            com.ss.android.ugc.aweme.sticker.view.a.i iVar = g().f136198a;
            if (iVar != null) {
                iVar.a(k2, m2, str, new j(bVar));
            }
        }
    }

    /* access modifiers changed from: protected */
    public com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b<Effect> n() {
        String str;
        com.ss.android.ugc.aweme.sticker.presenter.o d2 = d();
        com.ss.android.ugc.aweme.sticker.d.d e2 = e();
        com.ss.android.ugc.aweme.sticker.view.internal.g f2 = f();
        StickerStatesStoreViewModel stickerStatesStoreViewModel = (StickerStatesStoreViewModel) ae.a(requireActivity()).a(StickerStatesStoreViewModel.class);
        com.ss.android.ugc.aweme.sticker.repository.a.p e3 = d().c().e();
        EffectCategoryModel u2 = u();
        if (u2 == null || (str = u2.getKey()) == null) {
            str = "";
        }
        return new SharedPoolStickerListViewModel(this, d2, e2, f2, stickerStatesStoreViewModel.a(e3, str));
    }

    public final void q() {
        if ((!i().f136210f.f135209i || this.f136434i) && !this.f136448l) {
            this.f136448l = true;
            d().n().d().observe(this, new l(this));
            p().m().observe(this, new m(this));
            p().l().observe(this, new n(this));
            p().k().observe(this, new o(this));
            p().n().observe(this, new p(this));
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136452a;

        static {
            Covode.recordClassIndex(89115);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(g gVar) {
            this.f136452a = gVar;
        }

        public final void onViewDetachedFromWindow(View view) {
            h.f.b.l.d(view, "");
            this.f136452a.s();
        }

        public final void onViewAttachedToWindow(View view) {
            h.f.b.l.d(view, "");
            if (this.f136452a.getUserVisibleHint()) {
                this.f136452a.r();
            }
        }
    }

    public static final class e implements RecyclerView.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136455a;

        static {
            Covode.recordClassIndex(89117);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public final void b(View view) {
            h.f.b.l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(g gVar) {
            this.f136455a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public final void a(View view) {
            h.f.b.l.d(view, "");
            if (this.f136455a.getUserVisibleHint()) {
                this.f136455a.c(view);
            }
        }
    }

    public static final class q extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136463a;

        /* renamed from: b  reason: collision with root package name */
        private int f136464b;

        static {
            Covode.recordClassIndex(89130);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        q(g gVar) {
            this.f136463a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 0) {
                com.facebook.imagepipeline.e.h c2 = com.facebook.drawee.a.a.c.c();
                h.f.b.l.b(c2, "");
                if (c2.d()) {
                    com.facebook.drawee.a.a.c.c().c();
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    com.facebook.drawee.a.a.c.c().b();
                }
            } else if (this.f136464b == 2) {
                com.facebook.drawee.a.a.c.c().b();
            } else {
                com.facebook.imagepipeline.e.h c3 = com.facebook.drawee.a.a.c.c();
                h.f.b.l.b(c3, "");
                if (c3.d()) {
                    com.facebook.drawee.a.a.c.c().c();
                }
            }
            this.f136464b = i2;
            if (this.f136463a.t) {
                RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).m() - 1 == this.f136463a.f136436k) {
                    g gVar = this.f136463a;
                    gVar.a(gVar.f136436k);
                }
            }
        }
    }

    public static final class s extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136465a;

        static {
            Covode.recordClassIndex(89132);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(g gVar) {
            this.f136465a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 0) {
                com.facebook.imagepipeline.e.h c2 = com.facebook.drawee.a.a.c.c();
                h.f.b.l.b(c2, "");
                if (c2.d()) {
                    com.facebook.drawee.a.a.c.c().c();
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    com.facebook.drawee.a.a.c.c().b();
                }
            } else if (this.f136465a.u == 2) {
                com.facebook.drawee.a.a.c.c().b();
            } else {
                com.facebook.imagepipeline.e.h c3 = com.facebook.drawee.a.a.c.c();
                h.f.b.l.b(c3, "");
                if (c3.d()) {
                    com.facebook.drawee.a.a.c.c().c();
                }
            }
            this.f136465a.u = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<Integer, Effect> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b $adapter;

        static {
            Covode.recordClassIndex(89122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b bVar) {
            super(1);
            this.$adapter = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Effect invoke(Integer num) {
            return this.$adapter.a(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<Integer, Effect> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b $adapter;

        static {
            Covode.recordClassIndex(89123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b bVar) {
            super(1);
            this.$adapter = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Effect invoke(Integer num) {
            return this.$adapter.a(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements u<List<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136460a;

        static {
            Covode.recordClassIndex(89126);
        }

        n(g gVar) {
            this.f136460a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            if (list2 != null) {
                this.f136460a.a(list2);
                this.f136460a.b(3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements u<com.bytedance.jedi.arch.d<? extends Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136462a;

        static {
            Covode.recordClassIndex(89128);
        }

        p(g gVar) {
            this.f136462a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.bytedance.jedi.arch.d<? extends Effect> dVar) {
            com.bytedance.jedi.arch.d<? extends Effect> dVar2 = dVar;
            if (dVar2 != null) {
                dVar2.a(new h.f.a.b<Effect, z>(this) {
                    /* class com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g.p.AnonymousClass1 */
                    final /* synthetic */ p this$0;

                    static {
                        Covode.recordClassIndex(89129);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Effect effect) {
                        h.f.b.l.d(effect, "");
                        j.a.a(this.this$0.f136462a.requireContext(), (int) R.string.blv, 0).a();
                        return z.f158842a;
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            r();
        } else {
            s();
        }
    }

    static final class f<T> implements u<com.ss.android.ugc.aweme.sticker.view.a.n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136456a;

        static {
            Covode.recordClassIndex(89118);
        }

        f(g gVar) {
            this.f136456a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.sticker.view.a.n nVar) {
            com.ss.android.ugc.aweme.sticker.view.a.n nVar2 = nVar;
            if (nVar2 != null && nVar2.ordinal() == com.ss.android.ugc.aweme.sticker.view.a.n.SHOWN.ordinal()) {
                this.f136456a.q();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o<T> implements u<h.u<? extends Effect, ? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136461a;

        static {
            Covode.recordClassIndex(89127);
        }

        o(g gVar) {
            this.f136461a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(h.u<? extends Effect, ? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer> uVar) {
            int a2;
            h.u<? extends Effect, ? extends com.ss.android.ugc.tools.h.a.c, ? extends Integer> uVar2 = uVar;
            if (uVar2 != null) {
                Effect effect = (Effect) uVar2.component1();
                com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b bVar = (com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b) this.f136461a.f136429d;
                if (bVar != 0 && (a2 = bVar.a(effect)) >= 0) {
                    g.a(bVar, a2, effect);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public void a(List<? extends Effect> list) {
        h.f.b.l.d(list, "");
        ADAPTER adapter = this.f136429d;
        if (adapter != null && getActivity() != null && !list.isEmpty()) {
            adapter.f136368i = this.f136430e;
            adapter.a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g$g  reason: collision with other inner class name */
    static final class C3564g<T> implements u<com.ss.android.ugc.aweme.sticker.view.a.n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136457a;

        static {
            Covode.recordClassIndex(89119);
        }

        C3564g(g gVar) {
            this.f136457a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.sticker.view.a.n nVar) {
            ADAPTER adapter;
            List<T> list;
            com.ss.android.ugc.aweme.sticker.view.a.n nVar2 = nVar;
            if (nVar2 != null && nVar2.ordinal() == com.ss.android.ugc.aweme.sticker.view.a.n.SHOWN.ordinal() && (adapter = this.f136457a.f136429d) != null && (list = adapter.f136367h) != null && (!list.isEmpty())) {
                this.f136457a.b(3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements u<com.ss.android.ugc.aweme.sticker.presenter.n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136458a;

        static {
            Covode.recordClassIndex(89124);
        }

        l(g gVar) {
            this.f136458a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.sticker.presenter.n nVar) {
            com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b bVar;
            com.ss.android.ugc.aweme.sticker.presenter.n nVar2 = nVar;
            if (nVar2 != null && (bVar = (com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b) this.f136458a.f136429d) != 0) {
                Effect effect = nVar2.f135422a;
                Effect effect2 = nVar2.f135423b;
                int a2 = bVar.a(effect);
                int a3 = bVar.a(effect2);
                if (a2 >= 0) {
                    g.a(bVar, a2, effect);
                }
                if (a3 >= 0) {
                    g.a(bVar, a3, effect2);
                }
            }
        }
    }

    public final void b(int i2) {
        com.ss.android.ugc.aweme.sticker.view.a.n nVar;
        com.ss.android.ugc.aweme.sticker.view.a.i iVar;
        LiveData<com.ss.android.ugc.aweme.sticker.view.a.n> t2 = t();
        if (t2 != null) {
            nVar = t2.getValue();
        } else {
            nVar = null;
        }
        if (nVar == com.ss.android.ugc.aweme.sticker.view.a.n.SHOWN && getUserVisibleHint() && (iVar = g().f136198a) != null) {
            iVar.a(i2);
        }
    }

    public final void c(View view) {
        com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b bVar;
        List<T> list;
        com.ss.android.ugc.aweme.sticker.view.a.i iVar;
        String str = this.q;
        if (str != null && (bVar = (com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b) this.f136429d) != null && (list = bVar.f136367h) != null && !list.isEmpty()) {
            a();
            int d2 = RecyclerView.d(view);
            if (d2 != 0 && (iVar = g().f136198a) != null) {
                iVar.a(d2, str, new k(bVar));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements u<com.ss.android.ugc.tools.view.widget.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136459a;

        static {
            Covode.recordClassIndex(89125);
        }

        m(g gVar) {
            this.f136459a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.tools.view.widget.b.a aVar) {
            com.ss.android.ugc.tools.view.widget.b.a aVar2 = aVar;
            if (aVar2 != null) {
                int i2 = h.f136466a[aVar2.ordinal()];
                if (i2 == 1) {
                    this.f136459a.c().setState(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                } else if (i2 == 2) {
                    this.f136459a.c().setState(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
                    this.f136459a.b(1);
                } else if (i2 == 3) {
                    this.f136459a.c().setState(com.ss.android.ugc.tools.view.widget.b.a.EMPTY);
                    this.f136459a.b(0);
                } else if (i2 == 4) {
                    this.f136459a.c().setState(com.ss.android.ugc.tools.view.widget.b.a.NONE);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        EffectCategoryModel u2;
        super.onActivityCreated(bundle);
        if (getActivity() != null && m() && (u2 = u()) != null) {
            this.q = u2.getName();
            this.r = u2.getKey();
            com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b bVar = null;
            if (a().getAdapter() == null) {
                a().setItemAnimator(null);
                RecyclerView a2 = a();
                com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b o2 = o();
                this.f136429d = o2;
                a2.setAdapter(o2);
                a().a(new q(this));
            } else {
                RecyclerView.a adapter = a().getAdapter();
                if (adapter instanceof com.ss.android.ugc.aweme.sticker.view.internal.pager.a.b) {
                    bVar = adapter;
                }
                this.f136429d = bVar;
            }
            String str = this.r;
            if (str == null || h.m.p.a((CharSequence) str)) {
                c().setState(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
            } else {
                k();
                if (t() != null) {
                    LiveData<com.ss.android.ugc.aweme.sticker.view.a.n> t2 = t();
                    if (t2 != null) {
                        t2.observe(this, new f(this));
                    }
                } else {
                    q();
                }
                LiveData<com.ss.android.ugc.aweme.sticker.view.a.n> t3 = t();
                if (t3 != null) {
                    t3.observe(this, new C3564g(this));
                }
            }
            e eVar = new e(this);
            a().a(new b(this, eVar));
            a().addOnAttachStateChangeListener(new c(this));
            a().a(new d(this, eVar));
            a().a(eVar);
            this.s = true;
        }
    }

    public static final class b extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f136451b;

        static {
            Covode.recordClassIndex(89114);
        }

        b(g gVar, e eVar) {
            this.f136450a = gVar;
            this.f136451b = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            if (this.f136450a.s) {
                this.f136450a.s = false;
                recyclerView.b(this.f136451b);
            }
            super.a(recyclerView, i2);
        }
    }

    public static final class d implements RecyclerView.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f136453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f136454b;

        static {
            Covode.recordClassIndex(89116);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void a(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void b(RecyclerView recyclerView, MotionEvent motionEvent) {
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(motionEvent, "");
        }

        d(g gVar, e eVar) {
            this.f136453a = gVar;
            this.f136454b = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(motionEvent, "");
            if (this.f136453a.s) {
                this.f136453a.s = false;
                recyclerView.b(this.f136454b);
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a
    public void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        if (getActivity() != null && m()) {
            if (i().f136210f.f135209i) {
                c().setState(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
            }
            if (i().f136210f.f135210j) {
                a().a(new s(this));
            }
        }
    }

    public static void a(RecyclerView.a<?> aVar, int i2, Effect effect) {
        aVar.notifyItemChanged(i2 + 1, effect);
    }
}
