package com.ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.Arrays;

public final class a implements Serializable {
    @c(a = "beat_mv_dst_in")
    private final int dstIn;
    @c(a = "beat_mv_dst_out")
    private final int dstOut;
    @c(a = "beat_mv_music_key")
    private String musicKey;
    @c(a = "beat_mv_music_path")
    private final String musicName;
    @c(a = "beat_mv_bit_time")
    private float[] times;
    @c(a = "beat_mv_trim_in")
    private final int trimIn;
    @c(a = "beat_mv_trim_out")
    private final int trimOut;
    @c(a = "beat_mv_bit_value")
    private int[] values;

    static {
        Covode.recordClassIndex(72096);
    }

    public static /* synthetic */ a copy$default(a aVar, int[] iArr, float[] fArr, int i2, int i3, int i4, int i5, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            iArr = aVar.values;
        }
        if ((i6 & 2) != 0) {
            fArr = aVar.times;
        }
        if ((i6 & 4) != 0) {
            i2 = aVar.trimIn;
        }
        if ((i6 & 8) != 0) {
            i3 = aVar.trimOut;
        }
        if ((i6 & 16) != 0) {
            i4 = aVar.dstIn;
        }
        if ((i6 & 32) != 0) {
            i5 = aVar.dstOut;
        }
        if ((i6 & 64) != 0) {
            str = aVar.musicName;
        }
        if ((i6 & 128) != 0) {
            str2 = aVar.musicKey;
        }
        return aVar.copy(iArr, fArr, i2, i3, i4, i5, str, str2);
    }

    public final int[] component1() {
        return this.values;
    }

    public final float[] component2() {
        return this.times;
    }

    public final int component3() {
        return this.trimIn;
    }

    public final int component4() {
        return this.trimOut;
    }

    public final int component5() {
        return this.dstIn;
    }

    public final int component6() {
        return this.dstOut;
    }

    public final String component7() {
        return this.musicName;
    }

    public final String component8() {
        return this.musicKey;
    }

    public final a copy(int[] iArr, float[] fArr, int i2, int i3, int i4, int i5, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new a(iArr, fArr, i2, i3, i4, i5, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.values, aVar.values) && l.a(this.times, aVar.times) && this.trimIn == aVar.trimIn && this.trimOut == aVar.trimOut && this.dstIn == aVar.dstIn && this.dstOut == aVar.dstOut && l.a(this.musicName, aVar.musicName) && l.a(this.musicKey, aVar.musicKey);
    }

    public final int hashCode() {
        int[] iArr = this.values;
        int i2 = 0;
        int hashCode = (iArr != null ? Arrays.hashCode(iArr) : 0) * 31;
        float[] fArr = this.times;
        int hashCode2 = (((((((((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.trimIn) * 31) + this.trimOut) * 31) + this.dstIn) * 31) + this.dstOut) * 31;
        String str = this.musicName;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.musicKey;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "BeatMvInfo(values=" + Arrays.toString(this.values) + ", times=" + Arrays.toString(this.times) + ", trimIn=" + this.trimIn + ", trimOut=" + this.trimOut + ", dstIn=" + this.dstIn + ", dstOut=" + this.dstOut + ", musicName=" + this.musicName + ", musicKey=" + this.musicKey + ")";
    }

    public final int getDstIn() {
        return this.dstIn;
    }

    public final int getDstOut() {
        return this.dstOut;
    }

    public final String getMusicKey() {
        return this.musicKey;
    }

    public final String getMusicName() {
        return this.musicName;
    }

    public final float[] getTimes() {
        return this.times;
    }

    public final int getTrimIn() {
        return this.trimIn;
    }

    public final int getTrimOut() {
        return this.trimOut;
    }

    public final int[] getValues() {
        return this.values;
    }

    public final void setTimes(float[] fArr) {
        this.times = fArr;
    }

    public final void setValues(int[] iArr) {
        this.values = iArr;
    }

    public final void setMusicKey(String str) {
        l.d(str, "");
        this.musicKey = str;
    }

    public a(int[] iArr, float[] fArr, int i2, int i3, int i4, int i5, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.values = iArr;
        this.times = fArr;
        this.trimIn = i2;
        this.trimOut = i3;
        this.dstIn = i4;
        this.dstOut = i5;
        this.musicName = str;
        this.musicKey = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(int[] r10, float[] r11, int r12, int r13, int r14, int r15, java.lang.String r16, java.lang.String r17, int r18, h.f.b.g r19) {
        /*
            r9 = this;
            r5 = r14
            r6 = r15
            r7 = r16
            r2 = r18
            r1 = r2 & 16
            r0 = 0
            if (r1 == 0) goto L_0x000c
            r5 = 0
        L_0x000c:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x0011
            r6 = 0
        L_0x0011:
            r0 = r2 & 64
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0018
            r7 = r8
        L_0x0018:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0025
        L_0x001c:
            r0 = r9
            r4 = r13
            r3 = r12
            r2 = r11
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            r8 = r17
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mvtheme.a.<init>(int[], float[], int, int, int, int, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
