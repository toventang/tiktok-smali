package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.a.m;
import com.ss.android.ugc.aweme.sticker.view.internal.search.e;
import com.ss.android.ugc.aweme.sticker.view.internal.search.p;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerCategoryListViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.view.style.StyleTabLayout;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.p;
import h.z;
import java.util.List;
import java.util.Objects;

public abstract class AbstractStickerView implements au, com.ss.android.ugc.aweme.sticker.view.a.h {
    private com.ss.android.ugc.aweme.sticker.view.internal.d A;
    private final f.a.b.a B;
    private boolean C;
    private long D;
    private final com.ss.android.ugc.aweme.sticker.view.a.k E;
    private final boolean F;
    private final com.ss.android.ugc.aweme.sticker.view.internal.search.a G;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.i f136237a;

    /* renamed from: b  reason: collision with root package name */
    protected View f136238b;

    /* renamed from: c  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.sticker.view.a.g f136239c;

    /* renamed from: d  reason: collision with root package name */
    protected ViewGroup f136240d;

    /* renamed from: e  reason: collision with root package name */
    protected StyleTabLayout f136241e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.view.internal.b f136242f;

    /* renamed from: g  reason: collision with root package name */
    protected ViewGroup f136243g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.view.internal.search.c f136244h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.sticker.view.internal.a f136245i;

    /* renamed from: j  reason: collision with root package name */
    public int f136246j;

    /* renamed from: k  reason: collision with root package name */
    final f.a.l.c<com.ss.android.ugc.aweme.sticker.view.a.m> f136247k;

    /* renamed from: l  reason: collision with root package name */
    public final f.a.l.g<Boolean> f136248l;

    /* renamed from: m  reason: collision with root package name */
    public final f.a.l.c<Integer> f136249m;
    public final androidx.fragment.app.e n;
    public final ViewGroup o;
    public final androidx.lifecycle.m p;
    public final l.b q;
    public final l.a r;
    public final com.ss.android.ugc.aweme.sticker.d.e s;
    public final com.ss.android.ugc.aweme.sticker.panel.j t;
    private final h.h u;
    private ViewGroup v;
    private View w;
    private ViewGroup x;
    private com.ss.android.ugc.aweme.sticker.view.internal.h y;
    private com.ss.android.ugc.aweme.sticker.view.internal.search.b z;

