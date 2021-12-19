package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.am;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.view.widget.q;
import f.a.t;
import h.a.n;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l implements com.ss.android.ugc.aweme.filter.view.a.j {

    /* renamed from: a  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.filter.view.a.i f95926a;

    /* renamed from: b  reason: collision with root package name */
    FilterBean f95927b;

    /* renamed from: c  reason: collision with root package name */
    int f95928c;

    /* renamed from: d  reason: collision with root package name */
    final f.a.l.g<am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean>> f95929d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.l.g<com.ss.android.ugc.aweme.filter.view.a.c> f95930e;

    /* renamed from: f  reason: collision with root package name */
    public final c f95931f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f95932g;

    /* renamed from: h  reason: collision with root package name */
    public final m f95933h;

    /* renamed from: i  reason: collision with root package name */
    public final o f95934i;

    /* renamed from: j  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.repository.a.m f95935j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.view.internal.d f95936k;

    /* renamed from: l  reason: collision with root package name */
    private ViewGroup f95937l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.filter.view.internal.c f95938m;
    private com.ss.android.ugc.aweme.filter.view.internal.b n;
    private com.ss.android.ugc.aweme.filter.view.internal.a o;
    private com.ss.android.ugc.tools.view.base.c p;
    private com.ss.android.ugc.tools.view.base.d q;
    private boolean r;
    private final f.a.l.g<p<Boolean, FilterBean>> s;
    private final f.a.l.g<Boolean> t;
    private final f.a.b.a u;
    private final C2316l v;

    static {
        Covode.recordClassIndex(60768);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final void d() {
        b(true);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final FilterBean a() {
        com.ss.android.ugc.aweme.filter.view.a.i iVar = this.f95926a;
        if (iVar == null) {
            h.f.b.l.a("tabListView");
        }
        return iVar.a();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final t<am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean>> e() {
        t<am<com.ss.android.ugc.aweme.filter.view.a.e, Integer, FilterBean>> c2 = this.f95929d.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final t<com.bytedance.jedi.a.c.f<FilterBean>> f() {
        com.ss.android.ugc.aweme.filter.view.a.i iVar = this.f95926a;
        if (iVar == null) {
            h.f.b.l.a("tabListView");
        }
        return iVar.c();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final t<Boolean> g() {
        t<Boolean> c2 = this.t.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final t<com.ss.android.ugc.aweme.filter.view.a.c> h() {
        t<com.ss.android.ugc.aweme.filter.view.a.c> c2 = this.f95930e.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final void b() {
        if (this.f95931f.f95945e) {
            com.ss.android.ugc.tools.view.base.d dVar = this.q;
            if (dVar == null) {
                h.f.b.l.a("transitionView");
            }
            dVar.a();
            return;
        }
        com.ss.android.ugc.tools.view.base.d dVar2 = this.q;
        if (dVar2 == null) {
            h.f.b.l.a("transitionView");
        }
        dVar2.b();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final void c() {
        if (this.f95931f.f95945e) {
            com.ss.android.ugc.tools.view.base.d dVar = this.q;
            if (dVar == null) {
                h.f.b.l.a("transitionView");
            }
            dVar.c();
            return;
        }
        com.ss.android.ugc.tools.view.base.d dVar2 = this.q;
        if (dVar2 == null) {
            h.f.b.l.a("transitionView");
        }
        dVar2.f();
    }

    public final void i() {
        com.ss.android.ugc.aweme.filter.view.internal.b bVar = this.n;
        if (bVar == null) {
            h.f.b.l.a("cleanView");
        }
        if (!bVar.a()) {
            b(true);
        }
        this.f95930e.onNext(new com.ss.android.ugc.aweme.filter.view.a.c(com.ss.android.ugc.aweme.filter.view.a.d.CLEAR_MODE_CLICK, null, null, 6));
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f95941a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f95942b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f95943c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f95944d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f95945e;

        /* renamed from: f  reason: collision with root package name */
        public e f95946f;

        /* renamed from: g  reason: collision with root package name */
        public a f95947g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f95948h;

        static {
            Covode.recordClassIndex(60771);
        }

        public final void a(e eVar) {
            h.f.b.l.d(eVar, "");
            this.f95946f = eVar;
        }

        public /* synthetic */ c(l lVar) {
            this(lVar, new e(false, null, null, 63), new a());
        }

        private c(l lVar, e eVar, a aVar) {
            h.f.b.l.d(eVar, "");
            h.f.b.l.d(aVar, "");
            this.f95948h = lVar;
            this.f95941a = true;
            this.f95942b = true;
            this.f95943c = true;
            this.f95944d = true;
            this.f95945e = true;
            this.f95946f = eVar;
            this.f95947g = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.l$l  reason: collision with other inner class name */
    public static final class C2316l implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95958a;

        static {
            Covode.recordClassIndex(60780);
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2316l(l lVar) {
            this.f95958a = lVar;
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            l lVar = this.f95958a;
            FilterBean filterBean = lVar.f95927b;
            if (filterBean != null) {
                lVar.f95929d.onNext(new am<>(com.ss.android.ugc.aweme.filter.view.a.e.CHANGE_END, Integer.valueOf(lVar.f95928c), filterBean));
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            l lVar = this.f95958a;
            lVar.f95928c = i2;
            FilterBean filterBean = lVar.f95927b;
            if (filterBean != null) {
                lVar.f95929d.onNext(new am<>(com.ss.android.ugc.aweme.filter.view.a.e.CHANGING, Integer.valueOf(i2), filterBean));
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95949a;

        static {
            Covode.recordClassIndex(60772);
        }

        d(l lVar) {
            this.f95949a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f95949a.i();
        }
    }

    static final class f<T> implements f.a.d.f<com.bytedance.jedi.a.c.f<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95951a;

        static {
            Covode.recordClassIndex(60774);
        }

        f(l lVar) {
            this.f95951a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.a.c.f<? extends FilterBean> fVar) {
            this.f95951a.c((FilterBean) fVar.a());
        }
    }

    static final class g<T> implements f.a.d.f<FilterBean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95952a;

        static {
            Covode.recordClassIndex(60775);
        }

        g(l lVar) {
            this.f95952a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            l lVar = this.f95952a;
            h.f.b.l.b(filterBean2, "");
            lVar.b(filterBean2);
        }
    }

    static final class h<T> implements f.a.d.f<EffectCategoryResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95953a;

        static {
            Covode.recordClassIndex(60776);
        }

        h(l lVar) {
            this.f95953a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(EffectCategoryResponse effectCategoryResponse) {
            EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
            l lVar = this.f95953a;
            h.f.b.l.b(effectCategoryResponse2, "");
            lVar.a(effectCategoryResponse2);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95950a;

        static {
            Covode.recordClassIndex(60773);
        }

        e(l lVar) {
            this.f95950a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f95950a.f95930e.onNext(new com.ss.android.ugc.aweme.filter.view.a.c(com.ss.android.ugc.aweme.filter.view.a.d.FILTER_BOX_ENTRANCE_CLICK, null, null, 6));
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95954a;

        static {
            Covode.recordClassIndex(60777);
        }

        i(l lVar) {
            this.f95954a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f95954a.f95930e.onNext(new com.ss.android.ugc.aweme.filter.view.a.c(com.ss.android.ugc.aweme.filter.view.a.d.OUTSIDE_TOUCH, null, null, 6));
        }
    }

    static final class j<T> implements f.a.d.f<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95955a;

        static {
            Covode.recordClassIndex(60778);
        }

        j(l lVar) {
            this.f95955a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Boolean bool) {
            Boolean bool2 = bool;
            l lVar = this.f95955a;
            h.f.b.l.b(bool2, "");
            lVar.a(bool2.booleanValue());
        }
    }

    static final class k<T> implements f.a.d.f<com.ss.android.ugc.tools.view.base.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f95956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecyclerView f95957b;

        static {
            Covode.recordClassIndex(60779);
        }

        k(l lVar, RecyclerView recyclerView) {
            this.f95956a = lVar;
            this.f95957b = recyclerView;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.tools.view.base.e eVar) {
            if (eVar == com.ss.android.ugc.tools.view.base.e.PRE_HIDE) {
                this.f95957b.setItemAnimator(null);
            } else if (eVar == com.ss.android.ugc.tools.view.base.e.SHOWN) {
                this.f95957b.setItemAnimator(this.f95956a.f95931f.f95946f.f95856c);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.j
    public final void a(FilterBean filterBean) {
        com.ss.android.ugc.aweme.filter.view.a.i iVar = this.f95926a;
        if (iVar == null) {
            h.f.b.l.a("tabListView");
        }
        iVar.a(filterBean);
    }

    public final class b extends i {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f95940h;

        static {
            Covode.recordClassIndex(60770);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.filter.view.internal.main.i
        public final void a(List<EffectCategoryResponse> list) {
            h.f.b.l.d(list, "");
            TabLayout tabLayout = this.f95891f;
            int size = list.size() + this.f95887b.size();
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getName());
            }
            q.a(tabLayout, size, arrayList);
            super.a(list);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l lVar, com.ss.android.ugc.aweme.filter.view.a.h hVar, TabLayout tabLayout, com.ss.android.ugc.aweme.filter.view.internal.d dVar) {
            super(hVar, tabLayout, dVar);
            h.f.b.l.d(hVar, "");
            h.f.b.l.d(tabLayout, "");
            this.f95940h = lVar;
        }
    }

    public final void a(EffectCategoryResponse effectCategoryResponse) {
        this.f95930e.onNext(new com.ss.android.ugc.aweme.filter.view.a.c(com.ss.android.ugc.aweme.filter.view.a.d.TAB_CLICK, effectCategoryResponse, null, 4));
        b(false);
    }

    public final void b(FilterBean filterBean) {
        b(false);
        this.f95930e.onNext(new com.ss.android.ugc.aweme.filter.view.a.c(com.ss.android.ugc.aweme.filter.view.a.d.FILTER_CLICK, null, filterBean, 2));
    }

    private final void b(boolean z) {
        if (this.f95931f.f95942b && this.r != z) {
            this.r = z;
            com.ss.android.ugc.aweme.filter.view.internal.b bVar = this.n;
            if (bVar == null) {
                h.f.b.l.a("cleanView");
            }
            bVar.a(this.r);
            if (this.r) {
                a((FilterBean) null);
                com.ss.android.ugc.aweme.filter.view.a.i iVar = this.f95926a;
                if (iVar == null) {
                    h.f.b.l.a("tabListView");
                }
                iVar.a((EffectCategoryResponse) null, false);
            }
            com.ss.android.ugc.aweme.filter.view.a.i iVar2 = this.f95926a;
            if (iVar2 == null) {
                h.f.b.l.a("tabListView");
            }
            iVar2.a(!this.r);
            this.t.onNext(Boolean.valueOf(this.r));
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.g
    public final void a(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        h.f.b.l.d(map, "");
        com.ss.android.ugc.aweme.filter.view.a.i iVar = this.f95926a;
        if (iVar == null) {
            h.f.b.l.a("tabListView");
        }
        iVar.a(map);
    }

    public final void a(boolean z) {
        FilterBean filterBean;
        if (z && (filterBean = this.f95927b) != null) {
            com.ss.android.ugc.aweme.filter.view.a.i iVar = this.f95926a;
            if (iVar == null) {
                h.f.b.l.a("tabListView");
            }
            iVar.b(filterBean);
            com.ss.android.ugc.aweme.filter.view.a.i iVar2 = this.f95926a;
            if (iVar2 == null) {
                h.f.b.l.a("tabListView");
            }
            iVar2.c(filterBean);
        }
        this.s.onNext(v.a(Boolean.valueOf(z), this.f95927b));
    }

    public final void c(FilterBean filterBean) {
        this.f95927b = filterBean;
        boolean z = false;
        if (filterBean != null) {
            b(false);
        }
        FilterBean filterBean2 = this.f95927b;
        if (!this.f95931f.f95941a) {
            return;
        }
        if (filterBean2 != null) {
            com.ss.android.ugc.aweme.filter.view.internal.c cVar = this.f95938m;
            if (cVar == null) {
                h.f.b.l.a("seekBarView");
            }
            if (this.f95935j.b(filterBean2) != 0.0f) {
                z = true;
            }
            cVar.a(z);
            com.ss.android.ugc.aweme.filter.view.internal.c cVar2 = this.f95938m;
            if (cVar2 == null) {
                h.f.b.l.a("seekBarView");
            }
            if (cVar2.b()) {
                com.ss.android.ugc.aweme.filter.view.internal.c cVar3 = this.f95938m;
                if (cVar3 == null) {
                    h.f.b.l.a("seekBarView");
                }
                SeekBar a2 = cVar3.a();
                com.ss.android.ugc.aweme.filter.repository.a.m mVar = this.f95935j;
                h.f.b.l.d(mVar, "");
                h.f.b.l.d(filterBean2, "");
                a2.setProgress(com.ss.android.ugc.aweme.filter.c.a(filterBean2, mVar.a(filterBean2), mVar.a()));
                if (a2 instanceof FilterBeautySeekBar) {
                    com.ss.android.ugc.aweme.filter.repository.a.m mVar2 = this.f95935j;
                    h.f.b.l.d(mVar2, "");
                    h.f.b.l.d(filterBean2, "");
                    int a3 = com.ss.android.ugc.aweme.filter.c.a(filterBean2, mVar2.b(filterBean2), mVar2.a());
                    FilterBeautySeekBar filterBeautySeekBar = (FilterBeautySeekBar) a2;
                    if (a3 == 0 || a3 == 100) {
                        a3 = -1;
                    }
                    filterBeautySeekBar.setDefaultDotProgress(a3);
                    return;
                }
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.filter.view.internal.c cVar4 = this.f95938m;
        if (cVar4 == null) {
            h.f.b.l.a("seekBarView");
        }
        cVar4.a(false);
    }

    public final class a extends f {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l f95939m;

        static {
            Covode.recordClassIndex(60769);
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.ugc.aweme.filter.view.internal.main.f
        public final void b(int i2, int i3) {
            RecyclerView.i layoutManager = this.f95869h.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                t tVar = new t(this.f95869h.getContext());
                tVar.f3862g = i2;
                layoutManager.a(tVar);
            }
        }

        public /* synthetic */ a(l lVar, RecyclerView recyclerView, m mVar, r rVar, s sVar, g gVar) {
            this(lVar, recyclerView, mVar, rVar, sVar, f.f95860k, gVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private a(l lVar, RecyclerView recyclerView, m mVar, r rVar, s sVar, h.f.a.q<? super com.ss.android.ugc.aweme.filter.view.a.h, ? super FilterBean, ? super com.ss.android.ugc.aweme.filter.repository.a.g, z> qVar, g gVar) {
            super(recyclerView, mVar, rVar, sVar, qVar, gVar);
            h.f.b.l.d(recyclerView, "");
            h.f.b.l.d(mVar, "");
            h.f.b.l.d(gVar, "");
            this.f95939m = lVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(android.view.ViewGroup r26, androidx.lifecycle.m r27, com.ss.android.ugc.aweme.filter.repository.a.o r28, com.ss.android.ugc.aweme.filter.repository.a.m r29, com.ss.android.ugc.aweme.filter.view.internal.d r30, h.f.a.b<? super com.ss.android.ugc.aweme.filter.view.internal.main.l.c, h.z> r31) {
        /*
        // Method dump skipped, instructions count: 767
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.filter.view.internal.main.l.<init>(android.view.ViewGroup, androidx.lifecycle.m, com.ss.android.ugc.aweme.filter.repository.a.o, com.ss.android.ugc.aweme.filter.repository.a.m, com.ss.android.ugc.aweme.filter.view.internal.d, h.f.a.b):void");
    }
}
