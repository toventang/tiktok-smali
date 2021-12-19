package com.ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "bed_time_start")

    /* renamed from: a  reason: collision with root package name */
    public final String f105901a = null;
    @c(a = "bed_time_end")

    /* renamed from: b  reason: collision with root package name */
    public final String f105902b = null;
    @c(a = "wellness_img_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f105903c = null;
    @c(a = "dark_wellness_img_url")

    /* renamed from: d  reason: collision with root package name */
    public final String f105904d = null;
    @c(a = "title")

    /* renamed from: e  reason: collision with root package name */
    public final String f105905e = null;
    @c(a = "subtitle")

    /* renamed from: f  reason: collision with root package name */
    public final String f105906f = null;

    static {
        Covode.recordClassIndex(67773);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f105901a, bVar.f105901a) && l.a(this.f105902b, bVar.f105902b) && l.a(this.f105903c, bVar.f105903c) && l.a(this.f105904d, bVar.f105904d) && l.a(this.f105905e, bVar.f105905e) && l.a(this.f105906f, bVar.f105906f);
    }

    public final int hashCode() {
        String str = this.f105901a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f105902b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f105903c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f105904d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f105905e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f105906f;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "KidsBedTimeReminder(start=" + this.f105901a + ", end=" + this.f105902b + ", imageUrl=" + this.f105903c + ", imageUrlDark=" + this.f105904d + ", title=" + this.f105905e + ", subtitle=" + this.f105906f + ")";
    }

    private b() {
    }
}
