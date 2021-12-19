package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f34516a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34517b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends com.bytedance.ies.powerpreload.b.d> f34518c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f34519d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f34520e;

    /* renamed from: f  reason: collision with root package name */
    public String f34521f;

    /* renamed from: g  reason: collision with root package name */
    public String f34522g;

    static {
        Covode.recordClassIndex(20648);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f34519d, dVar.f34519d) && l.a(this.f34520e, dVar.f34520e) && l.a(this.f34521f, dVar.f34521f) && l.a(this.f34522g, dVar.f34522g);
    }

    public final int hashCode() {
        List<String> list = this.f34519d;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f34520e;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f34521f;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34522g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "RelationData(preLoads=" + this.f34519d + ", uriList=" + this.f34520e + ", owner=" + this.f34521f + ", stubOwner=" + this.f34522g + ")";
    }

    public /* synthetic */ d(List list, List list2) {
        this(list, list2, null, null);
    }

    public d(List<String> list, List<String> list2, String str, String str2) {
        l.c(list, "");
        l.c(list2, "");
        this.f34519d = list;
        this.f34520e = list2;
        this.f34521f = str;
        this.f34522g = str2;
    }
}
