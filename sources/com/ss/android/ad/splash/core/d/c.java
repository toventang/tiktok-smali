package com.ss.android.ad.splash.core.d;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public final class c extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    private boolean f58431a = true;

    /* renamed from: b  reason: collision with root package name */
    private GestureDetector f58432b;

    static {
        Covode.recordClassIndex(36278);
    }

    public final void setEnableScroll(boolean z) {
        this.f58431a = z;
    }

    public final void setGestureDetector(GestureDetector gestureDetector) {
        this.f58432b = gestureDetector;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public c(Context context) {
        super(context);
        setPageTransformer(true, new a());
        setOverScrollMode(2);
    }

    private MotionEvent a(MotionEvent motionEvent) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
        return motionEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f58431a) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(a(motionEvent));
        a(motionEvent);
        return onInterceptTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f58431a) {
            return false;
        }
        this.f58432b.onTouchEvent(motionEvent);
        return super.onTouchEvent(a(motionEvent));
    }

    public static class a implements ViewPager.f {
        static {
            Covode.recordClassIndex(36279);
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public final void a(View view, float f2) {
            if (f2 < -1.0f || f2 > 1.0f) {
                view.setAlpha(0.0f);
                return;
            }
            view.setAlpha(1.0f);
            view.setTranslationX(((float) view.getWidth()) * (-f2));
            view.setTranslationY(f2 * ((float) view.getHeight()));
        }
    }
}
