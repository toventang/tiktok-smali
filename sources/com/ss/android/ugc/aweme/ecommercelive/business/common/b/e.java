package com.ss.android.ugc.aweme.ecommercelive.business.common.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f87984a;

    /* renamed from: b  reason: collision with root package name */
    public final String f87985b;

    /* renamed from: c  reason: collision with root package name */
    public final String f87986c;

    static {
        Covode.recordClassIndex(55313);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f87984a, eVar.f87984a) && l.a(this.f87985b, eVar.f87985b) && l.a(this.f87986c, eVar.f87986c);
    }

    public final int hashCode() {
        String str = this.f87984a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87985b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f87986c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ECWidgetFirstShowData(serviceName=" + this.f87984a + ", authorId=" + this.f87985b + ", roomId=" + this.f87986c + ")";
    }

    public e(String str, String str2, String str3) {
        l.d(str, "");
        this.f87984a = str;
        this.f87985b = str2;
        this.f87986c = str3;
    }
}
