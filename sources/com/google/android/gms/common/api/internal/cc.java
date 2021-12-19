package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.f;

abstract class cc<T> extends as {

    /* renamed from: a  reason: collision with root package name */
    protected final i<T> f50142a;

    static {
        Covode.recordClassIndex(31274);
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public void a(cv cvVar, boolean z) {
    }

    /* access modifiers changed from: protected */
    public abstract void d(f.a<?> aVar);

    public cc(i<T> iVar) {
        super(4);
        this.f50142a = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public void a(RuntimeException runtimeException) {
        this.f50142a.b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public void a(Status status) {
        this.f50142a.b(new e(status));
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void c(f.a<?> aVar) {
        try {
            d(aVar);
        } catch (DeadObjectException e2) {
            a(bn.a(e2));
            throw e2;
        } catch (RemoteException e3) {
            a(bn.a(e3));
        } catch (RuntimeException e4) {
            a(e4);
        }
    }
}
