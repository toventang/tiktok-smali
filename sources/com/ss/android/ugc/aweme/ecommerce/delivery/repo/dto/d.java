package com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import h.f.b.l;

public final class d {
    @c(a = "address_reachable")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f85924a;
    @c(a = "shipping_address")

    /* renamed from: b  reason: collision with root package name */
    public final Address f85925b;
    @c(a = "invalid_hint_message")

    /* renamed from: c  reason: collision with root package name */
    public final String f85926c;
    @c(a = "address_valid")

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f85927d;

    static {
        Covode.recordClassIndex(53790);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f85924a == dVar.f85924a && l.a(this.f85925b, dVar.f85925b) && l.a(this.f85926c, dVar.f85926c) && l.a(this.f85927d, dVar.f85927d);
    }

    public final int hashCode() {
        boolean z = this.f85924a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        Address address = this.f85925b;
        int i6 = 0;
        int hashCode = (i5 + (address != null ? address.hashCode() : 0)) * 31;
        String str = this.f85926c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f85927d;
        if (bool != null) {
            i6 = bool.hashCode();
        }
        return hashCode2 + i6;
    }

    public final String toString() {
        return "ReachableAddress(reachable=" + this.f85924a + ", address=" + this.f85925b + ", invalidHintMessage=" + this.f85926c + ", addressValid=" + this.f85927d + ")";
    }
}
