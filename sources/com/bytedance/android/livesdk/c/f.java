package com.bytedance.android.livesdk.c;

import com.bytedance.covode.number.Covode;

public final class f extends e {
    static {
        Covode.recordClassIndex(8235);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.c.e
    public final float a(float f2) {
        if (f2 >= 0.0f && f2 > 1.0f) {
            f2 = 1.0f;
        }
        return a(this.f14863a, f2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.c.e
    public final float[] b(c cVar) {
        float[] fArr = new float[100];
        g[] gVarArr = new g[400];
        int i2 = 0;
        int i3 = 0;
        do {
            g a2 = cVar.a(((float) i3) / 399.0f);
            gVarArr[i3] = new g(a2.f14865a, a2.f14866b);
            i3++;
        } while (i3 < 400);
        int i4 = 0;
        do {
            float f2 = ((float) i2) / 99.0f;
            int i5 = i4;
            int i6 = 399;
            while (i4 <= i6 && gVarArr[i4].f14865a <= f2) {
                i5 = (i4 + i6) >>> 1;
                float f3 = gVarArr[i5].f14865a;
                if (f3 >= f2) {
                    if (f3 <= f2) {
                        break;
                    }
                    i6 = i5 - 1;
                } else {
                    i4 = i5 + 1;
                }
            }
            i4 = i5;
            int min = Math.min(i4 + 1, 399);
            float f4 = gVarArr[i4].f14865a;
            float f5 = gVarArr[min].f14865a;
            float f6 = gVarArr[i4].f14866b;
            float f7 = gVarArr[min].f14866b;
            if (i4 == min || f4 == f5) {
                fArr[i2] = f6;
            } else {
                fArr[i2] = a(f2, f4, f6, f5, f7);
            }
            i2++;
        } while (i2 < 100);
        return fArr;
    }
}
