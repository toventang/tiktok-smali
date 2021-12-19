package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.c.b;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.internal.measurement.bv;
import java.util.List;

public final class er {

    /* renamed from: a  reason: collision with root package name */
    final ff f51552a;

    static {
        Covode.recordClassIndex(32212);
    }

    private final boolean a() {
        try {
            b a2 = c.f50295a.a(this.f51552a.m());
            if (a2 == null) {
                this.f51552a.q().f51476k.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a2.b("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e2) {
            this.f51552a.q().f51476k.a("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }

    er(ff ffVar) {
        this.f51552a = ffVar;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        String str2;
        if (str == null || str.isEmpty()) {
            this.f51552a.q().f51472g.a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f51552a.p().c();
        if (!a()) {
            this.f51552a.q().f51474i.a("Install Referrer Reporter is not available");
            return;
        }
        eu euVar = new eu(this, str);
        this.f51552a.p().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f51552a.m().getPackageManager();
        if (packageManager == null) {
            this.f51552a.q().f51472g.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f51552a.q().f51474i.a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str3 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str3) || !a()) {
                this.f51552a.q().f51471f.a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            Intent intent2 = new Intent(intent);
            try {
                a.a();
                boolean b2 = a.b(this.f51552a.m(), intent2, euVar, 1);
                ee eeVar = this.f51552a.q().f51476k;
                if (b2) {
                    str2 = "available";
                } else {
                    str2 = "not available";
                }
                eeVar.a("Install Referrer Service is", str2);
            } catch (Exception e2) {
                this.f51552a.q().f51468c.a("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, bv bvVar) {
        this.f51552a.p().c();
        if (bvVar == null) {
            this.f51552a.q().f51471f.a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a2 = bvVar.a(bundle);
            if (a2 != null) {
                return a2;
            }
            this.f51552a.q().f51468c.a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.f51552a.q().f51468c.a("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }
}
