package com.ss.android.ugc.aweme.notification.followrequest.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class FollowRequestResponse extends BaseResponse {
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "max_time")
    public long maxTime;
    @c(a = "min_time")
    public long minTime;
    @c(a = "total")
    public int total;
    @c(a = "request_users")
    public List<User> userRequestList;

    static {
        Covode.recordClassIndex(72966);
    }
}
