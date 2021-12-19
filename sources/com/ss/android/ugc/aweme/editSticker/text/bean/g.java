package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class g {
    @c(a = "ifstandard")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f88424a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f88425b;

    static {
        Covode.recordClassIndex(55652);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f88424a == gVar.f88424a && this.f88425b == gVar.f88425b;
    }

    public final int hashCode() {
        boolean z = this.f88424a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f88425b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "EffectTextEffectExtra(ifStandard=" + this.f88424a + ", ifNone=" + this.f88425b + ")";
    }

    public /* synthetic */ g() {
        this(false, false);
    }

    public g(boolean z, boolean z2) {
        this.f88424a = z;
        this.f88425b = z2;
    }
}
