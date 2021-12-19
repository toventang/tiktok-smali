package com.ss.android.ugc.aweme.account.bean;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f62895a;

    /* renamed from: b  reason: collision with root package name */
    public final int f62896b;

    /* renamed from: c  reason: collision with root package name */
    public final String f62897c;

    static {
        Covode.recordClassIndex(38749);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f62895a, dVar.f62895a) && this.f62896b == dVar.f62896b && l.a(this.f62897c, dVar.f62897c);
    }

    public final int hashCode() {
        String str = this.f62895a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f62896b) * 31;
        String str2 = this.f62897c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PlatformInfo(name=" + this.f62895a + ", iconResID=" + this.f62896b + ", type=" + this.f62897c + ")";
    }

    public d(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f62895a = str;
        this.f62896b = i2;
        this.f62897c = str2;
    }
}
