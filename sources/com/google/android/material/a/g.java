package com.google.android.material.a;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;

public final class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f52136a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f52137b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f52138c = new Matrix();

    static {
        Covode.recordClassIndex(32416);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f52136a);
        matrix2.getValues(this.f52137b);
        int i2 = 0;
        do {
            float[] fArr = this.f52137b;
            float f3 = fArr[i2];
            float[] fArr2 = this.f52136a;
            fArr[i2] = fArr2[i2] + ((f3 - fArr2[i2]) * f2);
            i2++;
        } while (i2 < 9);
        this.f52138c.setValues(this.f52137b);
        return this.f52138c;
    }
}
