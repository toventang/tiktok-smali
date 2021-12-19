package com.ss.android.ugc.aweme.filter.repository.internal;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f95588a;

    /* renamed from: b  reason: collision with root package name */
    public final String f95589b;

    static {
        Covode.recordClassIndex(60573);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f95588a, dVar.f95588a) && l.a(this.f95589b, dVar.f95589b);
    }

    public final int hashCode() {
        String str = this.f95588a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f95589b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilterPaths(filterFilePath=" + this.f95588a + ", filterFolder=" + this.f95589b + ")";
    }

    public d(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f95588a = str;
        this.f95589b = str2;
    }
}
