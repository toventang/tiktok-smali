package com.ss.android.ugc.aweme.commercialize.egg.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.egg.a.a;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f73961a;

    /* renamed from: b  reason: collision with root package name */
    public final String f73962b;

    /* renamed from: c  reason: collision with root package name */
    public final String f73963c;

    /* renamed from: d  reason: collision with root package name */
    public final String f73964d;

    /* renamed from: e  reason: collision with root package name */
    public final a f73965e;

    static {
        Covode.recordClassIndex(45555);
    }

    public d() {
        this((String) null, (String) null, (String) null, (String) null, 31);
    }

    public d(String str, String str2, String str3) {
        this(str, str2, str3, (String) null, 24);
    }

    public d(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4, 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f73961a, dVar.f73961a) && l.a(this.f73962b, dVar.f73962b) && l.a(this.f73963c, dVar.f73963c) && l.a(this.f73964d, dVar.f73964d) && l.a(this.f73965e, dVar.f73965e);
    }

    public final int hashCode() {
        String str = this.f73961a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f73962b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f73963c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f73964d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        a aVar = this.f73965e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CommerceEggShowParam(eggType=" + this.f73961a + ", commentText=" + this.f73962b + ", enterFrom=" + this.f73963c + ", awemeId=" + this.f73964d + ", eventCallback=" + this.f73965e + ")";
    }

    private d(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f73961a = str;
        this.f73962b = str2;
        this.f73963c = str3;
        this.f73964d = str4;
        this.f73965e = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ d(String str, String str2, String str3, String str4, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4);
    }
}
