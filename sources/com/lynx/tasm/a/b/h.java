package com.lynx.tasm.a.b;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.bytedance.covode.number.Covode;

final class h extends Animation {

    /* renamed from: a  reason: collision with root package name */
    private final View f55663a;

    /* renamed from: b  reason: collision with root package name */
    private final float f55664b;

    /* renamed from: c  reason: collision with root package name */
    private final float f55665c;

    static {
        Covode.recordClassIndex(34833);
    }

    public final boolean willChangeBounds() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f2, Transformation transformation) {
        this.f55663a.setAlpha(this.f55664b + (this.f55665c * f2));
    }

    protected h(View view, float f2, float f3) {
        this.f55663a = view;
        this.f55664b = f2;
        this.f55665c = f3 - f2;
    }
}
