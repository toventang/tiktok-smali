package com.google.android.gms.common.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.k;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f50292a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f50293b;

    static {
        Covode.recordClassIndex(31351);
    }

    public static synchronized boolean a(Context context) {
        Boolean bool;
        synchronized (a.class) {
            MethodCollector.i(9629);
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            Context context2 = f50292a;
            if (context2 == null || (bool = f50293b) == null || context2 != applicationContext) {
                f50293b = null;
                if (k.e()) {
                    f50293b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f50293b = true;
                    } catch (ClassNotFoundException unused) {
                        f50293b = false;
                    }
                }
                f50292a = applicationContext;
                boolean booleanValue = f50293b.booleanValue();
                MethodCollector.o(9629);
                return booleanValue;
            }
            boolean booleanValue2 = bool.booleanValue();
            MethodCollector.o(9629);
            return booleanValue2;
        }
    }
}
