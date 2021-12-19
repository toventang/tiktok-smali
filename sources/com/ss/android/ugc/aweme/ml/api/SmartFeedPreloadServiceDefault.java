package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.b.d;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

public final class SmartFeedPreloadServiceDefault extends SmartFeedPreloadService {
    static {
        Covode.recordClassIndex(70885);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final boolean enable() {
        return false;
    }

    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final String getPredictLabelResult() {
        return null;
    }

    public final float getPredictProbabilityResult() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue() {
        return null;
    }

    public final d getSmartPreloadStrategyV2ExperimentValue() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService
    public final void startSmartPreloadV2Judge(Aweme aweme) {
    }
}
