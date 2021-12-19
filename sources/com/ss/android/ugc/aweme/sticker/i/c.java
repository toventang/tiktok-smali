package com.ss.android.ugc.aweme.sticker.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.i.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass1 f134916a;

    /* renamed from: b  reason: collision with root package name */
    private final Effect f134917b;

    static {
        Covode.recordClassIndex(88194);
    }

    c(a.AnonymousClass1 r1, Effect effect) {
        this.f134916a = r1;
        this.f134917b = effect;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a.AnonymousClass1 r0 = this.f134916a;
        return a.this.a(this.f134917b);
    }
}
