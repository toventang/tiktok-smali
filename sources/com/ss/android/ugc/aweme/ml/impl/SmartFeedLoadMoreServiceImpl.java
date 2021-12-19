package com.ss.android.ugc.aweme.ml.impl;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.FeedLoadMorePlan;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreStrategyConfig;
import com.ss.android.ugc.aweme.ml.ab.c;
import com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedLoadMoreService;
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
import h.f.b.l;
import h.f.b.z;
import org.json.JSONObject;

public final class SmartFeedLoadMoreServiceImpl extends SmartFeedLoadMoreService {

    /* renamed from: a  reason: collision with root package name */
    public boolean f110545a;

    /* renamed from: b  reason: collision with root package name */
    public LruCache<String, ISmartFeedLoadMoreService.b> f110546b = new LruCache<>(4);

    /* renamed from: c  reason: collision with root package name */
    public boolean f110547c;

    /* renamed from: d  reason: collision with root package name */
    SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel f110548d;

    /* renamed from: e  reason: collision with root package name */
    private final int f110549e = 3;

    /* renamed from: f  reason: collision with root package name */
    private boolean f110550f;

    /* renamed from: g  reason: collision with root package name */
    private int f110551g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f110552h;

    static {
        Covode.recordClassIndex(70945);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartFeedLoadMoreServiceImpl f110553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f110554b;

        static {
            Covode.recordClassIndex(70946);
        }

        a(SmartFeedLoadMoreServiceImpl smartFeedLoadMoreServiceImpl, z.d dVar) {
            this.f110553a = smartFeedLoadMoreServiceImpl;
            this.f110554b = dVar;
        }

        public final void run() {
            if (SmartFeedLoadMoreService.debug) {
                System.currentTimeMillis();
            }
            if (this.f110553a.f110548d != null) {
                SmartPlaytimePredictService.b.f110602a.ensureEnvAvailable("feed_load_more_ml");
            }
            if (SmartFeedLoadMoreService.debug) {
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        }
    }

    private boolean b() {
        if (this.f110548d == null || !SmartPlaytimePredictService.b.f110602a.enable("feed_load_more_ml")) {
            return false;
        }
        return true;
    }

    public static ISmartFeedLoadMoreService a() {
        MethodCollector.i(4847);
        Object a2 = com.ss.android.ugc.b.a(ISmartFeedLoadMoreService.class, false);
        if (a2 != null) {
            ISmartFeedLoadMoreService iSmartFeedLoadMoreService = (ISmartFeedLoadMoreService) a2;
            MethodCollector.o(4847);
            return iSmartFeedLoadMoreService;
        }
        if (com.ss.android.ugc.b.cF == null) {
            synchronized (ISmartFeedLoadMoreService.class) {
                try {
                    if (com.ss.android.ugc.b.cF == null) {
                        com.ss.android.ugc.b.cF = new SmartFeedLoadMoreServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4847);
                    throw th;
                }
            }
        }
        SmartFeedLoadMoreService smartFeedLoadMoreService = (SmartFeedLoadMoreService) com.ss.android.ugc.b.cF;
        MethodCollector.o(4847);
        return smartFeedLoadMoreService;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void checkAndInit() {
        InputFeaturesConfig inputFeaturesConfig;
        OneSmartDataTrackConfig oneSmartDataTrackConfig;
        MlSdkConfig mlSdkConfig;
        String str;
        if (!this.f110552h) {
            this.f110552h = true;
            int i2 = 0;
            if (!SmartFeedLoadMoreExperiment.a.f110320a) {
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel = (SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel) com.bytedance.ies.abmock.b.a().a(true, "feed_load_more_ml", SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel.class, SmartFeedLoadMoreExperiment.f110319a);
                SmartFeedLoadMoreExperiment.a.f110321b = feedLoadMoreMLModel;
                if (feedLoadMoreMLModel != null) {
                    if (SmartFeedLoadMoreExperiment.a.f110321b.params != null && SmartFeedLoadMoreExperiment.a.f110321b.params.length > 0) {
                        SmartFeedLoadMoreExperiment.a.f110322c = SmartFeedLoadMoreExperiment.a.f110321b.params[0];
                    }
                    SmartFeedLoadMoreExperiment.a.f110323d = SmartFeedLoadMoreExperiment.a.f110321b.countWhenExecute;
                    SmartFeedLoadMoreExperiment.a.f110324e = (long) SmartFeedLoadMoreExperiment.a.f110321b.runDelay;
                    SmartFeedLoadMoreExperiment.a.f110325f = SmartFeedLoadMoreExperiment.a.f110321b.loadModelBefore;
                    SmartFeedLoadMoreExperiment.a.f110326g = SmartFeedLoadMoreExperiment.a.f110321b.skipCount;
                    if (SmartFeedLoadMoreExperiment.a.f110321b.features == null) {
                        InputFeaturesConfig inputFeaturesConfig2 = new InputFeaturesConfig();
                        FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
                        featurePlayTypeConfig.setEnable(true);
                        featurePlayTypeConfig.setRange(SmartFeedLoadMoreExperiment.a.f110322c);
                        featurePlayTypeConfig.setPlayRangeType("playtime");
                        featurePlayTypeConfig.setFeedRangeType("");
                        inputFeaturesConfig2.setFTypePlay(featurePlayTypeConfig);
                        featurePlayTypeConfig.setRangeExcludeThis(true);
                        SmartFeedLoadMoreExperiment.a.f110321b.features = inputFeaturesConfig2;
                    }
                }
                SmartFeedLoadMoreExperiment.a.f110320a = true;
            }
            SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel2 = SmartFeedLoadMoreExperiment.a.f110321b;
            if (feedLoadMoreMLModel2 != null) {
                this.f110548d = feedLoadMoreMLModel2;
                OnePlaytimePredictConfig onePlaytimePredictConfig = new OnePlaytimePredictConfig();
                SmartClassifySceneConfig smartClassifySceneConfig = new SmartClassifySceneConfig();
                smartClassifySceneConfig.setScene("feed_load_more_ml");
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel3 = this.f110548d;
                OnePlaytimePredictRealConfig onePlaytimePredictRealConfig = null;
                if (feedLoadMoreMLModel3 != null) {
                    inputFeaturesConfig = feedLoadMoreMLModel3.features;
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
                    SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel4 = this.f110548d;
                    if (feedLoadMoreMLModel4 != null) {
                        str = feedLoadMoreMLModel4.packageUrl;
                    } else {
                        str = null;
                    }
                    mlSdkConfig.setPackageUrl(str);
                }
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel5 = this.f110548d;
                if (feedLoadMoreMLModel5 != null) {
                    oneSmartDataTrackConfig = feedLoadMoreMLModel5.track;
                } else {
                    oneSmartDataTrackConfig = null;
                }
                smartClassifySceneConfig.setTrack(oneSmartDataTrackConfig);
                onePlaytimePredictConfig.setSceneConfig(smartClassifySceneConfig);
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel6 = this.f110548d;
                if (feedLoadMoreMLModel6 != null) {
                    onePlaytimePredictRealConfig = feedLoadMoreMLModel6.realConfig;
                }
                onePlaytimePredictConfig.setRealConfig(onePlaytimePredictRealConfig);
                onePlaytimePredictConfig.setTrigger(0);
                SmartFeedLoadMoreExperiment.FeedLoadMoreMLModel feedLoadMoreMLModel7 = this.f110548d;
                if (feedLoadMoreMLModel7 != null) {
                    i2 = feedLoadMoreMLModel7.runDelay;
                }
                onePlaytimePredictConfig.setRunDelay(i2);
                SmartPlaytimePredictService.b.f110602a.configOneNewService(onePlaytimePredictConfig);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final boolean isSmartFeedLoadMoreScene(String str) {
        return l.a((Object) "homepage_hot", (Object) str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void startSmartFeedLoadMoreJudge(Aweme aweme, ISmartFeedLoadMoreService.a aVar) {
        l.d(aVar, "");
        if (aweme != null) {
            if (SmartFeedLoadMoreService.debug) {
                b();
                aweme.getAid();
            }
            if (b()) {
                this.f110545a = true;
                this.f110547c = false;
                h hVar = new h();
                hVar.f110631d = aweme;
                SmartPlaytimePredictService.b.f110602a.predict("feed_load_more_ml", hVar, null, new b(this, aweme, aVar));
            }
        }
    }

    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartFeedLoadMoreServiceImpl f110555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f110556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ISmartFeedLoadMoreService.a f110557c;

        static {
            Covode.recordClassIndex(70947);
        }

        @Override // com.ss.android.ugc.aweme.ml.infra.e
        public final void a(boolean z, k kVar) {
            float f2;
            FeedLoadMorePlan feedLoadMorePlan;
            this.f110555a.f110545a = false;
            if (!z || kVar == null || kVar.f110661a == null) {
                this.f110555a.f110547c = true;
                return;
            }
            if (SmartFeedLoadMoreService.debug) {
                System.currentTimeMillis();
            }
            String str = kVar.f110661a;
            if (str == null) {
                str = "";
            }
            Float a2 = kVar.a();
            if (a2 != null) {
                f2 = a2.floatValue();
            } else {
                f2 = -1.0f;
            }
            ISmartFeedLoadMoreService.b bVar = this.f110555a.f110546b.get(this.f110556b.getAid());
            if (bVar != null) {
                bVar.f110374a = f2;
                bVar.f110375b = str;
            }
            l.d(str, "");
            if (!c.f110358c) {
                c.f110357b = (SmartFeedLoadMoreStrategyConfig) com.bytedance.ies.abmock.b.a().a(true, "feed_load_more_strategy", SmartFeedLoadMoreStrategyConfig.class, c.f110356a);
                c.f110358c = true;
            }
            SmartFeedLoadMoreStrategyConfig smartFeedLoadMoreStrategyConfig = c.f110357b;
            if (smartFeedLoadMoreStrategyConfig != null) {
                feedLoadMorePlan = smartFeedLoadMoreStrategyConfig.getPlan(str);
            } else {
                feedLoadMorePlan = null;
            }
            ISmartFeedLoadMoreService.a aVar = this.f110557c;
            if (!(aVar == null || feedLoadMorePlan == null)) {
                aVar.a(feedLoadMorePlan.getPreload(), feedLoadMorePlan.getDelay());
            }
            if (SmartFeedLoadMoreService.debug) {
                System.currentTimeMillis();
                this.f110556b.getAid();
                User author = this.f110556b.getAuthor();
                if (author != null) {
                    author.getNickname();
                }
            }
        }

        b(SmartFeedLoadMoreServiceImpl smartFeedLoadMoreServiceImpl, Aweme aweme, ISmartFeedLoadMoreService.a aVar) {
            this.f110555a = smartFeedLoadMoreServiceImpl;
            this.f110556b = aweme;
            this.f110557c = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    public final void addVideoPlayEndReportData(JSONObject jSONObject, Aweme aweme, Integer num) {
        l.d(jSONObject, "");
        if (aweme != null && num != null && b() && num.intValue() == 0) {
            ISmartFeedLoadMoreService.b bVar = this.f110546b.get(aweme.getAid());
            if (bVar != null) {
                if (bVar.f110374a >= 0.0f) {
                    jSONObject.put("lp_predict", Float.valueOf(bVar.f110374a));
                }
                if (bVar.f110375b != null) {
                    jSONObject.put("lp_predictL", bVar.f110375b);
                }
                if (bVar.f110376c >= 0) {
                    jSONObject.put("left_videos_cnt", bVar.f110376c);
                }
            }
            if (SmartFeedLoadMoreService.debug) {
                aweme.getAid();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.f110374a >= 0.0f) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008e, code lost:
        if (r7 > r5.f110549e) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean needCheckLoadMore(int r6, int r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl.needCheckLoadMore(int, int, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
