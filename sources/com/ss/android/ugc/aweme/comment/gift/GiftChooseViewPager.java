package com.ss.android.ugc.aweme.comment.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.views.RtlViewPager;

public final class GiftChooseViewPager extends RtlViewPager {

    /* renamed from: f  reason: collision with root package name */
    private boolean f71800f = true;

    static {
        Covode.recordClassIndex(44167);
    }

    public final void setScrollable(boolean z) {
        this.f71800f = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f71800f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public GiftChooseViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
