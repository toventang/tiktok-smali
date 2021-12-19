package com.ss.android.ugc.aweme.services.story;

import com.bytedance.covode.number.Covode;

public interface IStoryPublishAnimateListener {
    static {
        Covode.recordClassIndex(79821);
    }

    void onAnimateFinish();

    void onAnimateStart();

    void onAnimateUpdate(float f2);
}
