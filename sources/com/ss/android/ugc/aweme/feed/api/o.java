package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.cache.j;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f91953a;

    /* renamed from: b  reason: collision with root package name */
    public final Long f91954b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f91955c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f91956d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f91957e;

    /* renamed from: f  reason: collision with root package name */
    public final String f91958f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f91959g;

    /* renamed from: h  reason: collision with root package name */
    public final String f91960h;

    /* renamed from: i  reason: collision with root package name */
    public final String f91961i;

    /* renamed from: j  reason: collision with root package name */
    public final j f91962j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f91963k;

    /* renamed from: l  reason: collision with root package name */
    public String f91964l = null;

    /* renamed from: m  reason: collision with root package name */
    public String f91965m = null;
    public final boolean n;
    public final String o;

    static {
        Covode.recordClassIndex(57904);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f91953a, oVar.f91953a) && l.a(this.f91954b, oVar.f91954b) && l.a(this.f91955c, oVar.f91955c) && l.a(this.f91956d, oVar.f91956d) && l.a(this.f91957e, oVar.f91957e) && l.a(this.f91958f, oVar.f91958f) && l.a(this.f91959g, oVar.f91959g) && l.a(this.f91960h, oVar.f91960h) && l.a(this.f91961i, oVar.f91961i) && l.a(this.f91962j, oVar.f91962j) && l.a(this.f91963k, oVar.f91963k) && l.a(this.f91964l, oVar.f91964l) && l.a(this.f91965m, oVar.f91965m) && this.n == oVar.n && l.a(this.o, oVar.o);
    }

    public final int hashCode() {
        Integer num = this.f91953a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Long l2 = this.f91954b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f91955c;
        int hashCode3 = (hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Integer num2 = this.f91956d;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f91957e;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str = this.f91958f;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num4 = this.f91959g;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str2 = this.f91960h;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f91961i;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        j jVar = this.f91962j;
        int hashCode10 = (hashCode9 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Boolean bool = this.f91963k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str4 = this.f91964l;
        int hashCode12 = (hashCode11 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f91965m;
        int hashCode13 = (hashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.n;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode13 + i3) * 31;
        String str6 = this.o;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "RecommendApiParam(type=" + this.f91953a + ", max=" + this.f91954b + ", min=" + this.f91955c + ", count=" + this.f91956d + ", feedStyle=" + this.f91957e + ", awemeId=" + this.f91958f + ", pullType=" + this.f91959g + ", awemeIds=" + this.f91960h + ", pushParams=" + this.f91961i + ", localCache=" + this.f91962j + ", isFirst=" + this.f91963k + ", showIds=" + this.f91964l + ", cachedIds=" + this.f91965m + ", isPlayingInBackground=" + this.n + ", showTimeGapInfo=" + this.o + ")";
    }

    public o(Integer num, Long l2, Long l3, Integer num2, Integer num3, String str, Integer num4, String str2, String str3, j jVar, Boolean bool, boolean z, String str4) {
        this.f91953a = num;
        this.f91954b = l2;
        this.f91955c = l3;
        this.f91956d = num2;
        this.f91957e = num3;
        this.f91958f = str;
        this.f91959g = num4;
        this.f91960h = str2;
        this.f91961i = str3;
        this.f91962j = jVar;
        this.f91963k = bool;
        this.n = z;
        this.o = str4;
    }
}
