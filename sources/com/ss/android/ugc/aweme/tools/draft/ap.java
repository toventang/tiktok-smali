package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import java.util.concurrent.Callable;

final /* synthetic */ class ap implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f139379a;

    static {
        Covode.recordClassIndex(91116);
    }

    ap(c cVar) {
        this.f139379a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return com.ss.android.ugc.aweme.port.in.c.C.c().a(this.f139379a);
    }
}
