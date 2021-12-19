package com.ss.android.ugc.aweme.story.edit.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f137585a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f137586b;

    /* renamed from: c  reason: collision with root package name */
    public final float[] f137587c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f137588d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f137589e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f137590f;

    static {
        Covode.recordClassIndex(90022);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f137585a, bVar.f137585a) && l.a(this.f137586b, bVar.f137586b) && l.a(this.f137587c, bVar.f137587c) && l.a(this.f137588d, bVar.f137588d) && l.a(this.f137589e, bVar.f137589e) && l.a(this.f137590f, bVar.f137590f);
    }

    public final int hashCode() {
        String[] strArr = this.f137585a;
        int i2 = 0;
        int hashCode = (strArr != null ? Arrays.hashCode(strArr) : 0) * 31;
        String[] strArr2 = this.f137586b;
        int hashCode2 = (hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31;
        float[] fArr = this.f137587c;
        int hashCode3 = (hashCode2 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31;
        int[] iArr = this.f137588d;
        int hashCode4 = (hashCode3 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        int[] iArr2 = this.f137589e;
        int hashCode5 = (hashCode4 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0)) * 31;
        int[] iArr3 = this.f137590f;
        if (iArr3 != null) {
            i2 = Arrays.hashCode(iArr3);
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "MediaPreviewArray(videoArray=" + Arrays.toString(this.f137585a) + ", audioArray=" + Arrays.toString(this.f137586b) + ", speedArray=" + Arrays.toString(this.f137587c) + ", rotationArray=" + Arrays.toString(this.f137588d) + ", vTrimInArray=" + Arrays.toString(this.f137589e) + ", vTrimOutArray=" + Arrays.toString(this.f137590f) + ")";
    }

    public b(String[] strArr, String[] strArr2, float[] fArr, int[] iArr, int[] iArr2, int[] iArr3) {
        l.d(strArr, "");
        l.d(fArr, "");
        l.d(iArr, "");
        l.d(iArr2, "");
        l.d(iArr3, "");
        this.f137585a = strArr;
        this.f137586b = strArr2;
        this.f137587c = fArr;
        this.f137588d = iArr;
        this.f137589e = iArr2;
        this.f137590f = iArr3;
    }
}
