package com.ss.android.ugc.aweme.application;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.bytedance.keva.Keva;
import com.ss.android.legoapi.IAccountInitializerTaskApi;
import com.ss.android.legoimpl.ExperienceKitInitTask;
import com.ss.android.legoimpl.NewUserTask;
import com.ss.android.legoimpl.ProcessMonitorTask;
import com.ss.android.legoimpl.StoragePolicyTask;
import com.ss.android.storageInit.StorageModuleInitTask;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.WsRegionTask;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.app.application.task.CheckUpdateChangeDeviceIDTask;
import com.ss.android.ugc.aweme.app.application.task.CommonParamsInitTask;
import com.ss.android.ugc.aweme.bc.a.h;
import com.ss.android.ugc.aweme.benchmark.BenchmarkInitService;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.device.DeviceInfoReportTask;
import com.ss.android.ugc.aweme.dynamicfeature.AabPluginServiceInitTask;
import com.ss.android.ugc.aweme.dynamicfeature.AabPluginServiceStartTask;
import com.ss.android.ugc.aweme.dynamicfeature.LivePluginInitTask;
import com.ss.android.ugc.aweme.emoji.lego.EmojiCompatTask;
import com.ss.android.ugc.aweme.experiment.BatteryTask;
import com.ss.android.ugc.aweme.experiment.ai;
import com.ss.android.ugc.aweme.experiment.ax;
import com.ss.android.ugc.aweme.experiment.bd;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.experiment.dy;
import com.ss.android.ugc.aweme.experiment.es;
import com.ss.android.ugc.aweme.experiment.fu;
import com.ss.android.ugc.aweme.experiment.j;
import com.ss.android.ugc.aweme.feed.cache.FeedCacheLoaderExtention$getInitTask$1;
import com.ss.android.ugc.aweme.feed.cache.ForegroundFeedCacheTask;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.story.icon.X2CIconStory;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.i;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.wrapper.InitServiceGroupTask;
import com.ss.android.ugc.aweme.lego.wrapper.InitServiceTask;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.legoImp.BDXBridgeInitTask;
import com.ss.android.ugc.aweme.legoImp.RetrieveUserGrowthGuidance;
import com.ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate;
import com.ss.android.ugc.aweme.legoImp.service.AOTOptimizeService;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.legoImp.task.ABCacheOptInitTask;
import com.ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.ss.android.ugc.aweme.legoImp.task.AlertDialogInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ApiUserInitTask;
import com.ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask;
import com.ss.android.ugc.aweme.legoImp.task.AppLinkDataTask;
import com.ss.android.ugc.aweme.legoImp.task.AppLogInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BPEATask;
import com.ss.android.ugc.aweme.legoImp.task.BulletAssemblerInitTask;
import com.ss.android.ugc.aweme.legoImp.task.BulletPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.CheckNoticeTask;
import com.ss.android.ugc.aweme.legoImp.task.ClearDiskBundleTask;
import com.ss.android.ugc.aweme.legoImp.task.ContentProviderAsyncInitTask;
import com.ss.android.ugc.aweme.legoImp.task.CovodeCollectTask;
import com.ss.android.ugc.aweme.legoImp.task.CpuBigCoreBindTask;
import com.ss.android.ugc.aweme.legoImp.task.DataUsageTask;
import com.ss.android.ugc.aweme.legoImp.task.DeeplinkPrefetchTask;
import com.ss.android.ugc.aweme.legoImp.task.EnterMusicGuideColdStartTask;
import com.ss.android.ugc.aweme.legoImp.task.FastEventBusConfigTask;
import com.ss.android.ugc.aweme.legoImp.task.FeedRequestParamPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask;
import com.ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak;
import com.ss.android.ugc.aweme.legoImp.task.FontTask;
import com.ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.ss.android.ugc.aweme.legoImp.task.GsonPrewarmTask;
import com.ss.android.ugc.aweme.legoImp.task.InferenceEngineTask;
import com.ss.android.ugc.aweme.legoImp.task.InitCovodeTask;
import com.ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.ss.android.ugc.aweme.legoImp.task.InitI18nMiniApp;
import com.ss.android.ugc.aweme.legoImp.task.InitLottieOptTask;
import com.ss.android.ugc.aweme.legoImp.task.InitMobShare;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.InitPageMonitorTask;
import com.ss.android.ugc.aweme.legoImp.task.InitPowerPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask;
import com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.ss.android.ugc.aweme.legoImp.task.InstancePreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.JacocoTask;
import com.ss.android.ugc.aweme.legoImp.task.JatoBoostTask;
import com.ss.android.ugc.aweme.legoImp.task.JatoInitTask;
import com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;
import com.ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.ss.android.ugc.aweme.legoImp.task.LiveInjectContextTask;
import com.ss.android.ugc.aweme.legoImp.task.LivePrefetchLoadOptTask;
import com.ss.android.ugc.aweme.legoImp.task.LivePrefetchLoadOtherOptTask;
import com.ss.android.ugc.aweme.legoImp.task.MigrationTask;
import com.ss.android.ugc.aweme.legoImp.task.MobMainAppEndTask;
import com.ss.android.ugc.aweme.legoImp.task.MobMainAppStartTask;
import com.ss.android.ugc.aweme.legoImp.task.MonitorDigitalWellbeingStatusTask;
import com.ss.android.ugc.aweme.legoImp.task.MonitorDirectOnTimer;
import com.ss.android.ugc.aweme.legoImp.task.NetworkRestrictionTask;
import com.ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister;
import com.ss.android.ugc.aweme.legoImp.task.ObtainCpuInfoTask;
import com.ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask;
import com.ss.android.ugc.aweme.legoImp.task.PoiInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import com.ss.android.ugc.aweme.legoImp.task.PreComputeTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadI18nManagerTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadKevaKeyTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadPrefsAndKevaTaskV1;
import com.ss.android.ugc.aweme.legoImp.task.PreloadPrefsAndKevaTaskV2;
import com.ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask;
import com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.ss.android.ugc.aweme.legoImp.task.ProfileEditorTask;
import com.ss.android.ugc.aweme.legoImp.task.RegisterMigrationTask;
import com.ss.android.ugc.aweme.legoImp.task.RegisterScreenBroadcastReceiverTask;
import com.ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask;
import com.ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb;
import com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadForAllProcessTask;
import com.ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.SkyEyeTask;
import com.ss.android.ugc.aweme.legoImp.task.SmartRouterProloadTask;
import com.ss.android.ugc.aweme.legoImp.task.SnapBoostPreloadTask;
import com.ss.android.ugc.aweme.legoImp.task.StorageTask;
import com.ss.android.ugc.aweme.legoImp.task.SyncAccountBannedDetailTask;
import com.ss.android.ugc.aweme.legoImp.task.SyncProtectionSettingTask;
import com.ss.android.ugc.aweme.legoImp.task.ThreadPoolInjectTask;
import com.ss.android.ugc.aweme.legoImp.task.UpdateLocale;
import com.ss.android.ugc.aweme.legoImp.task.WatcherTask;
import com.ss.android.ugc.aweme.legoImp.task.WebSocketTask;
import com.ss.android.ugc.aweme.legoImp.task.WorkManagerDelayInit;
import com.ss.android.ugc.aweme.legoImp.task.ZeroRatingTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.ApmInit;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.HackActivityThreadH;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAnywhereService;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitAwemeRuntime;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitDownloadComponentTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitQuotaTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWebViewClientHookCallback;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.InitWeekEndRecorder;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.NetworkUtilsTask;
import com.ss.android.ugc.aweme.legoImp.task.allProcessTask.RejectedExecutionHandler;
import com.ss.android.ugc.aweme.legoImp.task.api.PreloadFeedRequestTask;
import com.ss.android.ugc.aweme.legoImp.task.api.ReportColdBootTask;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FeedCacheOptTask;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.FrescoSoLoadSetter;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitLegoInflate;
import com.ss.android.ugc.aweme.legoImp.task.mainProcessTask.InitTurboTask;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.legoImpl.task.HybridABFrameworkInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.LobbyInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.SecShareSdkTask;
import com.ss.android.ugc.aweme.miniapp.abtest.MiniAppPluginInstallABTask;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.push.downgrade.NotifyPushStatusTask;
import com.ss.android.ugc.aweme.push.downgrade.d;
import com.ss.android.ugc.aweme.request_combine.task.FetchCombineSettingsTask;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoGlobalInitTask;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequest;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.story.StoryGetFeedTask;
import com.ss.android.ugc.aweme.task.AppStartTask;
import com.ss.android.ugc.aweme.task.ColdLoggerAttachBaseTask;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.upvote.UpvotePublishTask;
import com.ss.android.ugc.aweme.utils.DeadSystemExceptionTask;
import com.ss.android.ugc.aweme.utils.PreventServerSideCrashes;
import com.ss.android.ugc.aweme.utils.WebViewPreInitTask;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import h.f.b.l;
import h.f.b.m;
import h.i.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class AwemeAppTaskProvider implements a {

    /* renamed from: a  reason: collision with root package name */
    private IInitAllService f66915a = InitAllServiceImpl.q();

    /* renamed from: b  reason: collision with root package name */
    private ISplashAdService f66916b = SplashAdServiceImpl.h();

    static {
        Covode.recordClassIndex(41239);
    }

    public static final class BootfinishTasksContainter implements w {

        /* renamed from: a  reason: collision with root package name */
        public final AwemeAppTaskProvider f66917a;

        static {
            Covode.recordClassIndex(41240);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BOOT_FINISH;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BootfinishTasksContainter f66918a;

            static {
                Covode.recordClassIndex(41241);
            }

            a(BootfinishTasksContainter bootfinishTasksContainter) {
                this.f66918a = bootfinishTasksContainter;
            }

            public final void run() {
                List<n> f2 = this.f66918a.f66917a.f();
                f.d e2 = f.e();
                for (n nVar : f2) {
                    if (nVar == null) {
                        l.b();
                    }
                    e2.a(nVar);
                }
                e2.a();
            }
        }

        public BootfinishTasksContainter(AwemeAppTaskProvider awemeAppTaskProvider) {
            l.d(awemeAppTaskProvider, "");
            this.f66917a = awemeAppTaskProvider;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            g.d().schedule(new a(this), 3, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<List<? extends n>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66919a = new a();

        static {
            Covode.recordClassIndex(41242);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends n> invoke() {
            w[] wVarArr = new w[1];
            w initTask = AVExternalServiceImpl.a().initService().initTask(1);
            if (initTask == null) {
                l.b();
            }
            wVarArr[0] = initTask;
            return h.a.n.c(wVarArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.application.a
    public final List<n> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AppStartTask());
        arrayList.add(new ColdLoggerAttachBaseTask());
        arrayList.add(new JatoInitTask());
        w s = com.ss.android.ugc.aweme.legoImp.task.ae.s();
        l.b(s, "");
        arrayList.add(s);
        arrayList.add(new RejectedExecutionHandler());
        w d2 = com.ss.android.ugc.aweme.legoImp.task.ae.d();
        l.b(d2, "");
        arrayList.add(d2);
        arrayList.add(new CpuBigCoreBindTask());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.application.a
    public final List<n> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FetchCombineSettingsTask());
        arrayList.add(new ProcessMonitorTask());
        if (b.a().a(true, "fetch_feed_in_foreground", false)) {
            arrayList.add(new FeedCacheLoaderExtention$getInitTask$1());
        }
        if (!com.ss.android.ugc.aweme.lego.l.b() && Keva.getRepo("ab_repo_cold_boot").getBoolean("lego_boot_finish_commit_opt", i.f107567a)) {
            arrayList.add(new BootfinishTasksContainter(this));
        } else if (((Boolean) com.ss.android.ugc.aweme.lego.l.f107583k.getValue()).booleanValue()) {
            arrayList.add(new BootfinishTasksContainter(this));
        } else {
            arrayList.addAll(f());
        }
        if (fu.b()) {
            d.f118881b = true;
            arrayList.add(new InitServiceTask(new com.ss.android.ugc.aweme.push.downgrade.g(), 1));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.application.a
    public final List<n> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FeedCacheOptTask());
        if (SettingsRequestServiceImpl.i().h()) {
            w q = com.ss.android.ugc.aweme.legoImp.task.ae.q();
            l.b(q, "");
            arrayList.add(q);
            w a2 = com.ss.android.ugc.aweme.legoImp.task.ae.a();
            l.b(a2, "");
            arrayList.add(a2);
        }
        if (!fu.b()) {
            arrayList.add(new InitServiceTask(new com.ss.android.ugc.aweme.push.downgrade.g(), 1048575));
        }
        if (!com.ss.android.ugc.aweme.lego.d.d()) {
            arrayList.add(new FrescoSoLoadSetter());
            arrayList.add(new InitServiceTask(new h(), 1048575));
            arrayList.add(new PreloadWireFieldNoEnumClassTask());
        }
        arrayList.add(new PreloadI18nManagerTask());
        if (com.ss.android.ugc.aweme.s.a.g()) {
            arrayList.add(new PreloadPrefsAndKevaTaskV1());
        } else if (((Boolean) com.ss.android.ugc.aweme.s.a.f120728b.getValue()).booleanValue()) {
            arrayList.add(new PreloadPrefsAndKevaTaskV2());
        } else {
            arrayList.add(new SharePreferencePreloadTask());
        }
        arrayList.add(com.ss.android.legoapi.abtest.a.f59609a.d());
        if (bd.b()) {
            arrayList.add(new PreComputeTask());
        }
        if (!com.ss.android.ugc.aweme.s.a.g()) {
            arrayList.add(new SharePreferencePreloadForAllProcessTask());
        }
        if (!com.ss.android.ugc.aweme.s.a.i()) {
            w n = com.ss.android.ugc.aweme.legoImp.task.ae.n();
            l.b(n, "");
            arrayList.add(n);
        }
        w q2 = com.ss.android.ugc.aweme.legoImp.task.ae.q();
        l.b(q2, "");
        arrayList.add(q2);
        arrayList.add(new InstancePreloadTask());
        if (bd.a() == 1 || bd.a() == 3) {
            arrayList.add(new PreloadKevaKeyTask());
        }
        arrayList.add(new PreventServerSideCrashes());
        arrayList.add(new DeadSystemExceptionTask());
        arrayList.add(new FeedRequestParamPreloadTask());
        arrayList.add(new ObtainCpuInfoTask());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.application.a
    public final List<n> c() {
        w c2;
        w d2;
        int a2;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (com.ss.android.ugc.aweme.network.a.a.a()) {
            arrayList.add(new InitQuotaTask());
        }
        if (((Boolean) cx.f89736a.getValue()).booleanValue()) {
            arrayList.add(new PreloadFeedRequestTask());
        }
        if (((Boolean) com.ss.android.ugc.aweme.s.a.f120729c.getValue()).booleanValue()) {
            arrayList.add(new WebViewPreInitTask());
        }
        if (dy.b()) {
            arrayList.add(new SkyEyeTask());
        }
        ArrayList arrayList2 = new ArrayList();
        if (!com.ss.android.ugc.aweme.lego.d.b() && TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.s, "googleplay")) {
            if (((Boolean) com.ss.android.ugc.aweme.s.a.f120730d.getValue()).booleanValue()) {
                Application a3 = com.bytedance.ies.ugc.appcontext.g.a();
                l.b(a3, "");
                l.d(a3, "");
                Integer num = com.ss.android.ugc.aweme.settings.d.f123097b;
                if (num != null) {
                    a2 = num.intValue();
                } else {
                    a2 = com.ss.android.ugc.aweme.settings.d.a(a3);
                }
                com.ss.android.ugc.aweme.settings.d.f123097b = Integer.valueOf(a2);
                int nextInt = c.Default.nextInt(100000);
                Integer num2 = com.ss.android.ugc.aweme.settings.d.f123097b;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = com.ss.android.ugc.aweme.settings.d.f123096a;
                }
                if (nextInt < i2) {
                    arrayList2.add(new InitCovodeTask(true));
                    arrayList2.add(new CovodeCollectTask());
                }
            }
            if (com.ss.android.ugc.aweme.s.a.k()) {
                arrayList2.add(new InitCovodeTask(false));
            }
        } else if (com.ss.android.ugc.aweme.s.a.k()) {
            arrayList2.add(new InitCovodeTask(false));
        }
        arrayList2.add(com.ss.android.legoapi.b.f59611a.c());
        arrayList2.add(new NotifyPushStatusTask());
        arrayList2.add(new StoragePolicyTask());
        arrayList2.add(new ResetTTNetworkStateIndexTask());
        arrayList2.add(new InitStorageManagerTask());
        IInitAllService iInitAllService = this.f66915a;
        l.b(iInitAllService, "");
        w f2 = iInitAllService.f();
        l.b(f2, "");
        arrayList2.add(f2);
        arrayList2.add(new ApiUserInitTask());
        if (!com.ss.android.ugc.aweme.lego.d.d()) {
            w h2 = com.ss.android.ugc.aweme.legoImp.task.ae.h();
            l.b(h2, "");
            arrayList2.add(h2);
            arrayList2.add(new WatcherTask());
            arrayList2.add(new MonitorDirectOnTimer());
            arrayList2.add(new InitServiceTask(new com.ss.android.ugc.aweme.bc.a.d(), 1048575));
            w i3 = com.ss.android.ugc.aweme.legoImp.task.ae.i();
            l.b(i3, "");
            arrayList2.add(i3);
            IInitAllService iInitAllService2 = this.f66915a;
            l.b(iInitAllService2, "");
            w p = iInitAllService2.p();
            l.b(p, "");
            arrayList2.add(p);
        }
        if (!com.ss.android.ugc.aweme.lego.d.b()) {
            arrayList2.add(com.ss.android.legoapi.a.f59607a.h());
        }
        arrayList2.add(new NewUserTask());
        arrayList2.add(new ThreadPoolInjectTask());
        arrayList2.add(new AabPluginServiceInitTask());
        w k2 = com.ss.android.ugc.aweme.legoImp.task.ae.k();
        l.b(k2, "");
        arrayList2.add(k2);
        arrayList.addAll(arrayList2);
        arrayList.add(new MigrationTask());
        if (!cx.c() && (!e.n() || !ai.b())) {
            arrayList.add(new InitTTNetTask());
        }
        arrayList.add(new GeckoCustomRequest());
        w c3 = com.ss.android.ugc.aweme.legoImp.task.ae.c();
        l.b(c3, "");
        arrayList.add(c3);
        arrayList.add(new GeckoGlobalInitTask());
        w g2 = com.ss.android.ugc.aweme.legoImp.task.ae.g();
        l.b(g2, "");
        arrayList.add(g2);
        if (!com.ss.android.ugc.aweme.s.a.c()) {
            w j2 = com.ss.android.ugc.aweme.legoImp.task.ae.j();
            l.b(j2, "");
            arrayList.add(j2);
        }
        arrayList.add(new FontTask());
        arrayList.add(new LivePrefetchLoadOptTask());
        if (com.ss.android.ugc.aweme.lego.b.d()) {
            arrayList.add(new LivePrefetchLoadOtherOptTask());
        }
        arrayList.add(com.ss.android.legoapi.a.f59607a.g());
        arrayList.add(com.ss.android.legoapi.b.f59611a.b());
        if (!dy.b()) {
            arrayList.add(new SkyEyeTask());
        }
        arrayList.add(new BPEATask());
        w f3 = com.ss.android.ugc.aweme.legoImp.task.ae.f();
        l.b(f3, "");
        arrayList.add(f3);
        if (!com.ss.android.ugc.aweme.s.a.f()) {
            arrayList.add(new AppFlyerLoadPropertiesTask());
        }
        if (!com.ss.android.ugc.aweme.s.a.b()) {
            w o = com.ss.android.ugc.aweme.legoImp.task.ae.o();
            l.b(o, "");
            arrayList.add(o);
            if (!es.a() && (d2 = this.f66916b.d()) != null) {
                arrayList.add(d2);
            }
        }
        if (!es.a() && (c2 = this.f66916b.c()) != null) {
            arrayList.add(c2);
        }
        if (!((Boolean) com.ss.android.ugc.aweme.lego.e.f107510k.getValue()).booleanValue()) {
            w b2 = com.ss.android.ugc.aweme.legoImp.task.ae.b();
            l.b(b2, "");
            arrayList.add(b2);
        }
        IInitAllService iInitAllService3 = this.f66915a;
        l.b(iInitAllService3, "");
        w g3 = iInitAllService3.g();
        l.b(g3, "");
        arrayList.add(g3);
        w preloadInstanceTask = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getPreloadInstanceTask();
        l.b(preloadInstanceTask, "");
        arrayList.add(preloadInstanceTask);
        arrayList.add(new EmojiCompatTask());
        arrayList.add(new GeckoLocalRequest());
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: com.ss.android.ugc.aweme.lego.f */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.application.a
    public final List<n> d() {
        ArrayList arrayList = new ArrayList();
        com.ss.android.ugc.d.a.a.f145543a = false;
        arrayList.add(new CommonParamsInitTask());
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).initLegoInflate();
        if (ax.b()) {
            f.n.a((Class<? extends q>) com.ss.android.ugc.aweme.main.experiment.d.f109248a.a().getClass(), com.ss.android.ugc.aweme.main.experiment.d.f109248a.a());
            f.n.a((Class<? extends q>) com.ss.android.ugc.aweme.main.experiment.d.f109248a.b().getClass(), com.ss.android.ugc.aweme.main.experiment.d.f109248a.b());
            f.n.a((Class<? extends q>) com.ss.android.ugc.aweme.main.experiment.d.f109248a.c().getClass(), com.ss.android.ugc.aweme.main.experiment.d.f109248a.c());
        } else if (ax.a()) {
            f.n.a((Class<? extends q>) com.ss.android.ugc.aweme.main.experiment.d.f109248a.a().getClass(), com.ss.android.ugc.aweme.main.experiment.d.f109248a.a());
            f.n.a((Class<? extends q>) com.ss.android.ugc.aweme.main.experiment.d.f109248a.b().getClass(), com.ss.android.ugc.aweme.main.experiment.d.f109248a.b());
        }
        if (com.ss.android.ugc.aweme.s.d.d()) {
            f.n.a(X2CIconStory.class, new X2CIconStory());
        }
        w l2 = com.ss.android.ugc.aweme.legoImp.task.ae.l();
        l.b(l2, "");
        arrayList.add(l2);
        arrayList.add(new InitLegoInflate());
        q e2 = SplashAdServiceImpl.h().e();
        if (e2 != null) {
            arrayList.add(e2);
        }
        arrayList.add(new PreDrawableInflate());
        if (com.ss.android.ugc.aweme.s.d.j()) {
            arrayList.add(new DmtStatusViewInflate());
        }
        arrayList.add(new LegacyTask());
        w r = com.ss.android.ugc.aweme.legoImp.task.ae.r();
        l.b(r, "");
        arrayList.add(r);
        arrayList.add(new AppLogInitTask());
        if (((Boolean) cx.f89737b.getValue()).booleanValue()) {
            arrayList.add(new PreloadFeedRequestTask());
        }
        ArrayList arrayList2 = new ArrayList();
        if (!((Boolean) com.ss.android.ugc.aweme.lego.e.f107511l.getValue()).booleanValue()) {
            arrayList2.add(new NetworkUtilsTask());
        }
        if (!com.ss.android.ugc.aweme.lego.d.d()) {
            arrayList2.add(new InitServiceTask(new com.ss.android.ugc.aweme.bc.a.c(), 1048575));
            arrayList2.add(new InitServiceTask(new com.ss.android.ugc.aweme.bc.a.a(), 1048575));
        }
        arrayList2.add(new SecShareSdkTask());
        arrayList2.add(new JsBridge2InitTask(ae.MAIN));
        arrayList2.add(new InitAwemeRuntime());
        arrayList2.add(new InferenceEngineTask());
        IInitAllService iInitAllService = this.f66915a;
        l.b(iInitAllService, "");
        w m2 = iInitAllService.m();
        l.b(m2, "");
        arrayList2.add(m2);
        arrayList2.add(new UpdateLocale());
        arrayList2.add(new InitFramework());
        arrayList2.add(new AdjustMusicVolume());
        IAccountInitializerTaskApi f2 = AccountInitializerTaskImpl.f();
        if (f2 == null) {
            l.b();
        }
        arrayList2.add(f2.d());
        if (!((Boolean) com.ss.android.ugc.aweme.lego.e.f107512m.getValue()).booleanValue()) {
            arrayList2.add(new InitMusicManager());
        }
        if (!com.ss.android.ugc.aweme.lego.d.d()) {
            arrayList2.add(new ContentProviderAsyncInitTask());
            arrayList2.add(new InitReportSignature());
            arrayList2.add(new SetupMainServiceForJsb());
            arrayList2.add(new InitMobShare());
            arrayList2.add(new InitServiceTask(new com.ss.android.ugc.aweme.bc.a.i(), 1048575));
        }
        arrayList2.add(new InitTaskManager());
        IAccountInitializerTaskApi f3 = AccountInitializerTaskImpl.f();
        if (f3 == null) {
            l.b();
        }
        arrayList2.add(f3.a());
        arrayList2.add(new FixFocusedViewLeak());
        IInitAllService iInitAllService2 = this.f66915a;
        l.b(iInitAllService2, "");
        w l3 = iInitAllService2.l();
        l.b(l3, "");
        arrayList2.add(l3);
        arrayList2.add(new ObserveDeviceRegister());
        arrayList2.add(new RetrieveUserGrowthGuidance());
        arrayList2.add(new HybridABFrameworkInitTask());
        arrayList2.add(new ABCacheOptInitTask());
        arrayList2.add(new LobbyInitTask());
        arrayList2.add(new AlertDialogInitTask());
        arrayList2.add(new RegisterScreenBroadcastReceiverTask());
        arrayList2.add(com.ss.android.legoapi.a.f59607a.b());
        arrayList2.add(new CheckUpdateChangeDeviceIDTask());
        arrayList2.add(com.ss.android.ugc.aweme.hybridkit.a.f99732a.a());
        arrayList2.add(com.ss.android.ugc.aweme.hybridkit.a.f99732a.b());
        arrayList2.add(new BulletAssemblerInitTask());
        IAccountInitializerTaskApi f4 = AccountInitializerTaskImpl.f();
        if (f4 == null) {
            l.b();
        }
        arrayList2.add(f4.e());
        arrayList2.add(new PerformanceHelperTask());
        arrayList2.add(new ZeroRatingTask());
        arrayList2.add(new InitI18nMiniApp());
        arrayList2.add(new InitAnywhereService());
        arrayList2.add(new InitServiceGroupTask(new Runnable[]{new com.ss.android.ugc.aweme.bc.a.g()}));
        arrayList2.add(new InitWebViewClientHookCallback());
        arrayList2.add(new InitServiceGroupTask(new Runnable[]{new com.ss.android.ugc.aweme.bc.a.e(), new com.ss.android.ugc.aweme.bi.a()}));
        if (TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.s, "local_test")) {
            arrayList2.add(new InitWeekEndRecorder());
        }
        arrayList2.add(new FetchUltimateComplianceSettingsTask());
        arrayList2.add(new LiveInjectContextTask());
        arrayList.addAll(arrayList2);
        arrayList.add(new FastEventBusConfigTask());
        if (!com.ss.android.ugc.aweme.s.a.d()) {
            w e3 = com.ss.android.ugc.aweme.legoImp.task.ae.e();
            l.b(e3, "");
            arrayList.add(e3);
        }
        if (!com.ss.android.ugc.aweme.s.a.e()) {
            w m3 = com.ss.android.ugc.aweme.legoImp.task.ae.m();
            l.b(m3, "");
            arrayList.add(m3);
        }
        if (!j.b()) {
            w p = com.ss.android.ugc.aweme.legoImp.task.ae.p();
            l.b(p, "");
            arrayList.add(p);
        }
        arrayList.add(new GetGoogleAIdTask());
        if (((Boolean) cx.f89738c.getValue()).booleanValue()) {
            arrayList.add(new PreloadFeedRequestTask());
        }
        arrayList.add(com.ss.android.legoapi.b.f59611a.e());
        w initLocationTask = ((ILocationService) ServiceManager.get().getService(ILocationService.class)).getInitLocationTask();
        if (initLocationTask != null) {
            arrayList.add(initLocationTask);
        }
        if (!com.ss.android.ugc.aweme.lego.d.d()) {
            arrayList.add(new PowerPermissionsTask());
        }
        arrayList.add(new ApmInit());
        arrayList.add(new InitLottieOptTask());
        arrayList.add(new ExperienceKitInitTask());
        arrayList.add(new DeeplinkPrefetchTask());
        if (!f.b()) {
            arrayList.add(new MainLooperOptService());
        }
        if (!cx.c() && e.n() && ai.b()) {
            arrayList.add(new InitTTNetTask());
        }
        arrayList.add(new InitPageMonitorTask());
        return arrayList;
    }

    public final List<n> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BDXBridgeInitTask(ae.BOOT_FINISH));
        arrayList.add(BenchmarkInitService.b().a());
        arrayList.add(new InitTurboTask());
        arrayList.add(new MobMainAppStartTask());
        arrayList.add(new MobMainAppEndTask());
        arrayList.add(new SetAppTrackTask());
        arrayList.add(new AabPluginServiceStartTask());
        arrayList.add(new LivePluginInitTask());
        arrayList.add(new MiniAppPluginInstallABTask());
        arrayList.add(new InitDownloadComponentTask());
        arrayList.add(new GsonPrewarmTask());
        arrayList.add(new SmartRouterProloadTask());
        arrayList.add(new JsBridge2InitTask(ae.BOOT_FINISH));
        arrayList.add(new RegisterMigrationTask());
        arrayList.add(new JatoBoostTask());
        arrayList.add(com.ss.android.legoapi.a.f59607a.c());
        arrayList.add(com.ss.android.legoapi.b.f59611a.d());
        IAccountInitializerTaskApi f2 = AccountInitializerTaskImpl.f();
        if (f2 == null) {
            l.b();
        }
        arrayList.add(f2.b());
        arrayList.add(new AOTOptimizeService());
        arrayList.add(new HackActivityThreadH());
        if (com.ss.android.ugc.aweme.lego.m.c()) {
            f.a(ab.SETTING, a.f66919a);
        } else {
            w initTask = AVExternalServiceImpl.a().initService().initTask(1);
            if (initTask == null) {
                l.b();
            }
            arrayList.add(initTask);
        }
        arrayList.add(new WebSocketTask());
        arrayList.add(new AppLinkDataTask());
        arrayList.add(new DataUsageTask());
        arrayList.add(new StorageTask());
        IInitAllService iInitAllService = this.f66915a;
        l.b(iInitAllService, "");
        w o = iInitAllService.o();
        l.b(o, "");
        arrayList.add(o);
        arrayList.add(new JacocoTask());
        arrayList.add(new ForegroundFeedCacheTask(ae.BOOT_FINISH));
        arrayList.add(new WorkManagerDelayInit());
        IInitAllService iInitAllService2 = this.f66915a;
        l.b(iInitAllService2, "");
        w k2 = iInitAllService2.k();
        l.b(k2, "");
        arrayList.add(k2);
        if (TextUtils.equals(com.bytedance.ies.ugc.appcontext.d.s, "local_test")) {
            arrayList.add(com.ss.android.legoapi.a.f59607a.d());
        } else {
            arrayList.add(com.ss.android.legoapi.a.f59607a.a());
        }
        if (Build.VERSION.SDK_INT < 28) {
            arrayList.add(new PreloadResCleanerTask());
        }
        arrayList.add(new CheckNoticeTask());
        arrayList.add(new EnterMusicGuideColdStartTask());
        arrayList.add(new MonitorDigitalWellbeingStatusTask());
        arrayList.add(new InitMusicServiceTask());
        String str = com.ss.android.c.b.f59141e;
        l.b(str, "");
        arrayList.add(new FetchTTSettingTask(str));
        arrayList.add(new SyncProtectionSettingTask());
        arrayList.add(new SyncAccountBannedDetailTask());
        arrayList.add(com.ss.android.legoapi.a.f59607a.i());
        w c2 = com.ss.android.ugc.aweme.compliance.api.a.s().c();
        if (c2 == null) {
            l.b();
        }
        arrayList.add(c2);
        arrayList.add(com.ss.android.legoapi.b.f59611a.f());
        arrayList.add(new PoiInitTask());
        arrayList.add(new BulletPreloadTask());
        arrayList.add(new ClearDiskBundleTask());
        arrayList.add(new StoryGetFeedTask());
        arrayList.add(new DeviceInfoReportTask());
        arrayList.add(new ProfileEditorTask());
        arrayList.add(new SnapBoostPreloadTask());
        arrayList.add(new InitPowerPreloadTask());
        arrayList.add(new NetworkRestrictionTask());
        arrayList.add(com.ss.android.legoapi.a.f59607a.e());
        arrayList.add(new ReportColdBootTask());
        arrayList.add(new WsRegionTask());
        arrayList.add(new BatteryTask());
        arrayList.add(new StorageModuleInitTask());
        arrayList.add(new UpvotePublishTask());
        arrayList.add(UgCommonServiceImpl.j().c().b());
        return arrayList;
    }
}
