package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

final class j<ResultT> implements k<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    final Object f53377a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final b<? super ResultT> f53378b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f53379c;

    static {
        Covode.recordClassIndex(32972);
    }

    public j(Executor executor, b<? super ResultT> bVar) {
        this.f53379c = executor;
        this.f53378b = bVar;
    }

    @Override // com.google.android.play.core.tasks.k
    public final void a(d<ResultT> dVar) {
        b<? super ResultT> bVar;
        MethodCollector.i(8530);
        if (dVar.b()) {
            synchronized (this.f53377a) {
                try {
                    bVar = this.f53378b;
                } catch (Throwable th) {
                    MethodCollector.o(8530);
                    throw th;
                }
            }
            if (bVar == null) {
                MethodCollector.o(8530);
                return;
            }
            this.f53379c.execute(new i(this, dVar));
            MethodCollector.o(8530);
            return;
        }
        MethodCollector.o(8530);
    }
}
