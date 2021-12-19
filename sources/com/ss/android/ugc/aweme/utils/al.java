package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class al implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f142635a;

    /* renamed from: b  reason: collision with root package name */
    private final String f142636b;

    static {
        Covode.recordClassIndex(93306);
    }

    al(Runnable runnable, String str) {
        this.f142635a = runnable;
        this.f142636b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Runnable runnable = this.f142635a;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
