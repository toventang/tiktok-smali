package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class SummonFriendList extends BaseResponse {
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "user_list")
    public List<SummonFriendItem> items;
    @c(a = "input_keyword")
    public String keyword;
    @c(a = "log_pb")
    public LogPbBean logPbBean;
    @c(a = "rid")
    public String requestId;

    static {
        Covode.recordClassIndex(61607);
    }

    public SummonFriendList(List<SummonFriendItem> list, long j2, boolean z, String str) {
        this.items = list;
        this.cursor = j2;
        this.hasMore = z;
        this.keyword = str;
    }
}
