package com.bytedance.android.livesdk.rank.impl.ui;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class MarqueeSwitcher extends TextSwitcher {

    /* renamed from: a  reason: collision with root package name */
    private int f20946a;

    /* renamed from: b  reason: collision with root package name */
    private TimeInterpolator f20947b = new LinearInterpolator();

    /* renamed from: c  reason: collision with root package name */
    private boolean f20948c = true;

    static {
        Covode.recordClassIndex(12391);
    }

    public int getDisplayedChild() {
        return this.f20946a;
    }

    public View getCurrentView() {
        return getChildAt(this.f20946a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    public void showNext() {
        setDisplayedChild(this.f20946a + 1);
    }

    public void showPrevious() {
        setDisplayedChild(this.f20946a - 1);
    }

    public View getNextView() {
        return getChildAt(1 - this.f20946a);
    }

    public void reset() {
        this.f20948c = true;
        MarqueeTextView marqueeTextView = (MarqueeTextView) getChildAt(this.f20946a);
        marqueeTextView.b();
        marqueeTextView.animate().cancel();
        marqueeTextView.setAlpha(0.0f);
        MarqueeTextView marqueeTextView2 = (MarqueeTextView) getChildAt(1 - this.f20946a);
        marqueeTextView2.b();
        marqueeTextView2.animate().cancel();
        marqueeTextView2.setAlpha(0.0f);
    }

    public void setDisplayedChild(int i2) {
        MarqueeTextView marqueeTextView = (MarqueeTextView) getChildAt(this.f20946a);
        MarqueeTextView marqueeTextView2 = (MarqueeTextView) getChildAt(1 - this.f20946a);
        if (this.f20948c) {
            marqueeTextView2.setAlpha(1.0f);
            marqueeTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            marqueeTextView2.setMarqueeRepeatLimit(-1);
            marqueeTextView2.a();
            this.f20948c = false;
        } else {
            marqueeTextView.animate().cancel();
            marqueeTextView2.animate().cancel();
            marqueeTextView.animate().alpha(0.0f).setDuration(500).setInterpolator(this.f20947b).start();
            marqueeTextView2.animate().alpha(1.0f).setDuration(500).setInterpolator(this.f20947b).withEndAction(new a(marqueeTextView, marqueeTextView2)).start();
        }
        this.f20946a = i2;
        if (i2 >= getChildCount()) {
            this.f20946a = 0;
        } else if (i2 < 0) {
            this.f20946a = getChildCount() - 1;
        }
    }

    public MarqueeSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1294);
        MethodCollector.o(1294);
    }

    @Override // android.widget.ViewSwitcher, android.widget.ViewAnimator, android.widget.TextSwitcher, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.i(1309);
        super.addView(view, i2, layoutParams);
        view.setVisibility(0);
        view.setAlpha(0.0f);
        MethodCollector.o(1309);
    }
}
