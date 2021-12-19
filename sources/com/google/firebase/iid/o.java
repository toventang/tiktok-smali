package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.b.a;
import com.google.firebase.b.b;
import com.google.firebase.iid.FirebaseInstanceId;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId.a f54476a;

    static {
        Covode.recordClassIndex(33811);
    }

    o(FirebaseInstanceId.a aVar) {
        this.f54476a = aVar;
    }

    @Override // com.google.firebase.b.b
    public final void a(a aVar) {
        MethodCollector.i(12831);
        FirebaseInstanceId.a aVar2 = this.f54476a;
        synchronized (aVar2) {
            try {
                if (aVar2.a()) {
                    FirebaseInstanceId.this.startSyncIfNecessary();
                }
            } finally {
                MethodCollector.o(12831);
            }
        }
    }
}
