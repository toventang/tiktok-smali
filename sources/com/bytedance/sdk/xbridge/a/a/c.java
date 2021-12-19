package com.bytedance.sdk.xbridge.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.a.c;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public c.a f43908a;

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f43909b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f43910c;

    static {
        Covode.recordClassIndex(26829);
    }

    public c() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f43908a, cVar.f43908a) && l.a(this.f43909b, cVar.f43909b) && l.a(this.f43910c, cVar.f43910c);
    }

    public final int hashCode() {
        c.a aVar = this.f43908a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Set<String> set = this.f43909b;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f43910c;
        if (set2 != null) {
            i2 = set2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PermissionRule(access=" + this.f43908a + ", includedMethods=" + this.f43909b + ", excludedMethods=" + this.f43910c + ")";
    }

    private c(c.a aVar, Set<String> set, Set<String> set2) {
        l.c(aVar, "");
        l.c(set, "");
        l.c(set2, "");
        this.f43908a = aVar;
        this.f43909b = set;
        this.f43910c = set2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(c.a aVar, Set set, Set set2, int i2) {
        this((i2 & 1) != 0 ? c.a.PUBLIC : aVar, (i2 & 2) != 0 ? new LinkedHashSet() : set, (i2 & 4) != 0 ? new LinkedHashSet() : set2);
    }
}
