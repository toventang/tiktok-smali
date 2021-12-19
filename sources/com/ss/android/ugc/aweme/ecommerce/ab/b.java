package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "coupon_panel_schema")

    /* renamed from: a  reason: collision with root package name */
    public final String f84206a;
    @c(a = "prefetch_schema")

    /* renamed from: b  reason: collision with root package name */
    public final n f84207b;

    static {
        Covode.recordClassIndex(52518);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f84206a, bVar.f84206a) && l.a(this.f84207b, bVar.f84207b);
    }

    public final int hashCode() {
        String str = this.f84206a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        n nVar = this.f84207b;
        if (nVar != null) {
            i2 = nVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ECSettingConfig(couponPanelSchema=" + this.f84206a + ", prefetchSchema=" + this.f84207b + ")";
    }

    private b() {
        this.f84206a = null;
        this.f84207b = null;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
