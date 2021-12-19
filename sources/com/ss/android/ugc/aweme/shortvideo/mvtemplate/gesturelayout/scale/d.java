package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f129340a;

    /* renamed from: b  reason: collision with root package name */
    public float f129341b;

    /* renamed from: c  reason: collision with root package name */
    public float f129342c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f129343d = new Matrix();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f129344e;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f129345f;

    /* renamed from: g  reason: collision with root package name */
    private final b<Matrix, z> f129346g;

    static {
        Covode.recordClassIndex(84902);
    }

    public final void a() {
        Matrix matrix = this.f129343d;
        matrix.setValues(this.f129340a);
        matrix.mapRect(this.f129345f, this.f129344e);
        matrix.postTranslate(this.f129341b - this.f129345f.centerX(), this.f129342c - this.f129345f.centerY());
        this.f129346g.invoke(matrix);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super android.graphics.Matrix, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Rect rect, float[] fArr, b<? super Matrix, z> bVar) {
        l.d(fArr, "");
        l.d(bVar, "");
        this.f129346g = bVar;
        this.f129344e = new RectF(rect);
        this.f129345f = new RectF();
        this.f129340a = (float[]) fArr.clone();
        a();
    }
}
