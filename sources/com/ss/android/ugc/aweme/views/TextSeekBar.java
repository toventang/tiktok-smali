package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TextSeekBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f144579a;

    /* renamed from: b  reason: collision with root package name */
    private SeekBar f144580b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f144581c = true;

    static {
        Covode.recordClassIndex(94610);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f144579a = (TextView) getChildAt(0);
        this.f144580b = (SeekBar) getChildAt(1);
    }

    private void a() {
        int paddingLeft = this.f144580b.getPaddingLeft();
        int measuredWidth = (this.f144580b.getMeasuredWidth() - paddingLeft) - this.f144580b.getPaddingRight();
        int progress = this.f144580b.getProgress();
        this.f144579a.setText(String.valueOf(progress));
        double d2 = (double) progress;
        Double.isNaN(d2);
        int measuredWidth2 = this.f144579a.getMeasuredWidth();
        double d3 = (double) paddingLeft;
        double d4 = (double) measuredWidth;
        Double.isNaN(d4);
        Double.isNaN(d3);
        double d5 = (double) measuredWidth2;
        Double.isNaN(d5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f144579a.getLayoutParams());
        layoutParams.leftMargin = (int) ((d3 + ((d2 / 100.0d) * d4)) - (d5 / 2.0d));
        this.f144579a.setLayoutParams(layoutParams);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (dispatchTouchEvent) {
            a();
        }
        return dispatchTouchEvent;
    }

    public TextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3451);
        MethodCollector.o(3451);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(3453);
        super.onMeasure(i2, i3);
        if (this.f144580b.getMeasuredWidth() != 0 && this.f144581c) {
            a();
            this.f144581c = false;
        }
        MethodCollector.o(3453);
    }
}
