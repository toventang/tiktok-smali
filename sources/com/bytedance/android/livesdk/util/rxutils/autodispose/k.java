package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ab f22163a;

    static {
        Covode.recordClassIndex(13072);
    }

    k(ab abVar) {
        this.f22163a = abVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return e.b(this.f22163a);
    }
}
