package com.ss.android.ugc.aweme.common.h;

import android.animation.TypeEvaluator;
import com.bytedance.covode.number.Covode;
import h.p;

public final class b implements TypeEvaluator<p<? extends Float, ? extends Float>> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f76435a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(47191);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ p<? extends Float, ? extends Float> evaluate(float f2, p<? extends Float, ? extends Float> pVar, p<? extends Float, ? extends Float> pVar2) {
        p<? extends Float, ? extends Float> pVar3 = pVar;
        p<? extends Float, ? extends Float> pVar4 = pVar2;
        if (pVar3 == null || pVar4 == null) {
            return new p(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        return new p(Float.valueOf(((((Number) pVar4.getFirst()).floatValue() - ((Number) pVar3.getFirst()).floatValue()) * f2) + ((Number) pVar3.getFirst()).floatValue()), Float.valueOf(((((Number) pVar4.getSecond()).floatValue() - ((Number) pVar3.getSecond()).floatValue()) * f2) + ((Number) pVar3.getSecond()).floatValue()));
    }
}
