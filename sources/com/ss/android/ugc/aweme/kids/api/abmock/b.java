package com.ss.android.ugc.aweme.kids.api.abmock;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f105386a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f105387b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f105388c;

    static {
        Covode.recordClassIndex(67547);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f105386a, bVar.f105386a) && this.f105387b == bVar.f105387b && l.a(this.f105388c, bVar.f105388c);
    }

    public final int hashCode() {
        String str = this.f105386a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f105387b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        Object obj = this.f105388c;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "KidsGroups(option=" + this.f105386a + ", isDefault=" + this.f105387b + ", value=" + this.f105388c + ")";
    }

    public b(String str, boolean z, Object obj) {
        l.d(str, "");
        l.d(obj, "");
        this.f105386a = str;
        this.f105387b = z;
        this.f105388c = obj;
    }
}
