package com.ss.android.ugc.aweme.commercialize.adsetting;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f73683a;
    @com.google.gson.a.c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f73684b;
    @com.google.gson.a.c(a = "promotable")

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f73685c;
    @com.google.gson.a.c(a = "dark_post_status")

    /* renamed from: d  reason: collision with root package name */
    public final Integer f73686d;
    @com.google.gson.a.c(a = "dark_post_source")

    /* renamed from: e  reason: collision with root package name */
    public final Integer f73687e;
    @com.google.gson.a.c(a = "video_code")

    /* renamed from: f  reason: collision with root package name */
    public final String f73688f;
    @com.google.gson.a.c(a = "code_status")

    /* renamed from: g  reason: collision with root package name */
    public final Integer f73689g;
    @com.google.gson.a.c(a = "start_time")

    /* renamed from: h  reason: collision with root package name */
    public final Long f73690h;
    @com.google.gson.a.c(a = "end_time")

    /* renamed from: i  reason: collision with root package name */
    public final Long f73691i;

    static {
        Covode.recordClassIndex(45336);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f73683a, cVar.f73683a) && l.a(this.f73684b, cVar.f73684b) && l.a(this.f73685c, cVar.f73685c) && l.a(this.f73686d, cVar.f73686d) && l.a(this.f73687e, cVar.f73687e) && l.a(this.f73688f, cVar.f73688f) && l.a(this.f73689g, cVar.f73689g) && l.a(this.f73690h, cVar.f73690h) && l.a(this.f73691i, cVar.f73691i);
    }

    public final int hashCode() {
        Integer num = this.f73683a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f73684b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.f73685c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num2 = this.f73686d;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f73687e;
        int hashCode5 = (hashCode4 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str2 = this.f73688f;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num4 = this.f73689g;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Long l2 = this.f73690h;
        int hashCode8 = (hashCode7 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.f73691i;
        if (l3 != null) {
            i2 = l3.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "AdSettingsData(statusCode=" + this.f73683a + ", statusMsg=" + this.f73684b + ", promotable=" + this.f73685c + ", darkPostStatus=" + this.f73686d + ", darkPostSource=" + this.f73687e + ", videoCode=" + this.f73688f + ", codeStatus=" + this.f73689g + ", startTime=" + this.f73690h + ", endTime=" + this.f73691i + ")";
    }
}
