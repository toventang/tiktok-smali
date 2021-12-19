package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h implements TypeEvaluator<Rect> {

    /* renamed from: a  reason: collision with root package name */
    private Rect f129293a;

    static {
        Covode.recordClassIndex(84868);
    }

    public h(Rect rect) {
        this.f129293a = rect;
    }

    /* renamed from: a */
    public final Rect evaluate(float f2, Rect rect, Rect rect2) {
        if (rect == null) {
            l.b();
        }
        int i2 = rect.left;
        if (rect2 == null) {
            l.b();
        }
        int i3 = i2 + ((int) (((float) (rect2.left - rect.left)) * f2));
        int i4 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f2));
        int i5 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f2));
        int i6 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f2));
        Rect rect3 = this.f129293a;
        if (rect3 == null) {
            return new Rect(i3, i4, i5, i6);
        }
        rect3.set(i3, i4, i5, i6);
        return this.f129293a;
    }
}
