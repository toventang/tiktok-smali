package com.bytedance.android.livesdk.feed.drawerfeed.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.feed.banner.c;
import com.bytedance.covode.number.Covode;

public class DrawerBannerViewPager extends c {
    static {
        Covode.recordClassIndex(9658);
    }

    private static void c() {
        a.a().a(new com.bytedance.android.livesdk.feed.e.a(1));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            Boolean.valueOf(true);
            c();
        } else if (action == 1 || action == 3) {
            Boolean.valueOf(false);
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public DrawerBannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
