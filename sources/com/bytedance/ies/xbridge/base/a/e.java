package com.bytedance.ies.xbridge.base.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.b;
import h.f.b.l;

public class e<T, A> {

    /* renamed from: a  reason: collision with root package name */
    private b<? super A, ? extends T> f35776a;

    /* renamed from: b  reason: collision with root package name */
    private volatile T f35777b;

    static {
        Covode.recordClassIndex(21370);
    }

    public e(b<? super A, ? extends T> bVar) {
        l.c(bVar, "");
        this.f35776a = bVar;
    }

    public final T a(A a2) {
        T t;
        MethodCollector.i(3251);
        T t2 = this.f35777b;
        if (t2 != null) {
            MethodCollector.o(3251);
            return t2;
        }
        synchronized (this) {
            try {
                t = this.f35777b;
                if (t == null) {
                    b<? super A, ? extends T> bVar = this.f35776a;
                    if (bVar == null) {
                        l.a();
                    }
                    t = (T) bVar.invoke(a2);
                    this.f35777b = t;
                    this.f35776a = null;
                }
            } finally {
                MethodCollector.o(3251);
            }
        }
        return t;
    }
}
