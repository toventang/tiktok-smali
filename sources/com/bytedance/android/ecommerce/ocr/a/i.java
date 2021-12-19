package com.bytedance.android.ecommerce.ocr.a;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

public class i extends l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7224a = i.class.getSimpleName();

    static {
        Covode.recordClassIndex(3468);
    }

    @Override // com.bytedance.android.ecommerce.ocr.a.l
    public final Rect b(m mVar, m mVar2) {
        m a2 = mVar.a(mVar2);
        int i2 = (a2.f7229a - mVar2.f7229a) / 2;
        int i3 = (a2.f7230b - mVar2.f7230b) / 2;
        return new Rect(-i2, -i3, a2.f7229a - i2, a2.f7230b - i3);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.ecommerce.ocr.a.l
    public final float a(m mVar, m mVar2) {
        if (mVar.f7229a <= 0 || mVar.f7230b <= 0) {
            return 0.0f;
        }
        m a2 = mVar.a(mVar2);
        float f2 = (((float) a2.f7229a) * 1.0f) / ((float) mVar.f7229a);
        if (f2 > 1.0f) {
            f2 = (float) Math.pow((double) (1.0f / f2), 1.1d);
        }
        float f3 = ((((float) mVar2.f7229a) * 1.0f) / ((float) a2.f7229a)) * ((((float) mVar2.f7230b) * 1.0f) / ((float) a2.f7230b));
        return f2 * (((1.0f / f3) / f3) / f3);
    }
}
