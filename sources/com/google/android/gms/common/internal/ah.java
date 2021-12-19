package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.stats.a;
import java.util.HashMap;
import java.util.Map;

final class ah implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final Map<ServiceConnection, ServiceConnection> f50338a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f50339b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f50340c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f50341d;

    /* renamed from: e  reason: collision with root package name */
    final i.a f50342e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f50343f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ag f50344g;

    static {
        Covode.recordClassIndex(31372);
    }

    public final boolean b() {
        return this.f50338a.isEmpty();
    }

    public final void a() {
        this.f50339b = 3;
        boolean a2 = a.a(this.f50344g.f50333b, this.f50342e.a(this.f50344g.f50333b), this, this.f50342e.f50419c);
        this.f50340c = a2;
        if (a2) {
            this.f50344g.f50334c.sendMessageDelayed(this.f50344g.f50334c.obtainMessage(1, this.f50342e), this.f50344g.f50336e);
            return;
        }
        this.f50339b = 2;
        try {
            this.f50344g.f50333b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.f50338a.containsKey(serviceConnection);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        MethodCollector.i(10480);
        synchronized (this.f50344g.f50332a) {
            try {
                this.f50344g.f50334c.removeMessages(1, this.f50342e);
                this.f50341d = null;
                this.f50343f = componentName;
                for (ServiceConnection serviceConnection : this.f50338a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f50339b = 2;
            } finally {
                MethodCollector.o(10480);
            }
        }
    }

    public final void a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.f50342e.a(this.f50344g.f50333b);
        this.f50338a.put(serviceConnection, serviceConnection2);
    }

    public ah(ag agVar, i.a aVar) {
        this.f50344g = agVar;
        this.f50342e = aVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MethodCollector.i(10478);
        synchronized (this.f50344g.f50332a) {
            try {
                this.f50344g.f50334c.removeMessages(1, this.f50342e);
                this.f50341d = iBinder;
                this.f50343f = componentName;
                for (ServiceConnection serviceConnection : this.f50338a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f50339b = 1;
            } finally {
                MethodCollector.o(10478);
            }
        }
    }
}
