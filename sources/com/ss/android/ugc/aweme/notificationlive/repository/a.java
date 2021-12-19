package com.ss.android.ugc.aweme.notificationlive.repository;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f114360a;

    /* renamed from: b  reason: collision with root package name */
    public final String f114361b;

    /* renamed from: c  reason: collision with root package name */
    public final long f114362c;

    /* renamed from: d  reason: collision with root package name */
    public final int f114363d = 20;

    /* renamed from: e  reason: collision with root package name */
    public final int f114364e;

    /* renamed from: f  reason: collision with root package name */
    public final int f114365f;

    /* renamed from: g  reason: collision with root package name */
    public final int f114366g;

    /* renamed from: h  reason: collision with root package name */
    public final int f114367h;

    /* renamed from: i  reason: collision with root package name */
    public final int f114368i;

    static {
        Covode.recordClassIndex(73551);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f114360a, aVar.f114360a) && l.a(this.f114361b, aVar.f114361b) && this.f114362c == aVar.f114362c && this.f114363d == aVar.f114363d && this.f114364e == aVar.f114364e && this.f114365f == aVar.f114365f && this.f114366g == aVar.f114366g && this.f114367h == aVar.f114367h && this.f114368i == aVar.f114368i;
    }

    public final String toString() {
        return "FollowRelationQueryParam(userId=" + this.f114360a + ", secUserId=" + this.f114361b + ", maxTime=" + this.f114362c + ", count=" + this.f114363d + ", offset=" + this.f114364e + ", sourceType=" + this.f114365f + ", addressBookAccess=" + this.f114366g + ", vcdCount=" + this.f114367h + ", afterVcdAuthorize=" + this.f114368i + ")";
    }

    public final int hashCode() {
        int i2;
        String str = this.f114360a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.f114361b;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j2 = this.f114362c;
        return ((((((((((((((i4 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f114363d) * 31) + this.f114364e) * 31) + this.f114365f) * 31) + this.f114366g) * 31) + this.f114367h) * 31) + this.f114368i;
    }

    public a(String str, String str2, long j2, int i2, int i3, int i4, int i5, int i6) {
        l.d(str, "");
        l.d(str2, "");
        this.f114360a = str;
        this.f114361b = str2;
        this.f114362c = j2;
        this.f114364e = i2;
        this.f114365f = 3;
        this.f114366g = i4;
        this.f114367h = i5;
        this.f114368i = i6;
    }
}
