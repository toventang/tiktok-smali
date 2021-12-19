package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;

public class UserResponse extends BaseResponse {
    @c(a = "toast_back")
    private int action;
    private User user;

    static {
        Covode.recordClassIndex(74707);
    }

    public int getAction() {
        return this.action;
    }

    public User getUser() {
        return this.user;
    }

    public void setAction(int i2) {
        this.action = i2;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
