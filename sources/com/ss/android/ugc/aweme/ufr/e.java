package com.ss.android.ugc.aweme.ufr;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f141691a;

    /* renamed from: b  reason: collision with root package name */
    public int f141692b;

    /* renamed from: c  reason: collision with root package name */
    public final int f141693c;

    /* renamed from: d  reason: collision with root package name */
    public final String f141694d;

    static {
        Covode.recordClassIndex(92608);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f141691a == eVar.f141691a && this.f141692b == eVar.f141692b && this.f141693c == eVar.f141693c && l.a(this.f141694d, eVar.f141694d);
    }

    public final int hashCode() {
        boolean z = this.f141691a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = ((((i2 * 31) + this.f141692b) * 31) + this.f141693c) * 31;
        String str = this.f141694d;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UFRResult(status=" + this.f141691a + ", syncFrom=" + this.f141692b + ", requestStatusCode=" + this.f141693c + ", message=" + this.f141694d + ")";
    }

    private e(boolean z, int i2, int i3, String str) {
        l.c(str, "");
        this.f141691a = z;
        this.f141692b = i2;
        this.f141693c = i3;
        this.f141694d = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, int i2, int i3, String str, int i4) {
        this(z, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? "" : str);
    }
}
