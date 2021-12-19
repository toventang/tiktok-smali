package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.ROTATE_DEGREE;
import h.f.b.l;
import java.util.Arrays;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f61998a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f61999b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f62000c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f62001d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f62002e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f62003f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f62004g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f62005h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f62006i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f62007j;

    /* renamed from: k  reason: collision with root package name */
    public final ROTATE_DEGREE[] f62008k;

    static {
        Covode.recordClassIndex(38122);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f61998a, cVar.f61998a) && l.a(this.f61999b, cVar.f61999b) && l.a(this.f62000c, cVar.f62000c) && l.a(this.f62001d, cVar.f62001d) && l.a(this.f62002e, cVar.f62002e) && l.a(this.f62003f, cVar.f62003f) && l.a(this.f62004g, cVar.f62004g) && l.a(this.f62005h, cVar.f62005h) && l.a(this.f62006i, cVar.f62006i) && l.a(this.f62007j, cVar.f62007j) && l.a(this.f62008k, cVar.f62008k);
    }

    public final int hashCode() {
        String[] strArr = this.f61998a;
        int i2 = 0;
        int hashCode = (strArr != null ? Arrays.hashCode(strArr) : 0) * 31;
        String[] strArr2 = this.f61999b;
        int hashCode2 = (hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31;
        int[] iArr = this.f62000c;
        int hashCode3 = (hashCode2 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        int[] iArr2 = this.f62001d;
        int hashCode4 = (hashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0)) * 31;
        float[] fArr = this.f62002e;
        int hashCode5 = (hashCode4 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31;
        String[] strArr3 = this.f62003f;
        int hashCode6 = (hashCode5 + (strArr3 != null ? Arrays.hashCode(strArr3) : 0)) * 31;
        String[] strArr4 = this.f62004g;
        int hashCode7 = (hashCode6 + (strArr4 != null ? Arrays.hashCode(strArr4) : 0)) * 31;
        int[] iArr3 = this.f62005h;
        int hashCode8 = (hashCode7 + (iArr3 != null ? Arrays.hashCode(iArr3) : 0)) * 31;
        int[] iArr4 = this.f62006i;
        int hashCode9 = (hashCode8 + (iArr4 != null ? Arrays.hashCode(iArr4) : 0)) * 31;
        float[] fArr2 = this.f62007j;
        int hashCode10 = (hashCode9 + (fArr2 != null ? Arrays.hashCode(fArr2) : 0)) * 31;
        ROTATE_DEGREE[] rotate_degreeArr = this.f62008k;
        if (rotate_degreeArr != null) {
            i2 = Arrays.hashCode(rotate_degreeArr);
        }
        return hashCode10 + i2;
    }

    public final String toString() {
        return "ChangeResParamData(videoFilePaths=" + Arrays.toString(this.f61998a) + ", vFileInfos=" + Arrays.toString(this.f61999b) + ", vTrimIn=" + Arrays.toString(this.f62000c) + ", vTrimOut=" + Arrays.toString(this.f62001d) + ", videoSpeed=" + Arrays.toString(this.f62002e) + ", audioFilePaths=" + Arrays.toString(this.f62003f) + ", aFileInfos=" + Arrays.toString(this.f62004g) + ", aTrimIn=" + Arrays.toString(this.f62005h) + ", aTrimOut=" + Arrays.toString(this.f62006i) + ", audioSpeed=" + Arrays.toString(this.f62007j) + ", rotate=" + Arrays.toString(this.f62008k) + ")";
    }

    public c(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        l.d(strArr, "");
        l.d(iArr, "");
        l.d(iArr2, "");
        this.f61998a = strArr;
        this.f61999b = strArr2;
        this.f62000c = iArr;
        this.f62001d = iArr2;
        this.f62002e = fArr;
        this.f62003f = strArr3;
        this.f62004g = strArr4;
        this.f62005h = iArr3;
        this.f62006i = iArr4;
        this.f62007j = fArr2;
        this.f62008k = rotate_degreeArr;
    }
}
