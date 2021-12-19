package com.ss.android.ugc.aweme.mvtemplate.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class e {
    public static final a o = new a((byte) 0);
    @c(a = "template_id")

    /* renamed from: a  reason: collision with root package name */
    public final long f112142a;
    @c(a = "author")

    /* renamed from: b  reason: collision with root package name */
    public final User f112143b;
    @c(a = "music")

    /* renamed from: c  reason: collision with root package name */
    public final Music f112144c;
    @c(a = "video")

    /* renamed from: d  reason: collision with root package name */
    public final Video f112145d;
    @c(a = "title")

    /* renamed from: e  reason: collision with root package name */
    public final String f112146e;
    @c(a = "desc")

    /* renamed from: f  reason: collision with root package name */
    public final String f112147f;
    @c(a = "template_url")

    /* renamed from: g  reason: collision with root package name */
    public final String f112148g;
    @c(a = "fragment_count")

    /* renamed from: h  reason: collision with root package name */
    public final int f112149h;
    @c(a = "usage_amount")

    /* renamed from: i  reason: collision with root package name */
    public final long f112150i;
    @c(a = "extra")

    /* renamed from: j  reason: collision with root package name */
    public final String f112151j;
    @c(a = "is_collected")

    /* renamed from: k  reason: collision with root package name */
    public final boolean f112152k;
    @c(a = "sdk_version")

    /* renamed from: l  reason: collision with root package name */
    public final String f112153l;
    @c(a = "item_type")

    /* renamed from: m  reason: collision with root package name */
    public final int f112154m;
    @c(a = "md5")
    public final String n;

    static {
        Covode.recordClassIndex(72054);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f112142a == eVar.f112142a && l.a(this.f112143b, eVar.f112143b) && l.a(this.f112144c, eVar.f112144c) && l.a(this.f112145d, eVar.f112145d) && l.a(this.f112146e, eVar.f112146e) && l.a(this.f112147f, eVar.f112147f) && l.a(this.f112148g, eVar.f112148g) && this.f112149h == eVar.f112149h && this.f112150i == eVar.f112150i && l.a(this.f112151j, eVar.f112151j) && this.f112152k == eVar.f112152k && l.a(this.f112153l, eVar.f112153l) && this.f112154m == eVar.f112154m && l.a(this.n, eVar.n);
    }

    public final String toString() {
        return "TemplateResponseItem(id=" + this.f112142a + ", author=" + this.f112143b + ", music=" + this.f112144c + ", video=" + this.f112145d + ", title=" + this.f112146e + ", description=" + this.f112147f + ", templateUrl=" + this.f112148g + ", fragmentCount=" + this.f112149h + ", usageAmount=" + this.f112150i + ", extra=" + this.f112151j + ", isCollected=" + this.f112152k + ", sdkVersion=" + this.f112153l + ", itemType=" + this.f112154m + ", md5=" + this.n + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72055);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ e() {
        this("not_set", "not_set", "not_set", "not_set", "not_set", "not_set");
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
        long j2 = this.f112142a;
        int i10 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        User user = this.f112143b;
        int i11 = 0;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i10 + i2) * 31;
        Music music = this.f112144c;
        if (music != null) {
            i3 = music.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        Video video = this.f112145d;
        if (video != null) {
            i4 = video.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        String str = this.f112146e;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        String str2 = this.f112147f;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        String str3 = this.f112148g;
        if (str3 != null) {
            i7 = str3.hashCode();
        } else {
            i7 = 0;
        }
        long j3 = this.f112150i;
        int i17 = (((((i16 + i7) * 31) + this.f112149h) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str4 = this.f112151j;
        if (str4 != null) {
            i8 = str4.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        boolean z = this.f112152k;
        if (z) {
            z = true;
        }
        int i19 = z ? 1 : 0;
        int i20 = z ? 1 : 0;
        int i21 = z ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        String str5 = this.f112153l;
        if (str5 != null) {
            i9 = str5.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (((i22 + i9) * 31) + this.f112154m) * 31;
        String str6 = this.n;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        return i23 + i11;
    }

    private e(String str, String str2, String str3, String str4, String str5, String str6) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        this.f112142a = -1;
        this.f112143b = null;
        this.f112144c = null;
        this.f112145d = null;
        this.f112146e = str;
        this.f112147f = str2;
        this.f112148g = str3;
        this.f112149h = 0;
        this.f112150i = 0;
        this.f112151j = str4;
        this.f112152k = false;
        this.f112153l = str5;
        this.f112154m = -1;
        this.n = str6;
    }
}
