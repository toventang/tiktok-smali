package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

final class h<ResultT> implements k<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    final Object f53372a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final a f53373b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f53374c;

    static {
        Covode.recordClassIndex(32970);
    }

    public h(Executor executor, a aVar) {
        this.f53374c = executor;
        this.f53373b = aVar;
    }

    @Override // com.google.android.play.core.tasks.k
    public final void a(d<ResultT> dVar) {
        a aVar;
        MethodCollector.i(8561);
        if (!dVar.b()) {
            synchronized (this.f53372a) {
                try {
                    aVar = this.f53373b;
                } catch (Throwable th) {
                    MethodCollector.o(8561);
                    throw th;
                }
            }
            if (aVar == null) {
                MethodCollector.o(8561);
                return;
            }
            this.f53374c.execute(new g(this, dVar));
            MethodCollector.o(8561);
            return;
        }
        MethodCollector.o(8561);
    }
}
