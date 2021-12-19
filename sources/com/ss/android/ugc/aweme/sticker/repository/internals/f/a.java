package com.ss.android.ugc.aweme.sticker.repository.internals.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.f;
import com.ss.android.ugc.aweme.sticker.repository.a.j;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<String, f> f135652a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, f> f135653b;

    static {
        Covode.recordClassIndex(88674);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.j
    public final Map<String, f> a() {
        return this.f135653b;
    }

    public a() {
        LinkedHashMap<String, f> linkedHashMap = new LinkedHashMap<>();
        this.f135652a = linkedHashMap;
        this.f135653b = linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.j
    public final void b() {
        Collection<f> values = this.f135652a.values();
        l.b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.j
    public final void a(f fVar) {
        l.d(fVar, "");
        this.f135652a.put(fVar.b().getKey(), fVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.j
    public void a(List<EffectCategoryModel> list) {
        int a2;
        l.d(list, "");
        for (Map.Entry<String, f> entry : this.f135653b.entrySet()) {
            f value = entry.getValue();
            if (value.a() < 0 || value.a() > list.size() || (a2 = value.a()) < 0) {
                list.add(value.b());
            } else {
                list.add(a2, value.b());
            }
        }
    }
}
