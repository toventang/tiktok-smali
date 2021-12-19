package com.ss.android.ugc.aweme.account.login.v2.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class ab {
    @c(a = "captcha")

    /* renamed from: a  reason: collision with root package name */
    public final String f64191a;
    @c(a = "desc_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f64192b;
    @c(a = "description")

    /* renamed from: c  reason: collision with root package name */
    public final String f64193c;
    @c(a = "error_code")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f64194d;
    @c(a = "result")

    /* renamed from: e  reason: collision with root package name */
    public final String f64195e;
    @c(a = "wait_ticket")

    /* renamed from: f  reason: collision with root package name */
    public final String f64196f;
    @c(a = "challenge_ticket")

    /* renamed from: g  reason: collision with root package name */
    public final String f64197g;
    @c(a = "pending")

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f64198h;
    @c(a = "reason")

    /* renamed from: i  reason: collision with root package name */
    public final String f64199i;
    @c(a = "active_device_names")

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f64200j;

    static {
        Covode.recordClassIndex(39551);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return l.a(this.f64191a, abVar.f64191a) && l.a(this.f64192b, abVar.f64192b) && l.a(this.f64193c, abVar.f64193c) && l.a(this.f64194d, abVar.f64194d) && l.a(this.f64195e, abVar.f64195e) && l.a(this.f64196f, abVar.f64196f) && l.a(this.f64197g, abVar.f64197g) && l.a(this.f64198h, abVar.f64198h) && l.a(this.f64199i, abVar.f64199i) && l.a(this.f64200j, abVar.f64200j);
    }

    public final int hashCode() {
        String str = this.f64191a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f64192b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f64193c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f64194d;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.f64195e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f64196f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f64197g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Boolean bool = this.f64198h;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str7 = this.f64199i;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<String> list = this.f64200j;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "Request2svPushChallengeResponse(captcha=" + this.f64191a + ", desc_url=" + this.f64192b + ", description=" + this.f64193c + ", error_code=" + this.f64194d + ", result=" + this.f64195e + ", wait_ticket=" + this.f64196f + ", challenge_ticket=" + this.f64197g + ", pending=" + this.f64198h + ", reason=" + this.f64199i + ", active_device_names=" + this.f64200j + ")";
    }
}
