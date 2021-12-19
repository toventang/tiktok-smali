package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import h.f.b.l;
import java.util.List;

public final class a {
    public static final C2122a w = new C2122a((byte) 0);
    @c(a = "product_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f87748a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public final String f87749b;
    @c(a = "cover")

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a f87750c;
    @c(a = "img")

    /* renamed from: d  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a> f87751d;
    @c(a = "currency")

    /* renamed from: e  reason: collision with root package name */
    public final String f87752e;
    @c(a = "detail_url")

    /* renamed from: f  reason: collision with root package name */
    public final String f87753f;
    @c(a = "product_status")

    /* renamed from: g  reason: collision with root package name */
    public final int f87754g;
    @c(a = "addition_id")

    /* renamed from: h  reason: collision with root package name */
    public final String f87755h;
    @c(a = "elastic_title")

    /* renamed from: i  reason: collision with root package name */
    public final String f87756i;
    @c(a = "elastic_img")

    /* renamed from: j  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a> f87757j;
    @c(a = "platform")

    /* renamed from: k  reason: collision with root package name */
    public final int f87758k;
    @c(a = "format_price")

    /* renamed from: l  reason: collision with root package name */
    public final String f87759l;
    @c(a = "format_market_price")

    /* renamed from: m  reason: collision with root package name */
    public final String f87760m;
    @c(a = "source")
    public final String n;
    @c(a = "schema")
    public final String o;
    @c(a = "source_from")
    public final int p;
    @c(a = "format_origin_price")
    public final String q;
    @c(a = "format_available_price")
    public final String r;
    public boolean s;
    @c(a = "flash_sale_info")
    public final f t;
    @c(a = "promotion_logos")
    public final List<h> u;
    @c(a = "promotion_view")
    public final PromotionView v;

    static {
        Covode.recordClassIndex(55195);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f87748a, aVar.f87748a) && l.a(this.f87749b, aVar.f87749b) && l.a(this.f87750c, aVar.f87750c) && l.a(this.f87751d, aVar.f87751d) && l.a(this.f87752e, aVar.f87752e) && l.a(this.f87753f, aVar.f87753f) && this.f87754g == aVar.f87754g && l.a(this.f87755h, aVar.f87755h) && l.a(this.f87756i, aVar.f87756i) && l.a(this.f87757j, aVar.f87757j) && this.f87758k == aVar.f87758k && l.a(this.f87759l, aVar.f87759l) && l.a(this.f87760m, aVar.f87760m) && l.a(this.n, aVar.n) && l.a(this.o, aVar.o) && this.p == aVar.p && l.a(this.q, aVar.q) && l.a(this.r, aVar.r) && this.s == aVar.s && l.a(this.t, aVar.t) && l.a(this.u, aVar.u) && l.a(this.v, aVar.v);
    }

    public final int hashCode() {
        String str = this.f87748a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87749b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a aVar = this.f87750c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a> list = this.f87751d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f87752e;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f87753f;
        int hashCode6 = (((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f87754g) * 31;
        String str5 = this.f87755h;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f87756i;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<com.ss.android.ugc.aweme.ecommercelive.framework.a.a.a> list2 = this.f87757j;
        int hashCode9 = (((hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.f87758k) * 31;
        String str7 = this.f87759l;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f87760m;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.n;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.o;
        int hashCode13 = (((hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.p) * 31;
        String str11 = this.q;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.r;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        boolean z = this.s;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode15 + i3) * 31;
        f fVar = this.t;
        int hashCode16 = (i6 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        List<h> list3 = this.u;
        int hashCode17 = (hashCode16 + (list3 != null ? list3.hashCode() : 0)) * 31;
        PromotionView promotionView = this.v;
        if (promotionView != null) {
            i2 = promotionView.hashCode();
        }
        return hashCode17 + i2;
    }

    public final String toString() {
        return "AudienceProduct(productId=" + this.f87748a + ", title=" + this.f87749b + ", cover=" + this.f87750c + ", img=" + this.f87751d + ", currency=" + this.f87752e + ", detailUrl=" + this.f87753f + ", productStatus=" + this.f87754g + ", additionId=" + this.f87755h + ", elasticTitle=" + this.f87756i + ", elasticImg=" + this.f87757j + ", platform=" + this.f87758k + ", formatPrice=" + this.f87759l + ", formatMarketPrice=" + this.f87760m + ", source=" + this.n + ", schema=" + this.o + ", source_from=" + this.p + ", formatOriginPrice=" + this.q + ", formatAvailablePrice=" + this.r + ", isIntroduce=" + this.s + ", flashSaleInfo=" + this.t + ", promotionLogos=" + this.u + ", promotionView=" + this.v + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a.a$a  reason: collision with other inner class name */
    public static final class C2122a {
        static {
            Covode.recordClassIndex(55196);
        }

        private C2122a() {
        }

        public /* synthetic */ C2122a(byte b2) {
            this();
        }
    }
}
