package com.ss.android.ugc.aweme.sticker.view.internal.pager;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.d;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import f.a.d.f;
import f.a.t;
import h.h;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, d<Fragment>> f136383a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final List<EffectCategoryModel> f136384b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f136385c;

    /* renamed from: d  reason: collision with root package name */
    final f.a.l.c<Integer> f136386d;

    /* renamed from: e  reason: collision with root package name */
    public final f.a.l.c<p<Integer, Integer>> f136387e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f136388f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a f136389g;

    /* renamed from: h  reason: collision with root package name */
    public final l.a f136390h;

    /* renamed from: i  reason: collision with root package name */
    private final h f136391i;

    static {
        Covode.recordClassIndex(89074);
    }

    public final a a() {
        return (a) this.f136391i.getValue();
    }

    public final class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final l.a f136392a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<Integer, d<Fragment>> f136393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f136394c;

        /* renamed from: d  reason: collision with root package name */
        private final RecyclerView.RecycledViewPool f136395d = new RecyclerView.RecycledViewPool();

        /* renamed from: e  reason: collision with root package name */
        private final Map<Integer, f.a.b.b> f136396e = new LinkedHashMap();

        /* renamed from: f  reason: collision with root package name */
        private final l.b f136397f;

        /* renamed from: g  reason: collision with root package name */
        private final List<EffectCategoryModel> f136398g;

        /* renamed from: h  reason: collision with root package name */
        private final com.ss.android.ugc.aweme.sticker.view.a.b<?, Fragment> f136399h;

        static {
            Covode.recordClassIndex(89075);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            h.f.b.l.d(obj, "");
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f136398g.size();
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b$a$a  reason: collision with other inner class name */
        static final class C3557a<T> implements f<Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f136400a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f136401b;

            static {
                Covode.recordClassIndex(89076);
            }

            C3557a(a aVar, int i2) {
                this.f136400a = aVar;
                this.f136401b = i2;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.d.f
            public final /* synthetic */ void accept(Integer num) {
                Integer num2 = num;
                b bVar = this.f136400a.f136394c;
                h.f.b.l.b(num2, "");
                bVar.f136386d.onNext(Integer.valueOf(num2.intValue()));
            }
        }

        @Override // androidx.fragment.app.m
        public final Fragment a(int i2) {
            d<Fragment> a2 = this.f136399h.a(this.f136398g.get(i2).getKey()).a(i2, this.f136397f, this.f136392a, this.f136395d);
            this.f136393b.put(Integer.valueOf(i2), a2);
            f.a.b.b a3 = a2.h().a(new C3557a(this, i2), com.ss.android.ugc.tools.utils.p.f150012a);
            Map<Integer, f.a.b.b> map = this.f136396e;
            Integer valueOf = Integer.valueOf(i2);
            h.f.b.l.b(a3, "");
            map.put(valueOf, a3);
            return a2.l();
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(obj, "");
            super.destroyItem(viewGroup, i2, obj);
            f.a.b.b remove = this.f136396e.remove(Integer.valueOf(i2));
            if (remove != null && !remove.isDisposed()) {
                remove.dispose();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, i iVar, l.b bVar2, l.a aVar, Map<Integer, d<Fragment>> map, List<EffectCategoryModel> list, com.ss.android.ugc.aweme.sticker.view.a.b<?, Fragment> bVar3) {
            super(iVar);
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(map, "");
            h.f.b.l.d(list, "");
            h.f.b.l.d(bVar3, "");
            this.f136394c = bVar;
            this.f136397f = bVar2;
            this.f136392a = aVar;
            this.f136393b = map;
            this.f136398g = list;
            this.f136399h = bVar3;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final t<Integer> h() {
        t<Integer> c2 = this.f136386d.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b$b  reason: collision with other inner class name */
    static final class C3559b extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.a.b $categoryProvider;
        final /* synthetic */ i $fragmentManager;
        final /* synthetic */ l.b $requiredDependency;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(89077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3559b(b bVar, i iVar, l.b bVar2, com.ss.android.ugc.aweme.sticker.view.a.b bVar3) {
            super(0);
            this.this$0 = bVar;
            this.$fragmentManager = iVar;
            this.$requiredDependency = bVar2;
            this.$categoryProvider = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            b bVar = this.this$0;
            i iVar = this.$fragmentManager;
            l.b bVar2 = this.$requiredDependency;
            l.a aVar = bVar.f136390h;
            aVar.f136204g = this.this$0.f136387e.c();
            com.ss.android.ugc.aweme.sticker.view.a.b bVar3 = this.$categoryProvider;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(bVar3, "");
            return new a(bVar, iVar, bVar2, aVar, bVar.f136383a, bVar.f136384b, bVar3);
        }
    }

    public static final class c implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f136413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPager.e f136414b;

        static {
            Covode.recordClassIndex(89078);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f136414b.onPageScrollStateChanged(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f136413a.f136387e.onNext(v.a(Integer.valueOf(this.f136413a.f136385c), Integer.valueOf(i2)));
            this.f136413a.f136385c = i2;
            this.f136413a.a().f136392a.f136203f = Integer.valueOf(this.f136413a.f136385c);
            this.f136414b.onPageSelected(i2);
        }

        c(b bVar, ViewPager.e eVar) {
            this.f136413a = bVar;
            this.f136414b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            this.f136414b.onPageScrolled(i2, f2, i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.a
    public final void a(ViewPager.e eVar) {
        h.f.b.l.d(eVar, "");
        this.f136388f.addOnPageChangeListener(new c(this, eVar));
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.c
    public final void a(List<EffectCategoryModel> list) {
        h.f.b.l.d(list, "");
        if (this.f136388f.getAdapter() != null) {
            this.f136388f.setAdapter(null);
        }
        this.f136384b.clear();
        this.f136384b.addAll(list);
        this.f136388f.setAdapter(a());
        this.f136388f.setCurrentItem(this.f136389g.a());
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.d
    public final void a(int i2, boolean z) {
        this.f136388f.setCurrentItem(i2, z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.e
    public final void b(int i2, boolean z) {
        d<Fragment> dVar = this.f136383a.get(Integer.valueOf(this.f136385c));
        if (dVar != null) {
            dVar.b(i2, z);
        }
    }

    public b(ViewPager viewPager, com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.a aVar, i iVar, l.b bVar, l.a aVar2, com.ss.android.ugc.aweme.sticker.view.a.b<?, Fragment> bVar2) {
        h.f.b.l.d(viewPager, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar2, "");
        h.f.b.l.d(bVar2, "");
        this.f136388f = viewPager;
        this.f136389g = aVar;
        this.f136390h = aVar2;
        this.f136391i = h.i.a((h.f.a.a) new C3559b(this, iVar, bVar, bVar2));
        this.f136385c = -1;
        f.a.l.c<Integer> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.f136386d = cVar;
        f.a.l.c<p<Integer, Integer>> cVar2 = new f.a.l.c<>();
        h.f.b.l.b(cVar2, "");
        this.f136387e = cVar2;
        viewPager.setAdapter(a());
    }
}
