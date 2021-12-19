package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f129277a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f129278b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f129279c = new Matrix();

    static {
        Covode.recordClassIndex(84853);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
        Matrix matrix3 = matrix;
        Matrix matrix4 = matrix2;
        l.d(matrix3, "");
        l.d(matrix4, "");
        matrix3.getValues(this.f129277a);
        matrix4.getValues(this.f129278b);
        int i2 = 0;
        do {
            float[] fArr = this.f129278b;
            float f3 = fArr[i2];
            float[] fArr2 = this.f129277a;
            fArr[i2] = fArr2[i2] + ((f3 - fArr2[i2]) * f2);
            i2++;
        } while (i2 <= 8);
        this.f129279c.setValues(this.f129278b);
        return this.f129279c;
    }
}
