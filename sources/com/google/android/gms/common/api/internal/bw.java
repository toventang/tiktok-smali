package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.p;
import com.google.android.gms.internal.d.g;

final class bw extends g {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ bv f50127a;

    static {
        Covode.recordClassIndex(31266);
    }

    public final void handleMessage(Message message) {
        MethodCollector.i(13991);
        int i2 = message.what;
        if (i2 == 0) {
            k<R> kVar = (k) message.obj;
            synchronized (this.f50127a.f50122e) {
                if (kVar == null) {
                    try {
                        this.f50127a.f50119b.a(new Status(13, "Transform returned null"));
                    } catch (Throwable th) {
                        MethodCollector.o(13991);
                        throw th;
                    }
                } else if (kVar instanceof bp) {
                    this.f50127a.f50119b.a(((bp) kVar).f50105a);
                } else {
                    bv<? extends p> bvVar = this.f50127a.f50119b;
                    synchronized (bvVar.f50122e) {
                        try {
                            bvVar.f50121d = kVar;
                            if (!(bvVar.f50118a == null && bvVar.f50120c == null)) {
                                i iVar = bvVar.f50124g.get();
                                if (!(bvVar.f50126i || bvVar.f50118a == null || iVar == null)) {
                                    iVar.a(bvVar);
                                    bvVar.f50126i = true;
                                }
                                if (bvVar.f50123f != null) {
                                    bvVar.b(bvVar.f50123f);
                                } else if (bvVar.f50121d != null) {
                                    bvVar.f50121d.a(bvVar);
                                }
                            }
                        } catch (Throwable th2) {
                            MethodCollector.o(13991);
                            throw th2;
                        }
                    }
                }
            }
            MethodCollector.o(13991);
        } else if (i2 != 1) {
            int i3 = message.what;
            MethodCollector.o(13991);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            if (valueOf.length() != 0) {
                "Runtime exception on the transformation worker thread: ".concat(valueOf);
            } else {
                new String("Runtime exception on the transformation worker thread: ");
            }
            MethodCollector.o(13991);
            throw runtimeException;
        }
    }
}
