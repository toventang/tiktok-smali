package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.a.a;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f84848a;

    /* renamed from: b  reason: collision with root package name */
    public final String f84849b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f84850c;

    /* renamed from: d  reason: collision with root package name */
    public final String f84851d;

    /* renamed from: e  reason: collision with root package name */
    public final a f84852e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f84853f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f84854g;

    static {
        Covode.recordClassIndex(53004);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f84848a, iVar.f84848a) && l.a(this.f84849b, iVar.f84849b) && l.a(this.f84850c, iVar.f84850c) && l.a(this.f84851d, iVar.f84851d) && l.a(this.f84852e, iVar.f84852e) && l.a(this.f84853f, iVar.f84853f) && l.a(this.f84854g, iVar.f84854g);
    }

    public final int hashCode() {
        String str = this.f84848a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84849b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f84850c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f84851d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        a aVar = this.f84852e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Integer num2 = this.f84853f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f84854g;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "SummaryBillItem(itemName=" + this.f84848a + ", itemFee=" + this.f84849b + ", itemFeeColor=" + this.f84850c + ", link=" + this.f84851d + ", logo=" + this.f84852e + ", itemTextColor=" + this.f84853f + ", itemType=" + this.f84854g + ")";
    }

    public i(String str, String str2, Integer num, String str3, a aVar, Integer num2, Integer num3) {
        l.d(str, "");
        l.d(str2, "");
        this.f84848a = str;
        this.f84849b = str2;
        this.f84850c = num;
        this.f84851d = str3;
        this.f84852e = aVar;
        this.f84853f = num2;
        this.f84854g = num3;
    }
}
