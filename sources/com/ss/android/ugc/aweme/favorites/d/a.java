package com.ss.android.ugc.aweme.favorites.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f90593a;

    /* renamed from: b  reason: collision with root package name */
    public final int f90594b;

    static {
        Covode.recordClassIndex(56909);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f90593a, aVar.f90593a) && this.f90594b == aVar.f90594b;
    }

    public final int hashCode() {
        String str = this.f90593a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f90594b;
    }

    public final String toString() {
        return "CollectAwemeEvent(awemeId=" + this.f90593a + ", action=" + this.f90594b + ")";
    }

    public a(String str, int i2) {
        l.d(str, "");
        this.f90593a = str;
        this.f90594b = i2;
    }
}
