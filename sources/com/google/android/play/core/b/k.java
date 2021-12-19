package com.google.android.play.core.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;

final class k implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f53154a;

    static {
        Covode.recordClassIndex(32850);
    }

    /* synthetic */ k(l lVar) {
        this.f53154a = lVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f53154a.f53157b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f53154a.b(new i(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f53154a.f53157b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f53154a.b(new j(this));
    }
}
