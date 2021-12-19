package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;

public final class ez {

    /* renamed from: a  reason: collision with root package name */
    public static long f142899a;

    static {
        Covode.recordClassIndex(93506);
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1024);
        }
    }

    public static void a(Activity activity, int i2) {
        o.a(activity, i2);
        o.b(activity);
    }
}
