package com.google.ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f53436a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ai f53437b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ak f53438c;

    static {
        Covode.recordClassIndex(33072);
    }

    e(ak akVar, Activity activity, ai aiVar) {
        this.f53438c = akVar;
        this.f53436a = activity;
        this.f53437b = aiVar;
    }

    public final void run() {
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f53438c.f53414a.a(this.f53436a.getApplicationInfo().packageName, Collections.singletonList(ak.c()), new Bundle(), new c(this, atomicBoolean));
            new Handler().postDelayed(new d(this, atomicBoolean), 3000);
        } catch (RemoteException unused) {
            ak.a(this.f53436a, this.f53437b);
        }
    }
}
