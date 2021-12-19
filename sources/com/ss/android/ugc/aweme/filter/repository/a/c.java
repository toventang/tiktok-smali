package com.ss.android.ugc.aweme.filter.repository.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.f.b.l;
import h.p;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f95542a;

    /* renamed from: b  reason: collision with root package name */
    public final List<p<EffectCategoryResponse, List<f>>> f95543b;

    static {
        Covode.recordClassIndex(60547);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f95542a, cVar.f95542a) && l.a(this.f95543b, cVar.f95543b);
    }

    public final int hashCode() {
        List<f> list = this.f95542a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<p<EffectCategoryResponse, List<f>>> list2 = this.f95543b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterData(filters=" + this.f95542a + ", filterTable=" + this.f95543b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<com.ss.android.ugc.aweme.filter.repository.a.f>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<f> list, List<? extends p<EffectCategoryResponse, ? extends List<f>>> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f95542a = list;
        this.f95543b = list2;
    }
}
