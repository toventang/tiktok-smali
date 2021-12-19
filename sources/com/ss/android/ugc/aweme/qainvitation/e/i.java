package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class i {
    @c(a = "block_type")

    /* renamed from: a  reason: collision with root package name */
    public Integer f119154a;
    @c(a = "mention_type")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f119155b;

    static {
        Covode.recordClassIndex(77374);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f119154a, iVar.f119154a) && l.a(this.f119155b, iVar.f119155b);
    }

    public final int hashCode() {
        Integer num = this.f119154a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f119155b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UserBlockedResult(blockType=" + this.f119154a + ", mentionType=" + this.f119155b + ")";
    }
}
