package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

final class ae implements x {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicReference f53400a;

    static {
        Covode.recordClassIndex(33055);
    }

    ae(AtomicReference atomicReference) {
        this.f53400a = atomicReference;
    }

    @Override // com.google.ar.core.x
    public final void a(ArCoreApk.Availability availability) {
        this.f53400a.set(availability);
    }
}
