package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;

public interface IAccountInfoUpdateAdapterService {
    static {
        Covode.recordClassIndex(61355);
    }

    User getUser();

    int userDefaultAllowStatus();
}
