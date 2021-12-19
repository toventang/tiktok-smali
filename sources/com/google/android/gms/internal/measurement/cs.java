package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public final class cs<T> implements cq<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private volatile transient boolean f50749a;

    /* renamed from: b  reason: collision with root package name */
    private transient T f50750b;
    private final cq<T> zza;

    static {
        Covode.recordClassIndex(31712);
    }

    @Override // com.google.android.gms.internal.measurement.cq
    public final T a() {
        MethodCollector.i(6598);
        if (!this.f50749a) {
            synchronized (this) {
                try {
                    if (!this.f50749a) {
                        T a2 = this.zza.a();
                        this.f50750b = a2;
                        this.f50749a = true;
                        return a2;
                    }
                } finally {
                    MethodCollector.o(6598);
                }
            }
        }
        T t = this.f50750b;
        MethodCollector.o(6598);
        return t;
    }

    public final String toString() {
        Object obj;
        if (this.f50749a) {
            String valueOf = String.valueOf(this.f50750b);
            obj = new StringBuilder(String.valueOf(valueOf).length() + 25).append("<supplier that returned ").append(valueOf).append(">").toString();
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        return new StringBuilder(String.valueOf(valueOf2).length() + 19).append("Suppliers.memoize(").append(valueOf2).append(")").toString();
    }

    cs(cq<T> cqVar) {
        this.zza = (cq) cl.a(cqVar);
    }
}
