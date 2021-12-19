package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.m;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;

public interface p extends m {
    static {
        Covode.recordClassIndex(75327);
    }

    void b(AvatarUri avatarUri);

    void b(Exception exc);

    void b(String str);
}
