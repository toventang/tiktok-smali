package com.ss.android.ugc.aweme.player.sdk.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.playerkit.exp.b;
import java.util.ArrayList;
import java.util.List;

public final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final Object f115460a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final List<Runnable> f115461b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f115462c = new Runnable() {
        /* class com.ss.android.ugc.aweme.player.sdk.util.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(74120);
        }

        public final void run() {
            Runnable a2 = e.this.a();
            if (a2 != null) {
                a2.run();
            }
        }
    };

    static {
        Covode.recordClassIndex(74119);
    }

    /* access modifiers changed from: package-private */
    public final Runnable a() {
        Runnable runnable;
        MethodCollector.i(3811);
        synchronized (this.f115460a) {
            try {
                if (!this.f115461b.isEmpty()) {
                    runnable = this.f115461b.remove(0);
                } else {
                    runnable = null;
                }
            } finally {
                MethodCollector.o(3811);
            }
        }
        return runnable;
    }

    public e(Looper looper) {
        super(looper);
    }

    private void b(Runnable runnable) {
        MethodCollector.i(3809);
        synchronized (this.f115460a) {
            try {
                this.f115461b.add(runnable);
            } finally {
                MethodCollector.o(3809);
            }
        }
    }

    public final void a(Runnable runnable) {
        if (runnable != null) {
            b(runnable);
            Message obtain = Message.obtain(this, this.f115462c);
            if (b.v() && Build.VERSION.SDK_INT >= 22) {
                obtain.setAsynchronous(true);
            }
            sendMessageAtFrontOfQueue(obtain);
        }
    }
}
