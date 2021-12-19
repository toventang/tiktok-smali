package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.k;
import com.facebook.imagepipeline.d.q;

public final class b implements k<q> {

    /* renamed from: a  reason: collision with root package name */
    private final ActivityManager f39960a;

    /* renamed from: b  reason: collision with root package name */
    private int f39961b;

    static {
        Covode.recordClassIndex(24640);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.facebook.common.d.k
    public final /* synthetic */ q b() {
        int i2 = this.f39961b;
        if (i2 <= 0) {
            int min = Math.min(this.f39960a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
            if (min < 33554432) {
                i2 = 4194304;
            } else if (min < 67108864) {
                i2 = 6291456;
            } else {
                int i3 = Build.VERSION.SDK_INT;
                i2 = min / 8;
            }
        }
        return new q(i2, 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public b(ActivityManager activityManager, int i2) {
        this.f39960a = activityManager;
        this.f39961b = i2;
    }
}
