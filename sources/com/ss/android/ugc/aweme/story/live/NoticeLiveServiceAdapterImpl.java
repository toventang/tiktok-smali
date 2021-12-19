package com.ss.android.ugc.aweme.story.live;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class NoticeLiveServiceAdapterImpl implements NoticeLiveServiceAdapter {
    static {
        Covode.recordClassIndex(90238);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter
    public final void a() {
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.c().a(true);
    }

    public static NoticeLiveServiceAdapter b() {
        MethodCollector.i(5028);
        Object a2 = b.a(NoticeLiveServiceAdapter.class, false);
        if (a2 != null) {
            NoticeLiveServiceAdapter noticeLiveServiceAdapter = (NoticeLiveServiceAdapter) a2;
            MethodCollector.o(5028);
            return noticeLiveServiceAdapter;
        }
        if (b.eo == null) {
            synchronized (NoticeLiveServiceAdapter.class) {
                try {
                    if (b.eo == null) {
                        b.eo = new NoticeLiveServiceAdapterImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5028);
                    throw th;
                }
            }
        }
        NoticeLiveServiceAdapterImpl noticeLiveServiceAdapterImpl = (NoticeLiveServiceAdapterImpl) b.eo;
        MethodCollector.o(5028);
        return noticeLiveServiceAdapterImpl;
    }
}
