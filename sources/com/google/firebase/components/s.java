package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.d.a;

public final class s<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f54344a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f54345b = f54344a;

    /* renamed from: c  reason: collision with root package name */
    private volatile a<T> f54346c;

    static {
        Covode.recordClassIndex(33739);
    }

    @Override // com.google.firebase.d.a
    public final T a() {
        MethodCollector.i(3925);
        T t = (T) this.f54345b;
        Object obj = f54344a;
        if (t == obj) {
            synchronized (this) {
                try {
                    t = this.f54345b;
                    if (t == obj) {
                        t = this.f54346c.a();
                        this.f54345b = t;
                        this.f54346c = null;
                    }
                } finally {
                    MethodCollector.o(3925);
                }
            }
        }
        return t;
    }

    public s(a<T> aVar) {
        this.f54346c = aVar;
    }
}
