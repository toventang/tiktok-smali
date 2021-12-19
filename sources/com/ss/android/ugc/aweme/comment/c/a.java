package com.ss.android.ugc.aweme.comment.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f71742a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f71743b;

    static {
        Covode.recordClassIndex(44121);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f71742a, aVar.f71742a) && l.a(this.f71743b, aVar.f71743b);
    }

    public final int hashCode() {
        Integer num = this.f71742a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f71743b;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CachedCommentsExpandEvent(index=" + this.f71742a + ", distance=" + this.f71743b + ")";
    }

    public a(Integer num, Integer num2) {
        this.f71742a = num;
        this.f71743b = num2;
    }
}
