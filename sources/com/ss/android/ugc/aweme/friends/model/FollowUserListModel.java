package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public class FollowUserListModel extends BaseResponse {
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "min_time")
    public long maxTime;
    @c(a = "max_time")
    public long minTime;
    @c(a = "followings")
    public List<User> users;

    static {
        Covode.recordClassIndex(61572);
    }
}
