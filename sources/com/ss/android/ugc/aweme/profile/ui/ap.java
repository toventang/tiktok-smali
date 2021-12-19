package com.ss.android.ugc.aweme.profile.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.presenter.p;

public interface ap extends p {
    static {
        Covode.recordClassIndex(75479);
    }

    void a(AvatarUri avatarUri);

    void a(Exception exc);

    void a(String str);

    void e();
}
