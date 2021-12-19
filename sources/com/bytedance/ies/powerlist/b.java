package com.bytedance.ies.powerlist;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f34258a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f34259b;

    static {
        Covode.recordClassIndex(20470);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f34258a, bVar.f34258a) && this.f34259b == bVar.f34259b;
    }

    public final int hashCode() {
        List<T> list = this.f34258a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f34259b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "ListStateContent(items=" + this.f34258a + ", manual=" + this.f34259b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends T> list, boolean z) {
        l.c(list, "");
        this.f34258a = list;
        this.f34259b = z;
    }
}
