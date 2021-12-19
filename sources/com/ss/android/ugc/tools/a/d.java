package com.ss.android.ugc.tools.a;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal<Matrix> f149085a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final ThreadLocal<RectF> f149086b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final d f149087c = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(98202);
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            a(viewParent, view2, matrix);
            matrix.preTranslate(-((float) view2.getScrollX()), -((float) view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        l.b(matrix2, "");
        if (!matrix2.isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
