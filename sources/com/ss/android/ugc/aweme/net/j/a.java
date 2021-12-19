package com.ss.android.ugc.aweme.net.j;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.ab;
import h.f.b.l;
import java.util.Set;

public final class a {
    @c(a = "domains")

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f112391a;
    @c(a = "paths")

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f112392b;

    static {
        Covode.recordClassIndex(72245);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f112391a, aVar.f112391a) && l.a(this.f112392b, aVar.f112392b);
    }

    public final int hashCode() {
        Set<String> set = this.f112391a;
        int i2 = 0;
        int hashCode = (set != null ? set.hashCode() : 0) * 31;
        Set<String> set2 = this.f112392b;
        if (set2 != null) {
            i2 = set2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AllowApiConfig(domains=" + this.f112391a + ", paths=" + this.f112392b + ")";
    }

    private /* synthetic */ a() {
        this(ab.INSTANCE, ab.INSTANCE);
    }

    private a(Set<String> set, Set<String> set2) {
        this.f112391a = set;
        this.f112392b = set2;
    }
}
