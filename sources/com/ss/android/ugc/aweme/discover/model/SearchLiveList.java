package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class SearchLiveList extends SearchApiResult {
    @c(a = "cursor")
    public long cursor;
    @c(a = "extra_data")
    List<SearchLiveStruct> extraData;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "data")
    public List<SearchLiveStruct> liveList;

    static {
        Covode.recordClassIndex(50945);
    }
}
