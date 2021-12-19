package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.TypeEvaluator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d implements TypeEvaluator<float[]> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f129292a;

    static {
        Covode.recordClassIndex(84864);
    }

    public d(float[] fArr) {
        l.d(fArr, "");
        this.f129292a = fArr;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ float[] evaluate(float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        l.d(fArr3, "");
        l.d(fArr4, "");
        float[] fArr5 = this.f129292a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        int length = fArr5.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = fArr3[i2];
            fArr5[i2] = f3 + ((fArr4[i2] - f3) * f2);
        }
        return fArr5;
    }
}
