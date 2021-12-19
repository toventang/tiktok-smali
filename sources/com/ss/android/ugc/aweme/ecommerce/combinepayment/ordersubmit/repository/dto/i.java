package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class i {
    @c(a = "text")

    /* renamed from: a  reason: collision with root package name */
    public final String f84966a;
    @c(a = "link")

    /* renamed from: b  reason: collision with root package name */
    public final String f84967b;
    @c(a = "is_third_party_link")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f84968c;

    static {
        Covode.recordClassIndex(53128);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f84966a, iVar.f84966a) && l.a(this.f84967b, iVar.f84967b) && l.a(this.f84968c, iVar.f84968c);
    }

    public final int hashCode() {
        String str = this.f84966a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84967b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f84968c;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "LinkText(text=" + this.f84966a + ", link=" + this.f84967b + ", isThirdPartyLink=" + this.f84968c + ")";
    }
}
