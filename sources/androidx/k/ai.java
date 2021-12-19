package androidx.k;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public class ai {
    static {
        Covode.recordClassIndex(1177);
    }

    ai() {
    }

    public void c(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(R.id.ds6, null);
        }
    }

    public float a(View view) {
        Float f2 = (Float) view.getTag(R.id.ds6);
        if (f2 != null) {
            return view.getAlpha() / f2.floatValue();
        }
        return view.getAlpha();
    }

    public void b(View view) {
        if (view.getTag(R.id.ds6) == null) {
            view.setTag(R.id.ds6, Float.valueOf(view.getAlpha()));
        }
    }

    public void a(View view, float f2) {
        Float f3 = (Float) view.getTag(R.id.ds6);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    public void b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public void a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5) {
        view.setLeft(i2);
        view.setTop(i3);
        view.setRight(i4);
        view.setBottom(i5);
    }
}
