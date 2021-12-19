package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

public final class SmartClassifyServiceDefault extends SmartClassifyService {
    static {
        Covode.recordClassIndex(70974);
    }

    public final void classify(String str, h hVar, b bVar, a aVar) {
    }

    public final void classifyWithAweme(String str, Aweme aweme, a aVar) {
    }

    public final void classifyWithAweme(String str, Aweme aweme, b bVar, a aVar) {
    }

    public final void configSceneModel(String str, SmartClassifySceneConfig smartClassifySceneConfig) {
    }

    public final boolean enable(String str) {
        return false;
    }

    public final void ensureEnvAvailable(String str) {
    }

    public final boolean isEnvReady(String str) {
        return false;
    }

    public final String lastPredictResultLabel(String str, String str2) {
        return str2;
    }

    public final Map<String, Float> lastPredictResultScoreMap(String str) {
        return null;
    }
}
