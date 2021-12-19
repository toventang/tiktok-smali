package com.google.android.gms.common.api.internal;

import android.os.Build;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.f;

public abstract class bn {

    /* renamed from: a  reason: collision with root package name */
    private final int f50103a;

    static {
        Covode.recordClassIndex(31257);
    }

    public abstract void a(Status status);

    public abstract void a(cv cvVar, boolean z);

    public abstract void a(RuntimeException runtimeException);

    public abstract void c(f.a<?> aVar);

    public bn(int i2) {
        this.f50103a = i2;
    }

    static /* synthetic */ Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        int i2 = Build.VERSION.SDK_INT;
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }
}
