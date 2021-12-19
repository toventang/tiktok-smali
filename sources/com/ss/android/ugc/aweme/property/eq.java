package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.google.gson.a.c;
import h.f.b.l;

public final class eq {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f118502a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f118503b;
    @c(a = "max_speed")

    /* renamed from: c  reason: collision with root package name */
    public final int f118504c;
    @c(a = "compile_video_size_index")

    /* renamed from: d  reason: collision with root package name */
    public final int f118505d;
    @c(a = "high_quality_compile_video_size_index")

    /* renamed from: e  reason: collision with root package name */
    public final int f118506e;
    @c(a = "ve_synthesis_settings")

    /* renamed from: f  reason: collision with root package name */
    public final String f118507f;
    @c(a = "high_quality_ve_synthesis_settings")

    /* renamed from: g  reason: collision with root package name */
    public final String f118508g;
    @c(a = "use_smart_compile")

    /* renamed from: h  reason: collision with root package name */
    public final boolean f118509h;
    @c(a = "high_quality_use_smart_compile")

    /* renamed from: i  reason: collision with root package name */
    public final boolean f118510i;
    @c(a = "upload_socket_num")

    /* renamed from: j  reason: collision with root package name */
    public final int f118511j;
    @c(a = "bitrate_of_recode_threshold")

    /* renamed from: k  reason: collision with root package name */
    public final int f118512k;
    @c(a = "high_quality_bitrate_of_recode_threshold")

    /* renamed from: l  reason: collision with root package name */
    public final int f118513l;
    @c(a = "hardcode_adaptive_bitrate")

    /* renamed from: m  reason: collision with root package name */
    public final int f118514m;

    static {
        Covode.recordClassIndex(76971);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return this.f118504c == eqVar.f118504c && this.f118505d == eqVar.f118505d && this.f118506e == eqVar.f118506e && l.a(this.f118507f, eqVar.f118507f) && l.a(this.f118508g, eqVar.f118508g) && this.f118509h == eqVar.f118509h && this.f118510i == eqVar.f118510i && this.f118511j == eqVar.f118511j && this.f118512k == eqVar.f118512k && this.f118513l == eqVar.f118513l && this.f118514m == eqVar.f118514m;
    }

    public final int hashCode() {
        int i2 = ((((this.f118504c * 31) + this.f118505d) * 31) + this.f118506e) * 31;
        String str = this.f118507f;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f118508g;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i4 = (hashCode + i3) * 31;
        boolean z = this.f118509h;
        int i5 = 1;
        if (z) {
            z = true;
        }
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = (i4 + i6) * 31;
        if (!this.f118510i) {
            i5 = 0;
        }
        return ((((((((i9 + i5) * 31) + this.f118511j) * 31) + this.f118512k) * 31) + this.f118513l) * 31) + this.f118514m;
    }

    public final String toString() {
        return "UploadSpeedEncodeSettings(maxSpeed=" + this.f118504c + ", compileVideoSizeIndex=" + this.f118505d + ", highQualityCompileVideoSizeIndex=" + this.f118506e + ", veSynthesisSettings=" + this.f118507f + ", highQualityVeSynthesisSettings=" + this.f118508g + ", useSmartCompile=" + this.f118509h + ", highQualityUseSmartCompile=" + this.f118510i + ", uploadSocketNum=" + this.f118511j + ", bitrateOfRecodeThreshold=" + this.f118512k + ", highQualityBitrateOfRecodeThreshold=" + this.f118513l + ", hardcodeAdaptiveBitrate=" + this.f118514m + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(76972);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ eq() {
        this(x.a(), cb.a(), en.a(), en.b(), g.a(), ca.a(), b.a().a(true, "hardcode_adaptive_bitrate", 0));
    }

    private eq(int i2, int i3, String str, String str2, int i4, int i5, int i6) {
        l.d(str, "");
        l.d(str2, "");
        this.f118504c = -1;
        this.f118505d = i2;
        this.f118506e = i3;
        this.f118507f = str;
        this.f118508g = str2;
        this.f118509h = false;
        this.f118510i = false;
        this.f118511j = 1;
        this.f118512k = i4;
        this.f118513l = i5;
        this.f118514m = i6;
        this.f118502a = -1;
    }
}
