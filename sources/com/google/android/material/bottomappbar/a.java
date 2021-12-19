package com.google.android.material.bottomappbar;

import com.bytedance.covode.number.Covode;
import com.google.android.material.i.b;
import com.google.android.material.i.d;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public float f52280a;

    /* renamed from: b  reason: collision with root package name */
    public float f52281b;

    /* renamed from: c  reason: collision with root package name */
    public float f52282c;

    /* renamed from: d  reason: collision with root package name */
    public float f52283d;

    /* renamed from: e  reason: collision with root package name */
    public float f52284e;

    static {
        Covode.recordClassIndex(32460);
    }

    @Override // com.google.android.material.i.b
    public final void a(float f2, float f3, d dVar) {
        float f4 = this.f52282c;
        if (f4 == 0.0f) {
            dVar.a(f2);
            return;
        }
        float f5 = ((this.f52281b * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f52280a;
        float f7 = (f2 / 2.0f) + this.f52284e;
        float f8 = (this.f52283d * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            dVar.a(f2);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        float f14 = f11 - f6;
        dVar.a(f14);
        float f15 = f6 * 2.0f;
        dVar.a(f14, 0.0f, f11 + f6, f15, 270.0f, degrees);
        dVar.a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        dVar.a(f12 - f6, 0.0f, f12 + f6, f15, 270.0f - degrees, degrees);
        dVar.a(f2);
    }
}
