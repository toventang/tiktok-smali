package com.ss.android.ugc.aweme.filter.repository.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.c;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.a.ag;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f95532a = new c(z.INSTANCE, z.INSTANCE);

    /* renamed from: b  reason: collision with root package name */
    public static final EffectCategoryResponse f95533b = com.ss.android.ugc.tools.b.a.a.a.f149091b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f95534c = i.a((h.f.a.a) C2305a.f95535a);

    public static final FilterBean a() {
        return (FilterBean) f95534c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.a$a  reason: collision with other inner class name */
    static final class C2305a extends m implements h.f.a.a<FilterBean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2305a f95535a = new C2305a();

        static {
            Covode.recordClassIndex(60540);
        }

        C2305a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FilterBean invoke() {
            return a.b();
        }
    }

    static {
        Covode.recordClassIndex(60539);
    }

    public static final FilterBean b() {
        FilterBean filterBean = new FilterBean();
        filterBean.setFilterFolder("");
        filterBean.setEnName("normal");
        filterBean.setName("");
        return filterBean;
    }

    static final class b extends m implements h.f.a.b<K, Boolean> {
        final /* synthetic */ Object $k;

        static {
            Covode.recordClassIndex(60541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.$k = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Object obj) {
            return Boolean.valueOf(l.a(obj, this.$k));
        }
    }

    public static final String b(FilterBean filterBean) {
        String filterFolder;
        if (filterBean == null || (filterFolder = filterBean.getFilterFolder()) == null) {
            return "";
        }
        return filterFolder;
    }

    public static final String a(FilterBean filterBean) {
        String enName;
        if (filterBean == null || (enName = filterBean.getEnName()) == null) {
            return "";
        }
        return enName;
    }

    public static final <K, V> List<K> a(List<? extends p<? extends K, ? extends List<? extends V>>> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> b(List<? extends p<? extends K, ? extends List<? extends V>>> list) {
        if (list == null) {
            return ag.a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.j.h.b(ag.a(n.a((Iterable) list, 10)), 16));
        for (T t : list) {
            linkedHashMap.put(t.getFirst(), t.getSecond());
        }
        return linkedHashMap;
    }

    public static final <K, V> K a(List<? extends p<? extends K, ? extends List<? extends V>>> list, h.f.a.b<? super V, Boolean> bVar) {
        T t;
        l.d(list, "");
        l.d(bVar, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Iterator it2 = ((Iterable) t.getSecond()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object obj = (Object) it2.next();
                if (bVar.invoke(obj).booleanValue()) {
                    if (obj != 0) {
                        break;
                    }
                }
            }
        }
        T t2 = t;
        if (t2 != null) {
            return (K) t2.getFirst();
        }
        return null;
    }

    public static final <K, V> List<V> a(List<? extends p<? extends K, ? extends List<? extends V>>> list, K k2) {
        T t;
        l.d(list, "");
        b bVar = new b(k2);
        l.d(list, "");
        l.d(bVar, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Boolean) bVar.invoke(t.getFirst())).booleanValue()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return (List) t2.getSecond();
        }
        return null;
    }

    public static final boolean a(FilterBean filterBean, FilterBean filterBean2) {
        if (filterBean == null) {
            if (filterBean2 != null) {
                return false;
            }
            return true;
        } else if (filterBean2 == null || filterBean.getId() != filterBean2.getId()) {
            return false;
        } else {
            return true;
        }
    }
}
