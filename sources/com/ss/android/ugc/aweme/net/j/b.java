package com.ss.android.ugc.aweme.net.j;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.ab;
import h.f.b.l;
import java.util.List;
import java.util.Set;

public final class b {
    @c(a = "enable")

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f112393a;
    @c(a = "scope")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f112394b;
    @c(a = "regions")

    /* renamed from: c  reason: collision with root package name */
    public final Set<String> f112395c;
    @c(a = "denyKeys")

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f112396d;
    @c(a = "allowApis")

    /* renamed from: e  reason: collision with root package name */
    public final List<a> f112397e;

    static {
        Covode.recordClassIndex(72246);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f112393a, bVar.f112393a) && l.a(this.f112394b, bVar.f112394b) && l.a(this.f112395c, bVar.f112395c) && l.a(this.f112396d, bVar.f112396d) && l.a(this.f112397e, bVar.f112397e);
    }

    public final int hashCode() {
        Boolean bool = this.f112393a;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.f112394b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Set<String> set = this.f112395c;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Set<String> set2 = this.f112396d;
        int hashCode4 = (hashCode3 + (set2 != null ? set2.hashCode() : 0)) * 31;
        List<a> list = this.f112397e;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "HeaderParamConfig(enable=" + this.f112393a + ", scope=" + this.f112394b + ", regions=" + this.f112395c + ", denyKeys=" + this.f112396d + ", allowApis=" + this.f112397e + ")";
    }

    private /* synthetic */ b() {
        this(false, ab.INSTANCE, ab.INSTANCE);
    }

    private b(Boolean bool, Set<String> set, Set<String> set2) {
        this.f112393a = bool;
        this.f112394b = null;
        this.f112395c = set;
        this.f112396d = set2;
        this.f112397e = null;
    }
}
