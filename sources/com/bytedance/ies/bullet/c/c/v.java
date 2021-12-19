package com.bytedance.ies.bullet.c.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final i f32070a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32071b;

    static {
        Covode.recordClassIndex(18798);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return l.a(this.f32070a, vVar.f32070a) && this.f32071b == vVar.f32071b;
    }

    public final int hashCode() {
        i iVar = this.f32070a;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        boolean z = this.f32071b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "KitProcessResult(instance=" + this.f32070a + ", isNewInstance=" + this.f32071b + ")";
    }

    public v(i iVar, boolean z) {
        l.c(iVar, "");
        this.f32070a = iVar;
        this.f32071b = z;
    }
}
