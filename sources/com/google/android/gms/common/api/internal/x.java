package com.google.android.gms.common.api.internal;

import androidx.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.ConnectionResult;

public class x extends ch {

    /* renamed from: b  reason: collision with root package name */
    public final b<b<?>> f50281b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    public f f50282c;

    static {
        Covode.recordClassIndex(31327);
    }

    @Override // com.google.android.gms.common.api.internal.ch, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b() {
        super.b();
        g();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c() {
        super.c();
        g();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.ch
    public final void e() {
        this.f50282c.c();
    }

    private final void g() {
        if (!this.f50281b.isEmpty()) {
            this.f50282c.a(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ch, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        MethodCollector.i(12390);
        super.d();
        f fVar = this.f50282c;
        synchronized (f.f50224f) {
            try {
                if (fVar.f50234m == this) {
                    fVar.f50234m = null;
                    fVar.n.clear();
                }
            } finally {
                MethodCollector.o(12390);
            }
        }
    }

    public x(j jVar) {
        super(jVar);
        this.f50018a.a("ConnectionlessLifecycleHelper", this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.ch
    public final void a(ConnectionResult connectionResult, int i2) {
        this.f50282c.b(connectionResult, i2);
    }
}
