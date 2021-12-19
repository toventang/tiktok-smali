package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.j;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f57843a;

    /* renamed from: b  reason: collision with root package name */
    public final String f57844b;

    static {
        Covode.recordClassIndex(36000);
    }

    public final int hashCode() {
        int i2;
        String str = this.f57844b;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (i2 + 899) * 31;
        String str2 = this.f57843a;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        return this.f57843a + " realm=\"" + this.f57844b + "\"";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!j.a(this.f57843a, gVar.f57843a) || !j.a(this.f57844b, gVar.f57844b)) {
            return false;
        }
        return true;
    }

    public g(String str, String str2) {
        this.f57843a = str;
        this.f57844b = str2;
    }
}
