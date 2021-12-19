package com.google.firebase.iid;

import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.iid.x;

final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final x.a f54384a;

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f54385b;

    static {
        Covode.recordClassIndex(33768);
    }

    aa(x.a aVar, IBinder iBinder) {
        this.f54384a = aVar;
        this.f54385b = iBinder;
    }

    public final void run() {
        MethodCollector.i(13434);
        x.a aVar = this.f54384a;
        IBinder iBinder = this.f54385b;
        synchronized (aVar) {
            if (iBinder == null) {
                try {
                    aVar.a(0, "Null service connection");
                } finally {
                    MethodCollector.o(13434);
                }
            } else {
                try {
                    aVar.f54498c = new x.b(iBinder);
                    aVar.f54496a = 2;
                    aVar.a();
                    MethodCollector.o(13434);
                } catch (RemoteException e2) {
                    aVar.a(0, e2.getMessage());
                    MethodCollector.o(13434);
                }
            }
        }
    }
}
