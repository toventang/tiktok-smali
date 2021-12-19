package com.bytedance.android.live.core.f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.android.live.uikit.b.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class ac {
    static {
        Covode.recordClassIndex(4609);
    }

    private static int b(Activity activity) {
        return activity.getResources().getColor(R.color.c9);
    }

    public static int a(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
    }

    public static void a(Activity activity) {
        if (activity != null && !d.a(activity)) {
            int i2 = Build.VERSION.SDK_INT;
            activity.getWindow().setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT >= 21) {
                activity.getWindow().setStatusBarColor(b(activity));
                return;
            }
            int i3 = Build.VERSION.SDK_INT;
            a.a(activity, b(activity));
        }
    }
}
