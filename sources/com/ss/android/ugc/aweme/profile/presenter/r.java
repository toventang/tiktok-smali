package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.m;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

public interface r extends m {
    static {
        Covode.recordClassIndex(75329);
    }

    void b(FollowStatus followStatus);

    void c(FollowStatus followStatus);

    void d_(Exception exc);
}
