package com.ss.android.ugc.aweme.upvote.event;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f142221a;

    /* renamed from: b  reason: collision with root package name */
    public final String f142222b;

    /* renamed from: c  reason: collision with root package name */
    public final String f142223c;

    /* renamed from: d  reason: collision with root package name */
    public final String f142224d;

    /* renamed from: e  reason: collision with root package name */
    public final String f142225e;

    static {
        Covode.recordClassIndex(92979);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f142221a, bVar.f142221a) && l.a(this.f142222b, bVar.f142222b) && l.a(this.f142223c, bVar.f142223c) && l.a(this.f142224d, bVar.f142224d) && l.a(this.f142225e, bVar.f142225e);
    }

    public final int hashCode() {
        String str = this.f142221a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f142222b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f142223c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f142224d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f142225e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "UpvoteDetailMobParam(enterFrom=" + this.f142221a + ", groupId=" + this.f142222b + ", authorId=" + this.f142223c + ", requestId=" + this.f142224d + ", followStatus=" + this.f142225e + ")";
    }

    public b(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f142221a = str;
        this.f142222b = str2;
        this.f142223c = str3;
        this.f142224d = str4;
        this.f142225e = str5;
    }
}
