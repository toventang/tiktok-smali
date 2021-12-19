package com.ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f62787a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62788b;

    static {
        Covode.recordClassIndex(38688);
    }

    f(b bVar, String str) {
        this.f62787a = bVar;
        this.f62788b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return b.a(this.f62788b, true, false);
    }
}
