package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdkapi.view.f;
import com.bytedance.covode.number.Covode;

public class c extends RtlViewPager {

    /* renamed from: a  reason: collision with root package name */
    MotionEvent f17319a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17320b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f17321c;

    static {
        Covode.recordClassIndex(9599);
    }

    private f getParentViewPager() {
        ViewParent viewParent = this;
        while (viewParent != null && !(viewParent instanceof f)) {
            viewParent = viewParent.getParent();
        }
        return (f) viewParent;
    }

    private void c() {
        if (getChildCount() > 1 && this.f17320b) {
            a.a(3, "BannerViewPager", "disableParent");
            this.f17320b = false;
            f parentViewPager = getParentViewPager();
            if (parentViewPager != null && this.f17321c == null) {
                this.f17321c = Boolean.valueOf(parentViewPager.a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Boolean bool;
        if (!this.f17320b) {
            a.a(3, "BannerViewPager", "enableParent");
            this.f17320b = true;
            if (getParentViewPager() != null && (bool = this.f17321c) != null) {
                bool.booleanValue();
                this.f17321c = null;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, com.bytedance.android.live.uikit.rtl.RtlViewPager
    public void setOnPageChangeListener(ViewPager.e eVar) {
        super.setOnPageChangeListener(eVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            c();
        } else if (motionEvent.getAction() != 2) {
            b();
        } else if (onInterceptTouchEvent) {
            c();
        }
        this.f17319a = motionEvent;
        return onInterceptTouchEvent;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
