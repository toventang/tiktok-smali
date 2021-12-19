package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public class NoMoreSpaceTextView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    private int f15812a;

    /* renamed from: b  reason: collision with root package name */
    private int f15813b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15814c;

    static {
        Covode.recordClassIndex(8723);
    }

    public void scrollBy(int i2, int i3) {
    }

    public void scrollTo(int i2, int i3) {
    }

    private int getSpaceExtra() {
        if (getLineCount() == this.f15813b) {
            return this.f15812a;
        }
        int lineCount = getLineCount();
        this.f15813b = lineCount;
        this.f15812a = 0;
        int i2 = lineCount - 1;
        Layout layout = getLayout();
        if (i2 >= 0 && getMeasuredHeight() == layout.getHeight()) {
            Paint.FontMetricsInt fontMetricsInt = layout.getPaint().getFontMetricsInt();
            Rect rect = new Rect();
            this.f15812a = (rect.bottom - (fontMetricsInt.ascent - layout.getLineAscent(i2))) - (getLineBounds(i2, rect) + fontMetricsInt.bottom);
        }
        return this.f15812a;
    }

    public void setAlpha(float f2) {
        super.setAlpha(f2);
    }

    public void setAlwaysInvalidate(boolean z) {
        this.f15814c = z;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (this.f15814c) {
            invalidate();
        }
    }

    public NoMoreSpaceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() - getSpaceExtra());
    }

    private NoMoreSpaceTextView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
    }
}
