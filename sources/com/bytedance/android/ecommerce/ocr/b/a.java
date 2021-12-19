package com.bytedance.android.ecommerce.ocr.b;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private float[] f7231a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f7232b;

    static {
        Covode.recordClassIndex(3474);
    }

    public final int a(int i2, int i3) {
        if (i2 < 0 || i2 > 3) {
            return 0;
        }
        int i4 = (int) (this.f7231a[i2] * ((float) i3));
        int i5 = i2 % 2;
        int[] iArr = this.f7232b;
        if (i4 > iArr[i5]) {
            i4 = iArr[i5];
        }
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    public a(float f2, float f3, float f4, float f5, int i2, int i3) {
        float[] fArr = new float[4];
        this.f7231a = fArr;
        int[] iArr = new int[2];
        this.f7232b = iArr;
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        iArr[0] = i2;
        iArr[1] = i3;
    }
}
