package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class MusicList extends BaseResponse {
    @c(a = "child_collections")
    public List<MusicCollectionItem> childCollections;
    @c(a = "cursor")
    public int cursor;
    @c(a = "has_more")
    public int hasMore;
    @c(a = "music_list")
    public List<Music> items;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "music_type")
    public int mMusicType;
    @c(a = "mc_info")
    public MusicCollectionItem mcInfo;
    @c(a = "radio_cursor")
    public int radioCursor;

    static {
        Covode.recordClassIndex(71674);
    }

    public int getCursor() {
        int i2 = this.radioCursor;
        if (i2 > 0) {
            return i2;
        }
        return this.cursor;
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
