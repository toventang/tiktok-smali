package com.ss.android.ugc.aweme.ct;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ct.d;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final d.a f79079a;

    static {
        Covode.recordClassIndex(49101);
    }

    e(d.a aVar) {
        this.f79079a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f79079a.a();
    }
}
