package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f97009a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f97010b;

    /* renamed from: c  reason: collision with root package name */
    public final String f97011c;

    /* renamed from: d  reason: collision with root package name */
    public final int f97012d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f97013e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f97014f;

    /* renamed from: g  reason: collision with root package name */
    public final String f97015g;

    /* renamed from: h  reason: collision with root package name */
    public final String f97016h = null;

    /* renamed from: i  reason: collision with root package name */
    public final Integer f97017i;

    /* renamed from: j  reason: collision with root package name */
    public final String f97018j;

    static {
        Covode.recordClassIndex(61654);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l.a(this.f97009a, iVar.f97009a) && l.a(this.f97010b, iVar.f97010b) && l.a(this.f97011c, iVar.f97011c) && this.f97012d == iVar.f97012d && l.a(this.f97013e, iVar.f97013e) && l.a(this.f97014f, iVar.f97014f) && l.a(this.f97015g, iVar.f97015g) && l.a(this.f97016h, iVar.f97016h) && l.a(this.f97017i, iVar.f97017i) && l.a(this.f97018j, iVar.f97018j);
    }

    public final int hashCode() {
        Integer num = this.f97009a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f97010b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f97011c;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f97012d) * 31;
        Integer num3 = this.f97013e;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f97014f;
        int hashCode5 = (hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f97015g;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f97016h;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num5 = this.f97017i;
        int hashCode8 = (hashCode7 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str4 = this.f97018j;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "RecommendListUserRequestParams(count=" + this.f97009a + ", cursor=" + this.f97010b + ", targetUserId=" + this.f97011c + ", recommendType=" + this.f97012d + ", yellowPointCount=" + this.f97013e + ", addressBookAccess=" + this.f97014f + ", recImprUsers=" + this.f97015g + ", pushUserId=" + this.f97016h + ", moonAccess=" + this.f97017i + ", secTargetUserId=" + this.f97018j + ")";
    }

    public i(Integer num, Integer num2, String str, int i2, Integer num3, Integer num4, String str2, Integer num5, String str3) {
        this.f97009a = num;
        this.f97010b = num2;
        this.f97011c = str;
        this.f97012d = i2;
        this.f97013e = num3;
        this.f97014f = num4;
        this.f97015g = str2;
        this.f97017i = num5;
        this.f97018j = str3;
    }
}
