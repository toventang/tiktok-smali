package com.ss.android.ugc.aweme.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.appcompat.widget.aq;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.librarian.Librarian;
import com.bytedance.librarian.LibrarianMonitor;
import com.ss.android.legoapi.b;
import com.ss.android.legoimpl.ExperienceKitInitTask;
import com.ss.android.legoimpl.ProcessMonitorTask;
import com.ss.android.legoimpl.StoragePolicyTask;
import com.ss.android.ugc.aweme.app.ad;
import com.ss.android.ugc.aweme.childhook.b;
import com.ss.android.ugc.aweme.childhook.e;
import com.ss.android.ugc.aweme.device.DeviceInfoReportTask;
import com.ss.android.ugc.aweme.dynamicfeature.AabPluginServiceInitTask;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.ss.android.ugc.aweme.legoImp.task.AlertDialogInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletAssemblerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.EnterMusicGuideColdStartTask;
import com.ss.android.ugc.aweme.legoImp.task.FontTask;
import com.ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.ss.android.ugc.aweme.legoImp.task.JacocoTask;
import com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import com.ss.android.ugc.aweme.legoImp.task.KidsModeInitBulletJsbTask;
import com.ss.android.ugc.aweme.legoImp.task.KidsModeInitRouterTask;
import com.ss.android.ugc.aweme.legoImp.task.KidsModeInitRuntimeTask;
import com.ss.android.ugc.aweme.legoImp.task.KidsModeInitSettingTask;
import com.ss.android.ugc.aweme.legoImp.task.KidsModeLegacyTask;
import com.ss.android.ugc.aweme.legoImp.task.MigrationTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask;
import com.ss.android.ugc.aweme.legoImp.task.RegisterMigrationTask;
import com.ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask;
import com.ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.ss.android.ugc.aweme.legoImp.task.StorageTask;
import com.ss.android.ugc.aweme.legoImp.task.ThreadPoolInjectTask;
import com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.ss.android.ugc.aweme.legoImp.task.UpdateLocale;
import com.ss.android.ugc.aweme.legoImp.task.WorkManagerDelayInit;
import com.ss.android.ugc.aweme.legoImp.task.ae;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAnywhereService;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitDownloadComponentTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWebViewClientHookCallback;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.NetworkUtilsTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.KidsModeProfileInfoTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.TuxInitTask;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.net.f.h;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.storagemanager.a;
import h.e.c;
import h.e.q;
import h.f.b.l;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Iterator;

