package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Image f86480a;

    /* renamed from: b  reason: collision with root package name */
    public final String f86481b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f86482c;

    /* renamed from: d  reason: collision with root package name */
    public final String f86483d;

    /* renamed from: e  reason: collision with root package name */
    public final String f86484e;

    static {
        Covode.recordClassIndex(54162);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f86480a, oVar.f86480a) && l.a(this.f86481b, oVar.f86481b) && l.a(this.f86482c, oVar.f86482c) && l.a(this.f86483d, oVar.f86483d) && l.a(this.f86484e, oVar.f86484e);
    }

    public final int hashCode() {
        Image image = this.f86480a;
        int i2 = 0;
        int hashCode = (image != null ? image.hashCode() : 0) * 31;
        String str = this.f86481b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l2 = this.f86482c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str2 = this.f86483d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f86484e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "ShopProfileVO(shopImage=" + this.f86480a + ", shopName=" + this.f86481b + ", shopCount=" + this.f86482c + ", shopRate=" + this.f86483d + ", link=" + this.f86484e + ")";
    }

    public o(Image image, String str, Long l2, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f86480a = image;
        this.f86481b = str;
        this.f86482c = l2;
        this.f86483d = str2;
        this.f86484e = str3;
    }
}
