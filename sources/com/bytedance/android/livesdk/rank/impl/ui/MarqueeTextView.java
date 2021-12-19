package com.bytedance.android.livesdk.rank.impl.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public class MarqueeTextView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f20949a = true;

    static {
        Covode.recordClassIndex(12392);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public float getLeftFadingEdgeStrength() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public float getRightFadingEdgeStrength() {
        return 0.0f;
    }

    public void onWindowFocusChanged(boolean z) {
    }

    public final void a() {
        this.f20949a = false;
        setSelected(true);
    }

    public final void b() {
        this.f20949a = true;
        setSelected(false);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setSelected(false);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (!this.f20949a && ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight() > 0) {
            setSelected(false);
            setSelected(true);
        }
    }
}
