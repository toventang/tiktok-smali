package com.ss.android.ugc.aweme.follow.presenter;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f96259a;

    /* renamed from: b  reason: collision with root package name */
    public final int f96260b;

    /* renamed from: c  reason: collision with root package name */
    public final int f96261c;

    /* renamed from: d  reason: collision with root package name */
    public final String f96262d;

    /* renamed from: e  reason: collision with root package name */
    public final String f96263e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f96264f;

    /* renamed from: g  reason: collision with root package name */
    public final String f96265g;

    /* renamed from: h  reason: collision with root package name */
    public final String f96266h;

    /* renamed from: i  reason: collision with root package name */
    public final String f96267i;

    /* renamed from: j  reason: collision with root package name */
    public final int f96268j;

    /* renamed from: k  reason: collision with root package name */
    public final List<Long> f96269k;

    static {
        Covode.recordClassIndex(60968);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f96259a == dVar.f96259a && this.f96260b == dVar.f96260b && this.f96261c == dVar.f96261c && l.a(this.f96262d, dVar.f96262d) && l.a(this.f96263e, dVar.f96263e) && l.a(this.f96264f, dVar.f96264f) && l.a(this.f96265g, dVar.f96265g) && l.a(this.f96266h, dVar.f96266h) && l.a(this.f96267i, dVar.f96267i) && this.f96268j == dVar.f96268j && l.a(this.f96269k, dVar.f96269k);
    }

    public final int hashCode() {
        int i2 = ((((this.f96259a * 31) + this.f96260b) * 31) + this.f96261c) * 31;
        String str = this.f96262d;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f96263e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f96264f;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f96265g;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f96266h;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f96267i;
        int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f96268j) * 31;
        List<Long> list = this.f96269k;
        if (list != null) {
            i3 = list.hashCode();
        }
        return hashCode6 + i3;
    }

    public final String toString() {
        return "FollowFeedParam(listQueryType=" + this.f96259a + ", pullType=" + this.f96260b + ", followFeedStyle=" + this.f96261c + ", impressionIds=" + this.f96262d + ", lastFeedsId=" + this.f96263e + ", liveTagShow=" + this.f96264f + ", insertAwemeId=" + this.f96265g + ", pushAids=" + this.f96266h + ", pushParams=" + this.f96267i + ", refreshAfterVcdAuthorize=" + this.f96268j + ", insertRoomIds=" + this.f96269k + ")";
    }

    public d(int i2, int i3, int i4, String str, String str2, Integer num, String str3, String str4, String str5, int i5, List<Long> list) {
        l.d(str, "");
        this.f96259a = i2;
        this.f96260b = i3;
        this.f96261c = i4;
        this.f96262d = str;
        this.f96263e = str2;
        this.f96264f = num;
        this.f96265g = str3;
        this.f96266h = str4;
        this.f96267i = str5;
        this.f96268j = i5;
        this.f96269k = list;
    }
}
