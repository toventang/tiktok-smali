package com.ss.android.ugc.aweme.aabplugin.core.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.m.b.a;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f62453a;

    /* renamed from: b  reason: collision with root package name */
    private final a f62454b;

    static {
        Covode.recordClassIndex(38428);
    }

    c(b bVar, a aVar) {
        this.f62453a = bVar;
        this.f62454b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f62453a.c(this.f62454b);
    }
}
