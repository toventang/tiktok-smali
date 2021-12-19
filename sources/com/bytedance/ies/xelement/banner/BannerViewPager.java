package com.bytedance.ies.xelement.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public class BannerViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    private boolean f36707a = true;

    static {
        Covode.recordClassIndex(22043);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Runnable() {
            /* class com.bytedance.ies.xelement.banner.BannerViewPager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22044);
            }

            public final void run() {
                if (BannerViewPager.this.getAdapter() != null) {
                    BannerViewPager.this.getAdapter().notifyDataSetChanged();
                }
            }
        });
    }

    public void setScrollable(boolean z) {
        this.f36707a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f36707a) {
            return false;
        }
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36707a) {
            if (getCurrentItem() == 0 && getChildCount() == 0) {
                return false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(2, null);
    }
}
