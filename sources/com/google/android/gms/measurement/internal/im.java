package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class im implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51862a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51863b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51864c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f51865d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzn f51866e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ hv f51867f;

    static {
        Covode.recordClassIndex(32315);
    }

    public final void run() {
        MethodCollector.i(6926);
        synchronized (this.f51862a) {
            try {
                dt dtVar = this.f51867f.f51807b;
                if (dtVar == null) {
                    this.f51867f.q().f51468c.a("(legacy) Failed to get conditional properties; not connected to service", eb.a(this.f51863b), this.f51864c, this.f51865d);
                    this.f51862a.set(Collections.emptyList());
                    try {
                        this.f51862a.notify();
                    } finally {
                        MethodCollector.o(6926);
                    }
                } else {
                    if (TextUtils.isEmpty(this.f51863b)) {
                        this.f51862a.set(dtVar.a(this.f51864c, this.f51865d, this.f51866e));
                    } else {
                        this.f51862a.set(dtVar.a(this.f51863b, this.f51864c, this.f51865d));
                    }
                    this.f51867f.A();
                    this.f51862a.notify();
                    MethodCollector.o(6926);
                }
            } catch (RemoteException e2) {
                this.f51867f.q().f51468c.a("(legacy) Failed to get conditional properties; remote exception", eb.a(this.f51863b), this.f51864c, e2);
                this.f51862a.set(Collections.emptyList());
                this.f51862a.notify();
            } catch (Throwable th) {
                this.f51862a.notify();
                MethodCollector.o(6926);
                throw th;
            }
        }
    }

    im(hv hvVar, AtomicReference atomicReference, String str, String str2, String str3, zzn zzn) {
        this.f51867f = hvVar;
        this.f51862a = atomicReference;
        this.f51863b = str;
        this.f51864c = str2;
        this.f51865d = str3;
        this.f51866e = zzn;
    }
}
