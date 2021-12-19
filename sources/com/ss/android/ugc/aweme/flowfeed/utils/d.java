package com.ss.android.ugc.aweme.flowfeed.utils;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;

public final class d {
    static {
        Covode.recordClassIndex(60932);
    }

    private static int a(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        return scaledTouchSlop * scaledTouchSlop;
    }

    public static boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, Context context) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        int x = (int) (motionEvent2.getX() - motionEvent.getX());
        int y = (int) (motionEvent2.getY() - motionEvent.getY());
        int i2 = (x * x) + (y * y);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() * 3;
        if (i2 > a(context) || Math.abs(x) >= scaledTouchSlop) {
            return true;
        }
        return false;
    }
}
