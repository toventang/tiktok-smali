package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f142632a;

    /* renamed from: b  reason: collision with root package name */
    private final String f142633b;

    static {
        Covode.recordClassIndex(93304);
    }

    aj(Runnable runnable, String str) {
        this.f142632a = runnable;
        this.f142633b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Runnable runnable = this.f142632a;
        if (runnable == null) {
            return null;
        }
        runnable.run();
        return null;
    }
}
