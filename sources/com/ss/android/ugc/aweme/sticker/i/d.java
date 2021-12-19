package com.ss.android.ugc.aweme.sticker.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.i.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.Callable;

final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass2 f134918a;

    /* renamed from: b  reason: collision with root package name */
    private final Effect f134919b;

    static {
        Covode.recordClassIndex(88195);
    }

    d(a.AnonymousClass2 r1, Effect effect) {
        this.f134918a = r1;
        this.f134919b = effect;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a.AnonymousClass2 r0 = this.f134918a;
        return a.this.a(this.f134919b);
    }
}
