package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.f.c;
import com.ss.android.ugc.aweme.main.TabChangeManager;

public class FriendTabViewPager extends c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f112599a = true;

    static {
        Covode.recordClassIndex(72363);
    }

    public void setCanScroll(boolean z) {
        this.f112599a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.bytedance.ies.uikit.f.c
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f112599a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, com.bytedance.ies.uikit.f.c
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f112599a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScrollHorizontally(int i2) {
        if (TextUtils.equals(TabChangeManager.a.a((e) getContext()).f109107d, "HOME")) {
            return false;
        }
        return super.canScrollHorizontally(i2);
    }

    public FriendTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getChildDrawingOrder(int i2, int i3) {
        try {
            return super.getChildDrawingOrder(i2, i3);
        } catch (IndexOutOfBoundsException e2) {
            e2.printStackTrace();
            return i3;
        }
    }
}
