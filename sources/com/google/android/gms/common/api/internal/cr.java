package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
public final class cr implements bk {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ cn f50185a;

    static {
        Covode.recordClassIndex(31290);
    }

    private cr(cn cnVar) {
        this.f50185a = cnVar;
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(Bundle bundle) {
        this.f50185a.f50176g.lock();
        try {
            this.f50185a.f50174e = ConnectionResult.f49941a;
            cn.a(this.f50185a);
        } finally {
            this.f50185a.f50176g.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(ConnectionResult connectionResult) {
        this.f50185a.f50176g.lock();
        try {
            this.f50185a.f50174e = connectionResult;
            cn.a(this.f50185a);
        } finally {
            this.f50185a.f50176g.unlock();
        }
    }

    /* synthetic */ cr(cn cnVar, byte b2) {
        this(cnVar);
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(int i2, boolean z) {
        this.f50185a.f50176g.lock();
        try {
            if (this.f50185a.f50175f) {
                this.f50185a.f50175f = false;
                cn.a(this.f50185a, i2, z);
                return;
            }
            this.f50185a.f50175f = true;
            this.f50185a.f50170a.b(i2);
            this.f50185a.f50176g.unlock();
        } finally {
            this.f50185a.f50176g.unlock();
        }
    }
}
