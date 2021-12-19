package com.ss.android.ugc.aweme.ecommercelive.framework.a.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class a {
    @c(a = "url_list")

    /* renamed from: a  reason: collision with root package name */
    public final String f88004a;
    @c(a = "width")

    /* renamed from: b  reason: collision with root package name */
    public final int f88005b;
    @c(a = "height")

    /* renamed from: c  reason: collision with root package name */
    public final int f88006c;
    @c(a = "url")

    /* renamed from: d  reason: collision with root package name */
    public final String f88007d;
    @c(a = "key")

    /* renamed from: e  reason: collision with root package name */
    public final String f88008e;

    static {
        Covode.recordClassIndex(55327);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f88004a, aVar.f88004a) && this.f88005b == aVar.f88005b && this.f88006c == aVar.f88006c && l.a(this.f88007d, aVar.f88007d) && l.a(this.f88008e, aVar.f88008e);
    }

    public final int hashCode() {
        String str = this.f88004a;
        int i2 = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f88005b) * 31) + this.f88006c) * 31;
        String str2 = this.f88007d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f88008e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ECImage(key=" + this.f88004a + ", width=" + this.f88005b + ", height=" + this.f88006c + ", url=" + this.f88007d + ", urlKey=" + this.f88008e + ")";
    }
}
