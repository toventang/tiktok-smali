package com.facebook.common.b;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class i extends e {

    /* renamed from: a  reason: collision with root package name */
    private static i f47068a;

    static {
        Covode.recordClassIndex(28621);
    }

    private i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i b() {
        if (f47068a == null) {
            f47068a = new i();
        }
        return f47068a;
    }

    @Override // com.facebook.common.b.e
    public final void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
