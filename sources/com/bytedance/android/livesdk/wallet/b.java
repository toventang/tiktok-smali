package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f22402a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22403b;

    static {
        Covode.recordClassIndex(13225);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f22402a, bVar.f22402a) && l.a(this.f22403b, bVar.f22403b);
    }

    public final int hashCode() {
        String str = this.f22402a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22403b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CheckOrderResultInfo(productId=" + this.f22402a + ", orderId=" + this.f22403b + ")";
    }

    private /* synthetic */ b() {
        this(null, null);
    }

    public b(String str, String str2) {
        this.f22402a = str;
        this.f22403b = str2;
    }
}
