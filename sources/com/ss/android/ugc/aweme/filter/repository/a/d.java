package com.ss.android.ugc.aweme.filter.repository.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f95544a;

    /* renamed from: b  reason: collision with root package name */
    public final g f95545b;

    /* renamed from: c  reason: collision with root package name */
    public final String f95546c;

    /* renamed from: d  reason: collision with root package name */
    public final String f95547d;

    static {
        Covode.recordClassIndex(60548);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f95544a == dVar.f95544a && l.a(this.f95545b, dVar.f95545b) && l.a(this.f95546c, dVar.f95546c) && l.a(this.f95547d, dVar.f95547d);
    }

    public final int hashCode() {
        int i2 = this.f95544a * 31;
        g gVar = this.f95545b;
        int i3 = 0;
        int hashCode = (i2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str = this.f95546c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f95547d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "FilterInfo(id=" + this.f95544a + ", state=" + this.f95545b + ", filterFilePath=" + this.f95546c + ", filterFolder=" + this.f95547d + ")";
    }

    public d(int i2, g gVar, String str, String str2) {
        l.d(gVar, "");
        l.d(str, "");
        l.d(str2, "");
        this.f95544a = i2;
        this.f95545b = gVar;
        this.f95546c = str;
        this.f95547d = str2;
    }
}
