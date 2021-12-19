package com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a;

import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f101551a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f101552b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f101553c;

    static {
        Covode.recordClassIndex(64931);
    }

    public e() {
        this((List) null, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f101551a, eVar.f101551a) && this.f101552b == eVar.f101552b && this.f101553c == eVar.f101553c;
    }

    public final int hashCode() {
        List<a> list = this.f101551a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f101552b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.f101553c) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "GroupRequestInfo(requests=" + this.f101551a + ", hasMore=" + this.f101552b + ", isLoading=" + this.f101553c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(List list, boolean z, int i2) {
        this((List<a>) ((i2 & 1) != 0 ? z.INSTANCE : list), (i2 & 2) != 0 ? false : z, false);
    }

    private e(List<a> list, boolean z, boolean z2) {
        l.d(list, "");
        this.f101551a = list;
        this.f101552b = z;
        this.f101553c = z2;
    }

    public static /* synthetic */ e a(e eVar, List list, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            list = eVar.f101551a;
        }
        if ((i2 & 2) != 0) {
            z = eVar.f101552b;
        }
        if ((i2 & 4) != 0) {
            z2 = eVar.f101553c;
        }
        l.d(list, "");
        return new e(list, z, z2);
    }
}
