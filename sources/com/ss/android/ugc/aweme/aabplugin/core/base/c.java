package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final a f62480a;

    static {
        Covode.recordClassIndex(38448);
    }

    c(a aVar) {
        this.f62480a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a aVar = this.f62480a;
        n poll = aVar.f62464e.poll();
        if (poll == null) {
            return null;
        }
        aVar.d(poll);
        return null;
    }
}
