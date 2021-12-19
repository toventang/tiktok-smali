package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.a;
import com.ss.android.ugc.aweme.views.RtlViewPager;

public class LazyRtlViewPager extends RtlViewPager {

    /* renamed from: f  reason: collision with root package name */
    private a f82137f;

    static {
        Covode.recordClassIndex(51117);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter instanceof a) {
            this.f82137f = (a) pagerAdapter;
            super.setAdapter(pagerAdapter);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.ugc.aweme.views.RtlViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (bk.f82459a) {
            return true;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public LazyRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addOnPageChangeListener(new ViewPager.e() {
            /* class com.ss.android.ugc.aweme.discover.ui.LazyRtlViewPager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51118);
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrolled(int i2, float f2, int i3) {
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageScrollStateChanged(int i2) {
                if (i2 == 0) {
                    bk.f82459a = false;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.e
            public final void onPageSelected(int i2) {
                LazyRtlViewPager.this.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.discover.ui.LazyRtlViewPager.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(51119);
                    }

                    public final void run() {
                        LazyRtlViewPager lazyRtlViewPager = LazyRtlViewPager.this;
                        if (!lazyRtlViewPager.isLayoutRequested()) {
                            int childCount = lazyRtlViewPager.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                if (lazyRtlViewPager.getChildAt(i2).isLayoutRequested()) {
                                    lazyRtlViewPager.requestLayout();
                                    return;
                                }
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onPageScrolled(int i2, float f2, int i3) {
        if (getCurrentItem() == i2) {
            int i4 = i2 + 1;
            if (f2 >= 0.1f && this.f82137f.b(i4)) {
                this.f82137f.startUpdate((ViewGroup) this);
                this.f82137f.b(this, i4);
                this.f82137f.finishUpdate((ViewGroup) this);
            }
        } else if (getCurrentItem() > i2 && 1.0f - f2 >= 0.1f && this.f82137f.b(i2)) {
            this.f82137f.startUpdate((ViewGroup) this);
            this.f82137f.b(this, i2);
            this.f82137f.finishUpdate((ViewGroup) this);
        }
        super.onPageScrolled(i2, f2, i3);
    }
}
