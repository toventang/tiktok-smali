package com.ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f144772a;

    /* renamed from: b  reason: collision with root package name */
    public final int f144773b;

    /* renamed from: c  reason: collision with root package name */
    public final int f144774c;

    /* renamed from: d  reason: collision with root package name */
    public final String f144775d;

    /* renamed from: e  reason: collision with root package name */
    public final int f144776e;

    /* renamed from: f  reason: collision with root package name */
    public final int f144777f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f144778g;

    static {
        Covode.recordClassIndex(94683);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f144772a == bVar.f144772a && this.f144773b == bVar.f144773b && this.f144774c == bVar.f144774c && l.a(this.f144775d, bVar.f144775d) && this.f144776e == bVar.f144776e && this.f144777f == bVar.f144777f && this.f144778g == bVar.f144778g;
    }

    public final int hashCode() {
        int i2 = ((((this.f144772a * 31) + this.f144773b) * 31) + this.f144774c) * 31;
        String str = this.f144775d;
        int hashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f144776e) * 31) + this.f144777f) * 31;
        boolean z = this.f144778g;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return hashCode + i3;
    }

    public final String toString() {
        return "CommentWatermarkParam(inputMediaDuration=" + this.f144772a + ", inputMediaWidth=" + this.f144773b + ", inputMediaHeight=" + this.f144774c + ", commentWaterMarkPath=" + this.f144775d + ", commentWaterMarkHeight=" + this.f144776e + ", commentWaterMarkWidth=" + this.f144777f + ", is1To1=" + this.f144778g + ")";
    }

    public b(int i2, int i3, int i4, String str, int i5, int i6, boolean z) {
        l.d(str, "");
        this.f144772a = i2;
        this.f144773b = i3;
        this.f144774c = i4;
        this.f144775d = str;
        this.f144776e = i5;
        this.f144777f = i6;
        this.f144778g = z;
    }
}
