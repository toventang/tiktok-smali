package com.ss.android.ugc.aweme.challenge.f;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f69950a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f69951b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f69952c;

    static {
        Covode.recordClassIndex(43137);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f69950a, bVar.f69950a) && l.a(this.f69951b, bVar.f69951b) && l.a(this.f69952c, bVar.f69952c);
    }

    public final int hashCode() {
        Integer num = this.f69950a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f69951b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f69952c;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "TextProperty(width=" + this.f69950a + ", height=" + this.f69951b + ", lineCount=" + this.f69952c + ")";
    }

    public /* synthetic */ b() {
        this(-1, -1, -1);
    }

    public b(Integer num, Integer num2, Integer num3) {
        this.f69950a = num;
        this.f69951b = num2;
        this.f69952c = num3;
    }
}
