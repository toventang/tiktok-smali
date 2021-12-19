package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;

/* access modifiers changed from: package-private */
public final class cp implements bk {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ cn f50183a;

    static {
        Covode.recordClassIndex(31288);
    }

    private cp(cn cnVar) {
        this.f50183a = cnVar;
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(Bundle bundle) {
        this.f50183a.f50176g.lock();
        try {
            cn cnVar = this.f50183a;
            if (cnVar.f50172c == null) {
                cnVar.f50172c = bundle;
            } else if (bundle != null) {
                cnVar.f50172c.putAll(bundle);
            }
            this.f50183a.f50173d = ConnectionResult.f49941a;
            cn.a(this.f50183a);
        } finally {
            this.f50183a.f50176g.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(ConnectionResult connectionResult) {
        this.f50183a.f50176g.lock();
        try {
            this.f50183a.f50173d = connectionResult;
            cn.a(this.f50183a);
        } finally {
            this.f50183a.f50176g.unlock();
        }
    }

    /* synthetic */ cp(cn cnVar, byte b2) {
        this(cnVar);
    }

    @Override // com.google.android.gms.common.api.internal.bk
    public final void a(int i2, boolean z) {
        this.f50183a.f50176g.lock();
        try {
            if (this.f50183a.f50175f || this.f50183a.f50174e == null || !this.f50183a.f50174e.b()) {
                this.f50183a.f50175f = false;
                cn.a(this.f50183a, i2, z);
                return;
            }
            this.f50183a.f50175f = true;
            this.f50183a.f50171b.b(i2);
            this.f50183a.f50176g.unlock();
        } finally {
            this.f50183a.f50176g.unlock();
        }
    }
}
