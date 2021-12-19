package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.c;
import com.ss.android.ugc.aweme.filter.repository.a.d;
import com.ss.android.ugc.aweme.filter.repository.a.e;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.a.g;
import com.ss.android.ugc.aweme.filter.repository.a.l;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import f.a.e.e.e.v;
import f.a.h.a;
import f.a.l.b;
import f.a.t;
import h.a.ag;
import h.a.n;
import h.a.z;
import h.j.h;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class q implements o {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends FilterBean> f95742a;

    /* renamed from: b  reason: collision with root package name */
    private final b<c> f95743b;

    /* renamed from: c  reason: collision with root package name */
    private final b<Map<Integer, d>> f95744c;

    /* renamed from: d  reason: collision with root package name */
    private p f95745d;

    static {
        Covode.recordClassIndex(60665);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final com.ss.android.ugc.aweme.filter.repository.a.q f() {
        return this.f95745d;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final l g() {
        throw new UnsupportedOperationException("option not supported.");
    }

    public /* synthetic */ q() {
        this(z.INSTANCE, new p());
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<c> c() {
        t<c> c2 = this.f95743b.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<Map<Integer, d>> d() {
        t<Map<Integer, d>> c2 = this.f95744c.c();
        h.f.b.l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<e> e() {
        t<e> a2 = a.a(v.f157740a);
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final void a(f fVar) {
        h.f.b.l.d(fVar, "");
        throw new UnsupportedOperationException("option not supported.");
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final f a(int i2) {
        T t;
        Iterator<T> it = this.f95742a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getId() == i2) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return com.ss.android.ugc.aweme.filter.repository.internal.utils.b.b((FilterBean) t2);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final g b(int i2) {
        g gVar;
        Iterator<T> it = this.f95742a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getId() == i2) {
                if (next != null && (gVar = g.FILTER_STATE_DOWNLOAD_SUCCESS) != null) {
                    return gVar;
                }
            }
        }
        return g.FILTER_STATE_UNKNOWN;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<d> a(FilterBean filterBean) {
        T t;
        t<d> b2;
        h.f.b.l.d(filterBean, "");
        Iterator<T> it = this.f95742a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getId() == filterBean.getId()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null && (b2 = t.b(com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a(t2, g.FILTER_STATE_DOWNLOAD_SUCCESS))) != null) {
            return b2;
        }
        t<d> b3 = t.b(new d(filterBean.getId(), g.FILTER_STATE_DOWNLOAD_FAILED, "", ""));
        h.f.b.l.b(b3, "");
        return b3;
    }

    public final void a(List<? extends FilterBean> list) {
        b<c> bVar = this.f95743b;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.ss.android.ugc.aweme.filter.repository.internal.utils.b.b((FilterBean) it.next()));
        }
        bVar.onNext(new c(arrayList, z.INSTANCE));
        b<Map<Integer, d>> bVar2 = this.f95744c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(ag.a(n.a((Iterable) list, 10)), 16));
        for (T t : list) {
            p a2 = h.v.a(Integer.valueOf(t.getId()), com.ss.android.ugc.aweme.filter.repository.internal.utils.b.a(t, g.FILTER_STATE_DOWNLOAD_SUCCESS));
            linkedHashMap.put(a2.getFirst(), a2.getSecond());
        }
        bVar2.onNext(linkedHashMap);
        p pVar = this.f95745d;
        h.f.b.l.d(list, "");
        pVar.f95738a.setValue(list);
        pVar.f95739b.setValue(list);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.o
    public final t<d> a(f fVar, List<? extends p<EffectCategoryResponse, ? extends List<f>>> list) {
        h.f.b.l.d(fVar, "");
        throw new UnsupportedOperationException("option not supported.");
    }

    private q(List<? extends FilterBean> list, p pVar) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(pVar, "");
        this.f95742a = list;
        this.f95745d = pVar;
        b<c> bVar = new b<>();
        h.f.b.l.b(bVar, "");
        this.f95743b = bVar;
        b<Map<Integer, d>> bVar2 = new b<>();
        h.f.b.l.b(bVar2, "");
        this.f95744c = bVar2;
        a(this.f95742a);
    }
}
