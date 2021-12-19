package com.bytedance.ies.powerlist.debug;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView f34284a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34285b;

    static {
        Covode.recordClassIndex(20483);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f34284a, bVar.f34284a) && l.a(this.f34285b, bVar.f34285b);
    }

    public final int hashCode() {
        RecyclerView recyclerView = this.f34284a;
        int i2 = 0;
        int hashCode = (recyclerView != null ? recyclerView.hashCode() : 0) * 31;
        String str = this.f34285b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FpsInfo(fpsList=" + this.f34284a + ", fpsName=" + this.f34285b + ")";
    }

    public b(RecyclerView recyclerView, String str) {
        l.c(recyclerView, "");
        l.c(str, "");
        this.f34284a = recyclerView;
        this.f34285b = str;
    }
}
