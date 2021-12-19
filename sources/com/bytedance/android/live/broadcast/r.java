package com.bytedance.android.live.broadcast;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final p f8464a;

    static {
        Covode.recordClassIndex(4343);
    }

    r(p pVar) {
        this.f8464a = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(this.f8464a.a());
    }
}
