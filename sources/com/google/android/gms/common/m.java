package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.a.b;
import com.google.android.gms.common.internal.an;
import com.google.android.gms.common.internal.ao;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.ss.android.ugc.aweme.lancet.a.a;

/* access modifiers changed from: package-private */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static volatile an f50447a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f50448b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Context f50449c;

    static {
        Covode.recordClassIndex(31442);
    }

    static synchronized void a(Context context) {
        synchronized (m.class) {
            MethodCollector.i(11204);
            if (f50449c != null || context == null) {
                MethodCollector.o(11204);
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = a.f107166a;
                }
            }
            f50449c = applicationContext;
            MethodCollector.o(11204);
        }
    }

    static u a(String str, n nVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, nVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static u b(String str, n nVar, boolean z, boolean z2) {
        String str2;
        an anVar;
        MethodCollector.i(11206);
        try {
            if (f50447a == null) {
                r.a(f50449c);
                synchronized (f50448b) {
                    try {
                        if (f50447a == null) {
                            IBinder a2 = DynamiteModule.a(f50449c, DynamiteModule.f50535d, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl");
                            if (a2 == null) {
                                anVar = null;
                            } else {
                                IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                                if (queryLocalInterface instanceof an) {
                                    anVar = (an) queryLocalInterface;
                                } else {
                                    anVar = new ao(a2);
                                }
                            }
                            f50447a = anVar;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(11206);
                        throw th;
                    }
                }
            }
            r.a(f50449c);
            try {
                if (f50447a.a(new zzj(str, nVar, z, z2), b.a(f50449c.getPackageManager()))) {
                    u uVar = u.f50490a;
                    MethodCollector.o(11206);
                    return uVar;
                }
                w wVar = new w(new o(z, str, nVar), (byte) 0);
                MethodCollector.o(11206);
                return wVar;
            } catch (RemoteException e2) {
                u a3 = u.a("module call", e2);
                MethodCollector.o(11206);
                return a3;
            }
        } catch (DynamiteModule.a e3) {
            String valueOf = String.valueOf(e3.getMessage());
            if (valueOf.length() != 0) {
                str2 = "module init: ".concat(valueOf);
            } else {
                str2 = new String("module init: ");
            }
            u a4 = u.a(str2, e3);
            MethodCollector.o(11206);
            return a4;
        }
    }
}
