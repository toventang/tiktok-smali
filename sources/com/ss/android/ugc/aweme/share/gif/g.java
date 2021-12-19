package com.ss.android.ugc.aweme.share.gif;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f123530a;

    static {
        Covode.recordClassIndex(81095);
    }

    g(Runnable runnable) {
        this.f123530a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f123530a.run();
        return null;
    }
}
