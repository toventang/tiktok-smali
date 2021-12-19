package com.bytedance.android.livesdk.chatroom.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public final m f15081a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15082b;

    static {
        Covode.recordClassIndex(8372);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return l.a(this.f15081a, afVar.f15081a) && this.f15082b == afVar.f15082b;
    }

    public final int hashCode() {
        m mVar = this.f15081a;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        boolean z = this.f15082b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "SendCommentResult(subject=" + this.f15081a + ", success=" + this.f15082b + ")";
    }

    public af(m mVar, boolean z) {
        l.d(mVar, "");
        this.f15081a = mVar;
        this.f15082b = z;
    }
}
