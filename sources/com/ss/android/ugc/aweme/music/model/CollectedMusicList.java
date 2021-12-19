package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class CollectedMusicList extends BaseResponse {
    @c(a = "cursor")
    public int cursor;
    @c(a = "has_more")
    public int hasMore;
    @c(a = "mc_list")
    public List<Music> items;

    static {
        Covode.recordClassIndex(71657);
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
