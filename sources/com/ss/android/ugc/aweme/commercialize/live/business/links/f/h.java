package com.ss.android.ugc.aweme.commercialize.live.business.links.f;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class h {
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public final String f74642a;
    @c(a = "subtitle")

    /* renamed from: b  reason: collision with root package name */
    public final String f74643b;
    @c(a = "pic_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f74644c;
    @c(a = "link_id")

    /* renamed from: d  reason: collision with root package name */
    public final long f74645d;
    @c(a = "link_url")

    /* renamed from: e  reason: collision with root package name */
    public final String f74646e;
    @c(a = "card_type")

    /* renamed from: f  reason: collision with root package name */
    public final int f74647f;
    @c(a = "game_url")

    /* renamed from: g  reason: collision with root package name */
    public final String f74648g;

    static {
        Covode.recordClassIndex(46023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return l.a(this.f74642a, hVar.f74642a) && l.a(this.f74643b, hVar.f74643b) && l.a(this.f74644c, hVar.f74644c) && this.f74645d == hVar.f74645d && l.a(this.f74646e, hVar.f74646e) && this.f74647f == hVar.f74647f && l.a(this.f74648g, hVar.f74648g);
    }

    public final String toString() {
        return "CardData(title=" + this.f74642a + ", subtitle=" + this.f74643b + ", picUrl=" + this.f74644c + ", linkId=" + this.f74645d + ", linkUrl=" + this.f74646e + ", cardType=" + this.f74647f + ", gameUrl=" + this.f74648g + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f74642a;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = i2 * 31;
        String str2 = this.f74643b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.f74644c;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        long j2 = this.f74645d;
        int i9 = (((i8 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str4 = this.f74646e;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (((i9 + i5) * 31) + this.f74647f) * 31;
        String str5 = this.f74648g;
        if (str5 != null) {
            i6 = str5.hashCode();
        }
        return i10 + i6;
    }
}
