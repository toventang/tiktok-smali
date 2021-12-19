package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72827a;

    /* renamed from: b  reason: collision with root package name */
    private final long f72828b;

    static {
        Covode.recordClassIndex(44857);
    }

    z(k kVar, long j2) {
        this.f72827a = kVar;
        this.f72828b = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f72827a.c(this.f72828b);
    }
}
