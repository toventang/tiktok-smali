package com.bytedance.ies.powerpreload;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.b;
import h.f.b.l;

public final class f<T, A> {

    /* renamed from: a  reason: collision with root package name */
    private b<? super A, ? extends T> f34531a;

    /* renamed from: b  reason: collision with root package name */
    private volatile T f34532b;

    static {
        Covode.recordClassIndex(20655);
    }

    public f(b<? super A, ? extends T> bVar) {
        l.c(bVar, "");
        this.f34531a = bVar;
    }

    public final T a(A a2) {
        T t;
        MethodCollector.i(38);
        T t2 = this.f34532b;
        if (t2 != null) {
            MethodCollector.o(38);
            return t2;
        }
        synchronized (this) {
            try {
                t = this.f34532b;
                if (t != null) {
                    this.f34531a = null;
                } else {
                    b<? super A, ? extends T> bVar = this.f34531a;
                    if (bVar == null) {
                        l.a();
                    }
                    t = (T) bVar.invoke(a2);
                    this.f34532b = t;
                    this.f34531a = null;
                }
            } finally {
                MethodCollector.o(38);
            }
        }
        return t;
    }
}
