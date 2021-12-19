package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class m {
    static {
        Covode.recordClassIndex(41163);
    }

    public static void a(Intent intent, Context context, int i2) {
        if (i2 == 5) {
            intent.setClassName(context, "com.bytedance.android.aweme.lite.home.HomeActivity");
        } else {
            intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        }
    }
}
