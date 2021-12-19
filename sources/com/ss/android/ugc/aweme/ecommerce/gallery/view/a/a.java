package com.ss.android.ugc.aweme.ecommerce.gallery.view.a;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    RectF f86048a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    RectF f86049b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    RectF f86050c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    RectF f86051d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    PointF f86052e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    float f86053f;

    /* renamed from: g  reason: collision with root package name */
    float f86054g;

    /* renamed from: h  reason: collision with root package name */
    ImageView.ScaleType f86055h;

    static {
        Covode.recordClassIndex(53856);
    }

    public a(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, PointF pointF, float f2, float f3, ImageView.ScaleType scaleType) {
        this.f86048a.set(rectF);
        this.f86049b.set(rectF2);
        this.f86050c.set(rectF3);
        this.f86053f = f2;
        this.f86055h = scaleType;
        this.f86054g = f3;
        this.f86051d.set(rectF4);
        this.f86052e.set(pointF);
    }
}
