package com.ss.android.ugc.aweme.ml.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadCommentV2Experiment;
import com.ss.android.ugc.aweme.ml.api.SmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiService;
import com.ss.android.ugc.aweme.setting.model.MLModel;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f110421a;

    /* renamed from: b  reason: collision with root package name */
    public MLModel f110422b;

    static {
        Covode.recordClassIndex(70900);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.c.a$a  reason: collision with other inner class name */
    public static class C2824a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f110423a = new a();

        static {
            Covode.recordClassIndex(70901);
        }
    }

    public a() {
        int i2;
        SmartPreloadCommentV2Experiment.PreloadCommentMLModel a2 = SmartPreloadCommentV2Experiment.a.a();
        this.f110422b = a2;
        if (a2 != null) {
            this.f110421a = new b(new com.ss.android.ugc.aweme.ml.b.a(this.f110422b));
            InputFeaturesConfig inputFeaturesConfig = new InputFeaturesConfig();
            FeaturePlayTypeConfig featurePlayTypeConfig = new FeaturePlayTypeConfig();
            featurePlayTypeConfig.setEnable(true);
            if (this.f110422b.params == null || this.f110422b.params.length <= 0) {
                i2 = 5;
            } else {
                i2 = this.f110422b.params[0];
            }
            featurePlayTypeConfig.setRange(i2);
            featurePlayTypeConfig.setPlayRangeType("playtime");
            featurePlayTypeConfig.setFeedRangeType("");
            inputFeaturesConfig.setFTypePlay(featurePlayTypeConfig);
            SmartDataCenterApiService.instance().addSceneModelConfig(inputFeaturesConfig);
        }
        SmartPreloadCommentV2Service.getDebug();
    }
}
