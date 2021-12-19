package com.ss.android.ugc.aweme.newfollow.c;

import android.graphics.Matrix;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;

public final class g {
    static {
        Covode.recordClassIndex(72356);
    }

    public static void a(int i2, int i3, TextureView textureView, float f2) {
        float f3;
        if (i3 > 0 && i2 > 0 && f2 > 0.0f) {
            float f4 = ((float) i3) / ((float) i2);
            float f5 = 1.0f;
            if (f4 > f2) {
                f5 = f4 / f2;
                f3 = 1.0f;
            } else {
                f3 = f2 / f4;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f5, f3, (float) (i2 / 2), (float) (i3 / 2));
            textureView.setTransform(matrix);
        }
    }
}
