package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

public interface ISmartPreloadCommentV2Service {
    static {
        Covode.recordClassIndex(70859);
    }

    boolean ensureEvaluatorAvailable();

    float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2);
}
