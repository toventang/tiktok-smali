package com.ss.android.ugc.tools.h.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import java.util.List;

public final class a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final List<V> f149201a;

    /* renamed from: b  reason: collision with root package name */
    public final List<p<K, List<V>>> f149202b;

    static {
        Covode.recordClassIndex(98255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f149201a, aVar.f149201a) && l.a(this.f149202b, aVar.f149202b);
    }

    public final int hashCode() {
        List<V> list = this.f149201a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<p<K, List<V>>> list2 = this.f149202b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CategoryList(list=" + this.f149201a + ", table=" + this.f149202b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends h.p<? extends K, ? extends java.util.List<? extends V>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends V> list, List<? extends p<? extends K, ? extends List<? extends V>>> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f149201a = list;
        this.f149202b = list2;
    }
}
