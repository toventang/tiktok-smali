package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.internal.e.g;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class ag extends i implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final HashMap<i.a, ah> f50332a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    final Context f50333b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f50334c;

    /* renamed from: d  reason: collision with root package name */
    final a f50335d;

    /* renamed from: e  reason: collision with root package name */
    final long f50336e;

    /* renamed from: f  reason: collision with root package name */
    private final long f50337f;

    static {
        Covode.recordClassIndex(31371);
    }

    public final boolean handleMessage(Message message) {
        return a(this, message);
    }

    ag(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f50333b = applicationContext;
        this.f50334c = new g(context.getMainLooper(), this);
        this.f50335d = a.a();
        this.f50337f = 5000;
        this.f50336e = 300000;
    }

    private boolean a(Message message) {
        MethodCollector.i(12724);
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.f50332a) {
                try {
                    i.a aVar = (i.a) message.obj;
                    ah ahVar = this.f50332a.get(aVar);
                    if (ahVar != null && ahVar.b()) {
                        if (ahVar.f50340c) {
                            ahVar.f50344g.f50334c.removeMessages(1, ahVar.f50342e);
                            ahVar.f50344g.f50333b.unbindService(ahVar);
                            ahVar.f50340c = false;
                            ahVar.f50339b = 2;
                        }
                        this.f50332a.remove(aVar);
                    }
                } finally {
                    MethodCollector.o(12724);
                }
            }
            return true;
        } else if (i2 != 1) {
            MethodCollector.o(12724);
            return false;
        } else {
            synchronized (this.f50332a) {
                try {
                    i.a aVar2 = (i.a) message.obj;
                    ah ahVar2 = this.f50332a.get(aVar2);
                    if (ahVar2 != null && ahVar2.f50339b == 3) {
                        String.valueOf(String.valueOf(aVar2)).length();
                        new Exception();
                        ComponentName componentName = ahVar2.f50343f;
                        if (componentName == null && (componentName = aVar2.f50418b) == null) {
                            componentName = new ComponentName(aVar2.f50417a, "unknown");
                        }
                        ahVar2.onServiceDisconnected(componentName);
                    }
                } finally {
                    MethodCollector.o(12724);
                }
            }
            return true;
        }
    }

    private static boolean a(ag agVar, Message message) {
        try {
            return agVar.a(message);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.i
    public final void b(i.a aVar, ServiceConnection serviceConnection) {
        MethodCollector.i(12602);
        r.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f50332a) {
            try {
                ah ahVar = this.f50332a.get(aVar);
                if (ahVar == null) {
                    String valueOf = String.valueOf(aVar);
                    IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
                    MethodCollector.o(12602);
                    throw illegalStateException;
                } else if (ahVar.a(serviceConnection)) {
                    ahVar.f50338a.remove(serviceConnection);
                    if (ahVar.b()) {
                        this.f50334c.sendMessageDelayed(this.f50334c.obtainMessage(0, aVar), this.f50337f);
                    }
                } else {
                    String valueOf2 = String.valueOf(aVar);
                    IllegalStateException illegalStateException2 = new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf2).toString());
                    MethodCollector.o(12602);
                    throw illegalStateException2;
                }
            } finally {
                MethodCollector.o(12602);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.i
    public final boolean a(i.a aVar, ServiceConnection serviceConnection) {
        boolean z;
        MethodCollector.i(12493);
        r.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f50332a) {
            try {
                ah ahVar = this.f50332a.get(aVar);
                if (ahVar == null) {
                    ahVar = new ah(this, aVar);
                    ahVar.a(serviceConnection, serviceConnection);
                    ahVar.a();
                    this.f50332a.put(aVar, ahVar);
                } else {
                    this.f50334c.removeMessages(0, aVar);
                    if (!ahVar.a(serviceConnection)) {
                        ahVar.a(serviceConnection, serviceConnection);
                        int i2 = ahVar.f50339b;
                        if (i2 == 1) {
                            serviceConnection.onServiceConnected(ahVar.f50343f, ahVar.f50341d);
                        } else if (i2 == 2) {
                            ahVar.a();
                        }
                    } else {
                        String valueOf = String.valueOf(aVar);
                        IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
                        MethodCollector.o(12493);
                        throw illegalStateException;
                    }
                }
                z = ahVar.f50340c;
            } finally {
                MethodCollector.o(12493);
            }
        }
        return z;
    }
}
