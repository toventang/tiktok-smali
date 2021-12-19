package com.ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class f {
    @c(a = "target_item_key")

    /* renamed from: a  reason: collision with root package name */
    public final String f84338a;
    @c(a = "shipping_address")

    /* renamed from: b  reason: collision with root package name */
    public final Address f84339b;

    static {
        Covode.recordClassIndex(52582);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f84338a, fVar.f84338a) && l.a(this.f84339b, fVar.f84339b);
    }

    public final int hashCode() {
        String str = this.f84338a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Address address = this.f84339b;
        if (address != null) {
            i2 = address.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CandInputRequest(itemKey=" + this.f84338a + ", address=" + this.f84339b + ")";
    }

    public f(String str, Address address) {
        l.d(address, "");
        this.f84338a = str;
        this.f84339b = address;
    }
}
