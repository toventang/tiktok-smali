package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.a.a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.p;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class e extends a<Void> implements p {

    /* renamed from: f  reason: collision with root package name */
    private Semaphore f49862f = new Semaphore(0);

    /* renamed from: g  reason: collision with root package name */
    private Set<i> f49863g;

    static {
        Covode.recordClassIndex(31119);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void f() {
        this.f49862f.release();
    }

    @Override // androidx.loader.a.c
    public final void g() {
        this.f49862f.drainPermits();
        l();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Void d() {
        int i2 = 0;
        for (i iVar : this.f49863g) {
            if (iVar.a(this)) {
                i2++;
            }
        }
        try {
            this.f49862f.tryAcquire(i2, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public e(Context context, Set<i> set) {
        super(context);
        this.f49863g = set;
    }
}
