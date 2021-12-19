package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.h;
import com.google.android.gms.c.k;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.g;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.measurement.internal.hi;
import com.google.firebase.b;
import com.google.firebase.installations.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    private final f zzb;
    private String zzc;
    private long zzd;
    private final Object zze = new Object();
    private ExecutorService zzf;

    static {
        Covode.recordClassIndex(33690);
    }

    public final void resetAnalyticsData() {
        zza((String) null);
        f fVar = this.zzb;
        fVar.a(new n(fVar));
    }

    private final ExecutorService zza() {
        ExecutorService executorService;
        MethodCollector.i(141);
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.zzf == null) {
                    this.zzf = new b(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.zzf;
            } finally {
                MethodCollector.o(141);
            }
        }
        return executorService;
    }

    /* access modifiers changed from: public */
    private final String zzb() {
        MethodCollector.i(147);
        synchronized (this.zze) {
            try {
                if (Math.abs(g.f50507a.b() - this.zzd) < 1000) {
                    return this.zzc;
                }
                MethodCollector.o(147);
                return null;
            } finally {
                MethodCollector.o(147);
            }
        }
    }

    public final h<String> getAppInstanceId() {
        try {
            String zzb2 = zzb();
            if (zzb2 != null) {
                return k.a(zzb2);
            }
            return k.a(zza(), new a(this));
        } catch (Exception e2) {
            this.zzb.a("Failed to schedule task for getAppInstanceId", (Object) null);
            return k.a(e2);
        }
    }

    public final String getFirebaseInstanceId() {
        boolean z;
        try {
            b d2 = b.d();
            if (d2 != null) {
                z = true;
            } else {
                z = false;
            }
            r.b(z, "Null is not a valid value of FirebaseApp.");
            return (String) k.a(((c) d2.a(com.google.firebase.installations.h.class)).a(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e3) {
            throw new IllegalStateException(e3);
        }
    }

    private FirebaseAnalytics(f fVar) {
        r.a(fVar);
        this.zzb = fVar;
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        f fVar = this.zzb;
        fVar.a(new o(fVar, z));
    }

    public final void setMinimumSessionDuration(long j2) {
        f fVar = this.zzb;
        fVar.a(new q(fVar, j2));
    }

    public final void setSessionTimeoutDuration(long j2) {
        f fVar = this.zzb;
        fVar.a(new p(fVar, j2));
    }

    public final void setUserId(String str) {
        f fVar = this.zzb;
        fVar.a(new m(fVar, str));
    }

    /* access modifiers changed from: public */
    private final void zza(String str) {
        MethodCollector.i(146);
        synchronized (this.zze) {
            try {
                this.zzc = str;
                this.zzd = g.f50507a.b();
            } finally {
                MethodCollector.o(146);
            }
        }
    }

    public static FirebaseAnalytics getInstance(Context context) {
        MethodCollector.i(137);
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (zza == null) {
                        zza = new FirebaseAnalytics(f.a(context, (Bundle) null));
                    }
                } catch (Throwable th) {
                    MethodCollector.o(137);
                    throw th;
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        MethodCollector.o(137);
        return firebaseAnalytics;
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzb.a((String) null, str, bundle, false);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzb.a((String) null, str, (Object) str2, false);
    }

    public static hi getScionFrontendApiImplementation(Context context, Bundle bundle) {
        f a2 = f.a(context, bundle);
        if (a2 == null) {
            return null;
        }
        return new c(a2);
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        f fVar = this.zzb;
        fVar.a(new l(fVar, activity, str, str2));
    }
}
