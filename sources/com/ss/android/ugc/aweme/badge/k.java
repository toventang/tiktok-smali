package com.ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f67930a;

    /* renamed from: b  reason: collision with root package name */
    public final String f67931b;

    /* renamed from: c  reason: collision with root package name */
    public final List<h> f67932c;

    /* renamed from: d  reason: collision with root package name */
    public final d f67933d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f67934e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f67935f;

    static {
        Covode.recordClassIndex(41819);
    }

    public k() {
        this(null, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f67930a, kVar.f67930a) && l.a(this.f67931b, kVar.f67931b) && l.a(this.f67932c, kVar.f67932c) && l.a(this.f67933d, kVar.f67933d) && this.f67934e == kVar.f67934e && this.f67935f == kVar.f67935f;
    }

    public final int hashCode() {
        Integer num = this.f67930a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f67931b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<h> list = this.f67932c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        d dVar = this.f67933d;
        if (dVar != null) {
            i2 = dVar.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z = this.f67934e;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        if (!this.f67935f) {
            i4 = 0;
        }
        return i8 + i4;
    }

    public final String toString() {
        return "Result(statusCode=" + this.f67930a + ", statusMsg=" + this.f67931b + ", data=" + this.f67932c + ", campaign=" + this.f67933d + ", isLoading=" + this.f67934e + ", loadSuccess=" + this.f67935f + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(List list, boolean z, int i2) {
        this(null, null, (i2 & 4) != 0 ? null : list, null, (i2 & 16) != 0 ? true : z, false);
    }

    public k(Integer num, String str, List<h> list, d dVar, boolean z, boolean z2) {
        this.f67930a = num;
        this.f67931b = str;
        this.f67932c = list;
        this.f67933d = dVar;
        this.f67934e = z;
        this.f67935f = z2;
    }
}
