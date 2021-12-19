package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f96348a;

    /* renamed from: b  reason: collision with root package name */
    public final String f96349b;

    /* renamed from: c  reason: collision with root package name */
    public final long f96350c;

    /* renamed from: d  reason: collision with root package name */
    public final int f96351d;

    /* renamed from: e  reason: collision with root package name */
    public final int f96352e;

    /* renamed from: f  reason: collision with root package name */
    public final int f96353f;

    /* renamed from: g  reason: collision with root package name */
    public final int f96354g;

    /* renamed from: h  reason: collision with root package name */
    public final int f96355h;

    /* renamed from: i  reason: collision with root package name */
    public final int f96356i;

    static {
        Covode.recordClassIndex(60999);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f96348a, aVar.f96348a) && l.a(this.f96349b, aVar.f96349b) && this.f96350c == aVar.f96350c && this.f96351d == aVar.f96351d && this.f96352e == aVar.f96352e && this.f96353f == aVar.f96353f && this.f96354g == aVar.f96354g && this.f96355h == aVar.f96355h && this.f96356i == aVar.f96356i;
    }

    public final String toString() {
        return "FollowRelationQueryParam(userId=" + this.f96348a + ", secUserId=" + this.f96349b + ", maxTime=" + this.f96350c + ", count=" + this.f96351d + ", offset=" + this.f96352e + ", sourceType=" + this.f96353f + ", addressBookAccess=" + this.f96354g + ", vcdCount=" + this.f96355h + ", afterVcdAuthorize=" + this.f96356i + ")";
    }

    public final int hashCode() {
        int i2;
        String str = this.f96348a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.f96349b;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j2 = this.f96350c;
        return ((((((((((((((i4 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f96351d) * 31) + this.f96352e) * 31) + this.f96353f) * 31) + this.f96354g) * 31) + this.f96355h) * 31) + this.f96356i;
    }

    public /* synthetic */ a(String str, String str2, long j2, int i2, int i3, int i4, int i5) {
        this(str, str2, j2, 20, i2, i3, i4, i5, 0);
    }

    public a(String str, String str2, long j2, int i2, int i3, int i4, int i5, int i6, int i7) {
        l.d(str, "");
        l.d(str2, "");
        this.f96348a = str;
        this.f96349b = str2;
        this.f96350c = j2;
        this.f96351d = 20;
        this.f96352e = i3;
        this.f96353f = i4;
        this.f96354g = i5;
        this.f96355h = i6;
        this.f96356i = i7;
    }
}
