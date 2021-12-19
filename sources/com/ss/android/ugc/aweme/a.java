package com.ss.android.ugc.aweme;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.accountsdk.AccountInitializer;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Application f62426a;

    /* renamed from: b  reason: collision with root package name */
    public static bq f62427b;

    /* renamed from: c  reason: collision with root package name */
    public static IAccountUserService.a f62428c;

    /* renamed from: d  reason: collision with root package name */
    public static IAccountService.e f62429d;

    /* renamed from: e  reason: collision with root package name */
    public static ConcurrentHashMap<Class<?>, ServiceProvider<?>> f62430e;

    /* renamed from: f  reason: collision with root package name */
    public static b f62431f;

    /* renamed from: g  reason: collision with root package name */
    public static String f62432g;

    /* renamed from: h  reason: collision with root package name */
    public static String f62433h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f62434i = new a();

    private a() {
    }

    public static Application a() {
        Application application = f62426a;
        if (application == null) {
            l.a("sContext");
        }
        return application;
    }

    public static bq b() {
        bq bqVar = f62427b;
        if (bqVar == null) {
            l.a("sNetworkApi");
        }
        return bqVar;
    }

    static {
        Covode.recordClassIndex(38415);
        IAccountInitializer a2 = AccountInitializer.a();
        if (a2 == null) {
            l.b();
        }
        Application a3 = g.a();
        l.b(a3, "");
        a2.a(a3);
    }

    public static final <T> T a(Class<T> cls) {
        l.d(cls, "");
        ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap = f62430e;
        if (concurrentHashMap == null) {
            l.a("sNeedServices");
        }
        if (concurrentHashMap.contains(cls)) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap2 = f62430e;
            if (concurrentHashMap2 == null) {
                l.a("sNeedServices");
            }
            ServiceProvider<?> serviceProvider = concurrentHashMap2.get(cls);
            if (serviceProvider == null) {
                l.b();
            }
            return (T) serviceProvider.get();
        }
        b bVar = f62431f;
        if (bVar == null) {
            l.a("sServiceProvider");
        }
        ServiceProvider<?> a2 = bVar.a(cls);
        if (a2 != null) {
            ConcurrentHashMap<Class<?>, ServiceProvider<?>> concurrentHashMap3 = f62430e;
            if (concurrentHashMap3 == null) {
                l.a("sNeedServices");
            }
            concurrentHashMap3.put(cls, a2);
            return a2.get();
        }
        throw new RuntimeException("You are not init and register " + cls.getCanonicalName() + " in AccountSdkInitializer");
    }
}
