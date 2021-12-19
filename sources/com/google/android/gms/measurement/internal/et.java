package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.internal.measurement.bv;
import com.google.android.gms.internal.measurement.lq;

final class et implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ bv f51558a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f51559b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ eu f51560c;

    static {
        Covode.recordClassIndex(32214);
    }

    public final void run() {
        String str;
        er erVar = this.f51560c.f51562b;
        String str2 = this.f51560c.f51561a;
        bv bvVar = this.f51558a;
        ServiceConnection serviceConnection = this.f51559b;
        Bundle a2 = erVar.a(str2, bvVar);
        erVar.f51552a.p().c();
        if (a2 != null) {
            long j2 = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j2 == 0) {
                erVar.f51552a.q().f51471f.a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    erVar.f51552a.q().f51468c.a("No referrer defined in Install Referrer response");
                } else {
                    erVar.f51552a.q().f51476k.a("InstallReferrer API result", string);
                    jz e2 = erVar.f51552a.e();
                    String valueOf = String.valueOf(string);
                    if (valueOf.length() != 0) {
                        str = "?".concat(valueOf);
                    } else {
                        str = new String("?");
                    }
                    Bundle a3 = e2.a(Uri.parse(str));
                    if (a3 == null) {
                        erVar.f51552a.q().f51468c.a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j3 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j3 == 0) {
                                erVar.f51552a.q().f51468c.a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a3.putLong("click_timestamp", j3);
                            }
                        }
                        if (j2 == erVar.f51552a.b().f51528j.a()) {
                            erVar.f51552a.t();
                            erVar.f51552a.q().f51476k.a("Install Referrer campaign has already been logged");
                        } else {
                            lq.b();
                            if (!erVar.f51552a.f51600e.d(null, p.aB) || erVar.f51552a.r()) {
                                erVar.f51552a.b().f51528j.a(j2);
                                erVar.f51552a.t();
                                erVar.f51552a.q().f51476k.a("Logging Install Referrer campaign from sdk with ", "referrer API");
                                a3.putString("_cis", "referrer API");
                                erVar.f51552a.d().a("auto", "_cmp", a3);
                            }
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            a.a();
            erVar.f51552a.m().unbindService(serviceConnection);
        }
    }

    et(eu euVar, bv bvVar, ServiceConnection serviceConnection) {
        this.f51560c = euVar;
        this.f51558a = bvVar;
        this.f51559b = serviceConnection;
    }
}
