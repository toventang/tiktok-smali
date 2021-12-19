package com.ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.bytedance.covode.number.Covode;

public final class dz {
    static {
        Covode.recordClassIndex(83073);
    }

    public static void a(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        activity.getWindow().addFlags(67108864);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            return;
        }
        a(activity);
    }
}
