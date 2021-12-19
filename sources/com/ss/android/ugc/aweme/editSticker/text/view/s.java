package com.ss.android.ugc.aweme.editSticker.text.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.i;
import h.f.b.l;

public final class s extends i {

    /* renamed from: a  reason: collision with root package name */
    public final float f88714a;

    static {
        Covode.recordClassIndex(55809);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Drawable drawable, float f2) {
        super(drawable);
        l.d(drawable, "");
        this.f88714a = f2;
    }

    @Override // com.ss.android.ugc.tools.view.widget.i
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        l.d(paint, "");
        return (int) (((float) super.getSize(paint, charSequence, i2, i3, fontMetricsInt)) + this.f88714a);
    }
}
