package com.bytedance.liko.leakdetector.strategy.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "aid")

    /* renamed from: a  reason: collision with root package name */
    public final String f40121a;
    @c(a = "channel")

    /* renamed from: b  reason: collision with root package name */
    public final String f40122b;
    @c(a = "device_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f40123c;
    @c(a = "app_version")

    /* renamed from: d  reason: collision with root package name */
    public final String f40124d;
    @c(a = "update_version_code")

    /* renamed from: e  reason: collision with root package name */
    public final String f40125e;
    @c(a = "current_update_version_code")

    /* renamed from: f  reason: collision with root package name */
    public final String f40126f;
    @c(a = "os_version")

    /* renamed from: g  reason: collision with root package name */
    public final String f40127g;
    @c(a = "os_api")

    /* renamed from: h  reason: collision with root package name */
    public final String f40128h;
    @c(a = "device_model")

    /* renamed from: i  reason: collision with root package name */
    public final String f40129i;
    @c(a = "device_brand")

    /* renamed from: j  reason: collision with root package name */
    public final String f40130j;
    @c(a = "device_manufacturer")

    /* renamed from: k  reason: collision with root package name */
    public final String f40131k;
    @c(a = "process_name")

    /* renamed from: l  reason: collision with root package name */
    public final String f40132l;
    @c(a = "version_name")

    /* renamed from: m  reason: collision with root package name */
    public final String f40133m;
    @c(a = "version_code")
    public final String n;
    @c(a = "region")
    public final String o;
    @c(a = "os")
    public final String p;
    @c(a = "device_platform")
    public final String q;
    @c(a = "sid")
    public final String r;
    @c(a = "config_time")
    public final String s;
    @c(a = "release_build")
    public final String t;

    static {
        Covode.recordClassIndex(24729);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f40121a, bVar.f40121a) && l.a(this.f40122b, bVar.f40122b) && l.a(this.f40123c, bVar.f40123c) && l.a(this.f40124d, bVar.f40124d) && l.a(this.f40125e, bVar.f40125e) && l.a(this.f40126f, bVar.f40126f) && l.a(this.f40127g, bVar.f40127g) && l.a(this.f40128h, bVar.f40128h) && l.a(this.f40129i, bVar.f40129i) && l.a(this.f40130j, bVar.f40130j) && l.a(this.f40131k, bVar.f40131k) && l.a(this.f40132l, bVar.f40132l) && l.a(this.f40133m, bVar.f40133m) && l.a(this.n, bVar.n) && l.a(this.o, bVar.o) && l.a(this.p, bVar.p) && l.a(this.q, bVar.q) && l.a(this.r, bVar.r) && l.a(this.s, bVar.s) && l.a(this.t, bVar.t);
    }

    public final int hashCode() {
        String str = this.f40121a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f40122b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f40123c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f40124d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f40125e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f40126f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f40127g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f40128h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f40129i;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f40130j;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f40131k;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f40132l;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f40133m;
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
        return "HeaderBean(aid=" + this.f40121a + ", channel=" + this.f40122b + ", deviceID=" + this.f40123c + ", appVersion=" + this.f40124d + ", updateVersionCode=" + this.f40125e + ", currentUpdateVersionCode=" + this.f40126f + ", osVersion=" + this.f40127g + ", osApi=" + this.f40128h + ", deviceModel=" + this.f40129i + ", deviceBrand=" + this.f40130j + ", deviceManufacturer=" + this.f40131k + ", processName=" + this.f40132l + ", verionName=" + this.f40133m + ", verisonCode=" + this.n + ", region=" + this.o + ", os=" + this.p + ", devicePlatform=" + this.q + ", sid=" + this.r + ", configTime=" + this.s + ", releaseBuild=" + this.t + ")";
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        this.f40121a = str;
        this.f40122b = str2;
        this.f40123c = str3;
        this.f40124d = str4;
        this.f40125e = str5;
        this.f40126f = str6;
        this.f40127g = str7;
        this.f40128h = str8;
        this.f40129i = str9;
        this.f40130j = str10;
        this.f40131k = str11;
        this.f40132l = str12;
        this.f40133m = str13;
        this.n = str14;
        this.o = str15;
        this.p = str16;
        this.q = str17;
        this.r = str18;
        this.s = str19;
        this.t = str20;
    }
}
