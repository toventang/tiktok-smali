package com.google.firebase.analytics;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.ad;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.oy;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

final class a implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAnalytics f54266a;

    static {
        Covode.recordClassIndex(33691);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        String zza = FirebaseAnalytics.zza(this.f54266a);
        if (zza != null) {
            return zza;
        }
        f zzb = FirebaseAnalytics.zzb(this.f54266a);
        oy oyVar = new oy();
        zzb.a(new ad(zzb, oyVar));
        String a2 = oyVar.a(120000);
        if (a2 != null) {
            FirebaseAnalytics.zza(this.f54266a, a2);
            return a2;
        }
        throw new TimeoutException();
    }

    a(FirebaseAnalytics firebaseAnalytics) {
        this.f54266a = firebaseAnalytics;
    }
}
