package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<VideoSegment> f125452a;

    /* renamed from: b  reason: collision with root package name */
    public final String f125453b;

    /* renamed from: c  reason: collision with root package name */
    public final String f125454c;

    /* renamed from: d  reason: collision with root package name */
    public final int f125455d;

    /* renamed from: e  reason: collision with root package name */
    public final int f125456e;

    /* renamed from: f  reason: collision with root package name */
    public final int f125457f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f125458g;

    /* renamed from: h  reason: collision with root package name */
    public final VEVideoEncodeSettings.ENCODE_STANDARD f125459h;

    /* renamed from: i  reason: collision with root package name */
    public final VEVideoEncodeSettings.ENCODE_PROFILE f125460i;

    /* renamed from: j  reason: collision with root package name */
    public final VEVideoEncodeSettings.ENCODE_BITRATE_MODE f125461j;

    /* renamed from: k  reason: collision with root package name */
    public final int f125462k;

    /* renamed from: l  reason: collision with root package name */
    public final int f125463l;

    /* renamed from: m  reason: collision with root package name */
    public final int f125464m;
    public final String n;

    static {
        Covode.recordClassIndex(82342);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f125452a, eVar.f125452a) && l.a(this.f125453b, eVar.f125453b) && l.a(this.f125454c, eVar.f125454c) && this.f125455d == eVar.f125455d && this.f125456e == eVar.f125456e && this.f125457f == eVar.f125457f && this.f125458g == eVar.f125458g && l.a(this.f125459h, eVar.f125459h) && l.a(this.f125460i, eVar.f125460i) && l.a(this.f125461j, eVar.f125461j) && this.f125462k == eVar.f125462k && this.f125463l == eVar.f125463l && this.f125464m == eVar.f125464m && l.a(this.n, eVar.n);
    }

    public final int hashCode() {
        List<VideoSegment> list = this.f125452a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f125453b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f125454c;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f125455d) * 31) + this.f125456e) * 31) + this.f125457f) * 31;
        boolean z = this.f125458g;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = this.f125459h;
        int hashCode4 = (i6 + (encode_standard != null ? encode_standard.hashCode() : 0)) * 31;
        VEVideoEncodeSettings.ENCODE_PROFILE encode_profile = this.f125460i;
        int hashCode5 = (hashCode4 + (encode_profile != null ? encode_profile.hashCode() : 0)) * 31;
        VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode = this.f125461j;
        int hashCode6 = (((((((hashCode5 + (encode_bitrate_mode != null ? encode_bitrate_mode.hashCode() : 0)) * 31) + this.f125462k) * 31) + this.f125463l) * 31) + this.f125464m) * 31;
        String str3 = this.n;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "CutVideoCompileSettings(segments=" + this.f125452a + ", videoOutputPath=" + this.f125453b + ", audioOutputPath=" + this.f125454c + ", videoWidth=" + this.f125455d + ", videoHeight=" + this.f125456e + ", fps=" + this.f125457f + ", isHWEncode=" + this.f125458g + ", encodeStandard=" + this.f125459h + ", encodeProfile=" + this.f125460i + ", videoEncodeBitrateMode=" + this.f125461j + ", videoBitrate=" + this.f125462k + ", resizeMode=" + this.f125463l + ", rotate=" + this.f125464m + ", externalSettings=" + this.n + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> */
    /* JADX WARN: Multi-variable type inference failed */
    private e(List<? extends VideoSegment> list, String str, String str2, int i2, int i3, int i4, boolean z, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i5, int i6, String str3) {
        l.d(list, "");
        l.d(str, "");
        l.d(encode_standard, "");
        l.d(encode_profile, "");
        l.d(encode_bitrate_mode, "");
        l.d(str3, "");
        this.f125452a = list;
        this.f125453b = str;
        this.f125454c = str2;
        this.f125455d = i2;
        this.f125456e = i3;
        this.f125457f = i4;
        this.f125458g = z;
        this.f125459h = encode_standard;
        this.f125460i = encode_profile;
        this.f125461j = encode_bitrate_mode;
        this.f125462k = i5;
        this.f125463l = i6;
        this.f125464m = 0;
        this.n = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(List list, String str, String str2, int i2, int i3, int i4, boolean z, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i5, int i6, String str3, int i7) {
        this(list, str, str2, (i7 & 8) != 0 ? 720 : i2, (i7 & 16) != 0 ? 1280 : i3, (i7 & 32) != 0 ? 30 : i4, (i7 & 64) != 0 ? false : z, (i7 & 128) != 0 ? VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264 : encode_standard, (i7 & 256) != 0 ? VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE : encode_profile, (i7 & 512) != 0 ? VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF : encode_bitrate_mode, (i7 & 1024) != 0 ? 15 : i5, (i7 & 2048) != 0 ? 1 : i6, (i7 & 8192) != 0 ? "" : str3);
    }
}
