package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.i;

final class al implements i.b, i.c {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ae f50047a;

    static {
        Covode.recordClassIndex(31228);
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void b(int i2) {
    }

    private al(ae aeVar) {
        this.f50047a = aeVar;
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
        this.f50047a.f50024b.lock();
        try {
            if (this.f50047a.a(connectionResult)) {
                this.f50047a.f();
                this.f50047a.e();
            } else {
                this.f50047a.b(connectionResult);
            }
        } finally {
            this.f50047a.f50024b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void a(Bundle bundle) {
        if (this.f50047a.f50033k.f50391j) {
            this.f50047a.f50024b.lock();
            try {
                if (this.f50047a.f50027e != null) {
                    this.f50047a.f50027e.a(new aj(this.f50047a));
                    this.f50047a.f50024b.unlock();
                }
            } finally {
                this.f50047a.f50024b.unlock();
            }
        } else {
            this.f50047a.f50027e.a(new aj(this.f50047a));
        }
    }

    /* synthetic */ al(ae aeVar, byte b2) {
        this(aeVar);
    }
}
