package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public class SearchMix extends SearchApiResult {
    @c(a = "aweme_list")
    public List<Aweme> awemeList;
    @c(a = "cursor")
    public int cursor;
    @c(a = "has_more")
    public boolean hasMore;

    static {
        Covode.recordClassIndex(50947);
    }
}
