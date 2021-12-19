package com.ss.android.ugc.aweme.ml.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadProfileV2Experiment;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService;
import com.ss.android.ugc.aweme.setting.model.MLModel;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public d f110424a;

    /* renamed from: b  reason: collision with root package name */
    public MLModel f110425b;

    static {
        Covode.recordClassIndex(70903);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f110426a = new c();

        static {
            Covode.recordClassIndex(70904);
        }
    }

    public c() {
        int i2;
        SmartPreloadProfileV2Experiment.PreloadProfileMLModel a2 = SmartPreloadProfileV2Experiment.a.a();
        this.f110425b = a2;
        if (a2 != null) {
            this.f110424a = new d(new com.ss.android.ugc.aweme.ml.b.a(this.f110425b));
            InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            if (this.f110425b.params == null || this.f110425b.params.length <= 0) {
                i2 = 5;
            } else {
                i2 = this.f110425b.params[0];
            }
            featurePlayTypeConfig.setRange(i2);
            featurePlayTypeConfig.setPlayRangeType("playtime");
            featurePlayTypeConfig.setFeedRangeType("");
            inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
            SmartDataCenterApiService.instance().addSceneModelConfig(inputFeaturesConfig);
        }
        SmartPreloadProfileV2Service.getDebug();
    }
}
