package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.m.b.a;
import java.util.concurrent.Callable;

final /* synthetic */ class k implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final m f62490a;

    /* renamed from: b  reason: collision with root package name */
    private final a f62491b;

    static {
        Covode.recordClassIndex(38456);
    }

    k(m mVar, a aVar) {
        this.f62490a = mVar;
        this.f62491b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f62490a.b((m) this.f62491b);
    }
}
