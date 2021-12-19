package com.bytedance.ies.xbridge.m.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.b;
import h.f.b.l;

public class d<T, A> {

    /* renamed from: a  reason: collision with root package name */
    private b<? super A, ? extends T> f36283a;

    /* renamed from: b  reason: collision with root package name */
    private volatile T f36284b;

    static {
        Covode.recordClassIndex(21709);
    }

    public d(b<? super A, ? extends T> bVar) {
        l.c(bVar, "");
        this.f36283a = bVar;
    }

    public final T a(A a2) {
        T t;
        MethodCollector.i(14204);
        T t2 = this.f36284b;
        if (t2 != null) {
            MethodCollector.o(14204);
            return t2;
        }
        synchronized (this) {
            try {
                t = this.f36284b;
                if (t == null) {
                    b<? super A, ? extends T> bVar = this.f36283a;
                    if (bVar == null) {
                        l.a();
                    }
                    t = (T) bVar.invoke(a2);
                    this.f36284b = t;
                    this.f36283a = null;
                }
            } finally {
                MethodCollector.o(14204);
            }
        }
        return t;
    }
}
