package com.bytedance.android.livesdk.aj;

import com.bytedance.android.live.core.f.w;
import com.bytedance.android.livesdk.ab.h;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final n f13888a;

    static {
        Covode.recordClassIndex(7713);
    }

    q(n nVar) {
        this.f13888a = nVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        h.a().a(new r(this.f13888a, ((float) w.a()) / 1024.0f));
        return null;
    }
}
