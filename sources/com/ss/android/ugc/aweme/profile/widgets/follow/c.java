package com.ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.assem.arch.service.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;

public interface c extends b<d> {
    static {
        Covode.recordClassIndex(76275);
    }

    void a();

    void a(FollowStatus followStatus);

    void a(User user);

    void a(Exception exc);
}
