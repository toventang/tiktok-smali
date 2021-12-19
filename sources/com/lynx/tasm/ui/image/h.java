package com.lynx.tasm.ui.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;

public final class h implements q.b {
    static {
        Covode.recordClassIndex(35446);
    }

    @Override // com.facebook.drawee.e.q.b
    public final Matrix a(Matrix matrix, Rect rect, int i2, int i3, float f2, float f3) {
        float width = ((float) rect.width()) / ((float) i2);
        float height = ((float) rect.height()) / ((float) i3);
        float max = Math.max(width, height);
        float f4 = (float) rect.left;
        float f5 = (float) rect.top;
        if (width > height) {
            matrix.postTranslate(f4, 0.0f);
        } else {
            matrix.postTranslate(0.0f, f5);
        }
        matrix.setScale(max, max);
        return matrix;
    }
}
