package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class ib implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51824a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzn f51825b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hv f51826c;

    static {
        Covode.recordClassIndex(32304);
    }

    public final void run() {
        MethodCollector.i(7490);
        synchronized (this.f51824a) {
            try {
                dt dtVar = this.f51826c.f51807b;
                if (dtVar == null) {
                    this.f51826c.q().f51468c.a("Failed to get app instance id");
                    try {
                        this.f51824a.notify();
                    } finally {
                        MethodCollector.o(7490);
                    }
                } else {
                    this.f51824a.set(dtVar.c(this.f51825b));
                    String str = (String) this.f51824a.get();
                    if (str != null) {
                        this.f51826c.e().a(str);
                        this.f51826c.r().f51529k.a(str);
                    }
                    this.f51826c.A();
                    this.f51824a.notify();
                    MethodCollector.o(7490);
                }
            } catch (RemoteException e2) {
                this.f51826c.q().f51468c.a("Failed to get app instance id", e2);
                this.f51824a.notify();
            } catch (Throwable th) {
                this.f51824a.notify();
                MethodCollector.o(7490);
                throw th;
            }
        }
    }

    ib(hv hvVar, AtomicReference atomicReference, zzn zzn) {
        this.f51826c = hvVar;
        this.f51824a = atomicReference;
        this.f51825b = zzn;
    }
}
