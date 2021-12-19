package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import h.f.a.b;

final /* synthetic */ class MainServiceImpl$$Lambda$2 implements n.a {
    private final b arg$1;

    static {
        Covode.recordClassIndex(79526);
    }

    private MainServiceImpl$$Lambda$2(b bVar) {
        this.arg$1 = bVar;
    }

    static n.a get$Lambda(b bVar) {
        return new MainServiceImpl$$Lambda$2(bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
    public final void sendLog(boolean z) {
        this.arg$1.invoke(Boolean.valueOf(z));
    }
}
