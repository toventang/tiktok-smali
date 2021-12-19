package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.tools.infosticker.view.internal.f;
import com.ss.android.ugc.tools.infosticker.view.internal.main.l;
import com.ss.android.ugc.tools.view.style.j;
import com.ss.android.ugc.tools.view.widget.q;
import com.zhiliaoapp.musically.R;
import f.a.l.c;
import f.a.t;
import h.a.ac;
import h.a.n;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;

public final class f implements com.ss.android.ugc.tools.infosticker.view.internal.f {

    /* renamed from: a  reason: collision with root package name */
    public final List<p<f.a, h.f.a.a<View>>> f149688a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c<p<f.a, Integer>> f149689b;

    /* renamed from: c  reason: collision with root package name */
    public final l.c f149690c;

    /* renamed from: d  reason: collision with root package name */
    private final PagerAdapter f149691d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final ViewPager f149692e;

    /* renamed from: f  reason: collision with root package name */
    private final TabLayout f149693f;

    /* renamed from: g  reason: collision with root package name */
    private final View f149694g;

    static {
        Covode.recordClassIndex(98564);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.f
    public final ViewPager a() {
        return this.f149692e;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.f
    public final void b() {
        a(0, false);
    }

    final class a extends PagerAdapter {
        static {
            Covode.recordClassIndex(98566);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            h.f.b.l.d(view, "");
            h.f.b.l.d(obj, "");
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return f.this.f149688a.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            MethodCollector.i(7536);
            h.f.b.l.d(viewGroup, "");
            View invoke = f.this.f149688a.get(i2).getSecond().invoke();
            viewGroup.addView(invoke);
            MethodCollector.o(7536);
            return invoke;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            MethodCollector.i(7601);
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(obj, "");
            com.ss.android.ugc.tools.infosticker.view.a.b bVar = null;
            if (!(obj instanceof View)) {
                obj = null;
            }
            View view = (View) obj;
            if (view != null) {
                viewGroup.removeView(view);
                Object tag = view.getTag(R.id.bor);
                if (tag instanceof com.ss.android.ugc.tools.infosticker.view.a.b) {
                    bVar = tag;
                }
                com.ss.android.ugc.tools.infosticker.view.a.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.b();
                    MethodCollector.o(7601);
                    return;
                }
                MethodCollector.o(7601);
                return;
            }
            MethodCollector.o(7601);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
            h.f.b.l.d(viewGroup, "");
            h.f.b.l.d(obj, "");
            super.setPrimaryItem(viewGroup, i2, obj);
            l.c cVar = f.this.f149690c;
            if (cVar != null && cVar.f149788i) {
                com.ss.android.ugc.tools.infosticker.view.internal.c cVar2 = null;
                if (!(obj instanceof View)) {
                    obj = null;
                }
                View view = (View) obj;
                if (view != null) {
                    Object tag = view.getTag(R.id.bor);
                    if (tag instanceof com.ss.android.ugc.tools.infosticker.view.internal.c) {
                        cVar2 = tag;
                    }
                    com.ss.android.ugc.tools.infosticker.view.internal.c cVar3 = cVar2;
                    if (cVar3 != null) {
                        cVar3.e();
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.f
    public final t<p<f.a, Integer>> c() {
        t<p<f.a, Integer>> c2 = this.f149689b.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ac f149697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f149698b;

        static {
            Covode.recordClassIndex(98567);
        }

        b(ac acVar, f fVar) {
            this.f149697a = acVar;
            this.f149698b = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f149698b.a(this.f149697a.f158622a, true);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.f
    public final void a(boolean z) {
        int i2;
        View view = this.f149694g;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.f
    public final void a(List<? extends p<f.a, ? extends h.f.a.a<? extends View>>> list) {
        h.f.b.l.d(list, "");
        this.f149688a.clear();
        this.f149688a.addAll(list);
        if (this.f149692e.getAdapter() != null) {
            this.f149692e.setAdapter(null);
        }
        this.f149692e.setAdapter(this.f149691d);
        q.a(this.f149693f, this.f149688a.size());
        for (ac acVar : n.n(this.f149688a)) {
            f.a aVar = (f.a) acVar.f158623b.getFirst();
            h.f.b.l.d(aVar, "");
            Context context = this.f149692e.getContext();
            h.f.b.l.b(context, "");
            j a2 = com.ss.android.ugc.tools.b.a(context);
            a2.setText(aVar.f149606b);
            TabLayout tabLayout = this.f149693f;
            tabLayout.a(tabLayout.a().a(a2));
            a2.setOnClickListener(new b(acVar, this));
        }
    }

    public final void a(int i2, boolean z) {
        if (i2 < this.f149691d.getCount()) {
            this.f149692e.setCurrentItem(i2, z);
        }
    }

    public f(ViewPager viewPager, TabLayout tabLayout, View view, l.c cVar) {
        h.f.b.l.d(viewPager, "");
        h.f.b.l.d(tabLayout, "");
        h.f.b.l.d(view, "");
        this.f149692e = viewPager;
        this.f149693f = tabLayout;
        this.f149694g = view;
        this.f149690c = cVar;
        c<p<f.a, Integer>> cVar2 = new c<>();
        h.f.b.l.b(cVar2, "");
        this.f149689b = cVar2;
        viewPager.addOnPageChangeListener(new TabLayout.g(tabLayout));
        tabLayout.a(new TabLayout.c(this) {
            /* class com.ss.android.ugc.tools.infosticker.view.internal.main.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f149695a;

            static {
                Covode.recordClassIndex(98565);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
            public final void b(TabLayout.f fVar) {
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
            public final void c(TabLayout.f fVar) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f149695a = r1;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
            public final void a(TabLayout.f fVar) {
                Object first;
                if (fVar != null) {
                    int i2 = fVar.f130750e;
                    p pVar = (p) n.b((List) this.f149695a.f149688a, i2);
                    if (pVar != null && (first = pVar.getFirst()) != null) {
                        this.f149695a.a(i2, true);
                        this.f149695a.f149689b.onNext(v.a(first, Integer.valueOf(i2)));
                    }
                }
            }
        });
    }
}
