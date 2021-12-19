package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f22417a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22418b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22419c;

    static {
        Covode.recordClassIndex(13230);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f22417a, eVar.f22417a) && l.a(this.f22418b, eVar.f22418b) && l.a(this.f22419c, eVar.f22419c);
    }

    public final int hashCode() {
        String str = this.f22417a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22418b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22419c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "PayResultInfo(productId=" + this.f22417a + ", orderId=" + this.f22418b + ", userId=" + this.f22419c + ")";
    }

    private /* synthetic */ e() {
        this(null, null, null);
    }

    public e(String str, String str2, String str3) {
        this.f22417a = str;
        this.f22418b = str2;
        this.f22419c = str3;
    }
}
