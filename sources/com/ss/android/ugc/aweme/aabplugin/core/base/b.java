package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f62478a;

    /* renamed from: b  reason: collision with root package name */
    private final n f62479b;

    static {
        Covode.recordClassIndex(38447);
    }

    b(a aVar, n nVar) {
        this.f62478a = aVar;
        this.f62479b = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f62478a.e(this.f62479b);
    }
}
