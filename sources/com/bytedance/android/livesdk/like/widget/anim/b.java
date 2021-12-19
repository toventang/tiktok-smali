package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.TypeEvaluator;
import com.bytedance.covode.number.Covode;

public final class b implements TypeEvaluator<Float> {

    /* renamed from: a  reason: collision with root package name */
    public float f18610a;

    static {
        Covode.recordClassIndex(10433);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Float evaluate(float f2, Float f3, Float f4) {
        float f5 = 1.0f - f2;
        double pow = Math.pow((double) f5, 2.0d);
        double floatValue = (double) f3.floatValue();
        Double.isNaN(floatValue);
        double d2 = pow * floatValue;
        double d3 = (double) (2.0f * f2 * f5 * this.f18610a);
        Double.isNaN(d3);
        double d4 = d2 + d3;
        double floatValue2 = (double) (f2 * f2 * f4.floatValue());
        Double.isNaN(floatValue2);
        return Float.valueOf((float) (d4 + floatValue2));
    }
}
