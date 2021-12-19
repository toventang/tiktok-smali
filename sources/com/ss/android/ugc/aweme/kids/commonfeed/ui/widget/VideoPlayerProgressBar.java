package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class VideoPlayerProgressBar extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    private Paint f106367a;

    /* renamed from: b  reason: collision with root package name */
    private float f106368b;

    /* renamed from: c  reason: collision with root package name */
    private int f106369c;

    /* renamed from: d  reason: collision with root package name */
    private int f106370d;

    static {
        Covode.recordClassIndex(67977);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f).setDuration(0L);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 1.0f).setDuration(150L);
    }

    public void setReachedBarColor(int i2) {
        this.f106370d = i2;
    }

    public void setReachedProgressBarHeight(float f2) {
        this.f106368b = f2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f106369c) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f106367a.setColor(this.f106370d);
            this.f106367a.setStrokeWidth(this.f106368b);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f106367a);
        }
        canvas.restore();
    }

    public VideoPlayerProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f106368b, Math.abs(this.f106367a.descent() - this.f106367a.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.f106369c = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    private VideoPlayerProgressBar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(6163);
        this.f106367a = new Paint();
        this.f106368b = (float) ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a9j, R.attr.a9k});
        this.f106370d = obtainStyledAttributes.getColor(0, -261935);
        this.f106368b = obtainStyledAttributes.getDimension(1, this.f106368b);
        obtainStyledAttributes.recycle();
        MethodCollector.o(6163);
    }
}
