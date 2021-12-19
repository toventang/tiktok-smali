package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f127019a;

    /* renamed from: b  reason: collision with root package name */
    public final String f127020b;

    /* renamed from: c  reason: collision with root package name */
    public final String f127021c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f127022d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f127023e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f127024f;

    /* renamed from: g  reason: collision with root package name */
    public final String f127025g;

    /* renamed from: h  reason: collision with root package name */
    public final String f127026h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f127027i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f127028j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f127029k;

    /* renamed from: l  reason: collision with root package name */
    public final long f127030l;

    /* renamed from: m  reason: collision with root package name */
    public final long f127031m;
    public final String n;
    public final String o;

    static {
        Covode.recordClassIndex(83339);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f127019a, eVar.f127019a) && l.a(this.f127020b, eVar.f127020b) && l.a(this.f127021c, eVar.f127021c) && this.f127022d == eVar.f127022d && this.f127023e == eVar.f127023e && this.f127024f == eVar.f127024f && l.a(this.f127025g, eVar.f127025g) && l.a(this.f127026h, eVar.f127026h) && this.f127027i == eVar.f127027i && this.f127028j == eVar.f127028j && this.f127029k == eVar.f127029k && this.f127030l == eVar.f127030l && this.f127031m == eVar.f127031m && l.a(this.n, eVar.n) && l.a(this.o, eVar.o);
    }

    public final String toString() {
        return "ChooseMusicParam(stickerMusicIdsJsonString=" + this.f127019a + ", firstStickerId=" + this.f127020b + ", firstStickerChallengeId=" + this.f127021c + ", allowClear=" + this.f127022d + ", isPhotoMvMode=" + this.f127023e + ", isMVThemeMusic=" + this.f127024f + ", shootWay=" + this.f127025g + ", creationId=" + this.f127026h + ", longVideo=" + this.f127027i + ", isBusinessSticker=" + this.f127028j + ", hideCancelMusic=" + this.f127029k + ", maxDuration=" + this.f127030l + ", videoLength=" + this.f127031m + ", missionId=" + this.n + ", missionMusicId=" + this.o + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = this.f127019a;
        int i8 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = i2 * 31;
        String str2 = this.f127020b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        String str3 = this.f127021c;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        boolean z = this.f127022d;
        int i12 = 1;
        if (z) {
            z = true;
        }
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        int i15 = z ? 1 : 0;
        int i16 = (i11 + i13) * 31;
        boolean z2 = this.f127023e;
        if (z2) {
            z2 = true;
        }
        int i17 = z2 ? 1 : 0;
        int i18 = z2 ? 1 : 0;
        int i19 = z2 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        boolean z3 = this.f127024f;
        if (z3) {
            z3 = true;
        }
        int i21 = z3 ? 1 : 0;
        int i22 = z3 ? 1 : 0;
        int i23 = z3 ? 1 : 0;
        int i24 = (i20 + i21) * 31;
        String str4 = this.f127025g;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 31;
        String str5 = this.f127026h;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i26 = (i25 + i6) * 31;
        boolean z4 = this.f127027i;
        if (z4) {
            z4 = true;
        }
        int i27 = z4 ? 1 : 0;
        int i28 = z4 ? 1 : 0;
        int i29 = z4 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        boolean z5 = this.f127028j;
        if (z5) {
            z5 = true;
        }
        int i31 = z5 ? 1 : 0;
        int i32 = z5 ? 1 : 0;
        int i33 = z5 ? 1 : 0;
        int i34 = (i30 + i31) * 31;
        if (!this.f127029k) {
            i12 = 0;
        }
        long j2 = this.f127030l;
        long j3 = this.f127031m;
        int i35 = (((((i34 + i12) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str6 = this.n;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i36 = (i35 + i7) * 31;
        String str7 = this.o;
        if (str7 != null) {
            i8 = str7.hashCode();
        }
        return i36 + i8;
    }

    public e(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, boolean z4, boolean z5, boolean z6, long j2, long j3, String str6, String str7) {
        this.f127019a = str;
        this.f127020b = str2;
        this.f127021c = str3;
        this.f127022d = z;
        this.f127023e = z2;
        this.f127024f = z3;
        this.f127025g = str4;
        this.f127026h = str5;
        this.f127027i = z4;
        this.f127028j = z5;
        this.f127029k = z6;
        this.f127030l = j2;
        this.f127031m = j3;
        this.n = str6;
        this.o = str7;
    }
}
