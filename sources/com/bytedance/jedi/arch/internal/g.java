package com.bytedance.jedi.arch.internal;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final Handler f39499a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f39500b;

    public static final boolean a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(24302);
        Handler handler = new Handler(Looper.getMainLooper());
        f39499a = handler;
        f39500b = new f(handler);
    }
}
