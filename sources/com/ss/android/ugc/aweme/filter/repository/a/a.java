package com.ss.android.ugc.aweme.filter.repository.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;
import h.p;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f95530a;

    /* renamed from: b  reason: collision with root package name */
    public final List<p<EffectCategoryModel, List<b>>> f95531b;

    static {
        Covode.recordClassIndex(60538);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f95530a, aVar.f95530a) && l.a(this.f95531b, aVar.f95531b);
    }

    public final int hashCode() {
        List<b> list = this.f95530a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<p<EffectCategoryModel, List<b>>> list2 = this.f95531b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterBoxData(metas=" + this.f95530a + ", table=" + this.f95531b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends h.p<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel, ? extends java.util.List<com.ss.android.ugc.aweme.filter.repository.a.b>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<b> list, List<? extends p<EffectCategoryModel, ? extends List<b>>> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f95530a = list;
        this.f95531b = list2;
    }
}
