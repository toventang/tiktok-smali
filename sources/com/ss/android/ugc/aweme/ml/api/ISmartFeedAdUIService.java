package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;

public interface ISmartFeedAdUIService {
    static {
        Covode.recordClassIndex(70854);
    }

    void checkAndInit();

    boolean enable();

    String getPredictLabelResult();

    CommerceSmartUITasks getPredictTaskIndex();

    CommerceSmartUIModel getSmartAdUIExperimentValue();

    void startSmartAdUIJudge(Aweme aweme);
}
