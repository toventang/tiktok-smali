package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ab f22162a;

    static {
        Covode.recordClassIndex(13071);
    }

    j(ab abVar) {
        this.f22162a = abVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return e.c(this.f22162a);
    }
}
