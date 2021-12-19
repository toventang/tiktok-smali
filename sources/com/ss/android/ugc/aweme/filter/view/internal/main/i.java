package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.j;
import f.a.t;
import h.a.n;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class i implements com.ss.android.ugc.aweme.filter.view.a.i {

    /* renamed from: a  reason: collision with root package name */
    public Map<EffectCategoryResponse, List<FilterBean>> f95886a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<Object, View> f95887b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    boolean f95888c = true;

    /* renamed from: d  reason: collision with root package name */
    final f.a.l.g<EffectCategoryResponse> f95889d;

    /* renamed from: e  reason: collision with root package name */
    final f.a.l.g<Object> f95890e;

    /* renamed from: f  reason: collision with root package name */
    public final TabLayout f95891f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.filter.view.internal.d f95892g;

    /* renamed from: h  reason: collision with root package name */
    private final f.a.b.a f95893h;

    /* renamed from: i  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.filter.view.a.h f95894i;

    static final class g implements TabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f95903a = new g();

        static {
            Covode.recordClassIndex(60759);
        }

        g() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.b
        public final void a(TabLayout.f fVar) {
        }
    }

    static {
        Covode.recordClassIndex(60752);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.i
    public final ViewGroup e() {
        return this.f95891f;
    }

    public static final class b implements IIsTagNeedUpdatedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f95898a;

        static {
            Covode.recordClassIndex(60754);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedNotUpdate() {
            this.f95898a.a(false);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener
        public final void onTagNeedUpdate() {
            this.f95898a.a(true);
        }

        b(j jVar) {
            this.f95898a = jVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final FilterBean a() {
        return this.f95894i.a();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final t<FilterBean> b() {
        return this.f95894i.b();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final t<com.bytedance.jedi.a.c.f<FilterBean>> c() {
        return this.f95894i.c();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final t<FilterBean> d() {
        return this.f95894i.d();
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.i
    public final t<EffectCategoryResponse> f() {
        t<EffectCategoryResponse> c2 = this.f95889d.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.i
    public final t<Object> g() {
        t<Object> c2 = this.f95890e.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.i
    public final void a(boolean z) {
        this.f95888c = z;
    }

    public static final class f implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95902a;

        static {
            Covode.recordClassIndex(60758);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void b(TabLayout.f fVar) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void c(TabLayout.f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(i iVar) {
            this.f95902a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void a(TabLayout.f fVar) {
            View view;
            Object obj = null;
            if (fVar != null && (view = fVar.f130751f) != null) {
                if (!(view instanceof j)) {
                    view = null;
                }
                j jVar = (j) view;
                int i2 = 0;
                if (jVar != null) {
                    jVar.a(false);
                }
                com.ss.android.ugc.aweme.filter.view.internal.d dVar = this.f95902a.f95892g;
                if (dVar != null) {
                    Set<EffectCategoryResponse> keySet = this.f95902a.f95886a.keySet();
                    int i3 = fVar.f130750e;
                    l.d(keySet, "");
                    if (keySet instanceof List) {
                        obj = n.b((List) keySet, i3);
                    } else if (i3 >= 0) {
                        Iterator<T> it = keySet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            int i4 = i2 + 1;
                            if (i3 == i2) {
                                obj = next;
                                break;
                            }
                            i2 = i4;
                        }
                    }
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) obj;
                    if (effectCategoryResponse != null) {
                        dVar.a(effectCategoryResponse);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f95896b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f95897c;

        static {
            Covode.recordClassIndex(60753);
        }

        a(i iVar, View view, Object obj) {
            this.f95895a = iVar;
            this.f95896b = view;
            this.f95897c = obj;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            i iVar = this.f95895a;
            iVar.f95890e.onNext(this.f95897c);
        }
    }

    static final class d<T> implements f.a.d.f<com.bytedance.jedi.a.c.f<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95900a;

        static {
            Covode.recordClassIndex(60756);
        }

        d(i iVar) {
            this.f95900a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.bytedance.jedi.a.c.f<? extends FilterBean> fVar) {
            i iVar = this.f95900a;
            FilterBean filterBean = (FilterBean) fVar.a();
            if (filterBean != null) {
                iVar.c(filterBean);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final void a(FilterBean filterBean) {
        this.f95894i.a(filterBean);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final void b(FilterBean filterBean) {
        this.f95894i.b(filterBean);
    }

    static final class c<T> implements f.a.d.f<FilterBean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95899a;

        static {
            Covode.recordClassIndex(60755);
        }

        c(i iVar) {
            this.f95899a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            i iVar = this.f95899a;
            l.b(filterBean2, "");
            l.d(filterBean2, "");
            if (iVar.f95888c) {
                iVar.c(filterBean2);
            }
        }
    }

    static final class e<T> implements f.a.d.f<FilterBean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95901a;

        static {
            Covode.recordClassIndex(60757);
        }

        e(i iVar) {
            this.f95901a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(FilterBean filterBean) {
            FilterBean filterBean2 = filterBean;
            i iVar = this.f95901a;
            l.b(filterBean2, "");
            l.d(filterBean2, "");
            if (iVar.f95888c) {
                iVar.c(filterBean2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectCategoryResponse f95905b;

        static {
            Covode.recordClassIndex(60760);
        }

        h(i iVar, EffectCategoryResponse effectCategoryResponse) {
            this.f95904a = iVar;
            this.f95905b = effectCategoryResponse;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            i iVar = this.f95904a;
            EffectCategoryResponse effectCategoryResponse = this.f95905b;
            iVar.f95889d.onNext(effectCategoryResponse);
            iVar.a(effectCategoryResponse, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.g
    public final void a(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map) {
        l.d(map, "");
        this.f95886a.clear();
        this.f95886a.putAll(map);
        a(n.k(this.f95886a.keySet()));
        this.f95894i.a(this.f95886a);
        a((EffectCategoryResponse) n.d((Iterable) map.keySet()), false);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.i
    public final void c(FilterBean filterBean) {
        EffectCategoryResponse effectCategoryResponse;
        T t;
        l.d(filterBean, "");
        Iterator<T> it = this.f95886a.entrySet().iterator();
        while (true) {
            effectCategoryResponse = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Iterator it2 = ((Iterable) t.getValue()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((FilterBean) next).getId() == filterBean.getId()) {
                    if (next != null) {
                        break;
                    }
                }
            }
        }
        T t2 = t;
        if (t2 != null) {
            effectCategoryResponse = (EffectCategoryResponse) t2.getKey();
        }
        a(effectCategoryResponse, false);
    }

    /* access modifiers changed from: protected */
    public void a(List<EffectCategoryResponse> list) {
        l.d(list, "");
        this.f95891f.b();
        for (EffectCategoryResponse effectCategoryResponse : list) {
            Context context = this.f95891f.getContext();
            l.b(context, "");
            l.d(context, "");
            l.d(effectCategoryResponse, "");
            j a2 = com.ss.android.ugc.tools.b.a(context);
            int a3 = (int) r.a(context, 4.0f);
            a2.setPadding(a3, 0, a3, 0);
            if (TextUtils.isEmpty(effectCategoryResponse.getIcon_normal_url())) {
                a2.setText(effectCategoryResponse.getName());
            } else {
                String icon_normal_url = effectCategoryResponse.getIcon_normal_url();
                if (icon_normal_url == null) {
                    icon_normal_url = "";
                }
                a2.setImage(icon_normal_url);
            }
            com.ss.android.ugc.aweme.filter.view.internal.d dVar = this.f95892g;
            if (dVar != null) {
                dVar.a(effectCategoryResponse, new b(a2));
            }
            TabLayout.f a4 = this.f95891f.a().a(a2);
            l.b(a4, "");
            this.f95891f.a(a4);
            a2.setOnClickListener(new h(this, effectCategoryResponse));
        }
        for (Map.Entry<Object, View> entry : this.f95887b.entrySet()) {
            b(entry.getValue(), entry.getKey());
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.i
    public final void a(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        this.f95887b.put(obj, view);
        b(view, obj);
    }

    private final void b(View view, Object obj) {
        TabLayout.f a2 = this.f95891f.a().a(view);
        l.b(a2, "");
        ViewParent parent = view.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setOnClickListener(new a(this, view, obj));
        this.f95891f.a(a2);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.h
    public final void a(FilterBean filterBean, int i2) {
        this.f95894i.a(filterBean, i2);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.a.i
    public final void a(EffectCategoryResponse effectCategoryResponse, boolean z) {
        TabLayout.f a2;
        List<FilterBean> list;
        FilterBean filterBean;
        int i2 = -1;
        if (effectCategoryResponse != null) {
            Iterator<T> it = this.f95886a.keySet().iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (i3 < 0) {
                    n.a();
                }
                if (l.a((Object) next.getId(), (Object) effectCategoryResponse.getId())) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        if (!(!z || effectCategoryResponse == null || (list = this.f95886a.get(effectCategoryResponse)) == null || (filterBean = (FilterBean) n.h((List) list)) == null)) {
            this.f95894i.a(filterBean, 0);
        }
        if (i2 < 0) {
            if (this.f95891f.getCurSelectedTab() != null) {
                TabLayout.f curSelectedTab = this.f95891f.getCurSelectedTab();
                l.b(curSelectedTab, "");
                View view = curSelectedTab.f130751f;
                if (view != null) {
                    view.setSelected(false);
                }
            }
            this.f95891f.d();
        } else if (this.f95891f.getSelectedTabPosition() != i2 && (a2 = this.f95891f.a(i2)) != null) {
            a2.a();
        }
    }

    public i(com.ss.android.ugc.aweme.filter.view.a.h hVar, TabLayout tabLayout, com.ss.android.ugc.aweme.filter.view.internal.d dVar) {
        l.d(hVar, "");
        l.d(tabLayout, "");
        this.f95894i = hVar;
        this.f95891f = tabLayout;
        this.f95892g = dVar;
        f.a.l.c cVar = new f.a.l.c();
        l.b(cVar, "");
        this.f95889d = cVar;
        f.a.l.c cVar2 = new f.a.l.c();
        l.b(cVar2, "");
        this.f95890e = cVar2;
        f.a.b.a aVar = new f.a.b.a();
        this.f95893h = aVar;
        aVar.a(hVar.b().a(new c(this), f.a.e.b.a.f157192e));
        aVar.a(hVar.c().a(new d(this), f.a.e.b.a.f157192e));
        aVar.a(hVar.d().a(new e(this), f.a.e.b.a.f157192e));
        tabLayout.a(new f(this));
        tabLayout.setOnTabClickListener(g.f95903a);
    }
}
