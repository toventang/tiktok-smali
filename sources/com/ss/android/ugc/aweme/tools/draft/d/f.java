package com.ss.android.ugc.aweme.tools.draft.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import h.f.b.l;
import java.util.List;

public final class f {
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public final String f139495a;
    @c(a = "textExtra_strusts")

    /* renamed from: b  reason: collision with root package name */
    public final List<AVTextExtraStruct> f139496b;
    @c(a = "cover_path")

    /* renamed from: c  reason: collision with root package name */
    public final String f139497c;
    @c(a = "music_name")

    /* renamed from: d  reason: collision with root package name */
    public final String f139498d;
    @c(a = "music_id")

    /* renamed from: e  reason: collision with root package name */
    public final String f139499e;
    @c(a = "time")

    /* renamed from: f  reason: collision with root package name */
    public final long f139500f;
    @c(a = "save_time")

    /* renamed from: g  reason: collision with root package name */
    public long f139501g;

    static {
        Covode.recordClassIndex(91211);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f139495a, fVar.f139495a) && l.a(this.f139496b, fVar.f139496b) && l.a(this.f139497c, fVar.f139497c) && l.a(this.f139498d, fVar.f139498d) && l.a(this.f139499e, fVar.f139499e) && this.f139500f == fVar.f139500f && this.f139501g == fVar.f139501g;
    }

    public final String toString() {
        return "DraftShowInfo(title=" + this.f139495a + ", textExtraStrusts=" + this.f139496b + ", coverPath=" + this.f139497c + ", musicName=" + this.f139498d + ", musicId=" + this.f139499e + ", time=" + this.f139500f + ", saveTime=" + this.f139501g + ")";
    }

    public /* synthetic */ f() {
        this("", null, "", "", "", 0, 0);
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f139495a;
        int i6 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = i2 * 31;
        List<AVTextExtraStruct> list = this.f139496b;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str2 = this.f139497c;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str3 = this.f139498d;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        String str4 = this.f139499e;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        long j2 = this.f139500f;
        long j3 = this.f139501g;
        return ((((i10 + i6) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public f(String str, List<AVTextExtraStruct> list, String str2, String str3, String str4, long j2, long j3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.f139495a = str;
        this.f139496b = list;
        this.f139497c = str2;
        this.f139498d = str3;
        this.f139499e = str4;
        this.f139500f = j2;
        this.f139501g = j3;
    }
}
