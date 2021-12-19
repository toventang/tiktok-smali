package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72515a;

    /* renamed from: b  reason: collision with root package name */
    private final long f72516b;

    static {
        Covode.recordClassIndex(44689);
    }

    aj(k kVar, long j2) {
        this.f72515a = kVar;
        this.f72516b = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f72515a.b(this.f72516b);
    }
}
