package com.ss.android.ugc.aweme.awemeservice.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final d f67634a;

    /* renamed from: b  reason: collision with root package name */
    private final String f67635b;

    static {
        Covode.recordClassIndex(41643);
    }

    f(d dVar, String str) {
        this.f67634a = dVar;
        this.f67635b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f67634a.a(this.f67635b);
    }
}
