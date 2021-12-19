package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f22421a;

    /* renamed from: b  reason: collision with root package name */
    public String f22422b;

    static {
        Covode.recordClassIndex(13232);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f22421a, gVar.f22421a) && l.a(this.f22422b, gVar.f22422b);
    }

    public final int hashCode() {
        String str = this.f22421a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22422b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RechargeFailInfo(productId=" + this.f22421a + ", orderId=" + this.f22422b + ")";
    }

    private /* synthetic */ g() {
        this("", "");
    }

    public g(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f22421a = str;
        this.f22422b = str2;
    }
}
