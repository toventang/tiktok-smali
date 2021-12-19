package com.bytedance.tux.g;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Long f45067a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f45068b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f45069c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f45070d;

    /* renamed from: e  reason: collision with root package name */
    public long f45071e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f45072f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f45073g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f45074h;

    /* renamed from: i  reason: collision with root package name */
    public int f45075i;

    static {
        Covode.recordClassIndex(27495);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f45067a, cVar.f45067a) && l.a(this.f45068b, cVar.f45068b) && l.a(this.f45069c, cVar.f45069c) && l.a(this.f45070d, cVar.f45070d) && this.f45071e == cVar.f45071e && this.f45072f == cVar.f45072f && this.f45073g == cVar.f45073g && this.f45074h == cVar.f45074h && this.f45075i == cVar.f45075i;
    }

    public final int hashCode() {
        Long l2 = this.f45067a;
        int i2 = 0;
        int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
        CharSequence charSequence = this.f45068b;
        int hashCode2 = (hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        Integer num = this.f45069c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f45070d;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        long j2 = this.f45071e;
        int i3 = (((hashCode3 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z = this.f45072f;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        boolean z2 = this.f45073g;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        if (!this.f45074h) {
            i4 = 0;
        }
        return ((i12 + i4) * 31) + this.f45075i;
    }

    public final String toString() {
        return "TuxToastBundle(expireTime=" + this.f45067a + ", message=" + this.f45068b + ", icon=" + this.f45069c + ", iconColor=" + this.f45070d + ", duration=" + this.f45071e + ", hasShowAnimation=" + this.f45072f + ", hasDismissAnimation=" + this.f45073g + ", acrossActivities=" + this.f45074h + ", uniqueIdForReuse=" + this.f45075i + ")";
    }

    public /* synthetic */ c() {
        this(null, null, null, null, 3000, true, true, false, 0);
    }

    public c(Long l2, CharSequence charSequence, Integer num, Integer num2, long j2, boolean z, boolean z2, boolean z3, int i2) {
        this.f45067a = l2;
        this.f45068b = charSequence;
        this.f45069c = num;
        this.f45070d = num2;
        this.f45071e = j2;
        this.f45072f = z;
        this.f45073g = z2;
        this.f45074h = z3;
        this.f45075i = i2;
    }
}
