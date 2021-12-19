package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.internal.l;

final class bg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ConnectionResult f50095a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f.b f50096b;

    static {
        Covode.recordClassIndex(31250);
    }

    public final void run() {
        f.a<?> aVar = f.this.f50233l.get(this.f50096b.f50249b);
        if (aVar != null) {
            if (this.f50095a.b()) {
                this.f50096b.f50250c = true;
                if (this.f50096b.f50248a.i()) {
                    this.f50096b.a();
                    return;
                }
                try {
                    this.f50096b.f50248a.a((l) null, this.f50096b.f50248a.l());
                } catch (SecurityException unused) {
                    aVar.a(new ConnectionResult(10));
                }
            } else {
                aVar.a(this.f50095a);
            }
        }
    }

    bg(f.b bVar, ConnectionResult connectionResult) {
        this.f50096b = bVar;
        this.f50095a = connectionResult;
    }
}
