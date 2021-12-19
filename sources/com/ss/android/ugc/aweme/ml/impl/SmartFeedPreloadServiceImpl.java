package com.ss.android.ugc.aweme.ml.impl;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment;
import com.ss.android.ugc.aweme.ml.ab.d;
import com.ss.android.ugc.aweme.ml.ab.e;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.ml.infra.FeatureFeedTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.h;
import com.ss.android.ugc.aweme.ml.infra.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import h.a.i;
import h.f.b.l;
import h.f.b.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class SmartFeedPreloadServiceImpl extends SmartFeedPreloadService {

    /* renamed from: a  reason: collision with root package name */
    public boolean f110558a;

    /* renamed from: b  reason: collision with root package name */
    SmartPreloadExperiment.SmartPreloadModel f110559b;

    /* renamed from: c  reason: collision with root package name */
    public String f110560c = "";

    /* renamed from: d  reason: collision with root package name */
    public float f110561d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends PreloadStrategyConfig> f110562e;

    /* renamed from: f  reason: collision with root package name */
    private int f110563f;

    /* renamed from: g  reason: collision with root package name */
    private LruCache<String, Boolean> f110564g = new LruCache<>(8);

    /* renamed from: h  reason: collision with root package name */
    private boolean f110565h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f110566i;

    static {
        Covode.recordClassIndex(70948);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final String getPredictLabelResult() {
        return this.f110560c;
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f110569a;

        static {
            Covode.recordClassIndex(70950);
        }

        b(Throwable th) {
            this.f110569a = th;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.bytedance.c.a.a.a.b.a(this.f110569a);
            return null;
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartFeedPreloadServiceImpl f110567a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f110568b;

        static {
            Covode.recordClassIndex(70949);
        }

        a(SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl, z.d dVar) {
            this.f110567a = smartFeedPreloadServiceImpl;
            this.f110568b = dVar;
        }

        public final void run() {
            if (SmartFeedPreloadService.debug) {
                System.currentTimeMillis();
            }
            if (this.f110567a.f110559b != null) {
                SmartPlaytimePredictService.b.f110602a.ensureEnvAvailable("playtime_ml");
            }
            if (SmartFeedPreloadService.debug) {
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final boolean enable() {
        if (this.f110559b == null || !SmartPlaytimePredictService.b.f110602a.enable("playtime_ml")) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig>, java.util.List<com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig> */
    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue() {
        if (this.f110562e == null) {
            try {
                PreloadStrategyConfig[] preloadStrategyConfigArr = d.f110361b;
                if (preloadStrategyConfigArr != null) {
                    this.f110562e = i.k(preloadStrategyConfigArr);
                }
            } catch (Throwable unused) {
            }
            if (this.f110562e == null) {
                this.f110562e = h.a.z.INSTANCE;
            }
        }
        List list = this.f110562e;
        if (list == null) {
            l.b();
        }
        return list;
    }

    public static ISmartFeedPreloadService a() {
        MethodCollector.i(7739);
        Object a2 = com.ss.android.ugc.b.a(ISmartFeedPreloadService.class, false);
        if (a2 != null) {
            ISmartFeedPreloadService iSmartFeedPreloadService = (ISmartFeedPreloadService) a2;
            MethodCollector.o(7739);
            return iSmartFeedPreloadService;
        }
        if (com.ss.android.ugc.b.cG == null) {
            synchronized (ISmartFeedPreloadService.class) {
                try {
                    if (com.ss.android.ugc.b.cG == null) {
                        com.ss.android.ugc.b.cG = new SmartFeedPreloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7739);
                    throw th;
                }
            }
        }
        SmartFeedPreloadService smartFeedPreloadService = (SmartFeedPreloadService) com.ss.android.ugc.b.cG;
        MethodCollector.o(7739);
        return smartFeedPreloadService;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig() {
        com.ss.android.ugc.aweme.ml.b.d dVar;
        try {
            String predictLabelResult = getPredictLabelResult();
            if (TextUtils.isEmpty(predictLabelResult) || (dVar = e.f110363b) == null || dVar.f110420c == null) {
                return null;
            }
            PreloadStrategyConfig[] preloadStrategyConfigArr = dVar.f110420c;
            l.b(preloadStrategyConfigArr, "");
            if (preloadStrategyConfigArr.length == 0) {
                return null;
            }
            PreloadStrategyConfig[] preloadStrategyConfigArr2 = dVar.f110420c;
            int i2 = dVar.f110418a;
            List<String> list = dVar.f110419b;
            if (list != null && list.size() > 0 && list.contains(predictLabelResult) && list.indexOf(predictLabelResult) < preloadStrategyConfigArr2.length) {
                i2 = list.indexOf(predictLabelResult);
            }
            PreloadStrategyConfig preloadStrategyConfig = preloadStrategyConfigArr2[i2];
            boolean z = SmartFeedPreloadService.debug;
            return preloadStrategyConfig;
        } catch (Throwable th) {
            b.i.b(new b(th), b.i.f4824a);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        int i2;
        MlSdkConfig mlSdkConfig;
        String str;
        boolean z;
        if (!this.f110566i) {
            this.f110566i = true;
            if (!SmartPreloadExperiment.a.f110334a) {
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel = (SmartPreloadExperiment.SmartPreloadModel) com.bytedance.ies.abmock.b.a().a(true, "playtime_ml", SmartPreloadExperiment.SmartPreloadModel.class, SmartPreloadExperiment.f110333a);
                SmartPreloadExperiment.a.f110335b = smartPreloadModel;
                if (smartPreloadModel != null) {
                    if (SmartPreloadExperiment.a.f110335b.params != null && SmartPreloadExperiment.a.f110335b.params.length > 0) {
                        SmartPreloadExperiment.a.f110336c = SmartPreloadExperiment.a.f110335b.params[0];
                    }
                    SmartPreloadExperiment.a.f110337d = SmartPreloadExperiment.a.f110335b.embeddingRange;
                    SmartPreloadExperiment.a.f110338e = SmartPreloadExperiment.a.f110335b.skipCount;
                    SmartPreloadExperiment.a.f110339f = SmartPreloadExperiment.a.f110335b.notRunWhenPause;
                    SmartPreloadExperiment.a.f110340g = SmartPreloadExperiment.a.f110335b.notRepeat;
                    SmartPreloadExperiment.a.f110341h = (long) SmartPreloadExperiment.a.f110335b.runDelay;
                    if (SmartPreloadExperiment.a.f110335b.features == null) {
                        InputFeaturesConfig inputFeaturesConfig2 = new InputFeaturesConfig();
                        FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                        featurePlayTypeConfig.setEnable(true);
                        featurePlayTypeConfig.setRange(SmartPreloadExperiment.a.f110336c);
                        featurePlayTypeConfig.setPlayRangeType("playtime");
                        featurePlayTypeConfig.setFeedRangeType("");
                        inputFeaturesConfig2.setFTypePlay(featurePlayTypeConfig);
                        if (SmartPreloadExperiment.a.f110342i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        featurePlayTypeConfig.setRangeExcludeThis(z);
                        if (SmartPreloadExperiment.a.f110337d > 0) {
                            FeatureFeedTypeConfig featureFeedTypeConfig = new FeatureFeedTypeConfig();
                            featureFeedTypeConfig.setEnable(true);
                            featureFeedTypeConfig.setRange(SmartPreloadExperiment.a.f110337d);
                            featureFeedTypeConfig.setFeedRangeType("embeddings");
                        }
                        SmartPreloadExperiment.a.f110335b.features = inputFeaturesConfig2;
                    }
                }
                SmartPreloadExperiment.a.f110334a = true;
            }
            SmartPreloadExperiment.SmartPreloadModel smartPreloadModel2 = SmartPreloadExperiment.a.f110335b;
            if (smartPreloadModel2 != null) {
                this.f110559b = smartPreloadModel2;
                OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
                SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
                smartClassifySceneConfig.setScene("playtime_ml");
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel3 = this.f110559b;
                OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
                if (smartPreloadModel3 != null) {
                    inputFeaturesConfig = smartPreloadModel3.features;
                } else {
                    inputFeaturesConfig = null;
                }
                smartClassifySceneConfig.setFeatures(inputFeaturesConfig);
                smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
                SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig != null) {
                    sdkConfig.setMlSdkConfig(new MlSdkConfig());
                }
                SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
                if (!(sdkConfig2 == null || (mlSdkConfig = sdkConfig2.getMlSdkConfig()) == null)) {
                    SmartPreloadExperiment.SmartPreloadModel smartPreloadModel4 = this.f110559b;
                    if (smartPreloadModel4 != null) {
                        str = smartPreloadModel4.packageUrl;
                    } else {
                        str = null;
                    }
                    mlSdkConfig.setPackageUrl(str);
                }
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel5 = this.f110559b;
                if (smartPreloadModel5 != null) {
                    oneSmartDataTrackConfig = smartPreloadModel5.track;
                } else {
                    oneSmartDataTrackConfig = null;
                }
                smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
                onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel6 = this.f110559b;
                if (smartPreloadModel6 != null) {
                    i2 = smartPreloadModel6.runDelay;
                } else {
                    i2 = 0;
                }
                onePlaytimePredictConfig.setRunDelay(i2);
                onePlaytimePredictConfig.setTrigger(0);
                SmartPreloadExperiment.SmartPreloadModel smartPreloadModel7 = this.f110559b;
                if (smartPreloadModel7 != null) {
                    onePlaytimePredictRealConfig = smartPreloadModel7.realConfig;
                }
                onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
                SmartPlaytimePredictService.b.f110602a.configOneNewService(onePlaytimePredictConfig);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void startSmartPreloadV2Judge(Aweme aweme) {
        if (aweme != null) {
            if (SmartFeedPreloadService.debug) {
                enable();
            }
            if (!enable()) {
                return;
            }
            if (SmartPreloadExperiment.a.f110338e > 0 && this.f110563f < SmartPreloadExperiment.a.f110338e) {
                int i2 = this.f110563f + 1;
                this.f110563f = i2;
                if (i2 == SmartPreloadExperiment.a.f110338e && !this.f110565h) {
                    this.f110565h = true;
                    z.d dVar = new z.d();
                    dVar.element = 0;
                    if (SmartFeedPreloadService.debug) {
                        dVar.element = System.currentTimeMillis();
                    }
                    com.ss.android.ugc.aweme.ml.a.d.a(new a(this, dVar), SmartPreloadExperiment.a.f110341h);
                }
            } else if (SmartPreloadExperiment.a.f110341h <= 0 || !this.f110558a) {
                if (SmartPreloadExperiment.a.f110340g) {
                    String aid = aweme.getAid();
                    if (this.f110564g.get(aid) == null) {
                        this.f110564g.put(aid, true);
                    } else {
                        return;
                    }
                }
                this.f110558a = true;
                h hVar = new h();
                hVar.f110631d = aweme;
                SmartPlaytimePredictService.b.f110602a.predict("playtime_ml", hVar, null, new c(this, aweme));
            }
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.ml.infra.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartFeedPreloadServiceImpl f110570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f110571b;

        static {
            Covode.recordClassIndex(70951);
        }

        c(SmartFeedPreloadServiceImpl smartFeedPreloadServiceImpl, Aweme aweme) {
            this.f110570a = smartFeedPreloadServiceImpl;
            this.f110571b = aweme;
        }

        @Override // com.ss.android.ugc.aweme.ml.infra.e
        public final void a(boolean z, k kVar) {
            this.f110570a.f110558a = false;
            float f2 = -1.0f;
            String str = "";
            if (!z || kVar == null || kVar.f110661a == null) {
                this.f110570a.f110560c = str;
                this.f110570a.f110561d = -1.0f;
            } else {
                String str2 = kVar.f110661a;
                if (str2 != null) {
                    str = str2;
                }
                Float a2 = kVar.a();
                if (a2 != null) {
                    f2 = a2.floatValue();
                }
                this.f110570a.f110560c = str;
                this.f110570a.f110561d = f2;
            }
            if (SmartFeedPreloadService.debug) {
                this.f110571b.getAid();
                User author = this.f110571b.getAuthor();
                if (author != null) {
                    author.getNickname();
                }
            }
        }
    }
}
