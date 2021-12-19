package com.google.android.gms.common.util.a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.e.g;
import java.util.concurrent.Executor;

public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f50495a;

    static {
        Covode.recordClassIndex(31460);
    }

    public final void execute(Runnable runnable) {
        this.f50495a.post(runnable);
    }

    public a(Looper looper) {
        this.f50495a = new g(looper);
    }
}
