package com.facebook.imagepipeline.d;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.k;

public class i implements k<q> {

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f47809a;

    static {
        Covode.recordClassIndex(28951);
    }

    /* renamed from: a */
    public q b() {
        int i2;
        int min = Math.min(this.f47809a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i2 = 4194304;
        } else if (min < 67108864) {
            i2 = 6291456;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            i2 = min / 4;
        }
        return new q(i2, 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public i(ActivityManager activityManager) {
        this.f47809a = activityManager;
    }
}
