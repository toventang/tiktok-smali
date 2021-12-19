package com.google.firebase.analytics.connector;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.measurement.ae;
import com.google.android.gms.internal.measurement.f;
import com.google.firebase.b.a;
import com.google.firebase.b.b;

final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    static final b f54272a = new d();

    static {
        Covode.recordClassIndex(33697);
    }

    private d() {
    }

    @Override // com.google.firebase.b.b
    public final void a(a aVar) {
        MethodCollector.i(3804);
        boolean z = aVar.f54294b.f54251a;
        synchronized (b.class) {
            try {
                f fVar = ((b) b.f54268a).f54269b.f51312a;
                fVar.a(new ae(fVar, z));
            } finally {
                MethodCollector.o(3804);
            }
        }
    }
}
