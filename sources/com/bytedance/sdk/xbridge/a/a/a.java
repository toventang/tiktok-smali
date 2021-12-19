package com.bytedance.sdk.xbridge.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.a.c;
import h.f.b.l;
import java.util.List;
import java.util.regex.Pattern;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Pattern f43900a;

    /* renamed from: b  reason: collision with root package name */
    public c.a f43901b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f43902c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f43903d;

    static {
        Covode.recordClassIndex(26826);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f43900a, aVar.f43900a) && l.a(this.f43901b, aVar.f43901b) && l.a(this.f43902c, aVar.f43902c) && l.a(this.f43903d, aVar.f43903d);
    }

    public final int hashCode() {
        Pattern pattern = this.f43900a;
        int i2 = 0;
        int hashCode = (pattern != null ? pattern.hashCode() : 0) * 31;
        c.a aVar = this.f43901b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<String> list = this.f43902c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f43903d;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "PermissionConfig(pattern=" + this.f43900a + ", access=" + this.f43901b + ", includedMethods=" + this.f43902c + ", excludedMethods=" + this.f43903d + ")";
    }

    public a(Pattern pattern, c.a aVar, List<String> list, List<String> list2) {
        l.c(aVar, "");
        l.c(list, "");
        l.c(list2, "");
        this.f43900a = pattern;
        this.f43901b = aVar;
        this.f43902c = list;
        this.f43903d = list2;
    }
}
