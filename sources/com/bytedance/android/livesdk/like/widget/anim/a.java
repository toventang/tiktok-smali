package com.bytedance.android.livesdk.like.widget.anim;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

public final class a implements TypeEvaluator<PointF> {

    /* renamed from: a  reason: collision with root package name */
    private PointF f18609a;

    static {
        Covode.recordClassIndex(10432);
    }

    public a(PointF pointF) {
        this.f18609a = pointF;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ PointF evaluate(float f2, PointF pointF, PointF pointF2) {
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        PointF pointF5 = new PointF();
        float f3 = 1.0f - f2;
        double d2 = (double) f3;
        double pow = Math.pow(d2, 2.0d);
        double d3 = (double) pointF3.x;
        Double.isNaN(d3);
        double d4 = pow * d3;
        float f4 = 2.0f * f2 * f3;
        double d5 = (double) (this.f18609a.x * f4);
        Double.isNaN(d5);
        double d6 = d4 + d5;
        float f5 = f2 * f2;
        double d7 = (double) (pointF4.x * f5);
        Double.isNaN(d7);
        pointF5.x = (float) (d6 + d7);
        double pow2 = Math.pow(d2, 2.0d);
        double d8 = (double) pointF3.y;
        Double.isNaN(d8);
        double d9 = pow2 * d8;
        double d10 = (double) (f4 * this.f18609a.y);
        Double.isNaN(d10);
        double d11 = d9 + d10;
        double d12 = (double) (f5 * pointF4.y);
        Double.isNaN(d12);
        pointF5.y = (float) (d11 + d12);
        return pointF5;
    }
}
