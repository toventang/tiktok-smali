package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public final String f123080a;

    /* renamed from: b  reason: collision with root package name */
    public final String f123081b;

    /* renamed from: c  reason: collision with root package name */
    public final String f123082c;

    static {
        Covode.recordClassIndex(80839);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return l.a(this.f123080a, abVar.f123080a) && l.a(this.f123081b, abVar.f123081b) && l.a(this.f123082c, abVar.f123082c);
    }

    public final int hashCode() {
        String str = this.f123080a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f123081b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f123082c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ResourceInterceptItem(url=" + this.f123080a + ", channel=" + this.f123081b + ", fileName=" + this.f123082c + ")";
    }
}
