package com.android.billingclient.api;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Future;

final class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Future f5800a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f5801b;

    static {
        Covode.recordClassIndex(2431);
    }

    public final void run() {
        if (!this.f5800a.isDone() && !this.f5800a.isCancelled()) {
            this.f5800a.cancel(true);
            Runnable runnable = this.f5801b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    af(Future future, Runnable runnable) {
        this.f5800a = future;
        this.f5801b = runnable;
    }
}
