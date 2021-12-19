package com.ss.android.ugc.aweme.profile.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface g {
    static {
        Covode.recordClassIndex(75348);
    }

    boolean isDataSetChangedOnStart();

    void onVideoItemActionShow(Aweme aweme);

    void setDataSetChangedOnStart(boolean z);
}
