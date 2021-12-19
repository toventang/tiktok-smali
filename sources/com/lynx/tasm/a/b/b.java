package com.lynx.tasm.a.b;

import android.graphics.Rect;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxUI;

public abstract class b extends a {
    static {
        Covode.recordClassIndex(34825);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.a.b.a
    public final Animation a(LynxUI lynxUI, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        T t = lynxUI.mView;
        int i18 = this.f55646a.f55636d;
        float f7 = 1.0f;
        float f8 = 0.0f;
        if (i18 == 2) {
            if (b()) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            if (b()) {
                f7 = 0.0f;
            }
            return new ScaleAnimation(f3, f7, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        } else if (i18 == 4) {
            if (b()) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            if (b()) {
                f7 = 0.0f;
            }
            return new ScaleAnimation(1.0f, 1.0f, f4, f7, 1, 0.0f, 1, 0.5f);
        } else if (i18 != 8) {
            if (b()) {
                f6 = f2;
            } else {
                f6 = 0.0f;
            }
            if (!b()) {
                f8 = f2;
            }
            return new h(t, f6, f8);
        } else {
            if (b()) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            if (b()) {
                f7 = 0.0f;
            }
            return new ScaleAnimation(f5, f7, f5, f7, 1, 0.5f, 1, 0.5f);
        }
    }
}
