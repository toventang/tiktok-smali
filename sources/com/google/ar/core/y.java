package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.ArCoreApk;

final class y implements x {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f53483a;

    static {
        Covode.recordClassIndex(33120);
    }

    y(z zVar) {
        this.f53483a = zVar;
    }

    @Override // com.google.ar.core.x
    public final void a(ArCoreApk.Availability availability) {
        MethodCollector.i(9226);
        synchronized (this.f53483a) {
            try {
                this.f53483a.f53487d = availability;
                this.f53483a.f53488e = false;
            } finally {
                MethodCollector.o(9226);
            }
        }
    }
}
