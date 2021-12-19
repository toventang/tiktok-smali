package com.ss.android.ugc.aweme.base.utils;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.lang.ref.SoftReference;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static SoftReference<Handler> f68438a;

    static {
        Covode.recordClassIndex(42139);
    }

    public static Handler a() {
        Handler handler;
        SoftReference<Handler> softReference = f68438a;
        if (softReference != null && (handler = softReference.get()) != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        f68438a = new SoftReference<>(handler2);
        return handler2;
    }

    public static void a(Runnable runnable) {
        a().post(runnable);
    }

    public static void a(Runnable runnable, long j2) {
        a().postDelayed(runnable, j2);
    }
}
