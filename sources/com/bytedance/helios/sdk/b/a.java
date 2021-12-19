package com.bytedance.helios.sdk.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f30789a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30790b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30791c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30792d;

    /* renamed from: e  reason: collision with root package name */
    public final String f30793e;

    /* renamed from: f  reason: collision with root package name */
    public final String f30794f;

    /* renamed from: g  reason: collision with root package name */
    public final String f30795g;

    /* renamed from: h  reason: collision with root package name */
    public final String f30796h;

    /* renamed from: i  reason: collision with root package name */
    public final String f30797i;

    /* renamed from: j  reason: collision with root package name */
    public final String f30798j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f30799k = false;

    static {
        Covode.recordClassIndex(17894);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30789a == aVar.f30789a && this.f30790b == aVar.f30790b && this.f30791c == aVar.f30791c && l.a(this.f30792d, aVar.f30792d) && l.a(this.f30793e, aVar.f30793e) && l.a(this.f30794f, aVar.f30794f) && l.a(this.f30795g, aVar.f30795g) && l.a(this.f30796h, aVar.f30796h) && l.a(this.f30797i, aVar.f30797i) && l.a(this.f30798j, aVar.f30798j) && this.f30799k == aVar.f30799k;
    }

    public final int hashCode() {
        int i2 = ((((this.f30789a * 31) + this.f30790b) * 31) + this.f30791c) * 31;
        String str = this.f30792d;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f30793e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f30794f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f30795g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f30796h;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f30797i;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f30798j;
        if (str7 != null) {
            i3 = str7.hashCode();
        }
        int i4 = (hashCode6 + i3) * 31;
        boolean z = this.f30799k;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "SensitiveApiConfig(id=" + this.f30789a + ", invokeType=" + this.f30790b + ", type=" + this.f30791c + ", className=" + this.f30792d + ", memberName=" + this.f30793e + ", desc=" + this.f30794f + ", scopes=" + this.f30795g + ", actionName=" + this.f30796h + ", resourceName=" + this.f30797i + ", resourceId=" + this.f30798j + ", isCustomApi=" + this.f30799k + ")";
    }

    public a(int i2, int i3, int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(str4, "");
        l.c(str5, "");
        l.c(str6, "");
        l.c(str7, "");
        this.f30789a = i2;
        this.f30790b = i3;
        this.f30791c = i4;
        this.f30792d = str;
        this.f30793e = str2;
        this.f30794f = str3;
        this.f30795g = str4;
        this.f30796h = str5;
        this.f30797i = str6;
        this.f30798j = str7;
    }
}
