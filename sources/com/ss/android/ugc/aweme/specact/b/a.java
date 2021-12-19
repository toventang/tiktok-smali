package com.ss.android.ugc.aweme.specact.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f134053a;

    /* renamed from: b  reason: collision with root package name */
    public final String f134054b;

    static {
        Covode.recordClassIndex(87690);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f134053a == aVar.f134053a && l.a(this.f134054b, aVar.f134054b);
    }

    public final int hashCode() {
        int i2 = this.f134053a * 31;
        String str = this.f134054b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ReportResult(type=" + this.f134053a + ", body=" + this.f134054b + ")";
    }

    public a(int i2, String str) {
        this.f134053a = i2;
        this.f134054b = str;
    }
}
