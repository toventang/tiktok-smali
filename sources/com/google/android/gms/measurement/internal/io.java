package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
public final class io implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f51874a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f51875b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f51876c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f51877d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f51878e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzn f51879f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ hv f51880g;

    static {
        Covode.recordClassIndex(32317);
    }

    public final void run() {
        MethodCollector.i(6920);
        synchronized (this.f51874a) {
            try {
                dt dtVar = this.f51880g.f51807b;
                if (dtVar == null) {
                    this.f51880g.q().f51468c.a("(legacy) Failed to get user properties; not connected to service", eb.a(this.f51875b), this.f51876c, this.f51877d);
                    this.f51874a.set(Collections.emptyList());
                    try {
                        this.f51874a.notify();
                    } finally {
                        MethodCollector.o(6920);
                    }
                } else {
                    if (TextUtils.isEmpty(this.f51875b)) {
                        this.f51874a.set(dtVar.a(this.f51876c, this.f51877d, this.f51878e, this.f51879f));
                    } else {
                        this.f51874a.set(dtVar.a(this.f51875b, this.f51876c, this.f51877d, this.f51878e));
                    }
                    this.f51880g.A();
                    this.f51874a.notify();
                    MethodCollector.o(6920);
                }
            } catch (RemoteException e2) {
                this.f51880g.q().f51468c.a("(legacy) Failed to get user properties; remote exception", eb.a(this.f51875b), this.f51876c, e2);
                this.f51874a.set(Collections.emptyList());
                this.f51874a.notify();
            } catch (Throwable th) {
                this.f51874a.notify();
                MethodCollector.o(6920);
                throw th;
            }
        }
    }

    io(hv hvVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z, zzn zzn) {
        this.f51880g = hvVar;
        this.f51874a = atomicReference;
        this.f51875b = str;
        this.f51876c = str2;
        this.f51877d = str3;
        this.f51878e = z;
        this.f51879f = zzn;
    }
}
