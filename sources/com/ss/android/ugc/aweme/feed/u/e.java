package com.ss.android.ugc.aweme.feed.u;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;

final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final d f94012a;

    static {
        Covode.recordClassIndex(59777);
    }

    e(d dVar) {
        this.f94012a = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MethodCollector.i(10093);
        d dVar = this.f94012a;
        dVar.getItems().size();
        if (dVar.getItems() != null && dVar.f94005d.f95145a + 1 < dVar.getItems().size()) {
            dVar.getItems().subList(0, dVar.f94005d.f95145a + 1).clear();
            dVar.f94005d.f95145a = 0;
        }
        dVar.getItems().size();
        Thread.sleep(400);
        Object obj = dVar.mData;
        MethodCollector.o(10093);
        return obj;
    }
}
