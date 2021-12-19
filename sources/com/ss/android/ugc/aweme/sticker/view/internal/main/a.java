package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.sticker.panel.j;
import com.ss.android.ugc.aweme.sticker.view.a.g;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.view.widget.q;
import f.a.t;
import h.a.n;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;

public abstract class a<TabView> implements g {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.l.c<p<EffectCategoryModel, Integer>> f136269a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.l.b<p<EffectCategoryModel, Integer>> f136270b;

    /* renamed from: c  reason: collision with root package name */
    public final List<EffectCategoryModel> f136271c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final TabLayout f136272d;

    /* renamed from: e  reason: collision with root package name */
    public final e f136273e;

    /* renamed from: f  reason: collision with root package name */
    public final m f136274f;

    /* renamed from: g  reason: collision with root package name */
    public final j f136275g;

    /* renamed from: h  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.view.a.d f136276h;

    /* renamed from: i  reason: collision with root package name */
    public final l.b f136277i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a f136278j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.view.a.b<TabView, ?> f136279k;

    static final class d implements TabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f136283a = new d();

        static {
            Covode.recordClassIndex(89011);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.b
        public final void a(TabLayout.f fVar) {
        }
    }

    static {
        Covode.recordClassIndex(89006);
    }

    /* access modifiers changed from: protected */
    public abstract View a(e eVar, EffectCategoryModel effectCategoryModel, int i2, h.f.a.m<? super EffectCategoryModel, ? super Integer, z> mVar);

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final t<Integer> h() {
        return this.f136276h.h();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.g
    public final t<p<EffectCategoryModel, Integer>> a() {
        t<p<EffectCategoryModel, Integer>> c2 = this.f136269a.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.g
    public final t<p<EffectCategoryModel, Integer>> b() {
        t<p<EffectCategoryModel, Integer>> c2 = this.f136270b.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    public static final class b implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f136280a;

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.a$b$a  reason: collision with other inner class name */
        static final class C3554a implements IUpdateTagListener {

            /* renamed from: a  reason: collision with root package name */
            public static final C3554a f136281a = new C3554a();

            static {
                Covode.recordClassIndex(89009);
            }

            C3554a() {
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
            public final void onFinally() {
            }
        }

        static {
            Covode.recordClassIndex(89008);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void b(TabLayout.f fVar) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void c(TabLayout.f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f136280a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void a(TabLayout.f fVar) {
            h.f.b.l.d(fVar, "");
            com.ss.android.ugc.aweme.sticker.view.internal.pager.b.d.a(fVar, false);
            int i2 = fVar.f130750e;
            EffectCategoryModel effectCategoryModel = this.f136280a.f136271c.get(i2);
            if (effectCategoryModel.getKey() != null && h.f.b.l.a((Object) this.f136280a.f136278j.b().getValue(), (Object) true)) {
                this.f136280a.f136277i.f136209e.a(effectCategoryModel, C3554a.f136281a);
                this.f136280a.f136277i.f136207c.a(effectCategoryModel.getName());
                this.f136280a.f136270b.onNext(v.a(effectCategoryModel, Integer.valueOf(i2)));
            }
        }
    }

    static final class c<T> implements u<List<? extends EffectCategoryModel>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f136282a;

        static {
            Covode.recordClassIndex(89010);
        }

        c(a aVar) {
            this.f136282a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.ugc.aweme.sticker.view.internal.main.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(List<? extends EffectCategoryModel> list) {
            List<? extends EffectCategoryModel> list2 = list;
            if (list2 != null) {
                this.f136282a.a(list2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.c
    public final void a(List<EffectCategoryModel> list) {
        TabLayout.f a2;
        h.f.b.l.d(list, "");
        this.f136276h.a(list);
        this.f136271c.clear();
        this.f136271c.addAll(list);
        h.f.b.l.d(list, "");
        if (this.f136275g.f135223k) {
            q.a(this.f136272d, list.size());
        }
        h.f.b.l.d(list, "");
        boolean z = !h.f.b.l.a((Object) this.f136278j.b().getValue(), (Object) true);
        this.f136272d.b();
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            View a3 = a(this.f136273e, t, i2, new C3553a(this));
            TabLayout tabLayout = this.f136272d;
            tabLayout.a(tabLayout.a().c().a(a3), false);
            i2 = i3;
        }
        if (!z && (a2 = this.f136272d.a(this.f136278j.a())) != null) {
            a2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.d
    public final void a(int i2, boolean z) {
        this.f136276h.a(i2, z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final void b(int i2, boolean z) {
        this.f136276h.b(i2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.a$a  reason: collision with other inner class name */
    public static final /* synthetic */ class C3553a extends h.f.b.j implements h.f.a.m<EffectCategoryModel, Integer, z> {
        static {
            Covode.recordClassIndex(89007);
        }

        C3553a(a aVar) {
            super(2, aVar, a.class, "onTabClicked", "onTabClicked(Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;I)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(EffectCategoryModel effectCategoryModel, Integer num) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            int intValue = num.intValue();
            h.f.b.l.d(effectCategoryModel2, "");
            ((a) this.receiver).a(effectCategoryModel2, intValue);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(EffectCategoryModel effectCategoryModel, int i2) {
        h.f.b.l.d(effectCategoryModel, "");
        this.f136269a.onNext(v.a(effectCategoryModel, Integer.valueOf(i2)));
        a(i2, true);
    }

    public a(TabLayout tabLayout, e eVar, m mVar, j jVar, com.ss.android.ugc.aweme.sticker.view.a.d dVar, l.b bVar, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar, com.ss.android.ugc.aweme.sticker.view.a.b<TabView, ?> bVar2) {
        h.f.b.l.d(tabLayout, "");
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(jVar, "");
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(bVar2, "");
        this.f136272d = tabLayout;
        this.f136273e = eVar;
        this.f136274f = mVar;
        this.f136275g = jVar;
        this.f136276h = dVar;
        this.f136277i = bVar;
        this.f136278j = aVar;
        this.f136279k = bVar2;
        f.a.l.c<p<EffectCategoryModel, Integer>> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.f136269a = cVar;
        f.a.l.b<p<EffectCategoryModel, Integer>> bVar3 = new f.a.l.b<>();
        h.f.b.l.b(bVar3, "");
        this.f136270b = bVar3;
        tabLayout.a(new b(this));
        h.f.b.l.d(dVar, "");
        if (dVar instanceof com.ss.android.ugc.aweme.sticker.view.internal.pager.a) {
            ((com.ss.android.ugc.aweme.sticker.view.internal.pager.a) dVar).a(new TabLayout.g(tabLayout));
        }
        aVar.c().observe(mVar, new c(this));
        tabLayout.setOnTabClickListener(d.f136283a);
        aVar.e();
    }
}
