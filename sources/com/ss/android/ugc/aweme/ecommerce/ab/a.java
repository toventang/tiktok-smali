package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.language.d;
import h.f.b.l;

public final class a {
    @c(a = "enable_fast_edit")

    /* renamed from: a  reason: collision with root package name */
    public boolean f84203a;
    @c(a = "enable_check")

    /* renamed from: b  reason: collision with root package name */
    public boolean f84204b;
    @c(a = "enable_lynx")

    /* renamed from: c  reason: collision with root package name */
    public boolean f84205c;

    static {
        Covode.recordClassIndex(52517);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f84203a == aVar.f84203a && this.f84204b == aVar.f84204b && this.f84205c == aVar.f84205c;
    }

    public final int hashCode() {
        boolean z = this.f84203a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f84204b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f84205c) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "AddressEditConfig(enableFastEdit=" + this.f84203a + ", enableCheck=" + this.f84204b + ", enableLynx=" + this.f84205c + ")";
    }

    public /* synthetic */ a() {
        this(l.a((Object) "GB", (Object) d.a()));
    }

    private a(boolean z) {
        this.f84203a = z;
        this.f84204b = true;
        this.f84205c = true;
    }
}
