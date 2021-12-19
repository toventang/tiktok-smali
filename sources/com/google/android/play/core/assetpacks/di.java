package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.an;
import com.google.android.play.core.b.bk;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class di implements bk<Executor> {
    static {
        Covode.recordClassIndex(32755);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.play.core.b.bk
    public final /* bridge */ /* synthetic */ Executor a() {
        ThreadFactory threadFactory = cz.f53031a;
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = threadFactory;
        ExecutorService a3 = g.a(a2.a());
        an.a(a3);
        return a3;
    }
}
