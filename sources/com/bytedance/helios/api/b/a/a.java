package com.bytedance.helios.api.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.f;
import h.f.b.l;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final String f30645a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30646b;

    static {
        Covode.recordClassIndex(17804);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f30645a, aVar.f30645a) && l.a(this.f30646b, aVar.f30646b);
    }

    public final int hashCode() {
        String str = this.f30645a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f30646b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AppOpsApmEvent(apiName=" + this.f30645a + ", opsName=" + this.f30646b + ")";
    }

    public a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f30645a = str;
        this.f30646b = str2;
    }
}
