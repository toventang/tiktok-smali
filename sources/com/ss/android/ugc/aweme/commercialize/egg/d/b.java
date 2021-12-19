package com.ss.android.ugc.aweme.commercialize.egg.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f73955a;

    /* renamed from: b  reason: collision with root package name */
    public final String f73956b;

    /* renamed from: c  reason: collision with root package name */
    public final String f73957c;

    /* renamed from: d  reason: collision with root package name */
    public final String f73958d;

    /* renamed from: e  reason: collision with root package name */
    public final String f73959e;

    static {
        Covode.recordClassIndex(45553);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f73955a, bVar.f73955a) && l.a(this.f73956b, bVar.f73956b) && l.a(this.f73957c, bVar.f73957c) && l.a(this.f73958d, bVar.f73958d) && l.a(this.f73959e, bVar.f73959e);
    }

    public final int hashCode() {
        String str = this.f73955a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f73956b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f73957c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f73958d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f73959e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CommerceEggLogParam(eggType=" + this.f73955a + ", creativeId=" + this.f73956b + ", logExtra=" + this.f73957c + ", groupId=" + this.f73958d + ", eggId=" + this.f73959e + ")";
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null);
    }

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f73955a = str;
        this.f73956b = str2;
        this.f73957c = str3;
        this.f73958d = str4;
        this.f73959e = str5;
    }
}
