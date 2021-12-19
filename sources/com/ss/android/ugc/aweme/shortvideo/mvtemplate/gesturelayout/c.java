package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c implements g {
    static {
        Covode.recordClassIndex(84863);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.g
    public final Matrix a(RectF rectF, Rect rect) {
        l.d(rectF, "");
        l.d(rect, "");
        Matrix matrix = new Matrix();
        float min = 1.0f / Math.min(rectF.width() / ((float) rect.width()), rectF.height() / ((float) rect.height()));
        matrix.setScale(min, min, rectF.centerX(), rectF.centerY());
        matrix.postTranslate(((float) rect.centerX()) - rectF.centerX(), ((float) rect.centerY()) - rectF.centerY());
        return matrix;
    }
}
