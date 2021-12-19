package com.ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.g;
import h.f.b.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public g f153469a;

    /* renamed from: b  reason: collision with root package name */
    public ModelInfo f153470b;

    static {
        Covode.recordClassIndex(102331);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f153469a, hVar.f153469a) && l.a(this.f153470b, hVar.f153470b);
    }

    public final int hashCode() {
        g gVar = this.f153469a;
        int i2 = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        ModelInfo modelInfo = this.f153470b;
        if (modelInfo != null) {
            i2 = modelInfo.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ModelInfoCache(localModelInfo=" + this.f153469a + ", serverModelInfo=" + this.f153470b + ")";
    }

    public h(g gVar, ModelInfo modelInfo) {
        l.c(gVar, "");
        l.c(modelInfo, "");
        this.f153469a = gVar;
        this.f153470b = modelInfo;
    }
}
