package com.bytedance.android.live.effect.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f9885a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9886b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9887c;

    static {
        Covode.recordClassIndex(5061);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f9885a, bVar.f9885a) && l.a(this.f9886b, bVar.f9886b) && l.a(this.f9887c, bVar.f9887c);
    }

    public final int hashCode() {
        String str = this.f9885a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9886b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9887c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EffectLogData(roomId=" + this.f9885a + ", anchorId=" + this.f9886b + ", logPage=" + this.f9887c + ")";
    }

    public b(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f9885a = str;
        this.f9886b = str2;
        this.f9887c = str3;
    }
}
