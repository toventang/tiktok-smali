package com.google.ar.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;

final class al implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak f53423a;

    static {
        Covode.recordClassIndex(33062);
    }

    al(ak akVar) {
        this.f53423a = akVar;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f53423a.b();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f53423a.a(iBinder);
    }
}
