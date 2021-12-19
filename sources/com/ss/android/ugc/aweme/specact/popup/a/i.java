package com.ss.android.ugc.aweme.specact.popup.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class i {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public int f134431a;
    @c(a = "style")

    /* renamed from: b  reason: collision with root package name */
    public int f134432b;
    @c(a = StringSet.name)

    /* renamed from: c  reason: collision with root package name */
    public String f134433c;
    @c(a = "activity_id")

    /* renamed from: d  reason: collision with root package name */
    public String f134434d;
    @c(a = "cover_img")

    /* renamed from: e  reason: collision with root package name */
    public String f134435e;
    @c(a = "title")

    /* renamed from: f  reason: collision with root package name */
    public String f134436f;
    @c(a = "desc")

    /* renamed from: g  reason: collision with root package name */
    public String f134437g;
    @c(a = "top_image")

    /* renamed from: h  reason: collision with root package name */
    public String f134438h;
    @c(a = "progress_bar")

    /* renamed from: i  reason: collision with root package name */
    public g f134439i;
    @c(a = "font")

    /* renamed from: j  reason: collision with root package name */
    public d f134440j;
    @c(a = "body")

    /* renamed from: k  reason: collision with root package name */
    public List<a> f134441k;
    @c(a = "buttons")

    /* renamed from: l  reason: collision with root package name */
    public List<b> f134442l;
    @c(a = "frequency_control")

    /* renamed from: m  reason: collision with root package name */
    public e f134443m;
    @c(a = "priority")
    public int n;
    @c(a = "others")
    public f o;
    @c(a = "activity_start_time")
    public long p;
    @c(a = "activity_end_time")
    public long q;
    @c(a = "colors")
    public List<String> r;
    @c(a = "round")
    public int s;

    static {
        Covode.recordClassIndex(87883);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f134431a == iVar.f134431a && this.f134432b == iVar.f134432b && l.a(this.f134433c, iVar.f134433c) && l.a(this.f134434d, iVar.f134434d) && l.a(this.f134435e, iVar.f134435e) && l.a(this.f134436f, iVar.f134436f) && l.a(this.f134437g, iVar.f134437g) && l.a(this.f134438h, iVar.f134438h) && l.a(this.f134439i, iVar.f134439i) && l.a(this.f134440j, iVar.f134440j) && l.a(this.f134441k, iVar.f134441k) && l.a(this.f134442l, iVar.f134442l) && l.a(this.f134443m, iVar.f134443m) && this.n == iVar.n && l.a(this.o, iVar.o) && this.p == iVar.p && this.q == iVar.q && l.a(this.r, iVar.r) && this.s == iVar.s;
    }

    public final String toString() {
        return "SpecActPopupInfo(type=" + this.f134431a + ", style=" + this.f134432b + ", name=" + this.f134433c + ", activityId=" + this.f134434d + ", coverImg=" + this.f134435e + ", title=" + this.f134436f + ", desc=" + this.f134437g + ", topImage=" + this.f134438h + ", progressBar=" + this.f134439i + ", font=" + this.f134440j + ", body=" + this.f134441k + ", buttons=" + this.f134442l + ", frequencyControl=" + this.f134443m + ", priority=" + this.n + ", others=" + this.o + ", activityStartTime=" + this.p + ", activityEndTime=" + this.q + ", colors=" + this.r + ", round=" + this.s + ")";
    }

    private /* synthetic */ i() {
        this("", "", "", "", "", "", new g(), new d(), new ArrayList(), new ArrayList(), new e((byte) 0), new f(), new ArrayList());
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
        int i13;
        int i14 = ((this.f134431a * 31) + this.f134432b) * 31;
        String str = this.f134433c;
        int i15 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i14 + i2) * 31;
        String str2 = this.f134434d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str3 = this.f134435e;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        String str4 = this.f134436f;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 31;
        String str5 = this.f134437g;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 31;
        String str6 = this.f134438h;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        g gVar = this.f134439i;
        if (gVar != null) {
            i8 = gVar.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        d dVar = this.f134440j;
        if (dVar != null) {
            i9 = dVar.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        List<a> list = this.f134441k;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 31;
        List<b> list2 = this.f134442l;
        if (list2 != null) {
            i11 = list2.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        e eVar = this.f134443m;
        if (eVar != null) {
            i12 = eVar.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (((i25 + i12) * 31) + this.n) * 31;
        f fVar = this.o;
        if (fVar != null) {
            i13 = fVar.hashCode();
        } else {
            i13 = 0;
        }
        long j2 = this.p;
        long j3 = this.q;
        int i27 = (((((i26 + i13) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        List<String> list3 = this.r;
        if (list3 != null) {
            i15 = list3.hashCode();
        }
        return ((i27 + i15) * 31) + this.s;
    }

    private i(String str, String str2, String str3, String str4, String str5, String str6, g gVar, d dVar, List<a> list, List<b> list2, e eVar, f fVar, List<String> list3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(gVar, "");
        l.d(dVar, "");
        l.d(list, "");
        l.d(list2, "");
        l.d(eVar, "");
        l.d(fVar, "");
        l.d(list3, "");
        this.f134431a = 0;
        this.f134432b = 0;
        this.f134433c = str;
        this.f134434d = str2;
        this.f134435e = str3;
        this.f134436f = str4;
        this.f134437g = str5;
        this.f134438h = str6;
        this.f134439i = gVar;
        this.f134440j = dVar;
        this.f134441k = list;
        this.f134442l = list2;
        this.f134443m = eVar;
        this.n = 0;
        this.o = fVar;
        this.p = 0;
        this.q = 0;
        this.r = list3;
        this.s = 0;
    }
}
