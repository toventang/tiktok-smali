package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f84802a;

    /* renamed from: b  reason: collision with root package name */
    public final String f84803b;

    /* renamed from: c  reason: collision with root package name */
    public final String f84804c;

    /* renamed from: d  reason: collision with root package name */
    public final String f84805d;

    /* renamed from: e  reason: collision with root package name */
    public final String f84806e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f84807f;

    /* renamed from: g  reason: collision with root package name */
    public final String f84808g;

    /* renamed from: h  reason: collision with root package name */
    public final String f84809h;

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f84810i;

    /* renamed from: j  reason: collision with root package name */
    public final Boolean f84811j;

    static {
        Covode.recordClassIndex(52996);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f84802a, aVar.f84802a) && l.a(this.f84803b, aVar.f84803b) && l.a(this.f84804c, aVar.f84804c) && l.a(this.f84805d, aVar.f84805d) && l.a(this.f84806e, aVar.f84806e) && this.f84807f == aVar.f84807f && l.a(this.f84808g, aVar.f84808g) && l.a(this.f84809h, aVar.f84809h) && l.a(this.f84810i, aVar.f84810i) && l.a(this.f84811j, aVar.f84811j);
    }

    public final int hashCode() {
        String str = this.f84802a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84803b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84804c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f84805d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f84806e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f84807f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        String str6 = this.f84808g;
        int hashCode6 = (i6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f84809h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Boolean bool = this.f84810i;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f84811j;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "AddressVO(name=" + this.f84802a + ", phone=" + this.f84803b + ", region=" + this.f84804c + ", addressDetail=" + this.f84805d + ", zipcode=" + this.f84806e + ", hasAddress=" + this.f84807f + ", email=" + this.f84808g + ", invalidHintMessage=" + this.f84809h + ", addressReachable=" + this.f84810i + ", addressValid=" + this.f84811j + ")";
    }

    public a(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, Boolean bool, Boolean bool2) {
        this.f84802a = str;
        this.f84803b = str2;
        this.f84804c = str3;
        this.f84805d = str4;
        this.f84806e = str5;
        this.f84807f = z;
        this.f84808g = str6;
        this.f84809h = str7;
        this.f84810i = bool;
        this.f84811j = bool2;
    }
}
