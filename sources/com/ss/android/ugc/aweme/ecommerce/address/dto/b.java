package com.ss.android.ugc.aweme.ecommerce.address.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "shipping_address")

    /* renamed from: a  reason: collision with root package name */
    public final Address f84326a;
    @c(a = "session_key")

    /* renamed from: b  reason: collision with root package name */
    public final String f84327b;
    @c(a = "autocomplete_address_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f84328c;

    static {
        Covode.recordClassIndex(52578);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f84326a, bVar.f84326a) && l.a(this.f84327b, bVar.f84327b) && l.a(this.f84328c, bVar.f84328c);
    }

    public final int hashCode() {
        Address address = this.f84326a;
        int i2 = 0;
        int hashCode = (address != null ? address.hashCode() : 0) * 31;
        String str = this.f84327b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f84328c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CandDetailPlaceRequest(shippingAddress=" + this.f84326a + ", sessionKey=" + this.f84327b + ", autocompleteAddressId=" + this.f84328c + ")";
    }

    public b(Address address, String str, String str2) {
        l.d(address, "");
        l.d(str, "");
        l.d(str2, "");
        this.f84326a = address;
        this.f84327b = str;
        this.f84328c = str2;
    }
}
