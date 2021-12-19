package com.ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class m {
    @c(a = "product_type")

    /* renamed from: a  reason: collision with root package name */
    public final String f110924a;
    @c(a = "product_id")

    /* renamed from: b  reason: collision with root package name */
    public final Long f110925b;
    @c(a = "title")

    /* renamed from: c  reason: collision with root package name */
    public final String f110926c;
    @c(a = "elastic_title")

    /* renamed from: d  reason: collision with root package name */
    public final String f110927d;
    @c(a = "price_need_delete")

    /* renamed from: e  reason: collision with root package name */
    public final int f110928e;
    @c(a = "format_price")

    /* renamed from: f  reason: collision with root package name */
    public String f110929f;
    @c(a = "cover_url")

    /* renamed from: g  reason: collision with root package name */
    public final String f110930g;
    @c(a = "elastic_url")

    /* renamed from: h  reason: collision with root package name */
    public final String f110931h;
    @c(a = "platform")

    /* renamed from: i  reason: collision with root package name */
    public final Integer f110932i;
    @c(a = "schema")

    /* renamed from: j  reason: collision with root package name */
    public final String f110933j;
    @c(a = "source_from")

    /* renamed from: k  reason: collision with root package name */
    public final String f110934k;
    @c(a = "source")

    /* renamed from: l  reason: collision with root package name */
    public final String f110935l;
    @c(a = "detail_url")

    /* renamed from: m  reason: collision with root package name */
    public final String f110936m;
    @c(a = "need_preload")
    public final Boolean n;
    @c(a = "load_method_type")
    public final Integer o;
    @c(a = "product_base")
    public final i p;

    static {
        Covode.recordClassIndex(71163);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f110924a, mVar.f110924a) && l.a(this.f110925b, mVar.f110925b) && l.a(this.f110926c, mVar.f110926c) && l.a(this.f110927d, mVar.f110927d) && this.f110928e == mVar.f110928e && l.a(this.f110929f, mVar.f110929f) && l.a(this.f110930g, mVar.f110930g) && l.a(this.f110931h, mVar.f110931h) && l.a(this.f110932i, mVar.f110932i) && l.a(this.f110933j, mVar.f110933j) && l.a(this.f110934k, mVar.f110934k) && l.a(this.f110935l, mVar.f110935l) && l.a(this.f110936m, mVar.f110936m) && l.a(this.n, mVar.n) && l.a(this.o, mVar.o) && l.a(this.p, mVar.p);
    }

    public final int hashCode() {
        String str = this.f110924a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.f110925b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.f110926c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f110927d;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f110928e) * 31;
        String str4 = this.f110929f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f110930g;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f110931h;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num = this.f110932i;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        String str7 = this.f110933j;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f110934k;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f110935l;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f110936m;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Boolean bool = this.n;
        int hashCode13 = (hashCode12 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.o;
        int hashCode14 = (hashCode13 + (num2 != null ? num2.hashCode() : 0)) * 31;
        i iVar = this.p;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return hashCode14 + i2;
    }

    public final String toString() {
        return "ShopWindowExtraModel(productType=" + this.f110924a + ", productId=" + this.f110925b + ", title=" + this.f110926c + ", elasticTitle=" + this.f110927d + ", price=" + this.f110928e + ", formatPrice=" + this.f110929f + ", coverUrl=" + this.f110930g + ", elasticUrl=" + this.f110931h + ", platform=" + this.f110932i + ", schema=" + this.f110933j + ", sourceFrom=" + this.f110934k + ", source=" + this.f110935l + ", detailUrl=" + this.f110936m + ", need_preload=" + this.n + ", loadMethodType=" + this.o + ", productBase=" + this.p + ")";
    }

    public /* synthetic */ m() {
        this(false);
    }

    private m(Boolean bool) {
        this.f110924a = null;
        this.f110925b = null;
        this.f110926c = null;
        this.f110927d = null;
        this.f110928e = 0;
        this.f110929f = null;
        this.f110930g = null;
        this.f110931h = null;
        this.f110932i = null;
        this.f110933j = null;
        this.f110934k = null;
        this.f110935l = null;
        this.f110936m = null;
        this.n = bool;
        this.o = null;
        this.p = null;
    }
}
