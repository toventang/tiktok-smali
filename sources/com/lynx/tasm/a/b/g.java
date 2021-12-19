package com.lynx.tasm.a.b;

import android.graphics.Rect;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.ui.LynxUI;

public class g extends a {
    static {
        Covode.recordClassIndex(34832);
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.a.b.a
    public final Animation a(LynxUI lynxUI, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect, float f2) {
        boolean z;
        boolean z2 = false;
        if (lynxUI.getOriginLeft() == i2 && lynxUI.getOriginTop() == i3) {
            z = false;
        } else {
            z = true;
        }
        if (!(lynxUI.getWidth() == i4 && lynxUI.getHeight() == i5)) {
            z2 = true;
        }
        if (!z) {
            if (!z2) {
                return null;
            }
        } else if (!z2) {
            return new TranslateAnimation((float) (lynxUI.getOriginLeft() - i2), 0.0f, (float) (lynxUI.getOriginTop() - i3), 0.0f);
        }
        return new i(lynxUI, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }
}
