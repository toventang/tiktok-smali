package com.ss.android.ugc.aweme.aabplugin.core.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.m.b.a;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final b f62455a;

    /* renamed from: b  reason: collision with root package name */
    private final a f62456b;

    static {
        Covode.recordClassIndex(38432);
    }

    c(b bVar, a aVar) {
        this.f62455a = bVar;
        this.f62456b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f62455a.a(this.f62456b);
    }
}
