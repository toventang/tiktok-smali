package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.l;
import com.google.android.gms.internal.measurement.nc;
import java.lang.reflect.InvocationTargetException;

public final class km extends fz {

    /* renamed from: a  reason: collision with root package name */
    public b f52014a = c.f51376a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f52015b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f52016c;

    static {
        Covode.recordClassIndex(32370);
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
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

    public static long i() {
        return p.D.a(null).longValue();
    }

    public static long j() {
        return p.f52039d.a(null).longValue();
    }

    public final String u() {
        return a("debug.firebase.analytics.app", "");
    }

    public final boolean f() {
        t();
        Boolean d2 = d("firebase_analytics_collection_deactivated");
        if (d2 == null || !d2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final Boolean g() {
        boolean z;
        Boolean d2 = d("google_analytics_adid_collection_enabled");
        if (d2 == null || d2.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final int d() {
        com.google.android.gms.internal.measurement.km.b();
        if (!s().d(null, p.aL) || o().i() < 201500) {
            return 25;
        }
        return 100;
    }

    public final Boolean h() {
        nc.b();
        boolean z = true;
        if (!d(null, p.aC)) {
            return true;
        }
        Boolean d2 = d("google_analytics_automatic_screen_reporting_enabled");
        if (d2 != null && !d2.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    public final boolean v() {
        if (this.f52015b == null) {
            Boolean d2 = d("app_measurement_lite");
            this.f52015b = d2;
            if (d2 == null) {
                this.f52015b = false;
            }
        }
        if (this.f52015b.booleanValue() || !this.z.f51599d) {
            return true;
        }
        return false;
    }

    private final Bundle w() {
        try {
            if (m().getPackageManager() == null) {
                q().f51468c.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a2 = c.f50295a.a(m()).a(m().getPackageName(), 128);
            if (a2 != null) {
                return a2.metaData;
            }
            q().f51468c.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            q().f51468c.a("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final boolean e() {
        boolean z;
        MethodCollector.i(7709);
        if (this.f52016c == null) {
            synchronized (this) {
                try {
                    if (this.f52016c == null) {
                        ApplicationInfo applicationInfo = m().getApplicationInfo();
                        String a2 = l.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            if (str == null || !str.equals(a2)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            this.f52016c = Boolean.valueOf(z);
                        }
                        if (this.f52016c == null) {
                            this.f52016c = Boolean.TRUE;
                            q().f51468c.a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7709);
                    throw th;
                }
            }
        }
        boolean booleanValue = this.f52016c.booleanValue();
        MethodCollector.o(7709);
        return booleanValue;
    }

    km(ff ffVar) {
        super(ffVar);
    }

    public final int c(String str) {
        return b(str, p.o);
    }

    public final int a(String str) {
        return a(str, p.I, 25, 100);
    }

    public final boolean f(String str) {
        return "1".equals(this.f52014a.a(str, "gaia_collection_enabled"));
    }

    /* access modifiers changed from: package-private */
    public final int b(String str) {
        com.google.android.gms.internal.measurement.km.b();
        if (d(null, p.aK)) {
            return a(str, p.H, 500, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        return 500;
    }

    /* access modifiers changed from: package-private */
    public final Boolean d(String str) {
        r.a(str);
        Bundle w = w();
        if (w == null) {
            q().f51468c.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!w.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(w.getBoolean(str));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0018 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029 A[SYNTHETIC, Splitter:B:9:0x0029] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> e(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.r.a(r5)
            android.os.Bundle r1 = r4.w()
            r3 = 0
            if (r1 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.eb r0 = r4.q()
            com.google.android.gms.measurement.internal.ee r1 = r0.f51468c
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r1.a(r0)
        L_0x0015:
            r2 = r3
        L_0x0016:
            if (r2 != 0) goto L_0x0029
            return r3
        L_0x0019:
            boolean r0 = r1.containsKey(r5)
            if (r0 != 0) goto L_0x0020
            goto L_0x0015
        L_0x0020:
            int r0 = r1.getInt(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0016
        L_0x0029:
            android.content.Context r0 = r4.m()     // Catch:{ NotFoundException -> 0x0041 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ NotFoundException -> 0x0041 }
            int r0 = r2.intValue()     // Catch:{ NotFoundException -> 0x0041 }
            java.lang.String[] r0 = r1.getStringArray(r0)     // Catch:{ NotFoundException -> 0x0041 }
            if (r0 != 0) goto L_0x003c
            return r3
        L_0x003c:
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ NotFoundException -> 0x0041 }
            return r0
        L_0x0041:
            r2 = move-exception
            com.google.android.gms.measurement.internal.eb r0 = r4.q()
            com.google.android.gms.measurement.internal.ee r1 = r0.f51468c
            java.lang.String r0 = "Failed to load string array from metadata: resource not found"
            r1.a(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.km.e(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(com.google.android.gms.measurement.internal.ec r7) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.km.a(com.google.android.gms.measurement.internal.ec):java.lang.String");
    }

    public final long a(String str, dq<Long> dqVar) {
        if (str == null) {
            return dqVar.a(null).longValue();
        }
        String a2 = this.f52014a.a(str, dqVar.f51424a);
        if (TextUtils.isEmpty(a2)) {
            return dqVar.a(null).longValue();
        }
        try {
            return dqVar.a(Long.valueOf(Long.parseLong(a2))).longValue();
        } catch (NumberFormatException unused) {
            return dqVar.a(null).longValue();
        }
    }

    public final int b(String str, dq<Integer> dqVar) {
        if (str == null) {
            return dqVar.a(null).intValue();
        }
        String a2 = this.f52014a.a(str, dqVar.f51424a);
        if (TextUtils.isEmpty(a2)) {
            return dqVar.a(null).intValue();
        }
        try {
            return dqVar.a(Integer.valueOf(Integer.parseInt(a2))).intValue();
        } catch (NumberFormatException unused) {
            return dqVar.a(null).intValue();
        }
    }

    public final double c(String str, dq<Double> dqVar) {
        if (str == null) {
            return dqVar.a(null).doubleValue();
        }
        String a2 = this.f52014a.a(str, dqVar.f51424a);
        if (TextUtils.isEmpty(a2)) {
            return dqVar.a(null).doubleValue();
        }
        try {
            return dqVar.a(Double.valueOf(Double.parseDouble(a2))).doubleValue();
        } catch (NumberFormatException unused) {
            return dqVar.a(null).doubleValue();
        }
    }

    public final boolean d(String str, dq<Boolean> dqVar) {
        if (str == null) {
            return dqVar.a(null).booleanValue();
        }
        String a2 = this.f52014a.a(str, dqVar.f51424a);
        if (TextUtils.isEmpty(a2)) {
            return dqVar.a(null).booleanValue();
        }
        return dqVar.a(Boolean.valueOf(Boolean.parseBoolean(a2))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e2) {
            q().f51468c.a("Could not find SystemProperties class", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            q().f51468c.a("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (IllegalAccessException e4) {
            q().f51468c.a("Could not access SystemProperties.get()", e4);
            return str2;
        } catch (InvocationTargetException e5) {
            q().f51468c.a("SystemProperties.get() threw an exception", e5);
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(String str, dq<Integer> dqVar, int i2, int i3) {
        return Math.max(Math.min(b(str, dqVar), i3), i2);
    }
}
