package com.ss.android.ugc.aweme.ml.impl;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIPlayTime;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIStrategyConfig;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.feed.model.commercialize.PlanConfig;
import com.ss.android.ugc.aweme.feed.model.commercialize.UrlPackage;
import com.ss.android.ugc.aweme.ml.a.d;
import com.ss.android.ugc.aweme.ml.ab.CommerceSmartUIModelV2;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.MlSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifySceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.android.ugc.aweme.ml.infra.e;
import com.ss.android.ugc.aweme.ml.infra.h;
import com.ss.android.ugc.aweme.ml.infra.k;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public final class SmartFeedAdUIServiceImpl extends SmartFeedAdUIService {

    /* renamed from: a  reason: collision with root package name */
    public boolean f110533a;

    /* renamed from: b  reason: collision with root package name */
    CommerceSmartUIModelV2 f110534b;

    /* renamed from: c  reason: collision with root package name */
    public String f110535c = "";

    /* renamed from: d  reason: collision with root package name */
    public float f110536d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f110537e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f110538f;

    static {
        Covode.recordClassIndex(70940);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUIModel getSmartAdUIExperimentValue() {
        return com.ss.android.ugc.aweme.ml.ab.b.f110354b;
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f110541a;

        static {
            Covode.recordClassIndex(70942);
        }

        b(Throwable th) {
            this.f110541a = th;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.bytedance.c.a.a.a.b.a(this.f110541a);
            return null;
        }
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartFeedAdUIServiceImpl f110542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f110543b;

        static {
            Covode.recordClassIndex(70943);
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f110544a;

            static {
                Covode.recordClassIndex(70944);
            }

            a(c cVar) {
                this.f110544a = cVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                String str = this.f110544a.f110542a.f110535c;
                l.d("use_last_predict_label", "");
                l.d(str, "");
                com.ss.android.ugc.aweme.ml.a.c.f110300b.put("use_last_predict_label", str);
                com.ss.android.ugc.aweme.ml.a.c.f110299a.storeString("use_last_predict_label", str);
                return z.f158842a;
            }
        }

        c(SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl, Aweme aweme) {
            this.f110542a = smartFeedAdUIServiceImpl;
            this.f110543b = aweme;
        }

        @Override // com.ss.android.ugc.aweme.ml.infra.e
        public final void a(boolean z, k kVar) {
            this.f110542a.f110533a = false;
            float f2 = -1.0f;
            String str = "";
            if (!z || kVar == null || kVar.f110661a == null) {
                this.f110542a.f110535c = str;
                this.f110542a.f110536d = -1.0f;
            } else {
                String str2 = kVar.f110661a;
                if (str2 != null) {
                    str = str2;
                }
                Float a2 = kVar.a();
                if (a2 != null) {
                    f2 = a2.floatValue();
                }
                this.f110542a.f110535c = str;
                this.f110542a.f110536d = f2;
                i.b(new a(this), i.f4824a);
            }
            if (SmartFeedAdUIService.debug) {
                this.f110543b.getAid();
                User author = this.f110543b.getAuthor();
                if (author != null) {
                    author.getNickname();
                }
            }
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartFeedAdUIServiceImpl f110539a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f110540b;

        static {
            Covode.recordClassIndex(70941);
        }

        a(SmartFeedAdUIServiceImpl smartFeedAdUIServiceImpl, z.d dVar) {
            this.f110539a = smartFeedAdUIServiceImpl;
            this.f110540b = dVar;
        }

        public final void run() {
            if (SmartFeedAdUIService.debug) {
                System.currentTimeMillis();
            }
            if (this.f110539a.f110534b != null) {
                SmartPlaytimePredictService.b.f110602a.ensureEnvAvailable("commerce_ml_ui_model");
            }
            if (SmartFeedAdUIService.debug) {
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final boolean enable() {
        if (this.f110534b == null || !SmartPlaytimePredictService.b.f110602a.enable("commerce_ml_ui_model")) {
            return false;
        }
        return true;
    }

    public static ISmartFeedAdUIService a() {
        MethodCollector.i(4934);
        Object a2 = com.ss.android.ugc.b.a(ISmartFeedAdUIService.class, false);
        if (a2 != null) {
            ISmartFeedAdUIService iSmartFeedAdUIService = (ISmartFeedAdUIService) a2;
            MethodCollector.o(4934);
            return iSmartFeedAdUIService;
        }
        if (com.ss.android.ugc.b.cE == null) {
            synchronized (ISmartFeedAdUIService.class) {
                try {
                    if (com.ss.android.ugc.b.cE == null) {
                        com.ss.android.ugc.b.cE = new SmartFeedAdUIServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4934);
                    throw th;
                }
            }
        }
        SmartFeedAdUIService smartFeedAdUIService = (SmartFeedAdUIService) com.ss.android.ugc.b.cE;
        MethodCollector.o(4934);
        return smartFeedAdUIService;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final String getPredictLabelResult() {
        if (this.f110534b == null || !TextUtils.isEmpty(this.f110535c)) {
            return this.f110535c;
        }
        l.d("use_last_predict_label", "");
        l.d("use_last_predict_label", "");
        l.d("", "");
        Object obj = com.ss.android.ugc.aweme.ml.a.c.f110300b.get("use_last_predict_label");
        if (obj != null) {
            return (String) obj;
        }
        String string = com.ss.android.ugc.aweme.ml.a.c.f110299a.getString("use_last_predict_label", "");
        if (!TextUtils.equals(string, "")) {
            ConcurrentHashMap<String, Object> concurrentHashMap = com.ss.android.ugc.aweme.ml.a.c.f110300b;
            l.b(string, "");
            concurrentHashMap.put("use_last_predict_label", string);
        }
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        CommerceSmartUIPlayTime playTime;
        List<Integer> params;
        int intValue;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        MlSdkConfig mlSdkConfig;
        String str;
        CommerceSmartUIPlayTime playTime2;
        UrlPackage packageUrl;
        InputFeaturesConfig inputFeaturesConfig2;
        if (!this.f110538f) {
            this.f110538f = true;
            CommerceSmartUIModelV2 commerceSmartUIModelV2 = com.ss.android.ugc.aweme.ml.ab.b.f110354b;
            if (commerceSmartUIModelV2 != null) {
                this.f110534b = commerceSmartUIModelV2;
                OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
                SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
                smartClassifySceneConfig.setScene("commerce_ml_ui_model");
                CommerceSmartUIModelV2 commerceSmartUIModelV22 = this.f110534b;
                OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
                if (commerceSmartUIModelV22 != null) {
                    inputFeaturesConfig = commerceSmartUIModelV22.getFeatures();
                } else {
                    inputFeaturesConfig = null;
                }
                if (inputFeaturesConfig != null) {
                    CommerceSmartUIModelV2 commerceSmartUIModelV23 = this.f110534b;
                    if (commerceSmartUIModelV23 != null) {
                        inputFeaturesConfig2 = commerceSmartUIModelV23.getFeatures();
                    } else {
                        inputFeaturesConfig2 = null;
                    }
                    smartClassifySceneConfig.setFeatures(inputFeaturesConfig2);
                } else {
                    CommerceSmartUIModelV2 commerceSmartUIModelV24 = this.f110534b;
                    if (commerceSmartUIModelV24 != null && (playTime = commerceSmartUIModelV24.getPlayTime()) != null && (params = playTime.getParams()) != null && (!params.isEmpty()) && (intValue = params.get(0).intValue()) > 0) {
                        InputFeaturesConfig inputFeaturesConfig3 = new InputFeaturesConfig();
                        FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                        featurePlayTypeConfig.setEnable(true);
                        featurePlayTypeConfig.setRange(intValue);
                        featurePlayTypeConfig.setPlayRangeType("playtime");
                        featurePlayTypeConfig.setFeedRangeType("");
                        inputFeaturesConfig3.setFTypePlay(featurePlayTypeConfig);
                        smartClassifySceneConfig.setFeatures(inputFeaturesConfig3);
                    } else {
                        return;
                    }
                }
                smartClassifySceneConfig.setSdkConfig(new SmartSdkConfig());
                SmartSdkConfig sdkConfig = smartClassifySceneConfig.getSdkConfig();
                if (sdkConfig != null) {
                    sdkConfig.setMlSdkConfig(new MlSdkConfig());
                }
                SmartSdkConfig sdkConfig2 = smartClassifySceneConfig.getSdkConfig();
                if (!(sdkConfig2 == null || (mlSdkConfig = sdkConfig2.getMlSdkConfig()) == null)) {
                    CommerceSmartUIModelV2 commerceSmartUIModelV25 = this.f110534b;
                    if (commerceSmartUIModelV25 == null || (playTime2 = commerceSmartUIModelV25.getPlayTime()) == null || (packageUrl = playTime2.getPackageUrl()) == null) {
                        str = null;
                    } else {
                        str = packageUrl.getAndroidUrl();
                    }
                    mlSdkConfig.setPackageUrl(str);
                }
                CommerceSmartUIModelV2 commerceSmartUIModelV26 = this.f110534b;
                if (commerceSmartUIModelV26 != null) {
                    oneSmartDataTrackConfig = commerceSmartUIModelV26.getTrack();
                } else {
                    oneSmartDataTrackConfig = null;
                }
                smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
                onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
                CommerceSmartUIModelV2 commerceSmartUIModelV27 = this.f110534b;
                if (commerceSmartUIModelV27 != null) {
                    onePlaytimePredictRealConfig = commerceSmartUIModelV27.getRealConfig();
                }
                onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
                onePlaytimePredictConfig.setTrigger(0);
                SmartPlaytimePredictService.b.f110602a.configOneNewService(onePlaytimePredictConfig);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUITasks getPredictTaskIndex() {
        CommerceSmartUIModel smartAdUIExperimentValue;
        CommerceSmartUIStrategyConfig uiStrategy;
        PlanConfig[] plans;
        Integer num;
        PlanConfig planConfig;
        List<CommerceSmartUITasks> task;
        List<String> lableIndexMapping;
        try {
            String predictLabelResult = getPredictLabelResult();
            if (predictLabelResult == null || TextUtils.isEmpty(predictLabelResult) || (smartAdUIExperimentValue = getSmartAdUIExperimentValue()) == null || (uiStrategy = smartAdUIExperimentValue.getUiStrategy()) == null || (plans = uiStrategy.getPlans()) == null) {
                return null;
            }
            if (plans.length == 0) {
                return null;
            }
            CommerceSmartUIStrategyConfig uiStrategy2 = smartAdUIExperimentValue.getUiStrategy();
            if (uiStrategy2 != null) {
                num = Integer.valueOf(uiStrategy2.getDefaultIndex());
            } else {
                num = null;
            }
            CommerceSmartUIStrategyConfig uiStrategy3 = smartAdUIExperimentValue.getUiStrategy();
            if (uiStrategy3 != null && (lableIndexMapping = uiStrategy3.getLableIndexMapping()) != null && (true ^ lableIndexMapping.isEmpty()) && n.a((Iterable) lableIndexMapping, (Object) predictLabelResult) && n.a((List) lableIndexMapping, (Object) predictLabelResult) < plans.length) {
                num = Integer.valueOf(n.a((List) lableIndexMapping, (Object) predictLabelResult));
            }
            if (num == null || (planConfig = plans[num.intValue()]) == null || (task = planConfig.getTask()) == null) {
                return null;
            }
            return task.get(0);
        } catch (Throwable th) {
            i.b(new b(th), i.f4824a);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void startSmartAdUIJudge(Aweme aweme) {
        if (aweme != null) {
            if (SmartFeedAdUIService.debug) {
                enable();
                aweme.getAid();
            }
            if (enable()) {
                if (!this.f110537e) {
                    this.f110537e = true;
                    z.d dVar = new z.d();
                    dVar.element = 0;
                    if (SmartFeedAdUIService.debug) {
                        dVar.element = System.currentTimeMillis();
                    }
                    d.a(new a(this, dVar));
                }
                this.f110533a = true;
                h hVar = new h();
                hVar.f110631d = aweme;
                SmartPlaytimePredictService.b.f110602a.predict("commerce_ml_ui_model", hVar, null, new c(this, aweme));
            }
        }
    }
}
