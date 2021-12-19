package com.bytedance.ies.bullet.kit.rn;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f32382a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32383b = null;

    static {
        Covode.recordClassIndex(19137);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f32382a, kVar.f32382a) && l.a(this.f32383b, kVar.f32383b);
    }

    public final int hashCode() {
        List<String> list = this.f32382a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f32383b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SourceUrlSettings(whiteListHosts=" + this.f32382a + ", debugSafeHost=" + this.f32383b + ")";
    }

    public k(List<String> list) {
        l.c(list, "");
        this.f32382a = list;
    }
}
