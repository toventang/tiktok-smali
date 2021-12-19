package com.ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class f {
    @c(a = "ngo_name")

    /* renamed from: a  reason: collision with root package name */
    public final String f83028a;
    @c(a = "ngo_donation_link")

    /* renamed from: b  reason: collision with root package name */
    public final String f83029b;
    @c(a = "ngo_icon_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f83030c;
    @c(a = "ngo_description")

    /* renamed from: d  reason: collision with root package name */
    public final String f83031d;
    @c(a = "ngo_about_page")

    /* renamed from: e  reason: collision with root package name */
    public final String f83032e;

    static {
        Covode.recordClassIndex(51764);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f83028a, fVar.f83028a) && l.a(this.f83029b, fVar.f83029b) && l.a(this.f83030c, fVar.f83030c) && l.a(this.f83031d, fVar.f83031d) && l.a(this.f83032e, fVar.f83032e);
    }

    public final int hashCode() {
        String str = this.f83028a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f83029b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83030c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f83031d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f83032e;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "NgoStruct(ngoName=" + this.f83028a + ", donationLink=" + this.f83029b + ", url=" + this.f83030c + ", description=" + this.f83031d + ", aboutPage=" + this.f83032e + ")";
    }
}
