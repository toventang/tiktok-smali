package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.bq.a.a;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public final class RecentFriendModel extends BaseResponse {
    @c(a = "block_results")
    public final List<a> blockResults = new ArrayList();
    @c(a = "cursor")
    public final long cursor;
    @c(a = "has_more")
    public final boolean hasMore;
    @c(a = "user_list")
    public final List<User> users = new ArrayList();

    static {
        Covode.recordClassIndex(61595);
    }
}
