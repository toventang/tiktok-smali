package com.ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f81908a;

    /* renamed from: b  reason: collision with root package name */
    public final String f81909b;

    /* renamed from: c  reason: collision with root package name */
    public final String f81910c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f81911d;

    /* renamed from: e  reason: collision with root package name */
    public final String f81912e;

    /* renamed from: f  reason: collision with root package name */
    public final String f81913f;

    /* renamed from: g  reason: collision with root package name */
    public final String f81914g;

    /* renamed from: h  reason: collision with root package name */
    public final int f81915h = 1;

    static {
        Covode.recordClassIndex(50848);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f81908a, fVar.f81908a) && l.a(this.f81909b, fVar.f81909b) && l.a(this.f81910c, fVar.f81910c) && this.f81911d == fVar.f81911d && l.a(this.f81912e, fVar.f81912e) && l.a(this.f81913f, fVar.f81913f) && l.a(this.f81914g, fVar.f81914g) && this.f81915h == fVar.f81915h;
    }

    public final int hashCode() {
        String str = this.f81908a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f81909b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f81910c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f81911d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        String str4 = this.f81912e;
        int hashCode4 = (i6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f81913f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f81914g;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return ((hashCode5 + i2) * 31) + this.f81915h;
    }

    public final String toString() {
        return "SearchFollowParams(event=" + this.f81908a + ", toUserId=" + this.f81909b + ", enterFrom=" + this.f81910c + ", fromSearchResult=" + this.f81911d + ", enterMethod=" + this.f81912e + ", previousPage=" + this.f81913f + ", follow_type=" + this.f81914g + ", isSearchScene=" + this.f81915h + ")";
    }

    public f(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        this.f81908a = str;
        this.f81909b = str2;
        this.f81910c = str3;
        this.f81911d = z;
        this.f81912e = str4;
        this.f81913f = str5;
        this.f81914g = str6;
    }
}
