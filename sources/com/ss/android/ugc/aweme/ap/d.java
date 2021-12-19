package com.ss.android.ugc.aweme.ap;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.a;
import h.f.b.l;

final class d<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private a<? extends T> f66427a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f66428b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f66429c;

    static {
        Covode.recordClassIndex(40823);
    }

    public final String toString() {
        if (this.f66428b != f.f66430a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }

    @Override // com.ss.android.ugc.aweme.ap.c
    public final T a() {
        T t;
        MethodCollector.i(571);
        T t2 = (T) this.f66428b;
        if (t2 != f.f66430a) {
            MethodCollector.o(571);
            return t2;
        }
        synchronized (this.f66429c) {
            try {
                t = (T) this.f66428b;
                if (t == f.f66430a) {
                    a<? extends T> aVar = this.f66427a;
                    if (aVar == null) {
                        l.b();
                    }
                    t = (T) aVar.invoke();
                    this.f66428b = t;
                    this.f66427a = null;
                }
            } finally {
                MethodCollector.o(571);
            }
        }
        return t;
    }

    private d(a<? extends T> aVar) {
        l.d(aVar, "");
        this.f66427a = aVar;
        this.f66428b = f.f66430a;
        this.f66429c = this;
    }

    @Override // com.ss.android.ugc.aweme.ap.c
    public final void a(T t) {
        MethodCollector.i(573);
        if (l.a(this.f66428b, f.f66430a)) {
            synchronized (this.f66429c) {
                try {
                    this.f66428b = t;
                    this.f66427a = null;
                } finally {
                    MethodCollector.o(573);
                }
            }
            return;
        }
        this.f66428b = t;
        MethodCollector.o(573);
    }

    public /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }
}
