package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.q;

public class NoScrollViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    private boolean f88744a = true;

    static {
        Covode.recordClassIndex(55840);
    }

    public void setNoScroll(boolean z) {
        this.f88744a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i2) {
        super.setCurrentItem(i2, false);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f88744a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f88744a || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("cur_item:").append(getCurrentItem());
            if (getAdapter() != null) {
                sb.append(", count:").append(getAdapter().getCount());
            }
            q.b(sb.toString());
            e2.printStackTrace();
            return false;
        }
    }

    public void scrollTo(int i2, int i3) {
        super.scrollTo(i2, i3);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i2, boolean z) {
        super.setCurrentItem(i2, z);
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
