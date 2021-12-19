package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.g;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.i;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.d;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a {
    static {
        Covode.recordClassIndex(84848);
    }

    public static final Matrix a(Rect rect, int i2, int i3, Rect rect2, g gVar) {
        int i4;
        float f2;
        float f3;
        l.d(rect, "");
        l.d(gVar, "");
        int i5 = 0;
        if (rect2 != null) {
            i4 = rect2.width();
            i5 = rect2.height();
        } else {
            i4 = 0;
        }
        if (i.a(i2, i3, i4, i5)) {
            f2 = (float) i3;
            f3 = (float) i5;
        } else {
            f2 = (float) i2;
            f3 = (float) i4;
        }
        float f4 = f2 / f3;
        RectF rectF = new RectF(0.0f, 0.0f, (float) i4, (float) i5);
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f4, (float) (i4 / 2), (float) (i5 / 2));
        matrix.postTranslate((float) ((i2 - i4) / 2), (float) ((i3 - i5) / 2));
        matrix.mapRect(rectF, rectF);
        return gVar.a(rectF, rect);
    }

    public static final AnimatorSet a(Matrix matrix, Matrix matrix2, Rect rect, com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a aVar, b<? super Matrix, z> bVar) {
        RectF rectF;
        l.d(matrix, "");
        l.d(matrix2, "");
        l.d(aVar, "");
        l.d(bVar, "");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        d dVar = new d(rect, fArr, bVar);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dVar, PropertyValuesHolder.ofObject(c.f129275a, new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.d(new float[9]), fArr, fArr2));
        ofPropertyValuesHolder.setDuration(aVar.f129252g);
        ofPropertyValuesHolder.setInterpolator(aVar.f129247b);
        l.b(ofPropertyValuesHolder, "");
        g gVar = aVar.f129256k;
        if (rect != null) {
            rectF = new RectF(rect);
        } else {
            rectF = null;
        }
        RectF rectF2 = new RectF(rectF);
        RectF rectF3 = new RectF();
        RectF rectF4 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        matrix2.mapRect(rectF4, rectF2);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(dVar, i.a(c.f129276b, gVar.a(rectF3.centerX(), rectF3.centerY(), rectF4.centerX(), rectF4.centerY())));
        ofPropertyValuesHolder2.setDuration(aVar.f129251f);
        ofPropertyValuesHolder2.setInterpolator(aVar.f129246a);
        l.b(ofPropertyValuesHolder2, "");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2);
        return animatorSet;
    }
}
