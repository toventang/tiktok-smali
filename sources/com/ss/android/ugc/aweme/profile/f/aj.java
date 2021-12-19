package com.ss.android.ugc.aweme.profile.f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

public final class aj extends ImageSpan {

    /* renamed from: a  reason: collision with root package name */
    public int f116403a;

    static {
        Covode.recordClassIndex(75150);
    }

    public aj(Context context, int i2) {
        super(context, i2, 1);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f2 + ((float) this.f116403a), (float) ((i6 - drawable.getBounds().bottom) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }
}
