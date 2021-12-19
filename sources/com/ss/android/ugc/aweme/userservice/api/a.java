package com.ss.android.ugc.aweme.userservice.api;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f142439a;

    /* renamed from: b  reason: collision with root package name */
    public final String f142440b;

    /* renamed from: c  reason: collision with root package name */
    public final int f142441c;

    /* renamed from: d  reason: collision with root package name */
    public final int f142442d;

    /* renamed from: e  reason: collision with root package name */
    public final int f142443e;

    /* renamed from: f  reason: collision with root package name */
    public final String f142444f;

    /* renamed from: g  reason: collision with root package name */
    public final int f142445g;

    /* renamed from: h  reason: collision with root package name */
    public final String f142446h;

    /* renamed from: i  reason: collision with root package name */
    public final String f142447i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f142448j;

    static {
        Covode.recordClassIndex(93164);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f142439a, aVar.f142439a) && l.a(this.f142440b, aVar.f142440b) && this.f142441c == aVar.f142441c && this.f142442d == aVar.f142442d && this.f142443e == aVar.f142443e && l.a(this.f142444f, aVar.f142444f) && this.f142445g == aVar.f142445g && l.a(this.f142446h, aVar.f142446h) && l.a(this.f142447i, aVar.f142447i) && l.a(this.f142448j, aVar.f142448j);
    }

    public final int hashCode() {
        String str = this.f142439a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f142440b;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f142441c) * 31) + this.f142442d) * 31) + this.f142443e) * 31;
        String str3 = this.f142444f;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f142445g) * 31;
        String str4 = this.f142446h;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f142447i;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f142448j;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "FollowRequestParam(userId=" + this.f142439a + ", secUserId=" + this.f142440b + ", type=" + this.f142441c + ", channelId=" + this.f142442d + ", from=" + this.f142443e + ", itemId=" + this.f142444f + ", fromPreviousPage=" + this.f142445g + ", videoLinkId=" + this.f142446h + ", videoItemId=" + this.f142447i + ", linkSharer=" + this.f142448j + ")";
    }

    public /* synthetic */ a(String str, String str2, int i2, int i3, int i4, String str3, int i5) {
        this(str, str2, i2, i3, i4, str3, i5, null, null, null);
    }

    public a(String str, String str2, int i2, int i3, int i4, String str3, int i5, String str4, String str5, Integer num) {
        l.c(str, "");
        l.c(str2, "");
        this.f142439a = str;
        this.f142440b = str2;
        this.f142441c = i2;
        this.f142442d = i3;
        this.f142443e = i4;
        this.f142444f = str3;
        this.f142445g = i5;
        this.f142446h = str4;
        this.f142447i = str5;
        this.f142448j = num;
    }
}
