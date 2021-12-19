package com.google.ar.core;

import android.content.Context;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.ar.core.ArCoreApk;

/* access modifiers changed from: package-private */
public final class an implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f53425a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ x f53426b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ak f53427c;

    static {
        Covode.recordClassIndex(33064);
    }

    an(ak akVar, Context context, x xVar) {
        this.f53427c = akVar;
        this.f53425a = context;
        this.f53426b = xVar;
    }

    public final void run() {
        try {
            this.f53427c.f53414a.a(this.f53425a.getApplicationInfo().packageName, ak.c(), new am(this));
        } catch (RemoteException unused) {
            this.f53426b.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
