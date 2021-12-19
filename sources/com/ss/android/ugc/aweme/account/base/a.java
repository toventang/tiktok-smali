package com.ss.android.ugc.aweme.account.base;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;

public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62883a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f62884b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(38740);
    }

    private a() {
    }

    public final void execute(Runnable runnable) {
        this.f62884b.post(runnable);
    }
}
