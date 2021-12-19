package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.measurement.a.a;
import com.google.firebase.b.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    static volatile a f54268a;

    /* renamed from: b  reason: collision with root package name */
    final a f54269b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Object> f54270c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(33695);
    }

    private b(a aVar) {
        r.a(aVar);
        this.f54269b = aVar;
    }

    public static a a(com.google.firebase.b bVar, Context context, d dVar) {
        MethodCollector.i(112);
        r.a(bVar);
        r.a(context);
        r.a(dVar);
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        r.a(applicationContext);
        if (f54268a == null) {
            synchronized (b.class) {
                try {
                    if (f54268a == null) {
                        Bundle bundle = new Bundle(1);
                        if (bVar.f()) {
                            dVar.a(com.google.firebase.a.class, c.f54271a, d.f54272a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", bVar.e());
                        }
                        f54268a = new b(f.a(context, bundle).f50841c);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(112);
                    throw th;
                }
            }
        }
        a aVar = f54268a;
        MethodCollector.o(112);
        return aVar;
    }

    @Override // com.google.firebase.analytics.connector.a
    public final void a(String str, String str2, Bundle bundle) {
        if (com.google.firebase.analytics.connector.internal.a.a(str) && !com.google.firebase.analytics.connector.internal.a.f54273a.contains(str2)) {
            for (String str3 : com.google.firebase.analytics.connector.internal.a.f54274b) {
                if (bundle.containsKey(str3)) {
                    return;
                }
            }
            if ("_cmp".equals(str2)) {
                if (com.google.firebase.analytics.connector.internal.a.a(str)) {
                    for (String str4 : com.google.firebase.analytics.connector.internal.a.f54274b) {
                        if (bundle.containsKey(str4)) {
                            return;
                        }
                    }
                    str.hashCode();
                    char c2 = 65535;
                    switch (str.hashCode()) {
                        case 101200:
                            if (str.equals("fcm")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 101230:
                            if (str.equals("fdl")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3142703:
                            if (str.equals("fiam")) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            bundle.putString("_cis", "fcm_integration");
                            break;
                        case 1:
                            bundle.putString("_cis", "fdl_integration");
                            break;
                        case 2:
                            bundle.putString("_cis", "fiam_integration");
                            break;
                        default:
                            return;
                    }
                } else {
                    return;
                }
            }
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.f54269b.f51312a.a(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    public final void a(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.a.a(str)) {
            if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
                if (!str.equals("fcm") && !str.equals("frc")) {
                    return;
                }
            } else if ("_ln".equals(str2)) {
                if (!str.equals("fcm") && !str.equals("fiam")) {
                    return;
                }
            } else if (!com.google.firebase.analytics.connector.internal.a.f54275c.contains(str2)) {
                for (String str3 : com.google.firebase.analytics.connector.internal.a.f54276d) {
                    if (str2.matches(str3)) {
                        return;
                    }
                }
            } else {
                return;
            }
            this.f54269b.f51312a.a(str, str2, obj, true);
        }
    }
}
