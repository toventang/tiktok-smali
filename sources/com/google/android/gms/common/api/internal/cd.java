package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.c;
import com.google.android.gms.c.i;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;

public final class cd<ResultT> extends as {

    /* renamed from: a  reason: collision with root package name */
    private final s<a.b, ResultT> f50143a;

    /* renamed from: b  reason: collision with root package name */
    private final i<ResultT> f50144b;

    /* renamed from: c  reason: collision with root package name */
    private final q f50145c;

    static {
        Covode.recordClassIndex(31275);
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void a(RuntimeException runtimeException) {
        this.f50144b.b(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.as
    public final boolean b(f.a<?> aVar) {
        return this.f50143a.f50271b;
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void a(Status status) {
        this.f50144b.b(this.f50145c.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void c(f.a<?> aVar) {
        try {
            this.f50143a.a(aVar.f50235a, this.f50144b);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a(bn.a(e3));
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.as
    public final Feature[] a(f.a<?> aVar) {
        return this.f50143a.f50270a;
    }

    @Override // com.google.android.gms.common.api.internal.bn
    public final void a(cv cvVar, boolean z) {
        i<ResultT> iVar = this.f50144b;
        cvVar.f50205b.put(iVar, Boolean.valueOf(z));
        iVar.f49902a.a((c) new v(cvVar, iVar));
    }

    public cd(int i2, s<a.b, ResultT> sVar, i<ResultT> iVar, q qVar) {
        super(i2);
        this.f50144b = iVar;
        this.f50143a = sVar;
        this.f50145c = qVar;
    }
}
