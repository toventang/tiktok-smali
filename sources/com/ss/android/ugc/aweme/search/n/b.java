package com.ss.android.ugc.aweme.search.n;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f121540a;

    /* renamed from: b  reason: collision with root package name */
    public String f121541b;

    static {
        Covode.recordClassIndex(79165);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f121540a, bVar.f121540a) && l.a(this.f121541b, bVar.f121541b);
    }

    public final int hashCode() {
        String str = this.f121540a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f121541b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchContainerData(searchId=" + this.f121540a + ", searchKey=" + this.f121541b + ")";
    }

    public /* synthetic */ b() {
        this("", "");
    }

    public final void a(String str) {
        l.d(str, "");
        this.f121540a = str;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f121541b = str;
    }

    public b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f121540a = str;
        this.f121541b = str2;
    }
}
