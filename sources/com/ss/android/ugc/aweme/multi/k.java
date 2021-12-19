package com.ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class k {
    @c(a = "extra")

    /* renamed from: a  reason: collision with root package name */
    public final String f110913a;

    /* renamed from: b  reason: collision with root package name */
    public final m f110914b;
    @c(a = "keyword")

    /* renamed from: c  reason: collision with root package name */
    public final String f110915c;
    @c(a = "id")

    /* renamed from: d  reason: collision with root package name */
    public final String f110916d;
    @c(a = StringSet.type)

    /* renamed from: e  reason: collision with root package name */
    public final Integer f110917e;
    @c(a = "platform")

    /* renamed from: f  reason: collision with root package name */
    public final Integer f110918f;
    @c(a = "log_extra")

    /* renamed from: g  reason: collision with root package name */
    public final String f110919g;
    @c(a = "schema")

    /* renamed from: h  reason: collision with root package name */
    public final String f110920h;

    static {
        Covode.recordClassIndex(71159);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return l.a(this.f110913a, kVar.f110913a) && l.a(this.f110914b, kVar.f110914b) && l.a(this.f110915c, kVar.f110915c) && l.a(this.f110916d, kVar.f110916d) && l.a(this.f110917e, kVar.f110917e) && l.a(this.f110918f, kVar.f110918f) && l.a(this.f110919g, kVar.f110919g) && l.a(this.f110920h, kVar.f110920h);
    }

    public final int hashCode() {
        String str = this.f110913a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        m mVar = this.f110914b;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        String str2 = this.f110915c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f110916d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f110917e;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f110918f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.f110919g;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f110920h;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "ShopWindowAnchorModel(extra=" + this.f110913a + ", extraData=" + this.f110914b + ", keyword=" + this.f110915c + ", id=" + this.f110916d + ", type=" + this.f110917e + ", platform=" + this.f110918f + ", logExtra=" + this.f110919g + ", schema=" + this.f110920h + ")";
    }

    private /* synthetic */ k() {
        this("", new m(), "", "", null, null, "", "");
    }

    public k(String str, m mVar, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
        l.d(str, "");
        l.d(mVar, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f110913a = str;
        this.f110914b = mVar;
        this.f110915c = str2;
        this.f110916d = str3;
        this.f110917e = num;
        this.f110918f = num2;
        this.f110919g = str4;
        this.f110920h = str5;
    }
}
