package com.ss.android.ugc.aweme.bg;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.Arrays;

public final class d {
    @c(a = "show_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f68666a;
    @c(a = "number")

    /* renamed from: b  reason: collision with root package name */
    public final long[] f68667b;

    static {
        Covode.recordClassIndex(42257);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f68666a, dVar.f68666a) && l.a(this.f68667b, dVar.f68667b);
    }

    public final int hashCode() {
        String str = this.f68666a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long[] jArr = this.f68667b;
        if (jArr != null) {
            i2 = Arrays.hashCode(jArr);
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "KproPopupPeriod(show_id=" + this.f68666a + ", timePair=" + Arrays.toString(this.f68667b) + ")";
    }
}
