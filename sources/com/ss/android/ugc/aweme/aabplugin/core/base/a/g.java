package com.ss.android.ugc.aweme.aabplugin.core.base.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final int f62476a;

    static {
        Covode.recordClassIndex(38445);
    }

    g(int i2) {
        this.f62476a = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return f.b(this.f62476a);
    }
}
