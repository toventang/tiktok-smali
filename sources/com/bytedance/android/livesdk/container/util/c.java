package com.bytedance.android.livesdk.container.util;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.uikit.b.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f16886a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(9378);
    }

    public static void a(Activity activity, int i2) {
        l.d(activity, "");
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().clearFlags(67108864);
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            Window window = activity.getWindow();
            l.b(window, "");
            window.setStatusBarColor(i2);
            View findViewById = activity.getWindow().findViewById(16908290);
            l.b(findViewById, "");
            if (findViewById != null) {
                findViewById.setForeground(null);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            Window window2 = activity.getWindow();
            l.b(window2, "");
            window2.setStatusBarColor(i2);
        } else {
            int i3 = Build.VERSION.SDK_INT;
            a.a(activity, i2);
        }
    }
}
