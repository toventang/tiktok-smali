package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class f {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f72377a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f72378b;
    @c(a = "data")

    /* renamed from: c  reason: collision with root package name */
    public final e f72379c;

    static {
        Covode.recordClassIndex(44624);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f72377a == fVar.f72377a && l.a(this.f72378b, fVar.f72378b) && l.a(this.f72379c, fVar.f72379c);
    }

    public final int hashCode() {
        int i2 = this.f72377a * 31;
        String str = this.f72378b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        e eVar = this.f72379c;
        if (eVar != null) {
            i3 = eVar.hashCode();
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "GiftSupporterPanelResponse(code=" + this.f72377a + ", msg=" + this.f72378b + ", data=" + this.f72379c + ")";
    }
}