public class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public Application f66937a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f66938b;

    /* renamed from: c  reason: collision with root package name */
    private AppBuildConfig f66939c;

    /* renamed from: d  reason: collision with root package name */
    private h f66940d;

    /* renamed from: e  reason: collision with root package name */
    private long f66941e = -1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f66942f;

    static {
        Covode.recordClassIndex(41257);
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final Resources a(Resources resources) {
        return resources;
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final String a(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final void a(Configuration configuration) {
    }

    /* access modifiers changed from: protected */
    public void attachBaseContextAfterMultiDex() {
        l.attachBaseContextAfterMultiDex(this);
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final boolean c() {
        return this.f66942f;
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final boolean d() {
        return this.f66942f;
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final void a() {
        a.a(this.f66937a, this.f66938b);
        f.e().a(b.f59611a.c()).a(com.ss.android.legoapi.abtest.a.f59609a.a()).a(new MigrationTask()).a(new StoragePolicyTask()).a(new RegisterMigrationTask()).a();
        a.b.f109011a.a("method_init_ttnet_duration", false);
        f.e().a(new ResetTTNetworkStateIndexTask()).a(new InitTTNetTask()).a();
        a.b.f109011a.b("method_init_ttnet_duration", false);
        if (this.f66938b) {
            f.e().a(ae.c()).a(new KidsModeInitRouterTask()).a(new FontTask()).a();
        }
        f.e().a(com.ss.android.legoapi.a.f59607a.f()).a(com.ss.android.legoapi.a.f59607a.c()).a(b.f59611a.d()).a(ae.k()).a();
        w initBoeTask = a.C2792a.f108997a.f108996a.getInitBoeTask();
        if (initBoeTask != null) {
            f.e().a(initBoeTask).a();
        }
        if (this.f66938b) {
            f.e().a(ae.b()).a(AccountInitializerTaskImpl.f().b()).a();
        }
        if (this.f66938b) {
            f.e().a(new AabPluginServiceInitTask()).a();
        }
        a.b.f109011a.a("method_thread_pool_inject_duration", false);
        f.e().a(new ThreadPoolInjectTask()).a();
        a.b.f109011a.b("method_thread_pool_inject_duration", false);
        h.f112326a = k.f66945a;
        if (this.f66938b) {
            f.e().a(new TuxInitTask()).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final void b() {
        KidsCommonServiceImpl.g().f();
        AVExternalServiceImpl.a().attachApplication(this.f66937a);
        if (this.f66938b) {
            f.e().a(ae.d()).a();
        }
        f.e().a(new NetworkUtilsTask()).a();
        if (this.f66938b) {
            new f.c().b((w) new JsBridge2InitTask(com.ss.android.ugc.aweme.lego.ae.BACKGROUND)).b((w) new JsBridge2InitTask(com.ss.android.ugc.aweme.lego.ae.BOOT_FINISH)).b((w) new KidsModeInitRuntimeTask(this.f66937a)).b((w) new KidsModeInitBulletJsbTask(this.f66937a)).a();
        }
        aq.f1590a = true;
        f.e().a(new KidsModeLegacyTask()).a(ae.a()).a(new UpdateLocale()).a(new InitFramework()).a(new AdjustMusicVolume()).a(ae.m()).a(new InitReportSignature()).a(new InitTaskManager()).a(AccountInitializerTaskImpl.f().a()).a(new AlertDialogInitTask()).b(new InitMusicManager()).a();
        f.e().a(new GetGoogleAIdTask()).a(com.ss.android.legoapi.a.f59607a.b()).a(new BulletPreloadTask()).a(new BulletAssemblerInitTask()).a();
        f.d a2 = f.e().a(new SetAppTrackTask()).a(AVExternalServiceImpl.a().initService().initTask(1)).a(new DeviceInfoReportTask()).a(new StorageTask()).a(new JacocoTask()).a(new WorkManagerDelayInit());
        if (TextUtils.equals(d.s, "local_test")) {
            a2.a(com.ss.android.legoapi.a.f59607a.d());
        } else {
            a2.a(com.ss.android.legoapi.a.f59607a.a());
        }
        if (Build.VERSION.SDK_INT < 28) {
            a2.a(new PreloadResCleanerTask());
        }
        a2.a();
        f.e().a(new EnterMusicGuideColdStartTask()).a(new InitMusicServiceTask()).a(new InitAnywhereService()).a();
        f.e().a(new ApmInit()).a();
        f.e().a(new InitDownloadComponentTask()).a(new InitWebViewClientHookCallback()).a(new ProcessMonitorTask()).a(new ExperienceKitInitTask()).a();
        if (this.f66938b) {
            l.c(this.f66937a, "");
        }
        if (com.ss.android.ugc.aweme.s.a.e()) {
            f.a(ae.m());
            InitAVModule.c();
        }
        if (this.f66938b) {
            f.e().a(new KidsModeInitSettingTask()).a(new KidsModeProfileInfoTask()).a();
        }
        new com.ss.android.ugc.aweme.bc.a.f().run();
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final void a(int i2) {
        if (this.f66941e == -1) {
            this.f66941e = ad.a(this.f66937a);
        }
        if (this.f66941e == Thread.currentThread().getId()) {
            f.e().a(new TrimMemoryTask(i2)).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final void a(final Context context) {
        Librarian.a(context, this.f66939c.a(), new LibrarianMonitor() {
            /* class com.ss.android.ugc.aweme.application.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41258);
            }

            @Override // com.bytedance.librarian.LibrarianMonitor
            public final void a(String str) {
                n.a(context, str, true, true);
                super.a(str);
                n.a(context, str, true, false);
            }
        });
        if (Build.VERSION.SDK_INT >= 30 || (Build.VERSION.SDK_INT == 29 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            com.bytedance.mira.plugin.hook.flipped.a.a();
        }
        com.ss.android.ugc.aweme.lancet.a.a.a(this.f66937a, context);
        com.ss.android.ugc.aweme.app.k.a.a(this.f66939c.b());
        d.a("api-va.tiktokv.com", "ichannel-va.tiktokv.com", "api-va.tiktokv.com");
        com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.a(d.f34604k.f34586a, d.f34604k.f34587b, d.f34604k.f34588c);
        com.ss.android.ugc.aweme.launcher.service.account.a.f107290a.b("musical_ly");
        com.ss.android.ugc.aweme.net.b.a.a();
    }

    @Override // com.ss.android.ugc.aweme.application.i
    public final void b(Context context) {
        MethodCollector.i(5859);
        this.f66938b = com.ss.android.common.util.f.a(this.f66937a);
        com.ss.android.ugc.trill.i.a.a(com.ss.android.common.util.f.a(this.f66937a), this.f66937a);
        com.ss.android.ugc.aweme.app.launch.a.a(this.f66937a, this.f66939c);
        a.b.f109011a.a("cold_boot_application_attach_before_base_duration", false);
        com.bytedance.apm.trace.b.a();
        com.ss.android.ugc.aweme.bf.a.a(context);
        com.ss.android.ugc.aweme.app.launch.a.a(this.f66937a);
        a.b.f109011a.b("cold_boot_application_attach_before_base_duration", false);
        this.f66940d.a(this.f66937a);
        boolean a2 = com.ss.android.ugc.aweme.app.services.b.a(this.f66937a);
        this.f66942f = a2;
        if (a2) {
            MethodCollector.o(5859);
            return;
        }
        l.d(context, "");
        InputStream open = context.getAssets().open("kids_mode_allowlist.json");
        l.b(open, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
        try {
            h.l.h<String> a3 = q.a(bufferedReader);
            StringBuilder sb = new StringBuilder();
            Iterator<String> a4 = a3.a();
            while (a4.hasNext()) {
                sb.append(a4.next());
            }
            String sb2 = sb.toString();
            c.a(bufferedReader, null);
            l.b(sb2, "");
            e.f70256a = (com.ss.android.ugc.aweme.childhook.d) new com.google.gson.f().a(sb2, com.ss.android.ugc.aweme.childhook.d.class);
            com.ss.android.ugc.aweme.childhook.c.a();
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
                Field declaredField = invoke.getClass().getDeclaredField("mH");
                l.b(declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                if (obj != null) {
                    Handler handler = (Handler) obj;
                    Field declaredField2 = Handler.class.getDeclaredField("mCallback");
                    l.b(declaredField2, "");
                    declaredField2.setAccessible(true);
                    declaredField2.set(handler, new b.a((Handler.Callback) declaredField2.get(handler)));
                    attachBaseContextAfterMultiDex();
                    MethodCollector.o(5859);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.os.Handler");
                MethodCollector.o(5859);
                throw nullPointerException;
            } catch (Exception e2) {
                e2.printStackTrace();
                com.bytedance.c.a.a.a.b.a(e2, "ChildBroadcastReceiverHook.startHook");
            }
        } catch (Throwable th) {
            c.a(bufferedReader, th);
            MethodCollector.o(5859);
            throw th;
        }
    }

    public j(Application application, AppBuildConfig appBuildConfig, h hVar) {
        this.f66937a = application;
        this.f66939c = appBuildConfig;
        this.f66940d = hVar;
    }
}
