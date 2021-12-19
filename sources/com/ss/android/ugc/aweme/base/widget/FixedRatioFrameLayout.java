package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class FixedRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    int f68472a;

    /* renamed from: b  reason: collision with root package name */
    float f68473b;

    static {
        Covode.recordClassIndex(42159);
    }

    public int getMode() {
        return this.f68472a;
    }

    public float getWhRatio() {
        return this.f68473b;
    }

    public void setMode(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("mode must be either FIXED_HEIGHT or FIXED_WIDTH");
        } else if (this.f68472a != i2) {
            this.f68472a = i2;
            requestLayout();
        }
    }

    public void setWhRatio(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("whRatio must be positive.");
        } else if (this.f68473b != f2) {
            this.f68473b = f2;
            requestLayout();
        }
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(4863);
        int size = (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i3) - getPaddingBottom()) - getPaddingTop();
        if (this.f68472a == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) ((((float) size2) * this.f68473b) + 0.5f), 1073741824);
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec((int) ((((float) size) / this.f68473b) + 0.5f), 1073741824);
        }
        super.onMeasure(i2, i3);
        MethodCollector.o(4863);
    }

    private FixedRatioFrameLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(4820);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.uy, R.attr.atg}, 0, 0);
        this.f68472a = obtainStyledAttributes.getInteger(0, 1);
        this.f68473b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        MethodCollector.o(4820);
    }
}
