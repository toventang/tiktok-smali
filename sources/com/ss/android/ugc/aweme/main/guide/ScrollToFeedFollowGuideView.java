package com.ss.android.ugc.aweme.main.guide;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.d.a.c;

public class ScrollToFeedFollowGuideView extends FrameLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, GestureDetector.OnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    GestureDetector f109262a;

    static {
        Covode.recordClassIndex(69972);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        a(0);
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        getChildAt(0).setAlpha(1.0f - valueAnimator.getAnimatedFraction());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a(500);
        return this.f109262a.onTouchEvent(motionEvent);
    }

    public void onAnimationEnd(Animator animator) {
        MethodCollector.i(9050);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        MethodCollector.o(9050);
    }

    private void a(long j2) {
        c.a(new b(false));
        c.f109267a = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j2);
        ofFloat.addUpdateListener(this);
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public ScrollToFeedFollowGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ScrollToFeedFollowGuideView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9046);
        animate().alpha(1.0f).setDuration(1000).start();
        this.f109262a = new GestureDetector(getContext(), this);
        MethodCollector.o(9046);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        a(500);
        return true;
    }
}
