package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import java.util.concurrent.Callable;

final /* synthetic */ class ar implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f139382a;

    static {
        Covode.recordClassIndex(91118);
    }

    ar(c cVar) {
        this.f139382a = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.ss.android.ugc.aweme.tools.draft.j.c.a().delete(this.f139382a);
        return null;
    }
}
