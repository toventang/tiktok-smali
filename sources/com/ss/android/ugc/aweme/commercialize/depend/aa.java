package com.ss.android.ugc.aweme.commercialize.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend;
import com.ss.android.ugc.aweme.cw.g;
import h.f.b.l;
import java.util.concurrent.ExecutorService;

public final class aa implements IThreadPoolExecutorDepend {
    static {
        Covode.recordClassIndex(45408);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getCPUThreadExecutor() {
        ExecutorService b2 = g.b();
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getIOThreadExecutor() {
        ExecutorService a2 = g.a();
        l.b(a2, "");
        return a2;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IThreadPoolExecutorDepend
    public final ExecutorService getNormalThreadExecutor() {
        ExecutorService b2 = g.b();
        l.b(b2, "");
        return b2;
    }
}
