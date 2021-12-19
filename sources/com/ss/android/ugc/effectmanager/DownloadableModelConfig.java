package com.ss.android.ugc.effectmanager;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import com.ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import com.ss.android.ugc.effectmanager.knadapt.KNExecutor;
import com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter;
import com.ss.android.ugc.effectmanager.knadapt.KNMonitorService;
import com.ss.android.ugc.effectmanager.knadapt.KNNetworkClient;
import com.ss.android.ugc.effectmanager.knadapt.ModelConverterExtKt;
import com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import com.ss.ugc.effectplatform.a;
import com.ss.ugc.effectplatform.a.c.d;
import d.a.b.b.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class DownloadableModelConfig {
    private final String mAccessKey;
    private final String mAppId;
    private final AssetManager mAssetManager;
    private final Context mContext;
    private final String mDeviceType;
    private final EffectConfiguration mEffectConfiguration;
    private final IEffectNetWorker mEffectNetWorker;
    private final ModelEventListener mEventListener;
    private final Pattern mExclusionPattern;
    private final Executor mExecutor;
    private final FetchModelType mFetchModelType;
    private final List<Host> mHosts;
    private final IJsonConverter mJsonConverter;
    private a mKNEffectConfig;
    private final ModelFileEnv mModelFileEnv;
    private final IMonitorService mMonitorService;
    private final String mSdkVersion;
    private final String mWorkspace;

    static {
        Covode.recordClassIndex(95171);
    }

    public final String getAccessKey() {
        return this.mAccessKey;
    }

    public final String getAppId() {
        return this.mAppId;
    }

    public final AssetManager getAssetManager() {
        return this.mAssetManager;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final String getDeviceType() {
        return this.mDeviceType;
    }

    public final EffectConfiguration getEffectConfiguration() {
        return this.mEffectConfiguration;
    }

    public final IEffectNetWorker getEffectNetWorker() {
        return this.mEffectNetWorker;
    }

    public final ModelEventListener getEventListener() {
        return this.mEventListener;
    }

    public final Pattern getExclusionPattern() {
        return this.mExclusionPattern;
    }

    public final Executor getExecutor() {
        return this.mExecutor;
    }

    public final List<Host> getHosts() {
        return this.mHosts;
    }

    public final IJsonConverter getJsonConverter() {
        return this.mJsonConverter;
    }

    public final a getKNEffectConfig() {
        return this.mKNEffectConfig;
    }

    public final ModelFileEnv getModelFileEnv() {
        return this.mModelFileEnv;
    }

    public final FetchModelType getModelType() {
        return this.mFetchModelType;
    }

    public final IMonitorService getMonitorService() {
        return this.mMonitorService;
    }

    public final String getSdkVersion() {
        return this.mSdkVersion;
    }

    public final String getWorkspace() {
        return this.mWorkspace;
    }

    public static final class Builder {
        String mAccessKey;
        String mAppId;
        AssetManager mAssetManager;
        String mBid;
        Context mContext;
        String mDeviceType;
        EffectConfiguration mEffectConfiguration;
        IEffectNetWorker mEffectNetWorker;
        ModelEventListener mEventListener;
        Pattern mExclusionPattern;
        Executor mExecutor;
        FetchModelType mFetchModelType;
        List<Host> mHosts = new ArrayList();
        IJsonConverter mJsonConverter;
        private a.C4082a mKNEffectConfigBuilder = new a.C4082a();
        ModelFileEnv mModelFileEnv;
        IMonitorService mMonitorService;
        String mSdkVersion;
        String mWorkspace;

        static {
            Covode.recordClassIndex(95173);
        }

        public final DownloadableModelConfig build() {
            return new DownloadableModelConfig(this);
        }

        public final a buildKNConfig() {
            return this.mKNEffectConfigBuilder.a();
        }

        public final Builder setAssetManager(AssetManager assetManager) {
            this.mAssetManager = assetManager;
            return this;
        }

        public final Builder setBid(String str) {
            this.mBid = str;
            return this;
        }

        public final Builder setAccessKey(String str) {
            this.mAccessKey = str;
            this.mKNEffectConfigBuilder.a(str);
            return this;
        }

        public final Builder setAppId(String str) {
            this.mAppId = str;
            this.mKNEffectConfigBuilder.f153419f = str;
            return this;
        }

        public final Builder setDeviceType(String str) {
            this.mDeviceType = str;
            this.mKNEffectConfigBuilder.g(str);
            return this;
        }

        public final Builder setModelApiMaxTryCount(int i2) {
            this.mKNEffectConfigBuilder.p = i2;
            return this;
        }

        public final Builder setSdkVersion(String str) {
            this.mSdkVersion = str;
            this.mKNEffectConfigBuilder.b(str);
            return this;
        }

        public final Builder setWorkspace(String str) {
            this.mWorkspace = str;
            this.mKNEffectConfigBuilder.n = str;
            return this;
        }

        public static Context com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            return applicationContext;
        }

        public final Builder setContext(Context context) {
            Context com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
            this.mContext = com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
            this.mKNEffectConfigBuilder.a(com_ss_android_ugc_effectmanager_DownloadableModelConfig$Builder_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
            return this;
        }

        public final Builder setEffectNetWorker(IEffectNetWorker iEffectNetWorker) {
            this.mEffectNetWorker = iEffectNetWorker;
            this.mKNEffectConfigBuilder.a((d) new KNNetworkClient(iEffectNetWorker));
            return this;
        }

        public final Builder setEventListener(ModelEventListener modelEventListener) {
            this.mEventListener = modelEventListener;
            this.mKNEffectConfigBuilder.E = ModelListenerAdaptKt.toKNListener(modelEventListener);
            return this;
        }

        public final Builder setExecutor(Executor executor) {
            this.mExecutor = executor;
            this.mKNEffectConfigBuilder.a((b) new KNExecutor(executor));
            return this;
        }

        public final Builder setModelFileEnv(ModelFileEnv modelFileEnv) {
            this.mModelFileEnv = modelFileEnv;
            a.C4082a aVar = this.mKNEffectConfigBuilder;
            a.c kNModel = ModelConverterExtKt.toKNModel(modelFileEnv);
            l.c(kNModel, "");
            aVar.D = kNModel;
            return this;
        }

        public final Builder setModelType(FetchModelType fetchModelType) {
            this.mFetchModelType = fetchModelType;
            a.C4082a aVar = this.mKNEffectConfigBuilder;
            com.ss.ugc.effectplatform.model.algorithm.b kNFetchModelType = ModelConverterExtKt.toKNFetchModelType(fetchModelType);
            l.c(kNFetchModelType, "");
            aVar.B = kNFetchModelType;
            return this;
        }

        public final Builder setMonitorService(IMonitorService iMonitorService) {
            this.mMonitorService = iMonitorService;
            this.mKNEffectConfigBuilder.a((com.ss.ugc.effectplatform.i.a) new KNMonitorService(iMonitorService));
            return this;
        }

        public final Builder setExclusionPattern(String str) {
            if (str == null) {
                this.mExclusionPattern = null;
            } else {
                this.mExclusionPattern = Pattern.compile(str);
                a.C4082a aVar = this.mKNEffectConfigBuilder;
                l.c(str, "");
                aVar.C = str;
            }
            return this;
        }

        public final Builder setHosts(List<Host> list) {
            this.mHosts.addAll(list);
            if (!list.isEmpty()) {
                this.mKNEffectConfigBuilder.j(list.get(0).getItemName());
            }
            return this;
        }

        public final Builder setJsonConverter(IJsonConverter iJsonConverter) {
            this.mJsonConverter = iJsonConverter;
            this.mKNEffectConfigBuilder.a(new com.ss.ugc.effectplatform.a.b.b(new KNJsonConverter(iJsonConverter)));
            return this;
        }

        public final Builder setEffectConfiguration(EffectConfiguration effectConfiguration) {
            this.mEffectConfiguration = effectConfiguration;
            if (effectConfiguration.getContext() != null && this.mContext == null) {
                setContext(effectConfiguration.getContext());
            }
            if (effectConfiguration.getAppVersion() != null) {
                this.mKNEffectConfigBuilder.c(effectConfiguration.getAppVersion());
            }
            if (effectConfiguration.getChannel() != null) {
                this.mKNEffectConfigBuilder.e(effectConfiguration.getChannel());
            }
            if (effectConfiguration.getDeviceId() != null) {
                this.mKNEffectConfigBuilder.d(effectConfiguration.getDeviceId());
            }
            if (effectConfiguration.getPlatform() != null) {
                this.mKNEffectConfigBuilder.f(effectConfiguration.getPlatform());
            }
            if (effectConfiguration.getRegion() != null) {
                this.mKNEffectConfigBuilder.h(effectConfiguration.getRegion());
            }
            if (effectConfiguration.getAppLanguage() != null) {
                this.mKNEffectConfigBuilder.i(effectConfiguration.getAppLanguage());
            }
            if (effectConfiguration.getGpuVersion() != null) {
                this.mKNEffectConfigBuilder.v = effectConfiguration.getGpuVersion();
            }
            if (effectConfiguration.getTestStatus() != null) {
                this.mKNEffectConfigBuilder.u = effectConfiguration.getTestStatus();
            }
            this.mKNEffectConfigBuilder.a(effectConfiguration.getFilterType());
            return this;
        }
    }

    public enum ModelFileEnv {
        TEST,
        ONLINE;

        static {
            Covode.recordClassIndex(95174);
        }
    }

    private DownloadableModelConfig(Builder builder) {
        ModelFileEnv modelFileEnv;
        FetchModelType fetchModelType;
        this.mAssetManager = (AssetManager) Preconditions.checkNotNull(builder.mAssetManager);
        this.mWorkspace = (String) Preconditions.checkNotNull(builder.mWorkspace);
        this.mEffectNetWorker = (IEffectNetWorker) Preconditions.checkNotNull(builder.mEffectNetWorker);
        this.mHosts = Collections.unmodifiableList(builder.mHosts);
        this.mJsonConverter = (IJsonConverter) Preconditions.checkNotNull(builder.mJsonConverter);
        this.mExecutor = (Executor) Preconditions.checkNotNull(builder.mExecutor);
        this.mDeviceType = (String) Preconditions.checkNotNull(builder.mDeviceType);
        this.mSdkVersion = (String) Preconditions.checkNotNull(builder.mSdkVersion);
        this.mAppId = (String) Preconditions.checkNotNull(builder.mAppId);
        this.mAccessKey = (String) Preconditions.checkNotNull(builder.mAccessKey);
        this.mMonitorService = builder.mMonitorService;
        this.mExclusionPattern = builder.mExclusionPattern;
        this.mEventListener = builder.mEventListener;
        if (builder.mModelFileEnv == null) {
            modelFileEnv = ModelFileEnv.ONLINE;
        } else {
            modelFileEnv = builder.mModelFileEnv;
        }
        this.mModelFileEnv = modelFileEnv;
        if (builder.mFetchModelType == null) {
            fetchModelType = FetchModelType.ORIGIN;
        } else {
            fetchModelType = builder.mFetchModelType;
        }
        this.mFetchModelType = fetchModelType;
        this.mEffectConfiguration = builder.mEffectConfiguration;
        this.mContext = builder.mContext;
        a buildKNConfig = builder.buildKNConfig();
        this.mKNEffectConfig = buildKNConfig;
        if (buildKNConfig != null) {
            a.a(new d.a.e.a() {
                /* class com.ss.android.ugc.effectmanager.DownloadableModelConfig.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95172);
                }

                public void setEnabled(boolean z) {
                }

                @Override // d.a.e.a
                public boolean getEnabled() {
                    return EPLog.INSTANCE.getSEnableLog();
                }

                @Override // d.a.e.a
                public void logDebug(String str, String str2) {
                    EPLog.d(str, str2);
                }

                @Override // d.a.e.a
                public void logError(String str, String str2) {
                    EPLog.e(str, str2);
                }

                @Override // d.a.e.a
                public void logError(String str, String str2, Throwable th) {
                    EPLog.e(str, str2, th);
                }
            });
        }
    }
}
