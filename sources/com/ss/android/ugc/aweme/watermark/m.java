package com.ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f144799a;

    /* renamed from: b  reason: collision with root package name */
    public final String f144800b;

    /* renamed from: c  reason: collision with root package name */
    public final int f144801c = 3000;

    /* renamed from: d  reason: collision with root package name */
    public int f144802d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f144803e;

    static {
        Covode.recordClassIndex(94698);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f144799a, mVar.f144799a) && l.a(this.f144800b, mVar.f144800b) && this.f144801c == mVar.f144801c && this.f144802d == mVar.f144802d && l.a(this.f144803e, mVar.f144803e);
    }

    public final int hashCode() {
        String str = this.f144799a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f144800b;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f144801c) * 31) + this.f144802d) * 31;
        String[] strArr = this.f144803e;
        if (strArr != null) {
            i2 = Arrays.hashCode(strArr);
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "VideoEndWatermarkData(endWatermarkFrame=" + this.f144799a + ", endAudioPath=" + this.f144800b + ", watermarkDuration=" + this.f144801c + ", inputMediaDuration=" + this.f144802d + ", transitions=" + Arrays.toString(this.f144803e) + ")";
    }

    public m(String str, String str2, String[] strArr) {
        l.d(str, "");
        l.d(strArr, "");
        this.f144799a = str;
        this.f144800b = str2;
        this.f144803e = strArr;
    }
}
