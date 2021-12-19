package com.ss.android.ugc.aweme.authorize.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f67111a;

    /* renamed from: b  reason: collision with root package name */
    public final String f67112b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f67113c;

    /* renamed from: d  reason: collision with root package name */
    public final String f67114d;

    /* renamed from: e  reason: collision with root package name */
    public final String f67115e;

    /* renamed from: f  reason: collision with root package name */
    public final String f67116f;

    /* renamed from: g  reason: collision with root package name */
    public final String f67117g;

    static {
        Covode.recordClassIndex(41350);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f67111a, bVar.f67111a) && l.a(this.f67112b, bVar.f67112b) && l.a(this.f67113c, bVar.f67113c) && l.a(this.f67114d, bVar.f67114d) && l.a(this.f67115e, bVar.f67115e) && l.a(this.f67116f, bVar.f67116f) && l.a(this.f67117g, bVar.f67117g);
    }

    public final int hashCode() {
        String str = this.f67111a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f67112b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f67113c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f67114d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f67115e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f67116f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f67117g;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "QRCodeScanParams(ticket=" + this.f67111a + ", token=" + this.f67112b + ", authType=" + this.f67113c + ", clientKey=" + this.f67114d + ", clientSecret=" + this.f67115e + ", scope=" + this.f67116f + ", nextURL=" + this.f67117g + ")";
    }

    public b(String str, String str2, Integer num, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        this.f67111a = str;
        this.f67112b = str2;
        this.f67113c = num;
        this.f67114d = str3;
        this.f67115e = str4;
        this.f67116f = str5;
        this.f67117g = str6;
    }
}
