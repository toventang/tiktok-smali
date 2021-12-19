package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f93602a;

    static {
        Covode.recordClassIndex(59544);
    }

    n(Runnable runnable) {
        this.f93602a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f93602a.run();
        return null;
    }
}
