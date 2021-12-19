package com.google.ar.core;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.a.b.a.a.a.c;
import com.google.ar.core.ArCoreApk;

final class am extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ an f53424a;

    static {
        Covode.recordClassIndex(33063);
    }

    @Override // com.google.a.b.a.a.a.d
    public final void a(Bundle bundle) {
    }

    am(an anVar) {
        this.f53424a = anVar;
    }

    @Override // com.google.a.b.a.a.a.d
    public final void b(Bundle bundle) {
        int i2 = bundle.getInt("error.code", -100);
        if (i2 == -5) {
            this.f53424a.f53426b.a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
        } else if (i2 == -3) {
            this.f53424a.f53426b.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else if (i2 != 0) {
            this.f53424a.f53426b.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else {
            this.f53424a.f53426b.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
        }
    }
}
