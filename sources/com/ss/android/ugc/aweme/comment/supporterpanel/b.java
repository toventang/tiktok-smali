package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class b {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f72357a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f72358b;
    @c(a = "senders")

    /* renamed from: c  reason: collision with root package name */
    public final List<d> f72359c;
    @c(a = "has_more")

    /* renamed from: d  reason: collision with root package name */
    public final boolean f72360d;
    @c(a = "cursor")

    /* renamed from: e  reason: collision with root package name */
    public final Long f72361e;

    static {
        Covode.recordClassIndex(44620);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f72357a == bVar.f72357a && l.a(this.f72358b, bVar.f72358b) && l.a(this.f72359c, bVar.f72359c) && this.f72360d == bVar.f72360d && l.a(this.f72361e, bVar.f72361e);
    }

    public final int hashCode() {
        int i2 = this.f72357a * 31;
        String str = this.f72358b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        List<d> list = this.f72359c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.f72360d;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode2 + i4) * 31;
        Long l2 = this.f72361e;
        if (l2 != null) {
            i3 = l2.hashCode();
        }
        return i7 + i3;
    }

    public final String toString() {
        return "GiftListPanelResponse(code=" + this.f72357a + ", msg=" + this.f72358b + ", senders=" + this.f72359c + ", hasMore=" + this.f72360d + ", cursor=" + this.f72361e + ")";
    }
}
