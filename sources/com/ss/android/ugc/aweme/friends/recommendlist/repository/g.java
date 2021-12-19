package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f96998a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f96999b;

    /* renamed from: c  reason: collision with root package name */
    public final String f97000c;

    /* renamed from: d  reason: collision with root package name */
    public final int f97001d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f97002e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f97003f;

    /* renamed from: g  reason: collision with root package name */
    public final String f97004g;

    /* renamed from: h  reason: collision with root package name */
    public final String f97005h = null;

    /* renamed from: i  reason: collision with root package name */
    public final Integer f97006i;

    /* renamed from: j  reason: collision with root package name */
    public final String f97007j;

    static {
        Covode.recordClassIndex(61651);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f96998a, gVar.f96998a) && l.a(this.f96999b, gVar.f96999b) && l.a(this.f97000c, gVar.f97000c) && this.f97001d == gVar.f97001d && l.a(this.f97002e, gVar.f97002e) && l.a(this.f97003f, gVar.f97003f) && l.a(this.f97004g, gVar.f97004g) && l.a(this.f97005h, gVar.f97005h) && l.a(this.f97006i, gVar.f97006i) && l.a(this.f97007j, gVar.f97007j);
    }

    public final int hashCode() {
        Integer num = this.f96998a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f96999b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f97000c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f97001d) * 31;
        Integer num3 = this.f97002e;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f97003f;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f97004g;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f97005h;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num5 = this.f97006i;
        int hashCode8 = (hashCode7 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str4 = this.f97007j;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "RecommendListRequestParams(count=" + this.f96998a + ", cursor=" + this.f96999b + ", targetUserId=" + this.f97000c + ", recommendType=" + this.f97001d + ", yellowPointCount=" + this.f97002e + ", addressBookAccess=" + this.f97003f + ", recImprUsers=" + this.f97004g + ", pushUserId=" + this.f97005h + ", moonAccess=" + this.f97006i + ", secTargetUserId=" + this.f97007j + ")";
    }

    public g(Integer num, Integer num2, String str, int i2, Integer num3, Integer num4, String str2, Integer num5, String str3) {
        this.f96998a = num;
        this.f96999b = num2;
        this.f97000c = str;
        this.f97001d = i2;
        this.f97002e = num3;
        this.f97003f = num4;
        this.f97004g = str2;
        this.f97006i = num5;
        this.f97007j = str3;
    }
}
