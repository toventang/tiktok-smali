package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import java.util.concurrent.Callable;

final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f139521a;

    static {
        Covode.recordClassIndex(91224);
    }

    f(c cVar) {
        this.f139521a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftDelete(this.f139521a);
        return null;
    }
}
