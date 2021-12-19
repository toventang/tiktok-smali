package com.ss.android.ugc.aweme.live.g;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(69459);
    }

    public static void a(View view, Rect rect, Runnable runnable) {
        if (view == null) {
            runnable.run();
            return;
        }
        view.setPivotX((float) rect.centerX());
        view.setPivotY((float) rect.centerY());
        view.animate().scaleX(0.0f).scaleY(0.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(runnable).start();
    }
}
