package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class SearchUserList extends SearchApiResult {
    @c(a = "cursor")
    public int cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "user_list")
    public List<SearchUser> userList;

    static {
        Covode.recordClassIndex(50973);
    }
}
