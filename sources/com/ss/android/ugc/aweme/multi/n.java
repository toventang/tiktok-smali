package com.ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class n {
    @c(a = "anchor_show_type")

    /* renamed from: a  reason: collision with root package name */
    public String f111008a;
    @c(a = "author_id")

    /* renamed from: b  reason: collision with root package name */
    public String f111009b;
    @c(a = "enter_from_info")

    /* renamed from: c  reason: collision with root package name */
    public String f111010c;
    @c(a = "product_id")

    /* renamed from: d  reason: collision with root package name */
    public String f111011d;
    @c(a = "product_source")

    /* renamed from: e  reason: collision with root package name */
    public String f111012e;
    @c(a = "source_content_id")

    /* renamed from: f  reason: collision with root package name */
    public String f111013f;
    @c(a = "source_from")

    /* renamed from: g  reason: collision with root package name */
    public String f111014g;
    @c(a = "source")

    /* renamed from: h  reason: collision with root package name */
    public String f111015h;
    @c(a = "follow_status")

    /* renamed from: i  reason: collision with root package name */
    public String f111016i;
    @c(a = "entrance_form")

    /* renamed from: j  reason: collision with root package name */
    public String f111017j;
    @c(a = "source_page_type")

    /* renamed from: k  reason: collision with root package name */
    public String f111018k;
    @c(a = "request_id")

    /* renamed from: l  reason: collision with root package name */
    public String f111019l;
    @c(a = "is_self")

    /* renamed from: m  reason: collision with root package name */
    public Integer f111020m;
    @c(a = "is_single_anchor")
    public String n;
    @c(a = "is_ad")
    public Integer o;
    @c(a = "ad_id")
    public String p;

    static {
        Covode.recordClassIndex(71243);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.f111008a, nVar.f111008a) && l.a(this.f111009b, nVar.f111009b) && l.a(this.f111010c, nVar.f111010c) && l.a(this.f111011d, nVar.f111011d) && l.a(this.f111012e, nVar.f111012e) && l.a(this.f111013f, nVar.f111013f) && l.a(this.f111014g, nVar.f111014g) && l.a(this.f111015h, nVar.f111015h) && l.a(this.f111016i, nVar.f111016i) && l.a(this.f111017j, nVar.f111017j) && l.a(this.f111018k, nVar.f111018k) && l.a(this.f111019l, nVar.f111019l) && l.a(this.f111020m, nVar.f111020m) && l.a(this.n, nVar.n) && l.a(this.o, nVar.o) && l.a(this.p, nVar.p);
    }

    public final int hashCode() {
        String str = this.f111008a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f111009b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f111010c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f111011d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f111012e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f111013f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f111014g;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f111015h;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f111016i;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f111017j;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f111018k;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f111019l;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Integer num = this.f111020m;
        int hashCode13 = (hashCode12 + (num != null ? num.hashCode() : 0)) * 31;
        String str13 = this.n;
        int hashCode14 = (hashCode13 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Integer num2 = this.o;
        int hashCode15 = (hashCode14 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str14 = this.p;
        if (str14 != null) {
            i2 = str14.hashCode();
        }
        return hashCode15 + i2;
    }

    public final String toString() {
        return "TrackParams(anchor_show_type=" + this.f111008a + ", author_id=" + this.f111009b + ", enter_from_info=" + this.f111010c + ", product_id=" + this.f111011d + ", product_source=" + this.f111012e + ", source_content_id=" + this.f111013f + ", source_from=" + this.f111014g + ", source=" + this.f111015h + ", follow_status=" + this.f111016i + ", entrance_form=" + this.f111017j + ", source_page_type=" + this.f111018k + ", request_id=" + this.f111019l + ", is_self=" + this.f111020m + ", is_single_anchor=" + this.n + ", is_ad=" + this.o + ", ad_id=" + this.p + ")";
    }

    private n() {
        this.f111008a = null;
        this.f111009b = null;
        this.f111010c = null;
        this.f111011d = null;
        this.f111012e = null;
        this.f111013f = null;
        this.f111014g = null;
        this.f111015h = null;
        this.f111016i = null;
        this.f111017j = null;
        this.f111018k = null;
        this.f111019l = null;
        this.f111020m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public /* synthetic */ n(byte b2) {
        this();
    }
}
