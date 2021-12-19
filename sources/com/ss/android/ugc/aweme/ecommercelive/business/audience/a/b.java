package com.ss.android.ugc.aweme.ecommercelive.business.audience.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "enable_new_style")

    /* renamed from: a  reason: collision with root package name */
    public boolean f87741a;
    @c(a = "show_time")

    /* renamed from: b  reason: collision with root package name */
    public long f87742b;

    static {
        Covode.recordClassIndex(55189);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f87741a == bVar.f87741a && this.f87742b == bVar.f87742b;
    }

    public final int hashCode() {
        boolean z = this.f87741a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j2 = this.f87742b;
        return (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "PinCardStyleConfig(enableNewStyle=" + this.f87741a + ", showTime=" + this.f87742b + ")";
    }

    private b() {
        this.f87741a = false;
        this.f87742b = 30000;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }
}
