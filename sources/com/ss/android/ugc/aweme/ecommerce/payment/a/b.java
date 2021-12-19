package com.ss.android.ugc.aweme.ecommerce.payment.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "idc")

    /* renamed from: a  reason: collision with root package name */
    public final String f86268a;
    @c(a = "merchant_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f86269b;
    @c(a = "merchant_user_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f86270c;
    @c(a = "env")

    /* renamed from: d  reason: collision with root package name */
    public final String f86271d;
    @c(a = "nonce")

    /* renamed from: e  reason: collision with root package name */
    public final String f86272e;
    @c(a = "origin_key")

    /* renamed from: f  reason: collision with root package name */
    public final String f86273f;
    @c(a = "locale")

    /* renamed from: g  reason: collision with root package name */
    public final String f86274g;
    @c(a = "notification_url")

    /* renamed from: h  reason: collision with root package name */
    public final String f86275h;
    @c(a = "country_or_region")

    /* renamed from: i  reason: collision with root package name */
    public final String f86276i;
    @c(a = "payment_params")

    /* renamed from: j  reason: collision with root package name */
    public final d f86277j;
    @c(a = "risk_info")

    /* renamed from: k  reason: collision with root package name */
    public final String f86278k;
    @c(a = "ret_code")

    /* renamed from: l  reason: collision with root package name */
    public final String f86279l;
    @c(a = "address")

    /* renamed from: m  reason: collision with root package name */
    public a f86280m;

    static {
        Covode.recordClassIndex(53996);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f86268a, bVar.f86268a) && l.a(this.f86269b, bVar.f86269b) && l.a(this.f86270c, bVar.f86270c) && l.a(this.f86271d, bVar.f86271d) && l.a(this.f86272e, bVar.f86272e) && l.a(this.f86273f, bVar.f86273f) && l.a(this.f86274g, bVar.f86274g) && l.a(this.f86275h, bVar.f86275h) && l.a(this.f86276i, bVar.f86276i) && l.a(this.f86277j, bVar.f86277j) && l.a(this.f86278k, bVar.f86278k) && l.a(this.f86279l, bVar.f86279l) && l.a(this.f86280m, bVar.f86280m);
    }

    public final int hashCode() {
        String str = this.f86268a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86269b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86270c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f86271d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f86272e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f86273f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f86274g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f86275h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f86276i;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        d dVar = this.f86277j;
        int hashCode10 = (hashCode9 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str10 = this.f86278k;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f86279l;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        a aVar = this.f86280m;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode12 + i2;
    }

    public final String toString() {
        return "Cashier(idc=" + this.f86268a + ", merchantId=" + this.f86269b + ", merchantUserId=" + this.f86270c + ", env=" + this.f86271d + ", nonce=" + this.f86272e + ", originKey=" + this.f86273f + ", locale=" + this.f86274g + ", notificationUrl=" + this.f86275h + ", countryOrRegion=" + this.f86276i + ", paymentParams=" + this.f86277j + ", riskInfo=" + this.f86278k + ", retCode=" + this.f86279l + ", address=" + this.f86280m + ")";
    }
}
