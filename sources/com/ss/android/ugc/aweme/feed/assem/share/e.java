package com.ss.android.ugc.aweme.feed.assem.share;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a */
    public final boolean f92448a;

    /* renamed from: b */
    public final Float f92449b;

    /* renamed from: c */
    public final String f92450c;

    static {
        Covode.recordClassIndex(58524);
    }

    public e() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f92448a == eVar.f92448a && l.a(this.f92449b, eVar.f92449b) && l.a(this.f92450c, eVar.f92450c);
    }

    public final int hashCode() {
        boolean z = this.f92448a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Float f2 = this.f92449b;
        int i6 = 0;
        int hashCode = (i5 + (f2 != null ? f2.hashCode() : 0)) * 31;
        String str = this.f92450c;
        if (str != null) {
            i6 = str.hashCode();
        }
        return hashCode + i6;
    }

    public final String toString() {
        return "ShareCountState(visible=" + this.f92448a + ", size=" + this.f92449b + ", text=" + this.f92450c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z, int i2) {
        this((i2 & 1) != 0 ? true : z, null, null);
    }

    public static /* synthetic */ e a(e eVar, String str) {
        return new e(eVar.f92448a, eVar.f92449b, str);
    }

    public e(boolean z, Float f2, String str) {
        this.f92448a = z;
        this.f92449b = f2;
        this.f92450c = str;
    }
}
