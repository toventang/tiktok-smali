package com.ss.android.ugc.aweme.comment.supporterpanel;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public final long f72362a;
    @com.google.gson.a.c(a = StringSet.name)

    /* renamed from: b  reason: collision with root package name */
    public final String f72363b;
    @com.google.gson.a.c(a = "describe")

    /* renamed from: c  reason: collision with root package name */
    public final String f72364c;
    @com.google.gson.a.c(a = "diamond_count")

    /* renamed from: d  reason: collision with root package name */
    public final long f72365d;
    @com.google.gson.a.c(a = "image")

    /* renamed from: e  reason: collision with root package name */
    public final UrlModel f72366e;
    @com.google.gson.a.c(a = "icon")

    /* renamed from: f  reason: collision with root package name */
    public final UrlModel f72367f;
    @com.google.gson.a.c(a = "asset")

    /* renamed from: g  reason: collision with root package name */
    public final UrlModel f72368g;
    @com.google.gson.a.c(a = "icon_medium")

    /* renamed from: h  reason: collision with root package name */
    public final UrlModel f72369h;
    @com.google.gson.a.c(a = "icon_large")

    /* renamed from: i  reason: collision with root package name */
    public final UrlModel f72370i;
    @com.google.gson.a.c(a = StringSet.type)

    /* renamed from: j  reason: collision with root package name */
    public final Integer f72371j;

    static {
        Covode.recordClassIndex(44621);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f72362a == cVar.f72362a && l.a(this.f72363b, cVar.f72363b) && l.a(this.f72364c, cVar.f72364c) && this.f72365d == cVar.f72365d && l.a(this.f72366e, cVar.f72366e) && l.a(this.f72367f, cVar.f72367f) && l.a(this.f72368g, cVar.f72368g) && l.a(this.f72369h, cVar.f72369h) && l.a(this.f72370i, cVar.f72370i) && l.a(this.f72371j, cVar.f72371j);
    }

    public final String toString() {
        return "GiftPageItem(id=" + this.f72362a + ", name=" + this.f72363b + ", describe=" + this.f72364c + ", diamondCount=" + this.f72365d + ", imageURL=" + this.f72366e + ", iconURL=" + this.f72367f + ", assetURL=" + this.f72368g + ", iconMedium=" + this.f72369h + ", iconLarge=" + this.f72370i + ", type=" + this.f72371j + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2 = this.f72362a;
        int i9 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f72363b;
        int i10 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i9 + i2) * 31;
        String str2 = this.f72364c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        long j3 = this.f72365d;
        int i12 = (((i11 + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        UrlModel urlModel = this.f72366e;
        if (urlModel != null) {
            i4 = urlModel.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        UrlModel urlModel2 = this.f72367f;
        if (urlModel2 != null) {
            i5 = urlModel2.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        UrlModel urlModel3 = this.f72368g;
        if (urlModel3 != null) {
            i6 = urlModel3.hashCode();
        } else {
            i6 = 0;
        }
        int i15 = (i14 + i6) * 31;
        UrlModel urlModel4 = this.f72369h;
        if (urlModel4 != null) {
            i7 = urlModel4.hashCode();
        } else {
            i7 = 0;
        }
        int i16 = (i15 + i7) * 31;
        UrlModel urlModel5 = this.f72370i;
        if (urlModel5 != null) {
            i8 = urlModel5.hashCode();
        } else {
            i8 = 0;
        }
        int i17 = (i16 + i8) * 31;
        Integer num = this.f72371j;
        if (num != null) {
            i10 = num.hashCode();
        }
        return i17 + i10;
    }
}
