package com.ss.android.ugc.aweme.cn;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f71232a;

    /* renamed from: b  reason: collision with root package name */
    public final h f71233b;

    /* renamed from: c  reason: collision with root package name */
    public final d f71234c;

    static {
        Covode.recordClassIndex(43844);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f71232a, iVar.f71232a) && l.a(this.f71233b, iVar.f71233b) && l.a(this.f71234c, iVar.f71234c);
    }

    public final int hashCode() {
        String str = this.f71232a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        h hVar = this.f71233b;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        d dVar = this.f71234c;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SensitiveApiEvent: type: " + this.f71232a + ", context: " + this.f71233b + ", action: " + this.f71234c;
    }

    public i(String str, h hVar, d dVar) {
        l.d(str, "");
        l.d(hVar, "");
        l.d(dVar, "");
        this.f71232a = str;
        this.f71233b = hVar;
        this.f71234c = dVar;
    }
}
