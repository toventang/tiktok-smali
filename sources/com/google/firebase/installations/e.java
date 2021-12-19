package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f54580a;

    static {
        Covode.recordClassIndex(33856);
    }

    e(c cVar) {
        this.f54580a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f54580a.e();
    }
}