    static {
        Covode.recordClassIndex(88987);
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a a() {
        return (com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a) this.u.getValue();
    }

    /* access modifiers changed from: protected */
    public abstract com.ss.android.ugc.aweme.sticker.view.a.g b(ViewGroup viewGroup);

    @Override // androidx.lifecycle.k
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            destroy$feature_effect_record_release();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final com.ss.android.ugc.aweme.sticker.view.internal.search.c e() {
        return this.f136244h;
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ AbstractStickerView this$0;

        static {
            Covode.recordClassIndex(88996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AbstractStickerView abstractStickerView) {
            super(0);
            this.this$0 = abstractStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.c();
            return z.f158842a;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void destroy$feature_effect_record_release() {
        this.B.a();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final void l() {
        com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar = this.f136244h;
        if (cVar != null) {
            cVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public final StyleTabLayout b() {
        StyleTabLayout styleTabLayout = this.f136241e;
        if (styleTabLayout == null) {
            h.f.b.l.a("tabLayout");
        }
        return styleTabLayout;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final boolean d() {
        com.ss.android.ugc.aweme.sticker.view.internal.h hVar = this.y;
        if (hVar == null) {
            h.f.b.l.a("transitionView");
        }
        return hVar.a();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final t<Integer> h() {
        t<Integer> c2 = this.f136249m.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final t<Boolean> i() {
        t<Boolean> c2 = this.f136248l.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final t<com.ss.android.ugc.aweme.sticker.view.a.n> j() {
        com.ss.android.ugc.aweme.sticker.view.internal.h hVar = this.y;
        if (hVar == null) {
            h.f.b.l.a("transitionView");
        }
        return hVar.f();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final t<com.ss.android.ugc.aweme.sticker.view.a.m> k() {
        t<com.ss.android.ugc.aweme.sticker.view.a.m> c2 = this.f136247k.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ AbstractStickerView this$0;

        static {
            Covode.recordClassIndex(88993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(AbstractStickerView abstractStickerView) {
            super(0);
            this.this$0 = abstractStickerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a().a(new com.ss.android.ugc.aweme.sticker.repository.c.d());
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a $listViewModel;
        final /* synthetic */ AbstractStickerView this$0;

        static {
            Covode.recordClassIndex(89003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(AbstractStickerView abstractStickerView, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar) {
            super(0);
            this.this$0 = abstractStickerView;
            this.$listViewModel = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a invoke() {
            com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar = this.$listViewModel;
            if (aVar == null) {
                return new StickerCategoryListViewModel(this.this$0.p, this.this$0.q.f136205a, this.this$0.q.f136208d);
            }
            return aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final void g() {
        if (this.F) {
            com.ss.android.ugc.aweme.sticker.view.internal.h hVar = this.y;
            if (hVar == null) {
                h.f.b.l.a("transitionView");
            }
            hVar.d();
            return;
        }
        com.ss.android.ugc.aweme.sticker.view.internal.h hVar2 = this.y;
        if (hVar2 == null) {
            h.f.b.l.a("transitionView");
        }
        hVar2.e();
    }

    public final void c() {
        this.f136247k.onNext(m.c.f136213a);
        if (d()) {
            g();
            if (!h.f.b.l.a((Object) a().b().getValue(), (Object) true)) {
                this.q.f136207c.a(System.currentTimeMillis() - this.D, 2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.h
    public final void f() {
        this.D = System.currentTimeMillis();
        this.q.f136205a.a(this.D);
        o();
        if (this.F) {
            com.ss.android.ugc.aweme.sticker.view.internal.h hVar = this.y;
            if (hVar == null) {
                h.f.b.l.a("transitionView");
            }
            hVar.b();
            return;
        }
        com.ss.android.ugc.aweme.sticker.view.internal.h hVar2 = this.y;
        if (hVar2 == null) {
            h.f.b.l.a("transitionView");
        }
        hVar2.c();
    }

    /* access modifiers changed from: package-private */
    public final int m() {
        int i2 = 0;
        for (T t2 : com.ss.android.ugc.aweme.sticker.repository.b.a(this.q.f136205a.c().j())) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.n.a();
            }
            if (h.f.b.l.a((Object) t2.getKey(), (Object) "sticker_category:search")) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }

    public final void n() {
        com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar = this.f136244h;
        if (cVar != null && !cVar.h()) {
            com.ss.android.ugc.aweme.sticker.view.internal.a aVar = this.f136245i;
            if (aVar == null) {
                h.f.b.l.a("stickerBarViewController");
            }
            aVar.a(false);
        }
        com.ss.android.ugc.aweme.sticker.view.a.g gVar = this.f136239c;
        if (gVar == null) {
            h.f.b.l.a("tabListView");
        }
        gVar.a(2, true);
    }

    private void o() {
        t<p<Integer, Integer>> tVar;
        if (this.f136239c == null) {
            ViewGroup viewGroup = this.v;
            if (viewGroup == null) {
                h.f.b.l.a("content");
            }
            a(viewGroup);
            ViewGroup viewGroup2 = this.v;
            if (viewGroup2 == null) {
                h.f.b.l.a("content");
            }
            com.ss.android.ugc.aweme.sticker.view.a.g b2 = b(viewGroup2);
            f.a.b.b a2 = b2.b().a(new a(this), f.a.e.b.a.f157192e);
            h.f.b.l.b(a2, "");
            a(a2);
            f.a.b.b a3 = b2.a().a(new b(this), f.a.e.b.a.f157192e);
            h.f.b.l.b(a3, "");
            a(a3);
            f.a.b.b a4 = b2.h().a(new c(this), com.ss.android.ugc.tools.utils.p.f150012a);
            h.f.b.l.b(a4, "");
            a(a4);
            this.f136239c = b2;
            ViewGroup viewGroup3 = this.v;
            if (viewGroup3 == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup3, "");
            View findViewById = viewGroup3.findViewById(R.id.ebu);
            h.f.b.l.b(findViewById, "");
            new j(findViewById).a(new h(this));
            ViewGroup viewGroup4 = this.v;
            if (viewGroup4 == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup4, "");
            com.ss.android.ugc.aweme.sticker.view.a.k kVar = this.E;
            ViewGroup viewGroup5 = this.f136240d;
            if (viewGroup5 == null) {
                h.f.b.l.a("tabBarLayout");
            }
            kVar.a(viewGroup5).a(new d(this));
            com.ss.android.ugc.aweme.sticker.panel.e eVar = this.t.f135215c;
            if (eVar != null) {
                boolean j2 = com.ss.android.ugc.aweme.sticker.p.g.j(this.q.f136205a.f());
                ViewGroup viewGroup6 = this.v;
                if (viewGroup6 == null) {
                    h.f.b.l.a("content");
                }
                h.f.b.l.d(viewGroup6, "");
                h.f.b.l.d(eVar, "");
                View findViewById2 = viewGroup6.findViewById(R.id.c54);
                h.f.b.l.b(findViewById2, "");
                this.f136242f = new g((ViewGroup) findViewById2, eVar, j2);
            }
            if (p.a.a(this.t.f135219g)) {
                ViewGroup viewGroup7 = this.v;
                if (viewGroup7 == null) {
                    h.f.b.l.a("content");
                }
                int i2 = this.t.f135219g;
                h.f.b.l.d(viewGroup7, "");
                View findViewById3 = viewGroup7.findViewById(R.id.c8m);
                h.f.b.l.b(findViewById3, "");
                View view = this.f136238b;
                if (view == null) {
                    h.f.b.l.a("stickerView");
                }
                ViewGroup viewGroup8 = this.f136243g;
                if (viewGroup8 == null) {
                    h.f.b.l.a("stickerViewContainer");
                }
                com.ss.android.ugc.aweme.sticker.view.internal.search.p pVar = new com.ss.android.ugc.aweme.sticker.view.internal.search.p(findViewById3, view, viewGroup8, i2);
                androidx.fragment.app.e eVar2 = this.n;
                ViewGroup viewGroup9 = this.v;
                if (viewGroup9 == null) {
                    h.f.b.l.a("content");
                }
                com.ss.android.ugc.aweme.sticker.view.internal.search.c a5 = pVar.a(eVar2, viewGroup9, this.q, this.r, this.G, this.t);
                pVar.a(a5.a());
                f.a.b.b d2 = a5.d().d(new i(pVar, this));
                h.f.b.l.b(d2, "");
                a(d2);
                f.a.b.b d3 = a5.e().d(new j(pVar, this));
                h.f.b.l.b(d3, "");
                a(d3);
                f.a.b.b d4 = j().d(new k(a5, pVar, this));
                h.f.b.l.b(d4, "");
                a(d4);
                this.f136244h = a5;
                this.z = pVar;
                int m2 = m();
                if (m2 >= 0 && (tVar = this.r.f136204g) != null) {
                    f.a.b.b d5 = tVar.d(new l(m2, this));
                    h.f.b.l.b(d5, "");
                    a(d5);
                }
                this.G.h().observe(this.p, new m(this));
            }
            ViewGroup viewGroup10 = this.v;
            if (viewGroup10 == null) {
                h.f.b.l.a("content");
            }
            h.f.b.l.d(viewGroup10, "");
            FrameLayout frameLayout = (FrameLayout) viewGroup10.findViewById(R.id.c9a);
            h.f.b.l.b(frameLayout, "");
            i iVar = new i(frameLayout, this.t.f135224l.f135111a);
            a().d().observe(this.p, new f(iVar));
            iVar.a(new e(this));
            this.A = iVar;
            if (!this.C) {
                this.C = true;
                f.a.l.c<com.ss.android.ugc.aweme.sticker.view.a.m> cVar = this.f136247k;
                ViewGroup viewGroup11 = this.v;
                if (viewGroup11 == null) {
                    h.f.b.l.a("content");
                }
                cVar.onNext(new m.f(viewGroup11));
            }
            a().b().observe(this.p, new g(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136253a;

        static {
            Covode.recordClassIndex(88991);
        }

        c(AbstractStickerView abstractStickerView) {
            this.f136253a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Integer num) {
            this.f136253a.f136249m.onNext(num);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136266a;

        static {
            Covode.recordClassIndex(89001);
        }

        m(AbstractStickerView abstractStickerView) {
            this.f136266a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar = this.f136266a.f136244h;
            if (cVar != null) {
                cVar.a(false);
            }
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.a a(AbstractStickerView abstractStickerView) {
        com.ss.android.ugc.aweme.sticker.view.internal.a aVar = abstractStickerView.f136245i;
        if (aVar == null) {
            h.f.b.l.a("stickerBarViewController");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements u<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136256a;

        static {
            Covode.recordClassIndex(88995);
        }

        g(AbstractStickerView abstractStickerView) {
            this.f136256a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                AbstractStickerView abstractStickerView = this.f136256a;
                if (bool2.booleanValue()) {
                    abstractStickerView.f136247k.onNext(m.b.f136212a);
                }
            }
        }
    }

    private f.a.b.b a(f.a.b.b bVar) {
        h.f.b.l.d(bVar, "");
        this.B.a(bVar);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f.a.d.f<h.p<? extends EffectCategoryModel, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136251a;

        static {
            Covode.recordClassIndex(88989);
        }

        a(AbstractStickerView abstractStickerView) {
            this.f136251a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h.p<? extends EffectCategoryModel, ? extends Integer> pVar) {
            h.p<? extends EffectCategoryModel, ? extends Integer> pVar2 = pVar;
            AbstractStickerView abstractStickerView = this.f136251a;
            h.f.b.l.b(pVar2, "");
            abstractStickerView.f136247k.onNext(new m.d((EffectCategoryModel) pVar2.getFirst(), ((Number) pVar2.getSecond()).intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f<h.p<? extends EffectCategoryModel, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136252a;

        static {
            Covode.recordClassIndex(88990);
        }

        b(AbstractStickerView abstractStickerView) {
            this.f136252a = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h.p<? extends EffectCategoryModel, ? extends Integer> pVar) {
            h.p<? extends EffectCategoryModel, ? extends Integer> pVar2 = pVar;
            AbstractStickerView abstractStickerView = this.f136252a;
            h.f.b.l.b(pVar2, "");
            abstractStickerView.f136247k.onNext(new m.e((EffectCategoryModel) pVar2.getFirst(), ((Number) pVar2.getSecond()).intValue()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136254a;

        static {
            Covode.recordClassIndex(88992);
        }

        d(AbstractStickerView abstractStickerView) {
            this.f136254a = abstractStickerView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractStickerView abstractStickerView = this.f136254a;
            l.b bVar = abstractStickerView.q;
            bVar.f136207c.a("none");
            bVar.f136205a.n().a((com.ss.android.ugc.aweme.sticker.presenter.b) null);
            bVar.f136206b.a(com.ss.android.ugc.aweme.sticker.f.a.a(com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK));
            abstractStickerView.f136247k.onNext(m.a.f136211a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements u<com.ss.android.ugc.tools.view.widget.b.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.d f136255a;

        static {
            Covode.recordClassIndex(88994);
        }

        f(com.ss.android.ugc.aweme.sticker.view.internal.d dVar) {
            this.f136255a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.tools.view.widget.b.a aVar) {
            com.ss.android.ugc.tools.view.widget.b.a aVar2 = aVar;
            if (aVar2 != null) {
                int i2 = b.f136285b[aVar2.ordinal()];
                if (i2 == 1) {
                    this.f136255a.a(true);
                } else if (i2 == 2 || i2 == 3) {
                    this.f136255a.a(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f<com.ss.android.ugc.aweme.sticker.view.internal.search.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.b f136259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136260b;

        static {
            Covode.recordClassIndex(88998);
        }

        j(com.ss.android.ugc.aweme.sticker.view.internal.search.b bVar, AbstractStickerView abstractStickerView) {
            this.f136259a = bVar;
            this.f136260b = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.sticker.view.internal.search.e eVar) {
            com.ss.android.ugc.aweme.sticker.view.internal.search.e eVar2 = eVar;
            if (eVar2 instanceof e.c) {
                AbstractStickerView.a(this.f136260b).a(false);
            } else if (eVar2 instanceof e.b) {
                this.f136260b.a(((e.b) eVar2).f136526a);
            } else if (eVar2 instanceof e.a) {
                this.f136260b.n();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f<com.ss.android.ugc.aweme.sticker.view.internal.search.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.b f136257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136258b;

        static {
            Covode.recordClassIndex(88997);
        }

        i(com.ss.android.ugc.aweme.sticker.view.internal.search.b bVar, AbstractStickerView abstractStickerView) {
            this.f136257a = bVar;
            this.f136258b = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.sticker.view.internal.search.g gVar) {
            com.ss.android.ugc.aweme.sticker.view.internal.search.g gVar2 = gVar;
            if (gVar2.f136541a) {
                AbstractStickerView.a(this.f136258b).a(true);
                this.f136257a.a(gVar2.f136544d);
            } else {
                if (gVar2.f136542b || (this.f136258b.t.f135219g == 2 && gVar2.f136543c)) {
                    AbstractStickerView.a(this.f136258b).a(false);
                }
                this.f136257a.a(gVar2.f136543c);
            }
            this.f136258b.f136248l.onNext(Boolean.valueOf(gVar2.f136541a));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f<com.ss.android.ugc.aweme.sticker.view.a.n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.c f136261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.internal.search.b f136262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136263c;

        static {
            Covode.recordClassIndex(88999);
        }

        k(com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar, com.ss.android.ugc.aweme.sticker.view.internal.search.b bVar, AbstractStickerView abstractStickerView) {
            this.f136261a = cVar;
            this.f136262b = bVar;
            this.f136263c = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.sticker.view.a.n nVar) {
            View a2;
            if (nVar == com.ss.android.ugc.aweme.sticker.view.a.n.PRE_HIDE) {
                this.f136261a.c();
            } else if (nVar == com.ss.android.ugc.aweme.sticker.view.a.n.SHOWN) {
                com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar = this.f136263c.f136244h;
                if ((cVar != null && !cVar.a((Effect) null)) || this.f136262b.a()) {
                    AbstractStickerView abstractStickerView = this.f136263c;
                    if (p.a.a(abstractStickerView.t.f135219g)) {
                        if (abstractStickerView.t.f135219g != 1) {
                            com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar2 = abstractStickerView.f136244h;
                            if (cVar2 == null || (a2 = cVar2.a()) == null || a2.getVisibility() != 0) {
                                return;
                            }
                        } else if (abstractStickerView.m() != abstractStickerView.f136246j) {
                            return;
                        }
                        AbstractStickerView.a(this.f136263c).a(true);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f<h.p<? extends Integer, ? extends Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f136264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136265b;

        static {
            Covode.recordClassIndex(89000);
        }

        l(int i2, AbstractStickerView abstractStickerView) {
            this.f136264a = i2;
            this.f136265b = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h.p<? extends Integer, ? extends Integer> pVar) {
            h.p<? extends Integer, ? extends Integer> pVar2 = pVar;
            this.f136265b.f136246j = ((Number) pVar2.getSecond()).intValue();
            if (((Number) pVar2.getFirst()).intValue() == this.f136264a) {
                com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar = this.f136265b.f136244h;
                if (cVar != null && !cVar.h()) {
                    AbstractStickerView.a(this.f136265b).a(false);
                }
            } else if (((Number) pVar2.getSecond()).intValue() == this.f136264a) {
                com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar2 = this.f136265b.f136244h;
                if (cVar2 != null) {
                    cVar2.i();
                }
                com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar3 = this.f136265b.f136244h;
                if (cVar3 == null || cVar3.a((Effect) null)) {
                    AbstractStickerView.a(this.f136265b).a(false);
                } else {
                    AbstractStickerView.a(this.f136265b).a(true);
                }
            }
        }
    }

    static final class n<T> implements f.a.d.f<com.ss.android.ugc.aweme.sticker.view.a.n> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.t f136267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AbstractStickerView f136268b;

        static {
            Covode.recordClassIndex(89002);
        }

        n(androidx.lifecycle.t tVar, AbstractStickerView abstractStickerView) {
            this.f136267a = tVar;
            this.f136268b = abstractStickerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: androidx.lifecycle.t */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.sticker.view.a.n nVar) {
            com.ss.android.ugc.aweme.sticker.view.a.n nVar2 = nVar;
            this.f136267a.setValue(nVar2);
            if (nVar2 != null) {
                int i2 = b.f136284a[nVar2.ordinal()];
                if (i2 == 1) {
                    this.f136268b.q.f136207c.a().c("tool_performance_open_choose_sticker", "end_sticker_anim");
                    com.ss.android.ugc.aweme.sticker.view.internal.search.c cVar = this.f136268b.f136244h;
                    if (cVar != null) {
                        cVar.g();
                    }
                } else if (i2 == 2) {
                    this.f136268b.q.f136207c.a().b("tool_performance_open_choose_sticker", "start_sticker_anim");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.c8w);
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.air, frameLayout, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        this.f136240d = viewGroup2;
        if (viewGroup2 == null) {
            h.f.b.l.a("tabBarLayout");
        }
        frameLayout.addView(viewGroup2);
        com.ss.android.ugc.aweme.sticker.view.a.k kVar = this.E;
        ViewGroup viewGroup3 = this.f136240d;
        if (viewGroup3 == null) {
            h.f.b.l.a("tabBarLayout");
        }
        this.f136241e = kVar.b(viewGroup3);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.f
    public final void a(com.ss.android.ugc.aweme.sticker.panel.c cVar) {
        h.f.b.l.d(cVar, "");
        com.ss.android.ugc.aweme.sticker.view.internal.a aVar = this.f136245i;
        if (aVar == null) {
            h.f.b.l.a("stickerBarViewController");
        }
        aVar.a(cVar);
    }

    public final void a(Effect effect) {
        List<Effect> effects;
        com.ss.android.ugc.aweme.sticker.presenter.o oVar = this.q.f136205a;
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(effect, "");
        List<EffectCategoryModel> a2 = com.ss.android.ugc.aweme.sticker.repository.b.a(oVar.c().j());
        int a3 = com.ss.android.ugc.aweme.sticker.f.c.a(oVar);
        if (a2.size() > a3) {
            CategoryEffectModel a4 = com.ss.android.ugc.aweme.sticker.repository.b.a(oVar.c().j(), a2.get(a3).getKey());
            if (a4 == null || (effects = a4.getEffects()) == null || effects.isEmpty() || !TextUtils.equals(effect.getEffectId(), effects.get(0).getEffectId())) {
                oVar.a(a3, h.a.n.a(effect));
                if (a3 > 0) {
                    com.ss.android.ugc.aweme.sticker.view.a.g gVar = this.f136239c;
                    if (gVar == null) {
                        h.f.b.l.a("tabListView");
                    }
                    gVar.a(a3, true);
                    com.ss.android.ugc.aweme.sticker.view.a.g gVar2 = this.f136239c;
                    if (gVar2 == null) {
                        h.f.b.l.a("tabListView");
                    }
                    gVar2.b(0, true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.c
    public final void a(List<EffectCategoryModel> list) {
        h.f.b.l.d(list, "");
        o();
        com.ss.android.ugc.aweme.sticker.view.a.g gVar = this.f136239c;
        if (gVar == null) {
            h.f.b.l.a("tabListView");
        }
        gVar.a(list);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final void b(int i2, boolean z2) {
        o();
        com.ss.android.ugc.aweme.sticker.view.a.g gVar = this.f136239c;
        if (gVar == null) {
            h.f.b.l.a("tabListView");
        }
        gVar.b(i2, z2);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.d
    public final void a(int i2, boolean z2) {
        o();
        com.ss.android.ugc.aweme.sticker.view.a.g gVar = this.f136239c;
        if (gVar == null) {
            h.f.b.l.a("tabListView");
        }
        gVar.a(i2, z2);
    }

    public AbstractStickerView(androidx.fragment.app.e eVar, ViewGroup viewGroup, androidx.lifecycle.m mVar, l.b bVar, l.a aVar, com.ss.android.ugc.aweme.sticker.d.e eVar2, com.ss.android.ugc.aweme.sticker.panel.j jVar, com.ss.android.ugc.aweme.sticker.view.a.k kVar, androidx.fragment.app.i iVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar2, boolean z2, com.ss.android.ugc.aweme.sticker.view.internal.search.a aVar3) {
        androidx.fragment.app.i iVar2 = iVar;
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(eVar2, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(aVar3, "");
        this.n = eVar;
        this.o = viewGroup;
        this.p = mVar;
        this.q = bVar;
        this.r = aVar;
        this.s = eVar2;
        this.t = jVar;
        this.E = kVar;
        this.F = z2;
        this.G = aVar3;
        if (iVar2 == null) {
            if (mVar instanceof Fragment) {
                iVar2 = ((Fragment) mVar).getChildFragmentManager();
            } else {
                iVar2 = eVar.getSupportFragmentManager();
            }
            h.f.b.l.b(iVar2, "");
        }
        this.f136237a = iVar2;
        this.u = h.i.a((h.f.a.a) new o(this, aVar2));
        this.f136246j = -999;
        this.B = new f.a.b.a();
        f.a.l.c<com.ss.android.ugc.aweme.sticker.view.a.m> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.f136247k = cVar;
        f.a.l.c cVar2 = new f.a.l.c();
        h.f.b.l.b(cVar2, "");
        this.f136248l = cVar2;
        f.a.l.c<Integer> cVar3 = new f.a.l.c<>();
        h.f.b.l.b(cVar3, "");
        this.f136249m = cVar3;
        mVar.getLifecycle().a(this);
        bVar.f136206b.a(new com.ss.android.ugc.aweme.sticker.d.e(this) {
            /* class com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AbstractStickerView f136250a;

            static {
                Covode.recordClassIndex(88988);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f136250a = r1;
            }

            @Override // com.ss.android.ugc.aweme.sticker.d.e
            public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
                h.f.b.l.d(aVar, "");
                com.ss.android.ugc.aweme.sticker.view.internal.b bVar = this.f136250a.f136242f;
                if (bVar != null) {
                    bVar.a(com.ss.android.ugc.aweme.sticker.p.g.j(aVar.f135378a));
                }
                this.f136250a.s.a(aVar);
            }

            @Override // com.ss.android.ugc.aweme.sticker.d.e
            public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.d dVar) {
                h.f.b.l.d(dVar, "");
                com.ss.android.ugc.aweme.sticker.view.internal.b bVar = this.f136250a.f136242f;
                if (bVar != null) {
                    bVar.a(true);
                }
                this.f136250a.s.a(dVar);
            }
        });
        this.f136245i = new f();
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b3u, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        this.v = viewGroup2;
        if (viewGroup2 == null) {
            h.f.b.l.a("content");
        }
        h.f.b.l.d(viewGroup2, "");
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.eae);
        viewGroup3.removeAllViews();
        Objects.requireNonNull(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ais, viewGroup3, true), "null cannot be cast to non-null type android.view.ViewGroup");
        h.f.b.l.b(viewGroup3, "");
        this.x = viewGroup3;
        ViewGroup viewGroup4 = this.v;
        if (viewGroup4 == null) {
            h.f.b.l.a("content");
        }
        h.f.b.l.d(viewGroup4, "");
        View findViewById = viewGroup4.findViewById(R.id.c8q);
        h.f.b.l.b(findViewById, "");
        this.f136238b = findViewById;
        ViewGroup viewGroup5 = this.v;
        if (viewGroup5 == null) {
            h.f.b.l.a("content");
        }
        View findViewById2 = viewGroup5.findViewById(R.id.c8r);
        h.f.b.l.b(findViewById2, "");
        this.f136243g = (ViewGroup) findViewById2;
        ViewGroup viewGroup6 = this.v;
        if (viewGroup6 == null) {
            h.f.b.l.a("content");
        }
        h.f.b.l.d(viewGroup6, "");
        View findViewById3 = viewGroup6.findViewById(R.id.a1o);
        h.f.b.l.b(findViewById3, "");
        this.w = findViewById3;
        ViewGroup viewGroup7 = this.v;
        if (viewGroup7 == null) {
            h.f.b.l.a("content");
        }
        h.f.b.l.d(viewGroup7, "");
        ViewGroup viewGroup8 = this.x;
        if (viewGroup8 == null) {
            h.f.b.l.a("bottomSheet");
        }
        this.y = new n(viewGroup, viewGroup7, viewGroup8, jVar.f135222j, jVar.f135224l.f135114d, (byte) 0);
        androidx.lifecycle.t tVar = new androidx.lifecycle.t();
        f.a.b.b d2 = j().d(new n(tVar, this));
        h.f.b.l.b(d2, "");
        a(d2);
        aVar.f136202e = tVar;
        h.f.b.l.d(jVar, "");
        ViewGroup viewGroup9 = this.v;
        if (viewGroup9 == null) {
            h.f.b.l.a("content");
        }
        View findViewById4 = viewGroup9.findViewById(R.id.ehz);
        h.f.b.l.b(findViewById4, "");
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) findViewById4).getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (jVar.f135216d > 0) {
            marginLayoutParams.topMargin = jVar.f135216d;
        }
        int i2 = marginLayoutParams.topMargin;
        ViewGroup viewGroup10 = this.v;
        if (viewGroup10 == null) {
            h.f.b.l.a("content");
        }
        marginLayoutParams.topMargin = i2 + dh.c(viewGroup10.getContext());
        ViewGroup viewGroup11 = this.v;
        if (viewGroup11 == null) {
            h.f.b.l.a("content");
        }
        View findViewById5 = viewGroup11.findViewById(R.id.c8p);
        if (!(findViewById5 == null || jVar.f135213a == 0)) {
            findViewById5.setBackground(eVar.getResources().getDrawable(jVar.f135213a));
        }
        if (jVar.f135214b != 0) {
            ViewGroup viewGroup12 = this.f136243g;
            if (viewGroup12 == null) {
                h.f.b.l.a("stickerViewContainer");
            }
            viewGroup12.setBackground(eVar.getResources().getDrawable(jVar.f135214b));
        }
    }
}
