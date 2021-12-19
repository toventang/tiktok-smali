package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

public final class oy extends pe {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<Bundle> f51276a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f51277b;

    static {
        Covode.recordClassIndex(32057);
    }

    public final String a(long j2) {
        return (String) a(b(j2), String.class);
    }

    public final Bundle b(long j2) {
        Bundle bundle;
        MethodCollector.i(2954);
        synchronized (this.f51276a) {
            try {
                if (!this.f51277b) {
                    try {
                        this.f51276a.wait(j2);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = this.f51276a.get();
            } finally {
                MethodCollector.o(2954);
            }
        }
        MethodCollector.o(2954);
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.pb
    public final void a(Bundle bundle) {
        MethodCollector.i(2943);
        synchronized (this.f51276a) {
            try {
                this.f51276a.set(bundle);
                this.f51277b = true;
                try {
                    this.f51276a.notify();
                } finally {
                    MethodCollector.o(2943);
                }
            } catch (Throwable th) {
                this.f51276a.notify();
                MethodCollector.o(2943);
                throw th;
            }
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static <T> T a(Bundle bundle, Class<T> cls) {
        Object a2;
        if (bundle == null || (a2 = a(bundle, "r")) == null) {
            return null;
        }
        try {
            return cls.cast(a2);
        } catch (ClassCastException e2) {
            a.a("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{cls.getCanonicalName(), a2.getClass().getCanonicalName()});
            throw e2;
        }
    }
}
