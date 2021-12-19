package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.c;
import h.f.b.l;

public final class DrawableTopLeftTextView extends c {
    static {
        Covode.recordClassIndex(59808);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        l.d(canvas, "");
        if (!TextUtils.isEmpty(getText())) {
            a(getCompoundDrawables());
            int i2 = Build.VERSION.SDK_INT;
            a(getCompoundDrawablesRelative());
        }
        super.onDraw(canvas);
    }

    private final void a(Drawable[] drawableArr) {
        Drawable drawable;
        if (drawableArr != null && (drawable = drawableArr[0]) != null) {
            TextPaint paint = getPaint();
            l.b(paint, "");
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            Rect rect = new Rect();
            getPaint().getTextBounds(getText().toString(), 0, length(), rect);
            int height = (((getHeight() - drawable.getIntrinsicHeight()) / 2) - (rect.top - fontMetricsInt.top)) - (getPaddingTop() / 2);
            drawable.setBounds(0, -height, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() - height);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawableTopLeftTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
    }
}
