package com.bytedance.android.livesdk.aj;

import com.bytedance.android.live.core.f.c;
import com.bytedance.android.livesdk.ab.h;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f13808a;

    static {
        Covode.recordClassIndex(7678);
    }

    b(a aVar) {
        this.f13808a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        h.a().a(new c(this.f13808a, c.a()));
        return null;
    }
}
