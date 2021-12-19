package com.ss.android.ugc.effectmanager;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.TaskManager;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.network.EffectNetWorkerWrapper;
import com.ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcher;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.effect.task.task.DefaultEffectFetcher;
import com.ss.android.ugc.effectmanager.knadapt.KNExecutorService;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.android.ugc.effectmanager.knadapt.KNLogger;
import com.ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.c.d;
import com.ss.ugc.effectplatform.algorithm.e;
import d.a.b.b.b;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class EffectConfiguration {
    private ExecutorService executor;
    private int filterType;
    private HashMap<String, String> iopInfo;
    private IJsonConverter jsonConverter;
    private ListenerManger listenerManger;
    private String mAccessKey;
    private String mApiAddress;
    private String mAppID;
    private String mAppLanguage;
    private String mAppVersion;
    private ICache mCache;
    private String mChannel;
    private Context mContext;
    private String mDeviceId;
    private String mDeviceType;
    private ArrayList<String> mDraftList;
    private a mEffectConfig;
    private File mEffectDir;
    private EffectDownloadManager mEffectDownloadManager;
    private EffectFetcher mEffectFetcher;
    private EffectNetWorkerWrapper mEffectNetWorker;
    private String mGpuVersion;
    private List<Host> mHosts;
    private String mPlatform;
    private String mRegion;
    private int mRetryCount;
    private String mSdkVersion;
    private TaskManager mTaskManager;
    private IMonitorService monitorService;
    private int requestStrategy;
    private String testStatus;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.effectmanager.EffectConfiguration$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(95188);
        }
    }

    static {
        Covode.recordClassIndex(95187);
    }

    public String getAccessKey() {
        return this.mAccessKey;
    }

    public String getApiAdress() {
        return this.mApiAddress;
    }

    public String getAppID() {
        return this.mAppID;
    }

    public String getAppLanguage() {
        return this.mAppLanguage;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public ICache getCache() {
        return this.mCache;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public ArrayList<String> getDraftList() {
        return this.mDraftList;
    }

    public a getEffectConfig() {
        return this.mEffectConfig;
    }

    public File getEffectDir() {
        return this.mEffectDir;
    }

    public EffectDownloadManager getEffectDownloadManager() {
        return this.mEffectDownloadManager;
    }

    public EffectFetcher getEffectFetcher() {
        return this.mEffectFetcher;
    }

    public EffectNetWorkerWrapper getEffectNetWorker() {
        return this.mEffectNetWorker;
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public String getGpuVersion() {
        return this.mGpuVersion;
    }

    public List<Host> getHosts() {
        return this.mHosts;
    }

    public HashMap<String, String> getIopInfo() {
        return this.iopInfo;
    }

    public IJsonConverter getJsonConverter() {
        return this.jsonConverter;
    }

    public ListenerManger getListenerManger() {
        return this.listenerManger;
    }

    public IMonitorService getMonitorService() {
        return this.monitorService;
    }

    public String getPlatform() {
        return this.mPlatform;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public int getRequestStrategy() {
        return this.requestStrategy;
    }

    public int getRetryCount() {
        return this.mRetryCount;
    }

    public String getSdkVersion() {
        return this.mSdkVersion;
    }

    public TaskManager getTaskManager() {
        return this.mTaskManager;
    }

    public String getTestStatus() {
        return this.testStatus;
    }

    public static final class Builder {
        private static boolean hasAddedVersionTagInLog;
        public String accessKey;
        public String appID;
        public String appLanguage;
        public String appVersion;
        public ICache cache;
        public String channel;
        public Context context;
        public String deviceId;
        public String deviceType;
        public ArrayList<String> draftList;
        public File effectDir;
        public EffectFetcher effectFetcher;
        public IEffectNetWorker effectNetWorker;
        public int filterType;
        public String gpuVersion;
        public List<Host> hosts;
        public HashMap<String, String> iopInfo = new HashMap<>();
        public IJsonConverter jsonConverter;
        public ExecutorService mExecutor;
        private a.C4082a mKNEffectConfigBuilder;
        public IMonitorService monitorService;
        public String platform;
        public String region;
        public int requestStrategy;
        public int retryCount = 3;
        public String sdkVersion;
        public String testStatus;

        static {
            Covode.recordClassIndex(95189);
        }

        public final Builder sysLanguage(String str) {
            return this;
        }

        public final EffectConfiguration build() {
            return new EffectConfiguration(this, null);
        }

        public final a buildKNEffectConfig() {
            return this.mKNEffectConfigBuilder.a();
        }

        public Builder() {
            if (!hasAddedVersionTagInLog) {
                if (UseKNPlatform.enableKNPlatform) {
                    EPLog.addSDKTagString("760.0.0.148-alpha.2-mt");
                } else {
                    EPLog.addSDKTagString(EPUtils.getPlatformSDKVersion());
                }
                hasAddedVersionTagInLog = true;
            }
            this.mKNEffectConfigBuilder = new a.C4082a();
        }

        public final Builder cache(ICache iCache) {
            this.cache = iCache;
            return this;
        }

        public final Builder accessKey(String str) {
            this.accessKey = str;
            this.mKNEffectConfigBuilder.a(str);
            return this;
        }

        public final Builder appID(String str) {
            this.appID = str;
            this.mKNEffectConfigBuilder.f153419f = str;
            return this;
        }

        public final Builder appLanguage(String str) {
            this.appLanguage = str;
            this.mKNEffectConfigBuilder.i(str);
            return this;
        }

        public final Builder appVersion(String str) {
            this.appVersion = str;
            this.mKNEffectConfigBuilder.c(str);
            return this;
        }

        public final Builder channel(String str) {
            this.channel = str;
            this.mKNEffectConfigBuilder.e(str);
            return this;
        }

        public final Builder deviceId(String str) {
            this.deviceId = str;
            this.mKNEffectConfigBuilder.d(str);
            return this;
        }

        public final Builder deviceType(String str) {
            this.deviceType = str;
            this.mKNEffectConfigBuilder.g(str);
            return this;
        }

        public final Builder filterType(int i2) {
            this.filterType = i2;
            this.mKNEffectConfigBuilder.a(i2);
            return this;
        }

        public final Builder gpuInfo(String str) {
            this.gpuVersion = str;
            this.mKNEffectConfigBuilder.v = str;
            return this;
        }

        public final Builder knEffectFetcher(com.ss.ugc.effectplatform.a.a aVar) {
            this.mKNEffectConfigBuilder.s = aVar;
            return this;
        }

        public final Builder platform(String str) {
            this.platform = str;
            this.mKNEffectConfigBuilder.f(str);
            return this;
        }

        public final Builder region(String str) {
            this.region = str;
            this.mKNEffectConfigBuilder.h(str);
            return this;
        }

        public final Builder requestStrategy(int i2) {
            this.requestStrategy = i2;
            this.mKNEffectConfigBuilder.x = i2;
            return this;
        }

        public final Builder retryCount(int i2) {
            this.retryCount = i2;
            this.mKNEffectConfigBuilder.o = i2;
            return this;
        }

        public final Builder sdkVersion(String str) {
            this.sdkVersion = str;
            this.mKNEffectConfigBuilder.b(str);
            return this;
        }

        public final Builder testStatus(String str) {
            this.testStatus = str;
            this.mKNEffectConfigBuilder.u = str;
            return this;
        }

        public static Context com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context2) {
            Context applicationContext = context2.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        public final Builder context(Context context2) {
            Context com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context2);
            this.context = com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
            this.mKNEffectConfigBuilder.a(com_ss_android_ugc_effectmanager_EffectConfiguration$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
            return this;
        }

        public final Builder draftList(ArrayList<String> arrayList) {
            this.draftList = arrayList;
            a.C4082a aVar = this.mKNEffectConfigBuilder;
            l.c(arrayList, "");
            aVar.z = arrayList;
            return this;
        }

        public final Builder effectMaxCacheSize(long j2) {
            a.C4082a aVar = this.mKNEffectConfigBuilder;
            if (j2 > 0) {
                aVar.G = j2;
            }
            return this;
        }

        public final Builder effectNetWorker(IEffectNetWorker iEffectNetWorker) {
            this.effectNetWorker = iEffectNetWorker;
            this.mKNEffectConfigBuilder.a((d) new KNNetworkClient(iEffectNetWorker));
            return this;
        }

        public final Builder executor(ExecutorService executorService) {
            this.mExecutor = executorService;
            this.mKNEffectConfigBuilder.a((b) new KNExecutorService(executorService));
            return this;
        }

        public final Builder monitorService(IMonitorService iMonitorService) {
            this.monitorService = iMonitorService;
            this.mKNEffectConfigBuilder.a((com.ss.ugc.effectplatform.i.a) new KNMonitorService(iMonitorService));
            return this;
        }

        public final Builder JsonConverter(IJsonConverter iJsonConverter) {
            this.jsonConverter = iJsonConverter;
            this.mKNEffectConfigBuilder.a(new com.ss.ugc.effectplatform.a.b.b(new KNJsonConverter(iJsonConverter)));
            return this;
        }

        public final Builder effectDir(File file) {
            this.effectDir = file;
            if (file == null) {
                return this;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            this.mKNEffectConfigBuilder.f153426m = file.getAbsolutePath();
            return this;
        }

        public final Builder hosts(List<Host> list) {
            this.hosts = list;
            if (!list.isEmpty()) {
                this.mKNEffectConfigBuilder.j(list.get(0).getItemName());
            }
            return this;
        }

        public final Builder effectFetcher(EffectFetcher effectFetcher2) {
            this.effectFetcher = effectFetcher2;
            if (effectFetcher2 != null && "DownloadableModelSupportEffectFetcher".equals(effectFetcher2.getClass().getSimpleName()) && e.a.b()) {
                this.mKNEffectConfigBuilder.s = e.a.a().b();
            }
            return this;
        }

        public final Builder iop(String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str)) {
                this.iopInfo.put("lx", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                this.iopInfo.put("ly", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                this.iopInfo.put("cy_code", str3);
            }
            a.C4082a aVar = this.mKNEffectConfigBuilder;
            if (str != null && (!l.a((Object) str, (Object) ""))) {
                aVar.w.put("lx", str);
            }
            if (str2 != null && (!l.a((Object) str2, (Object) ""))) {
                aVar.w.put("ly", str2);
            }
            if (str3 != null && (!l.a((Object) str3, (Object) ""))) {
                aVar.w.put("cy_code", str3);
            }
            return this;
        }
    }

    public void setCache(ICache iCache) {
        this.mCache = iCache;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setDraftList(ArrayList<String> arrayList) {
        this.mDraftList = arrayList;
    }

    public void setEffectDir(File file) {
        this.mEffectDir = file;
    }

    public void setEffectFetcher(EffectFetcher effectFetcher) {
        this.mEffectFetcher = effectFetcher;
    }

    public void setTaskManager(TaskManager taskManager) {
        this.mTaskManager = taskManager;
    }

    public void setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
        this.mEffectNetWorker.setIEffectNetWorker(iEffectNetWorker);
    }

    public static File com_ss_android_ugc_effectmanager_EffectConfiguration_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    private EffectConfiguration(Builder builder) {
        String str;
        String str2;
        EffectFetcher effectFetcher;
        String str3 = "online";
        this.mChannel = str3;
        this.iopInfo = new HashMap<>();
        this.mRetryCount = 1;
        this.mApiAddress = "/effect/api";
        this.mAccessKey = builder.accessKey;
        this.mSdkVersion = builder.sdkVersion;
        this.mAppVersion = builder.appVersion;
        this.mDeviceId = builder.deviceId;
        this.mChannel = builder.channel != null ? builder.channel : str3;
        if (builder.platform == null) {
            str = "android";
        } else {
            str = builder.platform;
        }
        this.mPlatform = str;
        this.mDeviceType = builder.deviceType;
        this.mContext = builder.context;
        if (builder.effectDir != null || this.mContext == null) {
            this.mEffectDir = builder.effectDir;
        } else {
            this.mEffectDir = new File(com_ss_android_ugc_effectmanager_EffectConfiguration_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.mContext), "effect");
        }
        this.mEffectDir = builder.effectDir;
        this.mEffectNetWorker = new EffectNetWorkerWrapper(builder.effectNetWorker, builder.context);
        this.mRegion = builder.region;
        this.mCache = builder.cache;
        this.mRetryCount = builder.retryCount;
        this.jsonConverter = builder.jsonConverter;
        if (builder.appID == null) {
            str2 = "0";
        } else {
            str2 = builder.appID;
        }
        this.mAppID = str2;
        this.mAppLanguage = builder.appLanguage;
        this.iopInfo = builder.iopInfo;
        this.monitorService = builder.monitorService;
        this.executor = builder.mExecutor;
        if (builder.effectFetcher == null) {
            effectFetcher = new DefaultEffectFetcher(this.mEffectNetWorker, this.monitorService, this.mAppID, this.mAccessKey);
        } else {
            effectFetcher = builder.effectFetcher;
        }
        this.mEffectFetcher = effectFetcher;
        this.testStatus = builder.testStatus;
        this.listenerManger = new ListenerManger();
        this.mEffectDownloadManager = EffectDownloadManager.INSTANCE;
        this.mDraftList = builder.draftList;
        this.mGpuVersion = builder.gpuVersion;
        this.requestStrategy = builder.requestStrategy;
        this.mHosts = builder.hosts;
        this.filterType = builder.filterType;
        this.mEffectConfig = builder.buildKNEffectConfig();
        a.a(KNLogger.INSTANCE);
    }

    /* synthetic */ EffectConfiguration(Builder builder, AnonymousClass1 r2) {
        this(builder);
    }
}
