package com.bytedance.android.live.core.f;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;

public final class z extends q.a {

    /* renamed from: a  reason: collision with root package name */
    public static final z f9122a = new z();

    private z() {
    }

    static {
        Covode.recordClassIndex(4673);
    }

    @Override // com.facebook.drawee.e.q.a
    public final void a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3, float f4, float f5) {
        float f6;
        float height;
        if (rect != null) {
            float f7 = (float) i2;
            float c2 = ((float) y.c()) / f7;
            float f8 = (float) i3;
            float b2 = ((float) y.b()) / f8;
            if (b2 > c2) {
                f6 = ((float) rect.left) + ((((float) rect.width()) - (f7 * b2)) * 0.5f);
                if (f3 == 0.0f || f3 != 1.0f) {
                    height = (float) rect.top;
                } else {
                    height = ((float) rect.top) + (((float) rect.height()) - (f8 * b2));
                }
                c2 = b2;
            } else {
                f6 = (float) rect.left;
                float f9 = f8 * c2;
                float b3 = (((float) y.b()) - f9) * 0.5f;
                if (f3 == 0.0f) {
                    height = ((float) rect.top) + b3;
                } else if (f3 == 1.0f) {
                    height = ((float) rect.top) + ((Math.abs(b3) + ((float) rect.height())) - f9);
                } else {
                    height = ((float) rect.top) + ((((float) rect.height()) - f9) * 0.5f);
                }
            }
            if (matrix != null) {
                matrix.setScale(c2, c2);
                matrix.postTranslate((float) ((int) (f6 + 0.5f)), (float) ((int) (height + 0.5f)));
            }
        }
    }
}
