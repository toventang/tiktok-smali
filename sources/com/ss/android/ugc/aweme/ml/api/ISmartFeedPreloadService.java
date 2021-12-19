package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;
import java.util.List;

public interface ISmartFeedPreloadService {
    static {
        Covode.recordClassIndex(70858);
    }

    void checkAndInit();

    boolean enable();

    PreloadStrategyConfig getCurrentSmartPreloadStrategyConfig();

    String getPredictLabelResult();

    List<PreloadStrategyConfig> getSmartPreloadStrategyExperimentValue();

    void startSmartPreloadV2Judge(Aweme aweme);
}
