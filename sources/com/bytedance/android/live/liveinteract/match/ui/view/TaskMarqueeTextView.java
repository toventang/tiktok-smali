package com.bytedance.android.live.liveinteract.match.ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.uikit.c.a;
import com.bytedance.covode.number.Covode;

public class TaskMarqueeTextView extends LiveTextView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10972a = true;

    /* renamed from: b  reason: collision with root package name */
    private int f10973b = 1;

    /* renamed from: c  reason: collision with root package name */
    private int f10974c;

    static {
        Covode.recordClassIndex(5870);
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

    public int getLayoutDirection() {
        return this.f10973b;
    }

    public int getTextDirection() {
        return this.f10974c;
    }

    public final void a() {
        this.f10972a = true;
        setSelected(false);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setSelected(false);
    }

    public TaskMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2 = 4;
        this.f10974c = 4;
        this.f10973b = a.a(getContext()) ? 1 : 0;
        this.f10974c = !a.a(getContext()) ? 3 : i2;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (!this.f10972a && ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight() > 0) {
            setSelected(false);
            setSelected(true);
        }
    }
}
