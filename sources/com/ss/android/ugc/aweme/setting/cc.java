package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.google.gson.l;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cc implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final by f122155a;

    /* renamed from: b  reason: collision with root package name */
    private final l f122156b;

    static {
        Covode.recordClassIndex(80082);
    }

    cc(by byVar, l lVar) {
        this.f122155a = byVar;
        this.f122156b = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f122155a.a(this.f122156b);
    }
}
