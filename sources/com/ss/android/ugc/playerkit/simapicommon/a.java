package com.ss.android.ugc.playerkit.simapicommon;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Application f148866a;

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f148867b = Executors.newCachedThreadPool();

    /* renamed from: c  reason: collision with root package name */
    public static Handler f148868c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public static IAppConfig f148869d;

    /* renamed from: e  reason: collision with root package name */
    public static IMonitor f148870e;

    /* renamed from: f  reason: collision with root package name */
    public static IEvent f148871f;

    /* renamed from: g  reason: collision with root package name */
    public static IALog f148872g;

    public static IAppConfig a() {
        IAppConfig iAppConfig = f148869d;
        if (iAppConfig == null) {
            return (IAppConfig) InjectedConfigManager.getConfig(IAppConfig.class);
        }
        return iAppConfig;
    }

    public static IMonitor b() {
        IMonitor iMonitor = f148870e;
        if (iMonitor == null) {
            return (IMonitor) InjectedConfigManager.getConfig(IMonitor.class);
        }
        return iMonitor;
    }

    public static IEvent c() {
        IEvent iEvent = f148871f;
        if (iEvent == null) {
            return (IEvent) InjectedConfigManager.getConfig(IEvent.class);
        }
        return iEvent;
    }

    public static IALog d() {
        IALog iALog = f148872g;
        if (iALog == null) {
            return (IALog) InjectedConfigManager.getConfig(IALog.class);
        }
        return iALog;
    }

    static {
        Covode.recordClassIndex(98026);
    }

    public static void a(Application application) {
        if (f148866a == null) {
            com.ss.android.ugc.playerkit.b.a.f148653a = application;
            f148866a = application;
        }
    }
}
