package com.bytedance.helios.api.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashSet;
import java.util.Set;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Set<String> f30661a;

    /* renamed from: b  reason: collision with root package name */
    public Set<j> f30662b;

    static {
        Covode.recordClassIndex(17813);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f30661a, iVar.f30661a) && l.a(this.f30662b, iVar.f30662b);
    }

    public final int hashCode() {
        Set<String> set = this.f30661a;
        int i2 = 0;
        int hashCode = (set != null ? set.hashCode() : 0) * 31;
        Set<j> set2 = this.f30662b;
        if (set2 != null) {
            i2 = set2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FrequencyExtra(frequencyNames=" + this.f30661a + ", frequencyLogs=" + this.f30662b + ")";
    }

    public /* synthetic */ i() {
        this(new LinkedHashSet(), new LinkedHashSet());
    }

    private i(Set<String> set, Set<j> set2) {
        l.c(set, "");
        l.c(set2, "");
        this.f30661a = set;
        this.f30662b = set2;
    }
}
