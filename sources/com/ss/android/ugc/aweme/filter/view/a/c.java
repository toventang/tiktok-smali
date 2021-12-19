package com.ss.android.ugc.aweme.filter.view.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f95756a;

    /* renamed from: b  reason: collision with root package name */
    public final EffectCategoryResponse f95757b;

    /* renamed from: c  reason: collision with root package name */
    public final FilterBean f95758c;

    static {
        Covode.recordClassIndex(60677);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f95756a, cVar.f95756a) && l.a(this.f95757b, cVar.f95757b) && l.a(this.f95758c, cVar.f95758c);
    }

    public final int hashCode() {
        d dVar = this.f95756a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        EffectCategoryResponse effectCategoryResponse = this.f95757b;
        int hashCode2 = (hashCode + (effectCategoryResponse != null ? effectCategoryResponse.hashCode() : 0)) * 31;
        FilterBean filterBean = this.f95758c;
        if (filterBean != null) {
            i2 = filterBean.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "FilterViewActionEvent(type=" + this.f95756a + ", extraTab=" + this.f95757b + ", extraFilter=" + this.f95758c + ")";
    }

    private c(d dVar, EffectCategoryResponse effectCategoryResponse, FilterBean filterBean) {
        l.d(dVar, "");
        this.f95756a = dVar;
        this.f95757b = effectCategoryResponse;
        this.f95758c = filterBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, EffectCategoryResponse effectCategoryResponse, FilterBean filterBean, int i2) {
        this(dVar, (i2 & 2) != 0 ? null : effectCategoryResponse, (i2 & 4) != 0 ? null : filterBean);
    }
}
