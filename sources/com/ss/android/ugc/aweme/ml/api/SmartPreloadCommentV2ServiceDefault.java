package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Map;

public final class SmartPreloadCommentV2ServiceDefault extends SmartPreloadCommentV2Service {
    static {
        Covode.recordClassIndex(70889);
    }

    public final boolean enable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final boolean ensureEvaluatorAvailable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        l.d(map, "");
        l.d(map2, "");
        return -1.0f;
    }
}
