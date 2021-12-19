package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.c.b;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.internal.r;
import com.ss.android.ugc.aweme.lancet.a.a;

public class h {

    /* renamed from: b  reason: collision with root package name */
    private static h f50303b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f50304a;

    static {
        Covode.recordClassIndex(31358);
    }

    private h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f50304a = applicationContext;
    }

    public static h a(Context context) {
        MethodCollector.i(13384);
        r.a(context);
        synchronized (h.class) {
            try {
                if (f50303b == null) {
                    m.a(context);
                    f50303b = new h(context);
                }
            } catch (Throwable th) {
                MethodCollector.o(13384);
                throw th;
            }
        }
        h hVar = f50303b;
        MethodCollector.o(13384);
        return hVar;
    }

    private final u a(String str) {
        String str2;
        try {
            PackageInfo packageInfo = c.f50295a.a(this.f50304a).f50294a.getPackageManager().getPackageInfo(str, 64);
            boolean b2 = g.b(this.f50304a);
            if (packageInfo == null) {
                return u.a("null pkg");
            }
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                return u.a("single cert required");
            }
            q qVar = new q(packageInfo.signatures[0].toByteArray());
            String str3 = packageInfo.packageName;
            u a2 = m.a(str3, qVar, b2, false);
            if (!a2.f50491b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !m.a(str3, qVar, false, true).f50491b) {
                return a2;
            }
            return u.a("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "no pkg ".concat(valueOf);
            } else {
                str2 = new String("no pkg ");
            }
            return u.a(str2);
        }
    }

    public final boolean a(int i2) {
        u uVar;
        String[] a2 = b.a(c.f50295a.a(this.f50304a).f50294a.getPackageManager(), i2);
        if (a2 == null || a2.length == 0) {
            uVar = u.a("no pkgs");
        } else {
            uVar = null;
            for (String str : a2) {
                uVar = a(str);
                if (uVar.f50491b) {
                    break;
                }
            }
        }
        if (!uVar.f50491b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (uVar.f50492c != null) {
                uVar.a();
            } else {
                uVar.a();
            }
        }
        return uVar.f50491b;
    }

    private static n a(PackageInfo packageInfo, n... nVarArr) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        q qVar = new q(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < nVarArr.length; i2++) {
            if (nVarArr[i2].equals(qVar)) {
                return nVarArr[i2];
            }
        }
        return null;
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        n a2;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                a2 = a(packageInfo, s.f50457a);
            } else {
                a2 = a(packageInfo, s.f50457a[0]);
            }
            if (a2 != null) {
                return true;
            }
        }
        return false;
    }
}
