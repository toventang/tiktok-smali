package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;

public final class UserResponse extends BaseResponse {
    @c(a = "log_pb")
    private LogPbBean logPb;
    @c(a = "user")
    private User user;

    static {
        Covode.recordClassIndex(75295);
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUser(User user2) {
        this.user = user2;
    }
}
