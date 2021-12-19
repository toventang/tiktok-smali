package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f104551a;

    /* renamed from: b  reason: collision with root package name */
    public final String f104552b;

    /* renamed from: c  reason: collision with root package name */
    public final String f104553c;

    static {
        Covode.recordClassIndex(66983);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f104551a, dVar.f104551a) && l.a(this.f104552b, dVar.f104552b) && l.a(this.f104553c, dVar.f104553c);
    }

    public final int hashCode() {
        String str = this.f104551a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104552b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f104553c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ECWidgetFirstShowData(serviceName=" + this.f104551a + ", authorId=" + this.f104552b + ", roomId=" + this.f104553c + ")";
    }

    public d(String str, String str2, String str3) {
        l.d(str, "");
        this.f104551a = str;
        this.f104552b = str2;
        this.f104553c = str3;
    }
}
