package com.ss.android.ugc.aweme.utils;

import android.animation.TypeEvaluator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;

public final class af implements TypeEvaluator<PointF> {

    /* renamed from: a  reason: collision with root package name */
    PointF f142622a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    private float f142623b;

    /* renamed from: c  reason: collision with root package name */
    private float f142624c;

    /* renamed from: d  reason: collision with root package name */
    private float f142625d;

    /* renamed from: e  reason: collision with root package name */
    private float f142626e;

    /* renamed from: f  reason: collision with root package name */
    private float f142627f;

    /* renamed from: g  reason: collision with root package name */
    private float f142628g;

    static {
        Covode.recordClassIndex(93300);
    }

    public af(PointF pointF, PointF pointF2) {
        float f2 = pointF.x * 3.0f;
        float f3 = pointF2.x * 3.0f;
        this.f142623b = f2 - f3;
        this.f142624c = f3 - (f2 * 2.0f);
        this.f142625d = f2;
        float f4 = pointF.y * 3.0f;
        float f5 = pointF2.y * 3.0f;
        this.f142626e = f4 - f5;
        this.f142627f = f5 - (2.0f * f4);
        this.f142628g = f4;
    }

    /* renamed from: a */
    public final PointF evaluate(float f2, PointF pointF, PointF pointF2) {
        float f3 = pointF.x * 3.0f;
        float f4 = pointF.y * 3.0f;
        this.f142622a.x = (((((((((pointF2.x - pointF.x) + this.f142623b) * f2) + f3) + this.f142624c) * f2) - f3) + this.f142625d) * f2) + pointF.x;
        this.f142622a.y = (f2 * ((((((((pointF2.y - pointF.y) + this.f142626e) * f2) + f4) + this.f142627f) * f2) - f4) + this.f142628g)) + pointF.y;
        return this.f142622a;
    }
}
