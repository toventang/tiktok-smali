package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.b;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.a.h;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.internal.g;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, b> f95593a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, b> f95594b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final List<p<EffectCategoryResponse, List<f>>> f95595c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.filter.repository.a.a f95596d;

    /* renamed from: e  reason: collision with root package name */
    private final o f95597e;

    /* renamed from: f  reason: collision with root package name */
    private final g f95598f;

    static {
        Covode.recordClassIndex(60582);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.h
    public final com.ss.android.ugc.aweme.filter.repository.a.a a() {
        return this.f95596d;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.h
    public final void b() {
        if (!this.f95593a.isEmpty()) {
            this.f95598f.a(this.f95593a.keySet());
        }
        if (!this.f95594b.isEmpty()) {
            this.f95598f.b(this.f95594b.keySet());
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.h
    public final void a(b bVar) {
        l.d(bVar, "");
        if (!bVar.f95541c) {
            this.f95594b.remove(Integer.valueOf(bVar.f95539a.f95550a));
            this.f95593a.put(Integer.valueOf(bVar.f95539a.f95550a), bVar);
        }
        this.f95597e.a(bVar.f95539a, this.f95595c);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.h
    public final void b(b bVar) {
        l.d(bVar, "");
        if (!bVar.f95541c) {
            this.f95594b.put(Integer.valueOf(bVar.f95539a.f95550a), bVar);
            this.f95593a.remove(Integer.valueOf(bVar.f95539a.f95550a));
            this.f95597e.a(bVar.f95539a);
        }
    }

    public a(com.ss.android.ugc.aweme.filter.repository.a.a aVar, o oVar, g gVar) {
        l.d(aVar, "");
        l.d(oVar, "");
        l.d(gVar, "");
        this.f95596d = aVar;
        this.f95597e = oVar;
        this.f95598f = gVar;
        List<p<EffectCategoryModel, List<b>>> list = aVar.f95531b;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            com.ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel = (com.ss.ugc.effectplatform.model.EffectCategoryModel) t.getFirst();
            l.d(effectCategoryModel, "");
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, 1, null);
            effectCategoryResponse.setId(effectCategoryModel.getId());
            effectCategoryResponse.setName(effectCategoryModel.getName());
            effectCategoryResponse.setKey(effectCategoryModel.getKey());
            Iterable<b> iterable = (Iterable) t.getSecond();
            ArrayList arrayList2 = new ArrayList(n.a(iterable, 10));
            for (b bVar : iterable) {
                arrayList2.add(bVar.f95539a);
            }
            arrayList.add(v.a(effectCategoryResponse, arrayList2));
        }
        this.f95595c = arrayList;
    }
}
