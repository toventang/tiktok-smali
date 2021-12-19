package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.oz;
import com.google.android.gms.internal.measurement.pb;
import com.google.android.gms.internal.measurement.zzae;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class AppMeasurementDynamiteService extends oz {

    /* renamed from: a  reason: collision with root package name */
    ff f51313a;

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, gi> f51314b = new androidx.c.a();

    static {
        Covode.recordClassIndex(32083);
    }

    private final void a() {
        if (this.f51313a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void initForTests(Map map) {
        a();
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setInstanceIdProvider(c cVar) {
        a();
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void generateEventId(pb pbVar) {
        a();
        this.f51313a.e().a(pbVar, this.f51313a.e().f());
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getAppInstanceId(pb pbVar) {
        a();
        this.f51313a.p().a(new gc(this, pbVar));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getCachedAppInstanceId(pb pbVar) {
        a();
        a(pbVar, this.f51313a.d().x());
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getCurrentScreenClass(pb pbVar) {
        a();
        a(pbVar, this.f51313a.d().A());
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getCurrentScreenName(pb pbVar) {
        a();
        a(pbVar, this.f51313a.d().z());
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getGmpAppId(pb pbVar) {
        a();
        a(pbVar, this.f51313a.d().B());
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void isDataCollectionEnabled(pb pbVar) {
        a();
        this.f51313a.p().a(new jd(this, pbVar));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void resetAnalyticsData(long j2) {
        a();
        gk d2 = this.f51313a.d();
        d2.a((String) null);
        d2.p().a(new gr(d2, j2));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setDataCollectionEnabled(boolean z) {
        a();
        gk d2 = this.f51313a.d();
        d2.D();
        d2.p().a(new ha(d2, z));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        a();
        gk d2 = this.f51313a.d();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        d2.p().a(new gj(d2, bundle2));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setEventInterceptor(com.google.android.gms.internal.measurement.b bVar) {
        a();
        gk d2 = this.f51313a.d();
        b bVar2 = new b(bVar);
        d2.D();
        d2.p().a(new gq(d2, bVar2));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setMinimumSessionDuration(long j2) {
        a();
        gk d2 = this.f51313a.d();
        d2.p().a(new hd(d2, j2));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setSessionTimeoutDuration(long j2) {
        a();
        gk d2 = this.f51313a.d();
        d2.p().a(new go(d2, j2));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.b bVar) {
        a();
        gi giVar = this.f51314b.get(Integer.valueOf(bVar.a()));
        if (giVar == null) {
            giVar = new a(bVar);
            this.f51314b.put(Integer.valueOf(bVar.a()), giVar);
        }
        this.f51313a.d().a(giVar);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.b bVar) {
        a();
        gi remove = this.f51314b.remove(Integer.valueOf(bVar.a()));
        if (remove == null) {
            remove = new a(bVar);
        }
        this.f51313a.d().b(remove);
    }

    class a implements gi {

        /* renamed from: a  reason: collision with root package name */
        private com.google.android.gms.internal.measurement.b f51315a;

        static {
            Covode.recordClassIndex(32084);
        }

        a(com.google.android.gms.internal.measurement.b bVar) {
            this.f51315a = bVar;
        }

        @Override // com.google.android.gms.measurement.internal.gi
        public final void a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.f51315a.a(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f51313a.q().f51471f.a("Event listener threw exception", e2);
            }
        }
    }

    class b implements gf {

        /* renamed from: a  reason: collision with root package name */
        private com.google.android.gms.internal.measurement.b f51317a;

        static {
            Covode.recordClassIndex(32085);
        }

        b(com.google.android.gms.internal.measurement.b bVar) {
            this.f51317a = bVar;
        }

        @Override // com.google.android.gms.measurement.internal.gf
        public final void a(String str, String str2, Bundle bundle, long j2) {
            try {
                this.f51317a.a(str, str2, bundle, j2);
            } catch (RemoteException e2) {
                AppMeasurementDynamiteService.this.f51313a.q().f51471f.a("Event interceptor threw exception", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void beginAdUnitExposure(String str, long j2) {
        a();
        this.f51313a.n().a(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void endAdUnitExposure(String str, long j2) {
        a();
        this.f51313a.n().b(str, j2);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setMeasurementEnabled(boolean z, long j2) {
        a();
        this.f51313a.d().a(z);
    }

    private final void a(pb pbVar, String str) {
        this.f51313a.e().a(pbVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getMaxUserProperties(String str, pb pbVar) {
        a();
        this.f51313a.d();
        r.a(str);
        this.f51313a.e().a(pbVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void onActivityDestroyed(com.google.android.gms.a.a aVar, long j2) {
        a();
        hg hgVar = this.f51313a.d().f51685a;
        if (hgVar != null) {
            this.f51313a.d().w();
            hgVar.onActivityDestroyed((Activity) com.google.android.gms.a.b.a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void onActivityPaused(com.google.android.gms.a.a aVar, long j2) {
        a();
        hg hgVar = this.f51313a.d().f51685a;
        if (hgVar != null) {
            this.f51313a.d().w();
            hgVar.onActivityPaused((Activity) com.google.android.gms.a.b.a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void onActivityResumed(com.google.android.gms.a.a aVar, long j2) {
        a();
        hg hgVar = this.f51313a.d().f51685a;
        if (hgVar != null) {
            this.f51313a.d().w();
            hgVar.onActivityResumed((Activity) com.google.android.gms.a.b.a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void onActivityStarted(com.google.android.gms.a.a aVar, long j2) {
        a();
        hg hgVar = this.f51313a.d().f51685a;
        if (hgVar != null) {
            this.f51313a.d().w();
            hgVar.onActivityStarted((Activity) com.google.android.gms.a.b.a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void onActivityStopped(com.google.android.gms.a.a aVar, long j2) {
        a();
        hg hgVar = this.f51313a.d().f51685a;
        if (hgVar != null) {
            this.f51313a.d().w();
            hgVar.onActivityStopped((Activity) com.google.android.gms.a.b.a(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setConditionalUserProperty(Bundle bundle, long j2) {
        a();
        if (bundle == null) {
            this.f51313a.q().f51468c.a("Conditional user property must not be null");
        } else {
            this.f51313a.d().a(bundle, j2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setUserId(String str, long j2) {
        a();
        this.f51313a.d().a(null, "_id", str, true, j2);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getTestFlag(pb pbVar, int i2) {
        a();
        if (i2 == 0) {
            jz e2 = this.f51313a.e();
            gk d2 = this.f51313a.d();
            AtomicReference atomicReference = new AtomicReference();
            e2.a(pbVar, (String) d2.p().a(atomicReference, 15000, "String test flag value", new gv(d2, atomicReference)));
        } else if (i2 == 1) {
            jz e3 = this.f51313a.e();
            gk d3 = this.f51313a.d();
            AtomicReference atomicReference2 = new AtomicReference();
            e3.a(pbVar, ((Long) d3.p().a(atomicReference2, 15000, "long test flag value", new gw(d3, atomicReference2))).longValue());
        } else if (i2 == 2) {
            jz e4 = this.f51313a.e();
            gk d4 = this.f51313a.d();
            AtomicReference atomicReference3 = new AtomicReference();
            double doubleValue = ((Double) d4.p().a(atomicReference3, 15000, "double test flag value", new gy(d4, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                pbVar.a(bundle);
            } catch (RemoteException e5) {
                e4.z.q().f51471f.a("Error returning double value to wrapper", e5);
            }
        } else if (i2 == 3) {
            jz e6 = this.f51313a.e();
            gk d5 = this.f51313a.d();
            AtomicReference atomicReference4 = new AtomicReference();
            e6.a(pbVar, ((Integer) d5.p().a(atomicReference4, 15000, "int test flag value", new gz(d5, atomicReference4))).intValue());
        } else if (i2 == 4) {
            jz e7 = this.f51313a.e();
            gk d6 = this.f51313a.d();
            AtomicReference atomicReference5 = new AtomicReference();
            e7.a(pbVar, ((Boolean) d6.p().a(atomicReference5, 15000, "boolean test flag value", new gl(d6, atomicReference5))).booleanValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void performAction(Bundle bundle, pb pbVar, long j2) {
        a();
        pbVar.a(null);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a();
        this.f51313a.d().c(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getConditionalUserProperties(String str, String str2, pb pbVar) {
        a();
        this.f51313a.p().a(new kb(this, pbVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void onActivityCreated(com.google.android.gms.a.a aVar, Bundle bundle, long j2) {
        a();
        hg hgVar = this.f51313a.d().f51685a;
        if (hgVar != null) {
            this.f51313a.d().w();
            hgVar.onActivityCreated((Activity) com.google.android.gms.a.b.a(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void initialize(com.google.android.gms.a.a aVar, zzae zzae, long j2) {
        Context context = (Context) com.google.android.gms.a.b.a(aVar);
        ff ffVar = this.f51313a;
        if (ffVar == null) {
            this.f51313a = ff.a(context, zzae, Long.valueOf(j2));
        } else {
            ffVar.q().f51471f.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void onActivitySaveInstanceState(com.google.android.gms.a.a aVar, pb pbVar, long j2) {
        a();
        hg hgVar = this.f51313a.d().f51685a;
        Bundle bundle = new Bundle();
        if (hgVar != null) {
            this.f51313a.d().w();
            hgVar.onActivitySaveInstanceState((Activity) com.google.android.gms.a.b.a(aVar), bundle);
        }
        try {
            pbVar.a(bundle);
        } catch (RemoteException e2) {
            this.f51313a.q().f51471f.a("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void getUserProperties(String str, String str2, boolean z, pb pbVar) {
        a();
        this.f51313a.p().a(new hc(this, pbVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setCurrentScreen(com.google.android.gms.a.a aVar, String str, String str2, long j2) {
        String str3;
        a();
        hq h2 = this.f51313a.h();
        Activity activity = (Activity) com.google.android.gms.a.b.a(aVar);
        if (!h2.s().h().booleanValue()) {
            h2.q().f51473h.a("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (h2.f51783a == null) {
            h2.q().f51473h.a("setCurrentScreen cannot be called while no activity active");
        } else if (h2.f51786d.get(activity) == null) {
            h2.q().f51473h.a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = hq.a(activity.getClass().getCanonicalName());
            }
            boolean c2 = jz.c(h2.f51783a.f51773b, str2);
            boolean c3 = jz.c(h2.f51783a.f51772a, str);
            if (c2 && c3) {
                h2.q().f51473h.a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                h2.q().f51473h.a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                ee eeVar = h2.q().f51476k;
                if (str == null) {
                    str3 = "null";
                } else {
                    str3 = str;
                }
                eeVar.a("Setting current screen to name, class", str3, str2);
                hn hnVar = new hn(str, str2, h2.o().f());
                h2.f51786d.put(activity, hnVar);
                h2.a(activity, hnVar, true);
            } else {
                h2.q().f51473h.a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void setUserProperty(String str, String str2, com.google.android.gms.a.a aVar, boolean z, long j2) {
        a();
        this.f51313a.d().a(str, str2, com.google.android.gms.a.b.a(aVar), z, j2);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void logEventAndBundle(String str, String str2, Bundle bundle, pb pbVar, long j2) {
        Bundle bundle2;
        a();
        r.a(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f51313a.p().a(new ic(this, pbVar, new zzao(str2, new zzan(bundle), "app", j2), str));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void logHealthData(int i2, String str, com.google.android.gms.a.a aVar, com.google.android.gms.a.a aVar2, com.google.android.gms.a.a aVar3) {
        Object a2;
        Object a3;
        a();
        Object obj = null;
        if (aVar == null) {
            a2 = null;
        } else {
            a2 = com.google.android.gms.a.b.a(aVar);
        }
        if (aVar2 == null) {
            a3 = null;
        } else {
            a3 = com.google.android.gms.a.b.a(aVar2);
        }
        if (aVar3 != null) {
            obj = com.google.android.gms.a.b.a(aVar3);
        }
        this.f51313a.q().a(i2, true, false, str, a2, a3, obj);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        a();
        this.f51313a.d().a(str, str2, bundle, z, z2, j2);
    }
}
