package com.ss.android.ugc.aweme.filter.repository.internal.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.am;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import f.a.x;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class i implements com.ss.android.ugc.aweme.filter.repository.internal.i {

    /* renamed from: a  reason: collision with root package name */
    final t<List<FilterBean>> f95702a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    final t<List<EffectCategoryResponse>> f95703b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    final t<List<p<EffectCategoryResponse, List<FilterBean>>>> f95704c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    final t<Map<String, Effect>> f95705d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    final t<List<FilterBean>> f95706e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public final Map<Integer, com.ss.android.ugc.aweme.filter.repository.a.d> f95707f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final List<am<com.ss.android.ugc.aweme.filter.repository.a.f, com.ss.android.ugc.aweme.filter.repository.a.d, FilterBean>> f95708g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private f.a.b.a f95709h = new f.a.b.a();

    static {
        Covode.recordClassIndex(60643);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.q
    public final LiveData<List<FilterBean>> a() {
        return this.f95702a;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.q
    public final LiveData<List<FilterBean>> b() {
        return this.f95706e;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.q
    public final LiveData<List<p<EffectCategoryResponse, List<FilterBean>>>> c() {
        return this.f95704c;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.q
    public final LiveData<Map<String, Effect>> d() {
        return this.f95705d;
    }

    private final f.a.b.a e() {
        MethodCollector.i(10276);
        f.a.b.a aVar = new f.a.b.a();
        synchronized (this) {
            try {
                this.f95709h.dispose();
                this.f95709h.a();
                this.f95709h = aVar;
            } finally {
                MethodCollector.o(10276);
            }
        }
        return aVar;
    }

    static final class c<V> implements Callable<List<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f95718b;

        static {
            Covode.recordClassIndex(60646);
        }

        c(i iVar, Map map) {
            this.f95717a = iVar;
            this.f95718b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<FilterBean> call() {
            ArrayList arrayList;
            boolean z;
            MethodCollector.i(9715);
            synchronized (this.f95717a) {
                try {
                    List<am<com.ss.android.ugc.aweme.filter.repository.a.f, com.ss.android.ugc.aweme.filter.repository.a.d, FilterBean>> list = this.f95717a.f95708g;
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        com.ss.android.ugc.aweme.filter.repository.a.d dVar = (com.ss.android.ugc.aweme.filter.repository.a.d) this.f95718b.get(Integer.valueOf(t.f39387a.f95550a));
                        if (dVar == null) {
                            dVar = com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a(t.f39387a.f95550a);
                        }
                        A a2 = t.f39387a;
                        C c2 = t.f39389c;
                        com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a(dVar, c2);
                        arrayList2.add(new am(a2, dVar, c2));
                    }
                    arrayList = arrayList2;
                    this.f95717a.f95708g.clear();
                    this.f95717a.f95708g.addAll(arrayList);
                    this.f95717a.f95707f.clear();
                    this.f95717a.f95707f.putAll(this.f95718b);
                } catch (Throwable th) {
                    MethodCollector.o(9715);
                    throw th;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList) {
                if (((am) obj).f39388b.f95545b == com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList4.add(obj);
                }
            }
            ArrayList<am> arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(n.a((Iterable) arrayList5, 10));
            for (am amVar : arrayList5) {
                arrayList6.add(amVar.f39389c);
            }
            arrayList3.addAll(arrayList6);
            MethodCollector.o(9715);
            return arrayList3;
        }
    }

    static final class b<V> implements Callable<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.filter.repository.a.c f95716b;

        static {
            Covode.recordClassIndex(60645);
        }

        b(i iVar, com.ss.android.ugc.aweme.filter.repository.a.c cVar) {
            this.f95715a = iVar;
            this.f95716b = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public a call() {
            T t;
            C c2;
            MethodCollector.i(10598);
            ArrayList<am> arrayList = new ArrayList();
            synchronized (this.f95715a) {
                try {
                    List<am<com.ss.android.ugc.aweme.filter.repository.a.f, com.ss.android.ugc.aweme.filter.repository.a.d, FilterBean>> list = this.f95715a.f95708g;
                    for (T t2 : this.f95716b.f95542a) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it.next();
                            if (t.f39387a.f95550a == t2.f95550a) {
                                break;
                            }
                        }
                        T t3 = t;
                        com.ss.android.ugc.aweme.filter.repository.a.d dVar = this.f95715a.f95707f.get(Integer.valueOf(t2.f95550a));
                        if (dVar == null) {
                            dVar = com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a(t2.f95550a);
                        }
                        if (t3 == null || (c2 = t3.f39389c) == null) {
                            c2 = new FilterBean();
                        }
                        l.d(t2, "");
                        l.d(c2, "");
                        c2.setId(t2.f95550a);
                        c2.setResId(t2.f95551b);
                        c2.setExtra(t2.f95558i);
                        c2.setName(t2.f95552c);
                        c2.setEnName(t2.f95553d);
                        c2.setResource(t2.f95554e);
                        c2.setTags(t2.f95555f);
                        c2.setTagUpdateAt(t2.f95556g);
                        c2.setThumbnailFileUri(t2.f95557h);
                        com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a(dVar, c2);
                        arrayList.add(new am(t2, dVar, c2));
                    }
                    this.f95715a.f95708g.clear();
                    this.f95715a.f95708g.addAll(arrayList);
                } catch (Throwable th) {
                    MethodCollector.o(10598);
                    throw th;
                }
            }
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
            for (am amVar : arrayList) {
                arrayList2.add(amVar.f39389c);
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList) {
                if (((am) obj).f39388b.f95545b == com.ss.android.ugc.aweme.filter.repository.a.g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    arrayList4.add(obj);
                }
            }
            ArrayList<am> arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(n.a((Iterable) arrayList5, 10));
            for (am amVar2 : arrayList5) {
                arrayList6.add(amVar2.f39389c);
            }
            ArrayList arrayList7 = arrayList6;
            List<p<EffectCategoryResponse, List<FilterBean>>> a2 = i.a(this.f95716b.f95543b, arrayList3);
            List<p<EffectCategoryResponse, List<com.ss.android.ugc.aweme.filter.repository.a.f>>> list2 = this.f95716b.f95543b;
            ArrayList arrayList8 = new ArrayList(n.a((Iterable) list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList8.add(it2.next().getFirst());
            }
            ArrayList arrayList9 = arrayList8;
            a aVar = new a(arrayList3, arrayList9, a2, i.a(arrayList9), arrayList7);
            MethodCollector.o(10598);
            return aVar;
        }
    }

    static final class g<T> implements f.a.d.f<List<? extends FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95722a;

        static {
            Covode.recordClassIndex(60650);
        }

        g(i iVar) {
            this.f95722a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends FilterBean> list) {
            i iVar = this.f95722a;
            l.b(list, "");
            iVar.f95706e.setValue(list);
        }
    }

    static final class d<T, R> implements f.a.d.g<com.ss.android.ugc.aweme.filter.repository.a.c, x<? extends a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95719a;

        static {
            Covode.recordClassIndex(60647);
        }

        d(i iVar) {
            this.f95719a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ x<? extends a> apply(com.ss.android.ugc.aweme.filter.repository.a.c cVar) {
            com.ss.android.ugc.aweme.filter.repository.a.c cVar2 = cVar;
            l.d(cVar2, "");
            i iVar = this.f95719a;
            l.d(cVar2, "");
            f.a.t c2 = f.a.t.c(new b(iVar, cVar2));
            l.b(c2, "");
            return c2;
        }
    }

    static final class f<T, R> implements f.a.d.g<Map<Integer, ? extends com.ss.android.ugc.aweme.filter.repository.a.d>, x<? extends List<? extends FilterBean>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95721a;

        static {
            Covode.recordClassIndex(60649);
        }

        f(i iVar) {
            this.f95721a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ x<? extends List<? extends FilterBean>> apply(Map<Integer, ? extends com.ss.android.ugc.aweme.filter.repository.a.d> map) {
            Map<Integer, ? extends com.ss.android.ugc.aweme.filter.repository.a.d> map2 = map;
            l.d(map2, "");
            f.a.t c2 = f.a.t.c(new c(this.f95721a, map2));
            l.b(c2, "");
            return c2;
        }
    }

    static final class e<T> implements f.a.d.f<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f95720a;

        static {
            Covode.recordClassIndex(60648);
        }

        e(i iVar) {
            this.f95720a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(a aVar) {
            a aVar2 = aVar;
            i iVar = this.f95720a;
            l.b(aVar2, "");
            iVar.f95702a.setValue(aVar2.f95710a);
            iVar.f95704c.setValue(aVar2.f95712c);
            iVar.f95706e.setValue(aVar2.f95714e);
            iVar.f95703b.setValue(aVar2.f95711b);
            iVar.f95705d.setValue(aVar2.f95713d);
        }
    }

    protected static Map<String, Effect> a(List<EffectCategoryResponse> list) {
        l.d(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Effect> totalEffects = it.next().getTotalEffects();
            if (totalEffects != null) {
                for (T t : totalEffects) {
                    if (!(t == null || t.getName() == null)) {
                        linkedHashMap.put(t.getName(), t);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.i
    public final void a(o oVar) {
        l.d(oVar, "");
        f.a.b.a e2 = e();
        e2.a(oVar.c().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a((f.a.d.g<? super com.ss.android.ugc.aweme.filter.repository.a.c, ? extends x<? extends R>>) new d(this), false).a(f.a.a.b.a.a()).a(new e(this), com.ss.android.ugc.tools.utils.p.f150012a));
        e2.a(oVar.d().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a((f.a.d.g<? super Map<Integer, com.ss.android.ugc.aweme.filter.repository.a.d>, ? extends x<? extends R>>) new f(this), false).a(f.a.a.b.a.a()).a(new g(this), com.ss.android.ugc.tools.utils.p.f150012a));
    }

    protected static List<p<EffectCategoryResponse, List<FilterBean>>> a(List<? extends p<EffectCategoryResponse, ? extends List<com.ss.android.ugc.aweme.filter.repository.a.f>>> list, List<? extends FilterBean> list2) {
        l.d(list, "");
        l.d(list2, "");
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            for (T t : list) {
                ArrayList arrayList2 = new ArrayList();
                for (com.ss.android.ugc.aweme.filter.repository.a.f fVar : (Iterable) t.getSecond()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next.getId() == fVar.f95550a) {
                            if (next != null) {
                                arrayList2.add(next);
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(v.a(t.getFirst(), arrayList2));
                }
            }
        } else {
            arrayList.add(v.a(com.ss.android.ugc.aweme.filter.repository.a.a.a.f95533b, list2));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<FilterBean> f95710a;

        /* renamed from: b  reason: collision with root package name */
        public final List<EffectCategoryResponse> f95711b;

        /* renamed from: c  reason: collision with root package name */
        public final List<p<EffectCategoryResponse, List<FilterBean>>> f95712c;

        /* renamed from: d  reason: collision with root package name */
        public final Map<String, Effect> f95713d;

        /* renamed from: e  reason: collision with root package name */
        public final List<FilterBean> f95714e;

        static {
            Covode.recordClassIndex(60644);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f95710a, aVar.f95710a) && l.a(this.f95711b, aVar.f95711b) && l.a(this.f95712c, aVar.f95712c) && l.a(this.f95713d, aVar.f95713d) && l.a(this.f95714e, aVar.f95714e);
        }

        public final int hashCode() {
            List<FilterBean> list = this.f95710a;
            int i2 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<EffectCategoryResponse> list2 = this.f95711b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            List<p<EffectCategoryResponse, List<FilterBean>>> list3 = this.f95712c;
            int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
            Map<String, Effect> map = this.f95713d;
            int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
            List<FilterBean> list4 = this.f95714e;
            if (list4 != null) {
                i2 = list4.hashCode();
            }
            return hashCode4 + i2;
        }

        public final String toString() {
            return "FilterDataObserveBundle(filters=" + this.f95710a + ", categories=" + this.f95711b + ", categoryMap=" + this.f95712c + ", effectMap=" + this.f95713d + ", availableFilters=" + this.f95714e + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean>>> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.filter.FilterBean> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends FilterBean> list, List<EffectCategoryResponse> list2, List<? extends p<EffectCategoryResponse, ? extends List<? extends FilterBean>>> list3, Map<String, ? extends Effect> map, List<? extends FilterBean> list4) {
            l.d(list, "");
            l.d(list2, "");
            l.d(list3, "");
            l.d(map, "");
            l.d(list4, "");
            this.f95710a = list;
            this.f95711b = list2;
            this.f95712c = list3;
            this.f95713d = map;
            this.f95714e = list4;
        }
    }
}
