package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class r<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    final Object f49921a = new Object();

    /* renamed from: b  reason: collision with root package name */
    c<TResult> f49922b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f49923c;

    static {
        Covode.recordClassIndex(31167);
    }

    public r(Executor executor, c<TResult> cVar) {
        this.f49923c = executor;
        this.f49922b = cVar;
    }

    @Override // com.google.android.gms.c.z
    public final void a(h<TResult> hVar) {
        MethodCollector.i(6875);
        synchronized (this.f49921a) {
            try {
                if (this.f49922b != null) {
                    this.f49923c.execute(new s(this, hVar));
                    MethodCollector.o(6875);
                }
            } finally {
                MethodCollector.o(6875);
            }
        }
    }

    @Override // com.google.android.gms.c.z
    public final void N_() {
        MethodCollector.i(6951);
        synchronized (this.f49921a) {
            try {
                this.f49922b = null;
            } finally {
                MethodCollector.o(6951);
            }
        }
    }
}
