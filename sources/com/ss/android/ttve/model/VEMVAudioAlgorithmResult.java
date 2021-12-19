package com.ss.android.ttve.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;

public class VEMVAudioAlgorithmResult {
    public float[] bitsTime;
    public int[] bitsValue;
    public int size;

    static {
        Covode.recordClassIndex(37658);
    }

    public int resizeBeatTrackingNum(int i2, int i3) {
        if (i2 >= i3) {
            return 0;
        }
        an.a("VEMVAudioAlgorithmResult", "need to transForm beat num... musicTime = " + i2 + ", mvTime = " + i3);
        int i4 = i3 / i2;
        float f2 = (float) i2;
        int i5 = this.size;
        int i6 = ((int) ((((float) (i3 - (i2 * i4))) / f2) * ((float) i5))) + 1;
        int i7 = (i5 * i4) + i6;
        int[] iArr = new int[i7];
        float[] fArr = new float[i7];
        float[] fArr2 = new float[this.bitsTime.length];
        for (int i8 = 0; i8 < i4; i8++) {
            int[] iArr2 = this.bitsValue;
            int i9 = this.size;
            System.arraycopy(iArr2, 0, iArr, i9 * i8, i9);
            int i10 = 0;
            while (true) {
                float[] fArr3 = this.bitsTime;
                if (i10 >= fArr3.length) {
                    break;
                }
                fArr2[i10] = fArr3[i10] + ((f2 / 1000.0f) * ((float) i8));
                i10++;
            }
            int i11 = this.size;
            System.arraycopy(fArr2, 0, fArr, i11 * i8, i11);
        }
        int i12 = 0;
        while (true) {
            float[] fArr4 = this.bitsTime;
            if (i12 < fArr4.length) {
                fArr2[i12] = fArr4[i12] + ((f2 / 1000.0f) * ((float) i4));
                i12++;
            } else {
                System.arraycopy(this.bitsValue, 0, iArr, this.size * i4, i6);
                System.arraycopy(fArr2, 0, fArr, this.size * i4, i6);
                this.bitsValue = iArr;
                this.bitsTime = fArr;
                this.size = i7;
                return 0;
            }
        }
    }
}
