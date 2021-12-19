package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class ag implements c.AbstractC1210c {

    /* renamed from: a  reason: collision with root package name */
    final boolean f50038a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<ae> f50039b;

    /* renamed from: c  reason: collision with root package name */
    private final a<?> f50040c;

    static {
        Covode.recordClassIndex(31223);
    }

    @Override // com.google.android.gms.common.internal.c.AbstractC1210c
    public final void a(ConnectionResult connectionResult) {
        boolean z;
        ae aeVar = this.f50039b.get();
        if (aeVar != null) {
            if (Looper.myLooper() == aeVar.f50023a.f50080m.c()) {
                z = true;
            } else {
                z = false;
            }
            r.a(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            aeVar.f50024b.lock();
            try {
                if (aeVar.b(0)) {
                    if (!connectionResult.b()) {
                        aeVar.b(connectionResult, this.f50040c, this.f50038a);
                    }
                    if (aeVar.d()) {
                        aeVar.e();
                    }
                    aeVar.f50024b.unlock();
                }
            } finally {
                aeVar.f50024b.unlock();
            }
        }
    }

    public ag(ae aeVar, a<?> aVar, boolean z) {
        this.f50039b = new WeakReference<>(aeVar);
        this.f50040c = aVar;
        this.f50038a = z;
    }
}
