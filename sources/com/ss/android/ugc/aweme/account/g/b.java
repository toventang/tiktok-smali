package com.ss.android.ugc.aweme.account.g;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f63032a;

    /* renamed from: b  reason: collision with root package name */
    public final String f63033b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f63034c;

    /* renamed from: d  reason: collision with root package name */
    public final String f63035d;

    /* renamed from: e  reason: collision with root package name */
    public final String f63036e;

    static {
        Covode.recordClassIndex(38830);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f63032a, bVar.f63032a) && l.a(this.f63033b, bVar.f63033b) && l.a(this.f63034c, bVar.f63034c) && l.a(this.f63035d, bVar.f63035d) && l.a(this.f63036e, bVar.f63036e);
    }

    public final int hashCode() {
        String str = this.f63032a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f63033b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f63034c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f63035d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f63036e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "TwoStepAuthResponse(successTicket=" + this.f63032a + ", profileKey=" + this.f63033b + ", errorCode=" + this.f63034c + ", errorMessage=" + this.f63035d + ", smsCodeKey=" + this.f63036e + ")";
    }

    public /* synthetic */ b(String str, String str2, Integer num, String str3) {
        this(str, str2, num, str3, null);
    }

    public b(String str, String str2, Integer num, String str3, String str4) {
        this.f63032a = str;
        this.f63033b = str2;
        this.f63034c = num;
        this.f63035d = str3;
        this.f63036e = str4;
    }
}
