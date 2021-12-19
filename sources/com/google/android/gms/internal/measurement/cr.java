package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
public final class cr<T> implements cq<T> {

    /* renamed from: a  reason: collision with root package name */
    private volatile cq<T> f50746a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f50747b;

    /* renamed from: c  reason: collision with root package name */
    private T f50748c;

    static {
        Covode.recordClassIndex(31711);
    }

    @Override // com.google.android.gms.internal.measurement.cq
    public final T a() {
        MethodCollector.i(6519);
        if (!this.f50747b) {
            synchronized (this) {
                try {
                    if (!this.f50747b) {
                        T a2 = this.f50746a.a();
                        this.f50748c = a2;
                        this.f50747b = true;
                        this.f50746a = null;
                        return a2;
                    }
                } finally {
                    MethodCollector.o(6519);
                }
            }
        }
        T t = this.f50748c;
        MethodCollector.o(6519);
        return t;
    }

    public final String toString() {
        Object obj = this.f50746a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f50748c);
            obj = new StringBuilder(String.valueOf(valueOf).length() + 25).append("<supplier that returned ").append(valueOf).append(">").toString();
        }
        String valueOf2 = String.valueOf(obj);
        return new StringBuilder(String.valueOf(valueOf2).length() + 19).append("Suppliers.memoize(").append(valueOf2).append(")").toString();
    }

    cr(cq<T> cqVar) {
        this.f50746a = (cq) cl.a(cqVar);
    }
}
