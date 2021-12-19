package com.ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class m implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final m f68150a = new m();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f68151b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(41988);
    }

    private m() {
    }

    public final void execute(Runnable runnable) {
        this.f68151b.post(runnable);
    }

    public final void a(Runnable runnable, long j2) {
        this.f68151b.postDelayed(runnable, j2);
    }
}
