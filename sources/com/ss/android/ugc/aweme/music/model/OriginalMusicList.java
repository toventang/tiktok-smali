package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public class OriginalMusicList extends BaseResponse {
    @c(a = "cursor")
    public int cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "music")
    public List<Music> musicList;

    static {
        Covode.recordClassIndex(71682);
    }
}
