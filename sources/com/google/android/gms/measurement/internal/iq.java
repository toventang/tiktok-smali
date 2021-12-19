package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.stats.a;

public final class iq implements ServiceConnection, c.a, c.b {

    /* renamed from: a  reason: collision with root package name */
    volatile boolean f51883a;

    /* renamed from: b  reason: collision with root package name */
    volatile dy f51884b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ hv f51885c;

    static {
        Covode.recordClassIndex(32319);
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void a() {
        MethodCollector.i(7111);
        r.b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f51885c.p().a(new ir(this, (dt) this.f51884b.q()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f51884b = null;
                this.f51883a = false;
            } catch (Throwable th) {
                MethodCollector.o(7111);
                throw th;
            }
        }
        MethodCollector.o(7111);
    }

    protected iq(hv hvVar) {
        this.f51885c = hvVar;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        r.b("MeasurementServiceConnection.onServiceDisconnected");
        this.f51885c.q().f51475j.a("Service disconnected");
        this.f51885c.p().a(new is(this, componentName));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void a(int i2) {
        r.b("MeasurementServiceConnection.onConnectionSuspended");
        this.f51885c.q().f51475j.a("Service connection suspended");
        this.f51885c.p().a(new iu(this));
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(ConnectionResult connectionResult) {
        eb ebVar;
        MethodCollector.i(7122);
        r.b("MeasurementServiceConnection.onConnectionFailed");
        ff ffVar = this.f51885c.z;
        if (!(ffVar.f51601f == null || !ffVar.f51601f.w() || (ebVar = ffVar.f51601f) == null)) {
            ebVar.f51471f.a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            try {
                this.f51883a = false;
                this.f51884b = null;
            } catch (Throwable th) {
                MethodCollector.o(7122);
                throw th;
            }
        }
        this.f51885c.p().a(new it(this));
        MethodCollector.o(7122);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dt dvVar;
        MethodCollector.i(7061);
        r.b("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                try {
                    this.f51883a = false;
                    this.f51885c.q().f51468c.a("Service connected with null binder");
                } finally {
                    MethodCollector.o(7061);
                }
            } else {
                dt dtVar = null;
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof dt) {
                            dvVar = (dt) queryLocalInterface;
                        } else {
                            dvVar = new dv(iBinder);
                        }
                        dtVar = dvVar;
                        this.f51885c.q().f51476k.a("Bound to IMeasurementService interface");
                        if (dtVar != null) {
                            this.f51885c.p().a(new ip(this, dtVar));
                            MethodCollector.o(7061);
                        }
                        this.f51883a = false;
                        try {
                            a.a();
                            this.f51885c.m().unbindService(this.f51885c.f51806a);
                        } catch (IllegalArgumentException unused) {
                        }
                        MethodCollector.o(7061);
                    }
                    this.f51885c.q().f51468c.a("Got binder with a wrong descriptor", interfaceDescriptor);
                    this.f51883a = false;
                    a.a();
                    this.f51885c.m().unbindService(this.f51885c.f51806a);
                    MethodCollector.o(7061);
                } catch (RemoteException unused2) {
                    this.f51885c.q().f51468c.a("Service connect failed to get IMeasurementService");
                }
            }
        }
    }
}
