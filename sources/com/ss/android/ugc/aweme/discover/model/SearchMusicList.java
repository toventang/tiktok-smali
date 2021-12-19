package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class SearchMusicList extends SearchApiResult {
    @c(a = "cursor")
    public int cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "music_info_list")
    public List<SearchMusic> searchMusicList;

    static {
        Covode.recordClassIndex(50950);
    }
}
