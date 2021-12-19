package com.ss.android.ugc.aweme.ecommerce.service.vo;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f87360a;

    /* renamed from: b  reason: collision with root package name */
    public final String f87361b;

    static {
        Covode.recordClassIndex(54840);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f87360a, aVar.f87360a) && l.a(this.f87361b, aVar.f87361b);
    }

    public final int hashCode() {
        String str = this.f87360a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87361b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CommonResource(couponPopupBg2xUrl=" + this.f87360a + ", couponPopupBg3xUrl=" + this.f87361b + ")";
    }

    public a(String str, String str2) {
        this.f87360a = str;
        this.f87361b = str2;
    }
}
