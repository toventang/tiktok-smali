package com.bytedance.android.livesdk.c;

import com.bytedance.covode.number.Covode;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected float[] f14863a;

    /* renamed from: b  reason: collision with root package name */
    private c f14864b;

    static {
        Covode.recordClassIndex(8234);
    }

    protected static float a(float f2, float f3, float f4, float f5, float f6) {
        return f4 + (((f2 - f3) / (f5 - f3)) * (f6 - f4));
    }

    /* access modifiers changed from: protected */
    public abstract float a(float f2);

    /* access modifiers changed from: protected */
    public abstract float[] b(c cVar);

    public final void a(c cVar) {
        this.f14864b = cVar;
        this.f14863a = b(cVar);
    }

    protected static float a(float[] fArr, float f2) {
        int length = fArr.length - 1;
        float f3 = (float) length;
        float f4 = 1.0f / f3;
        int i2 = (int) (f3 * f2);
        int min = Math.min(i2 + 1, length);
        if (i2 == min) {
            return fArr[length];
        }
        float f5 = ((float) i2) * f4;
        return a(f2, f5, fArr[i2], f4 + f5, fArr[min]);
    }
}
