package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f100222a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f100223b = new Handler(Looper.getMainLooper());

    private k() {
    }

    static {
        Covode.recordClassIndex(63884);
    }

    public static final void a(Runnable runnable) {
        l.d(runnable, "");
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        if (mainLooper.getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f100223b.post(runnable);
        }
    }

    public static final void a(Runnable runnable, long j2) {
        l.d(runnable, "");
        f100223b.postDelayed(runnable, j2);
    }
}
