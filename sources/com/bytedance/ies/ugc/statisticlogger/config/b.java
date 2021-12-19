package com.bytedance.ies.ugc.statisticlogger.config;

import android.app.Application;
import androidx.lifecycle.w;
import com.bytedance.analytics.page.TrackerProcessLifecycleObserver;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.statisticlogger.a.b;
import com.bytedance.ies.ugc.statisticlogger.e;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.service.IEtDebugService;
import f.a.d.f;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final f.a.l.b<c> f35336a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f35337b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final c f35338c = new c();

    public static final class c implements AppLog.e {
        static {
            Covode.recordClassIndex(21159);
        }

        c() {
        }

        @Override // com.ss.android.common.applog.AppLog.e
        public final void a() {
            com.bytedance.ies.ugc.statisticlogger.a.e();
            b.f35336a.onNext(c.Remote);
        }

        @Override // com.ss.android.common.applog.AppLog.e
        public final void b() {
            System.currentTimeMillis();
            com.bytedance.ies.ugc.statisticlogger.a.e();
            b.f35336a.onNext(c.Local);
        }
    }

    private b() {
    }

    public static final class a implements AppLog.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f35339a;

        static {
            Covode.recordClassIndex(21157);
        }

        @Override // com.ss.android.common.applog.AppLog.g
        public final boolean a() {
            return this.f35339a.b();
        }

        @Override // com.ss.android.common.applog.AppLog.g
        public final boolean b() {
            l.b(ServiceManager.get().getService(IEtDebugService.class), "");
            return com.bytedance.ies.abmock.b.a().a(true, "enable_applog_content_encrypt", true);
        }

        a(d dVar) {
            this.f35339a = dVar;
        }
    }

    static {
        Covode.recordClassIndex(21156);
        f.a.l.b<c> bVar = new f.a.l.b<>();
        l.b(bVar, "");
        f35336a = bVar;
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$b  reason: collision with other inner class name */
    static final class C0804b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0804b f35340a = new C0804b();

        static {
            Covode.recordClassIndex(21158);
        }

        C0804b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((c) obj).name();
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            currentThread.getName();
        }
    }

    public static void a(d dVar) {
        l.d(dVar, "");
        AppLog.addAppCount();
        AppLog.setIsNotRequestSender(true);
        AppLog.setReleaseBuild(d.c());
        a.f35334a = true;
        AppLog.setAppContext(a.f35335b);
        AppLog.setUseGoogleAdId(true);
        j a2 = dVar.a().a();
        if (a2 != j.f26946a) {
            j.f26946a = a2;
        }
        ((IEtDebugService) ServiceManager.get().getService(IEtDebugService.class)).a(d.a());
        AppLog.setLogEncryptConfig(new a(dVar));
        AppLog.setConfigUpdateListener(f35338c);
        f35336a.d((f<? super c>) C0804b.f35340a);
        com.bytedance.ies.ugc.statisticlogger.a.e();
        DeviceRegisterManager.addOnDeviceConfigUpdateListener(com.bytedance.ies.ugc.statisticlogger.a.f35312e);
        AppLog.addSessionHook(e.f35347d);
        AppLog.setAliYunHanlder(com.ss.android.common.applog.a.a());
        Application application = dVar.f35342a;
        String valueOf = String.valueOf(d.n);
        l.d(application, "");
        l.d(valueOf, "");
        if (com.ss.android.j.a.a()) {
            b.a aVar = b.a.f35319a;
            l.d(application, "");
            l.d(valueOf, "");
            l.d(aVar, "");
            w.f3548i.getLifecycle().a(TrackerProcessLifecycleObserver.f6562a);
            application.registerActivityLifecycleCallbacks(com.bytedance.analytics.page.j.f6592a);
            com.bytedance.analytics.b.f6551b = valueOf;
            com.bytedance.analytics.b.a.f6553b = aVar;
            b.C0802b bVar = new b.C0802b();
            l.d(bVar, "");
            com.bytedance.analytics.page.e.f6569b = bVar;
        }
        new f.c().b((com.ss.android.ugc.aweme.lego.w) new LazyLoadLegoTask(dVar.f35342a)).b((com.ss.android.ugc.aweme.lego.w) new SetAppTrackTask()).a();
    }
}
