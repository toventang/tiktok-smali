package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import h.f.b.l;

public final class p extends n {
    static {
        Covode.recordClassIndex(60474);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_record";
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        GsonProvider c2 = GsonHolder.c();
        l.b(c2, "");
        String b2 = c2.b().b(d());
        l.b(b2, "");
        return b2;
    }
}
