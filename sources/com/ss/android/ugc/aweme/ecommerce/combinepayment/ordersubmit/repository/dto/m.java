package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class m {
    @c(a = "video_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f84977a;
    @c(a = "voice_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f84978b;
    @c(a = "browser_language")

    /* renamed from: c  reason: collision with root package name */
    public final String f84979c;
    @c(a = "browser_name")

    /* renamed from: d  reason: collision with root package name */
    public final String f84980d;
    @c(a = "browser_online")

    /* renamed from: e  reason: collision with root package name */
    public final String f84981e;
    @c(a = "browser_platform")

    /* renamed from: f  reason: collision with root package name */
    public final String f84982f;
    @c(a = "browser_version")

    /* renamed from: g  reason: collision with root package name */
    public final String f84983g;
    @c(a = "captcha_check_result")

    /* renamed from: h  reason: collision with root package name */
    public final String f84984h;
    @c(a = "check_sign_res")

    /* renamed from: i  reason: collision with root package name */
    public final String f84985i;
    @c(a = "cookie_enabled")

    /* renamed from: j  reason: collision with root package name */
    public final String f84986j;
    @c(a = "custom_check_sign")

    /* renamed from: k  reason: collision with root package name */
    public final String f84987k;
    @c(a = "device_fingerprint_id")

    /* renamed from: l  reason: collision with root package name */
    public final String f84988l;
    @c(a = "fp")

    /* renamed from: m  reason: collision with root package name */
    public final String f84989m;
    @c(a = "group_id")
    public final String n;
    @c(a = "referer")
    public final String o;
    @c(a = "screen_height")
    public final String p;
    @c(a = "screen_width")
    public final String q;
    @c(a = "target")
    public final String r;
    @c(a = "terminal_country")
    public final String s;
    @c(a = "card_number_paste")
    public final String t;

    static {
        Covode.recordClassIndex(53132);
    }

    public m() {
        this(null, null, 1048575);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f84977a, mVar.f84977a) && l.a(this.f84978b, mVar.f84978b) && l.a(this.f84979c, mVar.f84979c) && l.a(this.f84980d, mVar.f84980d) && l.a(this.f84981e, mVar.f84981e) && l.a(this.f84982f, mVar.f84982f) && l.a(this.f84983g, mVar.f84983g) && l.a(this.f84984h, mVar.f84984h) && l.a(this.f84985i, mVar.f84985i) && l.a(this.f84986j, mVar.f84986j) && l.a(this.f84987k, mVar.f84987k) && l.a(this.f84988l, mVar.f84988l) && l.a(this.f84989m, mVar.f84989m) && l.a(this.n, mVar.n) && l.a(this.o, mVar.o) && l.a(this.p, mVar.p) && l.a(this.q, mVar.q) && l.a(this.r, mVar.r) && l.a(this.s, mVar.s) && l.a(this.t, mVar.t);
    }

    public final int hashCode() {
        String str = this.f84977a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84978b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84979c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f84980d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f84981e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f84982f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f84983g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f84984h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f84985i;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f84986j;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f84987k;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f84988l;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f84989m;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.n;
        int hashCode14 = (hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.o;
        int hashCode15 = (hashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.p;
        int hashCode16 = (hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.q;
        int hashCode17 = (hashCode16 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.r;
        int hashCode18 = (hashCode17 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.s;
        int hashCode19 = (hashCode18 + (str19 != null ? str19.hashCode() : 0)) * 31;
        String str20 = this.t;
        if (str20 != null) {
            i2 = str20.hashCode();
        }
        return hashCode19 + i2;
    }

    public final String toString() {
        return "PayRiskControlParam(videoId=" + this.f84977a + ", voiceId=" + this.f84978b + ", browserLanguage=" + this.f84979c + ", browserName=" + this.f84980d + ", browserOnline=" + this.f84981e + ", browserPlatform=" + this.f84982f + ", browserVersion=" + this.f84983g + ", captchaCheckResult=" + this.f84984h + ", checkSignRes=" + this.f84985i + ", cookieEnabled=" + this.f84986j + ", customCheckSign=" + this.f84987k + ", deviceFingerprintId=" + this.f84988l + ", fp=" + this.f84989m + ", groupId=" + this.n + ", referer=" + this.o + ", screenHeight=" + this.p + ", screenWidth=" + this.q + ", target=" + this.r + ", terminalCountry=" + this.s + ", cardNumberPaste=" + this.t + ")";
    }

    private m(String str, String str2) {
        this.f84977a = null;
        this.f84978b = null;
        this.f84979c = null;
        this.f84980d = null;
        this.f84981e = null;
        this.f84982f = null;
        this.f84983g = null;
        this.f84984h = null;
        this.f84985i = null;
        this.f84986j = null;
        this.f84987k = null;
        this.f84988l = str;
        this.f84989m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = str2;
        this.s = null;
        this.t = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, String str2, int i2) {
        this((i2 & 2048) != 0 ? null : str, (i2 & 131072) != 0 ? null : str2);
    }
}
