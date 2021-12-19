package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Exception f94054a;

    static {
        Covode.recordClassIndex(59785);
    }

    m(Exception exc) {
        this.f94054a = exc;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return l.b(this.f94054a);
    }
}
