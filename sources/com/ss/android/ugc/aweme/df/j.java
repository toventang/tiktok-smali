package com.ss.android.ugc.aweme.df;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class j implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final j f80052a = new j();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f80053b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(49831);
    }

    private j() {
    }

    public final void execute(Runnable runnable) {
        this.f80053b.post(runnable);
    }
}
