package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

public final class SmartFeedAdUIServiceDefault extends SmartFeedAdUIService {
    static {
        Covode.recordClassIndex(70877);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final boolean enable() {
        return false;
    }

    public final void ensureEvaluatorAvailable() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final String getPredictLabelResult() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUITasks getPredictTaskIndex() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final CommerceSmartUIModel getSmartAdUIExperimentValue() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService
    public final void startSmartAdUIJudge(Aweme aweme) {
    }
}
