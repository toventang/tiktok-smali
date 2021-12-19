package com.ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import java.lang.reflect.Field;

public class NonSwipeableViewPager extends RtlViewPager {

    /* renamed from: f  reason: collision with root package name */
    private boolean f63222f;

    static {
        Covode.recordClassIndex(38966);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setShouldLimitHeight(boolean z) {
        this.f63222f = z;
    }

    public class a extends Scroller {
        static {
            Covode.recordClassIndex(38967);
        }

        public a(Context context) {
            super(context, new DecelerateInterpolator());
        }

        public final void startScroll(int i2, int i3, int i4, int i5, int i6) {
            super.startScroll(i2, i3, i4, i5, 150);
        }
    }

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new a(getContext()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f63222f) {
            int i4 = 0;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i2));
            View childAt = getChildAt(getCurrentItem());
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, 0);
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > 0) {
                    i4 = measuredHeight;
                }
                double d2 = (double) Resources.getSystem().getDisplayMetrics().heightPixels;
                Double.isNaN(d2);
                int max = Math.max(measuredHeight, (int) (d2 * 0.6d));
                if (i4 != 0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
                }
                super.onMeasure(i2, i3);
            }
        }
    }
}
