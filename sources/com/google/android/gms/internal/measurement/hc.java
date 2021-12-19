package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class hc {

    /* renamed from: d  reason: collision with root package name */
    private static final fy f50970d = fy.a();

    /* renamed from: a  reason: collision with root package name */
    fe f50971a;

    /* renamed from: b  reason: collision with root package name */
    volatile ht f50972b;

    /* renamed from: c  reason: collision with root package name */
    volatile fe f50973c;

    public int hashCode() {
        return 1;
    }

    static {
        Covode.recordClassIndex(31842);
    }

    public final int a() {
        if (this.f50973c != null) {
            return this.f50973c.zza();
        }
        if (this.f50972b != null) {
            return this.f50972b.m();
        }
        return 0;
    }

    public final fe b() {
        MethodCollector.i(5872);
        if (this.f50973c != null) {
            fe feVar = this.f50973c;
            MethodCollector.o(5872);
            return feVar;
        }
        synchronized (this) {
            try {
                if (this.f50973c != null) {
                    return this.f50973c;
                }
                if (this.f50972b == null) {
                    this.f50973c = fe.zza;
                } else {
                    this.f50973c = this.f50972b.g();
                }
                fe feVar2 = this.f50973c;
                MethodCollector.o(5872);
                return feVar2;
            } finally {
                MethodCollector.o(5872);
            }
        }
    }

    private final ht a(ht htVar) {
        MethodCollector.i(5796);
        if (this.f50972b == null) {
            synchronized (this) {
                try {
                    if (this.f50972b == null) {
                        try {
                            this.f50972b = htVar;
                            this.f50973c = fe.zza;
                        } catch (gu unused) {
                            this.f50972b = htVar;
                            this.f50973c = fe.zza;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5796);
                    throw th;
                }
            }
        }
        ht htVar2 = this.f50972b;
        MethodCollector.o(5796);
        return htVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        ht htVar = this.f50972b;
        ht htVar2 = hcVar.f50972b;
        if (htVar == null) {
            if (htVar2 == null) {
                return b().equals(hcVar.b());
            }
            return a(htVar2.H_()).equals(htVar2);
        } else if (htVar2 != null) {
            return htVar.equals(htVar2);
        } else {
            return htVar.equals(hcVar.a(htVar.H_()));
        }
    }
}
