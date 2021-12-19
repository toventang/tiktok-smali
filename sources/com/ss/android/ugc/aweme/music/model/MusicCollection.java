package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class MusicCollection extends BaseResponse {
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "mc_list")
    public List<MusicCollectionItem> items;

    static {
        Covode.recordClassIndex(71669);
    }

    public List<MusicCollectionItem> getItems() {
        List<MusicCollectionItem> list = this.items;
        if (list == null || list.isEmpty()) {
            return this.items;
        }
        return MusicCollectionFilterKt.distinctByName(this.items);
    }
}
