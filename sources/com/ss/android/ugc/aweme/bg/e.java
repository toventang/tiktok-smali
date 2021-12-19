package com.ss.android.ugc.aweme.bg;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.Arrays;

public final class e {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final String f68668a;
    @c(a = "background_image_url")

    /* renamed from: b  reason: collision with root package name */
    public final String f68669b;
    @c(a = "title_image_url")

    /* renamed from: c  reason: collision with root package name */
    public final String f68670c;
    @c(a = "title")

    /* renamed from: d  reason: collision with root package name */
    public final String f68671d;
    @c(a = "sub_title")

    /* renamed from: e  reason: collision with root package name */
    public final String f68672e;
    @c(a = "mask")

    /* renamed from: f  reason: collision with root package name */
    public final String f68673f;
    @c(a = "btn_label")

    /* renamed from: g  reason: collision with root package name */
    public final String f68674g;
    @c(a = "rand_time")

    /* renamed from: h  reason: collision with root package name */
    public final long f68675h;
    @c(a = "complete_id")

    /* renamed from: i  reason: collision with root package name */
    public final String f68676i;
    @c(a = "url")

    /* renamed from: j  reason: collision with root package name */
    public final String f68677j;
    @c(a = "time_range")

    /* renamed from: k  reason: collision with root package name */
    public final d[] f68678k;
    @c(a = "primary_btn")

    /* renamed from: l  reason: collision with root package name */
    public final c f68679l;
    @c(a = "secondary_btn")

    /* renamed from: m  reason: collision with root package name */
    public final c f68680m;

    static {
        Covode.recordClassIndex(42258);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f68668a, eVar.f68668a) && l.a(this.f68669b, eVar.f68669b) && l.a(this.f68670c, eVar.f68670c) && l.a(this.f68671d, eVar.f68671d) && l.a(this.f68672e, eVar.f68672e) && l.a(this.f68673f, eVar.f68673f) && l.a(this.f68674g, eVar.f68674g) && this.f68675h == eVar.f68675h && l.a(this.f68676i, eVar.f68676i) && l.a(this.f68677j, eVar.f68677j) && l.a(this.f68678k, eVar.f68678k) && l.a(this.f68679l, eVar.f68679l) && l.a(this.f68680m, eVar.f68680m);
    }

    public final String toString() {
        return "KproPopupSetting(type=" + this.f68668a + ", backGroundImageUrl=" + this.f68669b + ", title_image_url=" + this.f68670c + ", title=" + this.f68671d + ", sub_title=" + this.f68672e + ", mask=" + this.f68673f + ", btn_label=" + this.f68674g + ", rand_time=" + this.f68675h + ", complete_id=" + this.f68676i + ", url=" + this.f68677j + ", time_range=" + Arrays.toString(this.f68678k) + ", primaryBtn=" + this.f68679l + ", secondaryBtn=" + this.f68680m + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str = this.f68668a;
        int i13 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = i2 * 31;
        String str2 = this.f68669b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        String str3 = this.f68670c;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        String str4 = this.f68671d;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        String str5 = this.f68672e;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 31;
        String str6 = this.f68673f;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 31;
        String str7 = this.f68674g;
        if (str7 != null) {
            i8 = str7.hashCode();
        } else {
            i8 = 0;
        }
        long j2 = this.f68675h;
        int i20 = (((i19 + i8) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str8 = this.f68676i;
        if (str8 != null) {
            i9 = str8.hashCode();
        } else {
            i9 = 0;
        }
        int i21 = (i20 + i9) * 31;
        String str9 = this.f68677j;
        if (str9 != null) {
            i10 = str9.hashCode();
        } else {
            i10 = 0;
        }
        int i22 = (i21 + i10) * 31;
        d[] dVarArr = this.f68678k;
        if (dVarArr != null) {
            i11 = Arrays.hashCode(dVarArr);
        } else {
            i11 = 0;
        }
        int i23 = (i22 + i11) * 31;
        c cVar = this.f68679l;
        if (cVar != null) {
            i12 = cVar.hashCode();
        } else {
            i12 = 0;
        }
        int i24 = (i23 + i12) * 31;
        c cVar2 = this.f68680m;
        if (cVar2 != null) {
            i13 = cVar2.hashCode();
        }
        return i24 + i13;
    }
}
