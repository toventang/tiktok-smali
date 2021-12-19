package com.bytedance.creativex.filter.view.widget;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f28049a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28050b;

    static {
        Covode.recordClassIndex(16425);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f28049a, bVar.f28049a) && l.a(this.f28050b, bVar.f28050b);
    }

    public final int hashCode() {
        String str = this.f28049a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f28050b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterNameWithCategory(filterName=" + this.f28049a + ", category=" + this.f28050b + ")";
    }

    public b(String str, String str2) {
        l.d(str, "");
        this.f28049a = str;
        this.f28050b = str2;
    }
}
