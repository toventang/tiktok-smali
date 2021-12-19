package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;

public class UserStruct extends BaseResponse {
    @c(a = "user")
    User user;

    static {
        Covode.recordClassIndex(65631);
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
