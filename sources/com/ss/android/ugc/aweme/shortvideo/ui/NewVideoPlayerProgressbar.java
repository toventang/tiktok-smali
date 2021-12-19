package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class NewVideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a  reason: collision with root package name */
    private Paint f131107a;

    /* renamed from: b  reason: collision with root package name */
    private float f131108b;

    /* renamed from: c  reason: collision with root package name */
    private int f131109c;

    /* renamed from: d  reason: collision with root package name */
    private int f131110d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f131111e;

    static {
        Covode.recordClassIndex(85916);
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
        this.f131110d = i2;
    }

    public void setReachedProgressBarHeight(float f2) {
        this.f131108b = f2;
    }

    public NewVideoPlayerProgressbar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f131109c) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f131107a.setColor(this.f131110d);
            this.f131107a.setStrokeWidth(this.f131108b);
            float height = ((float) getHeight()) / 2.0f;
            if (this.f131111e) {
                int i2 = this.f131109c;
                canvas.drawLine((float) i2, height, ((float) i2) - progress, height, this.f131107a);
            } else {
                canvas.drawLine(0.0f, height, progress, height, this.f131107a);
            }
        }
        canvas.restore();
    }

    public NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f131108b, Math.abs(this.f131107a.descent() - this.f131107a.ascent())));
            if (mode == Integer.MIN_VALUE) {
                size2 = Math.min(paddingTop, size2);
            } else {
                size2 = paddingTop;
            }
        }
        setMeasuredDimension(size, size2);
        this.f131109c = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
        boolean z = true;
        if (v.e(this) != 1) {
            z = false;
        }
        this.f131111e = z;
    }

    private NewVideoPlayerProgressbar(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9264);
        this.f131107a = new Paint();
        this.f131108b = (float) ((int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a9j, R.attr.a9k});
        this.f131110d = obtainStyledAttributes.getColor(0, -261935);
        this.f131108b = obtainStyledAttributes.getDimension(1, this.f131108b);
        obtainStyledAttributes.recycle();
        MethodCollector.o(9264);
    }
}
