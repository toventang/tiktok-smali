package com.bytedance.android.ecommerce.ocr.a;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

public class j extends l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7225a = j.class.getSimpleName();

    private static float a(float f2) {
        return f2 < 1.0f ? 1.0f / f2 : f2;
    }

    static {
        Covode.recordClassIndex(3469);
    }

    @Override // com.bytedance.android.ecommerce.ocr.a.l
    public final Rect b(m mVar, m mVar2) {
        return new Rect(0, 0, mVar2.f7229a, mVar2.f7230b);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.ecommerce.ocr.a.l
    public final float a(m mVar, m mVar2) {
        if (mVar.f7229a <= 0 || mVar.f7230b <= 0) {
            return 0.0f;
        }
        float a2 = (1.0f / a((((float) mVar.f7229a) * 1.0f) / ((float) mVar2.f7229a))) / a((((float) mVar.f7230b) * 1.0f) / ((float) mVar2.f7230b));
        float a3 = a(((((float) mVar.f7229a) * 1.0f) / ((float) mVar.f7230b)) / ((((float) mVar2.f7229a) * 1.0f) / ((float) mVar2.f7230b)));
        return a2 * (((1.0f / a3) / a3) / a3);
    }
}
