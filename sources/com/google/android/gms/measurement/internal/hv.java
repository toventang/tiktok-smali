package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.pb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class hv extends fb {

    /* renamed from: a  reason: collision with root package name */
    final iq f51806a;

    /* renamed from: b  reason: collision with root package name */
    dt f51807b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Boolean f51808c;

    /* renamed from: d  reason: collision with root package name */
    private final h f51809d;

    /* renamed from: e  reason: collision with root package name */
    private final jl f51810e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Runnable> f51811f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final h f51812g;

    static {
        Covode.recordClassIndex(32297);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fb
    public final boolean u() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.cb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* access modifiers changed from: package-private */
    public final void a(dt dtVar, AbstractSafeParcelable abstractSafeParcelable, zzn zzn) {
        int i2;
        c();
        D();
        int i3 = 0;
        do {
            ArrayList arrayList = new ArrayList();
            List<AbstractSafeParcelable> x = i().x();
            if (x != null) {
                arrayList.addAll(x);
                i2 = x.size();
            } else {
                i2 = 0;
            }
            if (abstractSafeParcelable != null && i2 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzao) {
                    try {
                        dtVar.a((zzao) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e2) {
                        q().f51468c.a("Failed to send event to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkr) {
                    try {
                        dtVar.a((zzkr) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e3) {
                        q().f51468c.a("Failed to send user property to the service", e3);
                    }
                } else if (abstractSafeParcelable2 instanceof zzw) {
                    try {
                        dtVar.a((zzw) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e4) {
                        q().f51468c.a("Failed to send conditional user property to the service", e4);
                    }
                } else {
                    q().f51468c.a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            if (i3 >= 1001) {
                return;
            }
        } while (i2 == 100);
    }

    /* access modifiers changed from: protected */
    public final void a(zzao zzao, String str) {
        boolean a2;
        r.a(zzao);
        c();
        D();
        dx i2 = i();
        Parcel obtain = Parcel.obtain();
        zzao.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i2.q().f51469d.a("Event is too long for local database. Sending event directly to service");
            a2 = false;
        } else {
            a2 = i2.a(0, marshall);
        }
        a(new ik(this, a2, zzao, a(true), str));
    }

    /* access modifiers changed from: protected */
    public final void a(zzw zzw) {
        boolean a2;
        r.a(zzw);
        c();
        D();
        t();
        dx i2 = i();
        i2.o();
        byte[] a3 = jz.a((Parcelable) zzw);
        if (a3.length > 131072) {
            i2.q().f51469d.a("Conditional user property too long for local database. Sending directly to service");
            a2 = false;
        } else {
            a2 = i2.a(2, a3);
        }
        a(new ij(this, a2, new zzw(zzw), a(true), zzw));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<zzw>> atomicReference, String str, String str2, String str3) {
        c();
        D();
        a(new im(this, atomicReference, str, str2, str3, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(pb pbVar, String str, String str2) {
        c();
        D();
        a(new il(this, str, str2, a(false), pbVar));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<zzkr>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        D();
        a(new io(this, atomicReference, str, str2, str3, z, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(pb pbVar, String str, String str2, boolean z) {
        c();
        D();
        a(new in(this, str, str2, z, a(false), pbVar));
    }

    /* access modifiers changed from: protected */
    public final void a(zzkr zzkr) {
        c();
        D();
        dx i2 = i();
        Parcel obtain = Parcel.obtain();
        boolean z = false;
        zzkr.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i2.q().f51469d.a("User property too long for local database. Sending directly to service");
        } else {
            z = i2.a(1, marshall);
        }
        a(new hx(this, z, zzkr, a(true)));
    }

    public final void a(AtomicReference<String> atomicReference) {
        c();
        D();
        a(new ib(this, atomicReference, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(hn hnVar) {
        c();
        D();
        a(new id(this, hnVar));
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ a d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ gk e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ du f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ hv g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ hq h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ dx i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.cb
    public final /* bridge */ /* synthetic */ iz j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    public final boolean w() {
        c();
        D();
        if (this.f51807b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void A() {
        c();
        this.f51810e.a();
        this.f51809d.a(p.J.a(null).longValue());
    }

    /* access modifiers changed from: package-private */
    public final boolean I() {
        c();
        D();
        if (J() && o().i() < 200900) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void x() {
        c();
        D();
        a(new ih(this, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void y() {
        c();
        D();
        zzn a2 = a(false);
        i().w();
        a(new hz(this, a2));
    }

    /* access modifiers changed from: protected */
    public final void z() {
        c();
        D();
        zzn a2 = a(true);
        i().a(3, new byte[0]);
        a(new ie(this, a2));
    }

    public final void G() {
        c();
        D();
        iq iqVar = this.f51806a;
        if (iqVar.f51884b != null && (iqVar.f51884b.g() || iqVar.f51884b.h())) {
            iqVar.f51884b.f();
        }
        iqVar.f51884b = null;
        try {
            a.a();
            m().unbindService(this.f51806a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f51807b = null;
    }

    /* access modifiers changed from: package-private */
    public final void H() {
        c();
        q().f51476k.a("Processing queued up service tasks", Integer.valueOf(this.f51811f.size()));
        for (Runnable runnable : this.f51811f) {
            try {
                runnable.run();
            } catch (Exception e2) {
                q().f51468c.a("Task exception while flushing queue", e2);
            }
        }
        this.f51811f.clear();
        this.f51812g.c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (0 == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r1 != false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean J() {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.hv.J():boolean");
    }

    /* access modifiers changed from: package-private */
    public final void B() {
        MethodCollector.i(7031);
        c();
        D();
        if (w()) {
            MethodCollector.o(7031);
        } else if (J()) {
            iq iqVar = this.f51806a;
            iqVar.f51885c.c();
            Context m2 = iqVar.f51885c.m();
            synchronized (iqVar) {
                try {
                    if (iqVar.f51883a) {
                        iqVar.f51885c.q().f51476k.a("Connection attempt already in progress");
                    } else if (iqVar.f51884b == null || (!iqVar.f51884b.h() && !iqVar.f51884b.g())) {
                        iqVar.f51884b = new dy(m2, Looper.getMainLooper(), iqVar, iqVar);
                        iqVar.f51885c.q().f51476k.a("Connecting to remote service");
                        iqVar.f51883a = true;
                        iqVar.f51884b.m();
                        MethodCollector.o(7031);
                    } else {
                        iqVar.f51885c.q().f51476k.a("Already awaiting connection attempt");
                        MethodCollector.o(7031);
                    }
                } finally {
                    MethodCollector.o(7031);
                }
            }
        } else {
            if (!s().v()) {
                t();
                List<ResolveInfo> queryIntentServices = m().getPackageManager().queryIntentServices(new Intent().setClassName(m(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    q().f51468c.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                } else {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context m3 = m();
                    t();
                    intent.setComponent(new ComponentName(m3, "com.google.android.gms.measurement.AppMeasurementService"));
                    iq iqVar2 = this.f51806a;
                    iqVar2.f51885c.c();
                    Context m4 = iqVar2.f51885c.m();
                    a.a();
                    synchronized (iqVar2) {
                        try {
                            if (iqVar2.f51883a) {
                                iqVar2.f51885c.q().f51476k.a("Connection attempt already in progress");
                                return;
                            }
                            iqVar2.f51885c.q().f51476k.a("Using local app measurement service");
                            iqVar2.f51883a = true;
                            a.b(m4, intent, iqVar2.f51885c.f51806a, 129);
                            MethodCollector.o(7031);
                            return;
                        } finally {
                            MethodCollector.o(7031);
                        }
                    }
                }
            }
            MethodCollector.o(7031);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(dt dtVar) {
        c();
        r.a(dtVar);
        this.f51807b = dtVar;
        A();
        H();
    }

    private final zzn a(boolean z) {
        String str;
        t();
        du f2 = f();
        if (z) {
            str = q().e();
        } else {
            str = null;
        }
        return f2.a(str);
    }

    protected hv(ff ffVar) {
        super(ffVar);
        this.f51810e = new jl(ffVar.l());
        this.f51806a = new iq(this);
        this.f51809d = new hy(this, ffVar);
        this.f51812g = new ii(this, ffVar);
    }

    static /* synthetic */ void a(hv hvVar) {
        hvVar.c();
        if (hvVar.w()) {
            hvVar.q().f51476k.a("Inactivity, disconnecting from the service");
            hvVar.G();
        }
    }

    private final void a(Runnable runnable) {
        c();
        if (w()) {
            runnable.run();
        } else if (((long) this.f51811f.size()) >= 1000) {
            q().f51468c.a("Discarding data. Max runnable queue size reached");
        } else {
            this.f51811f.add(runnable);
            this.f51812g.a(60000);
            B();
        }
    }

    public final void a(Bundle bundle) {
        c();
        D();
        a(new ig(this, bundle, a(false)));
    }

    public final void a(pb pbVar) {
        c();
        D();
        a(new ia(this, a(false), pbVar));
    }

    static /* synthetic */ void a(hv hvVar, ComponentName componentName) {
        hvVar.c();
        if (hvVar.f51807b != null) {
            hvVar.f51807b = null;
            hvVar.q().f51476k.a("Disconnected from device MeasurementService", componentName);
            hvVar.c();
            hvVar.B();
        }
    }

    public final void a(pb pbVar, zzao zzao, String str) {
        c();
        D();
        if (o().j() != 0) {
            q().f51471f.a("Not bundling data. Service unavailable or out of date");
            o().a(pbVar, new byte[0]);
            return;
        }
        a(new Cif(this, zzao, str, pbVar));
    }
}
