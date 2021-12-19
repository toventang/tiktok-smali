package com.bytedance.android.livesdk.wallet;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f22392a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22393b;

    static {
        Covode.recordClassIndex(13223);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f22392a, aVar.f22392a) && l.a(this.f22393b, aVar.f22393b);
    }

    public final int hashCode() {
        String str = this.f22392a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22393b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AmazonUserdata(mUserId=" + this.f22392a + ", mUserMarkPlace=" + this.f22393b + ")";
    }

    public a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f22392a = str;
        this.f22393b = str2;
    }
}
