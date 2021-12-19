package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class SearchMusicList {
    @c(a = "cursor")
    public int cursor;
    @c(a = "has_more")
    int hasMore;
    @c(a = "music_list")
    public List<SearchMusic> items;

    static {
        Covode.recordClassIndex(84476);
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
