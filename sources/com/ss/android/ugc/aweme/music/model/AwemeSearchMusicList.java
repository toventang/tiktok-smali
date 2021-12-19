package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class AwemeSearchMusicList {
    @c(a = "query_correct_info")
    public MusicSearchCorrectInfo correctInfo;
    @c(a = "cursor")
    public int cursor;
    @c(a = "extra")
    public Extra extra;
    @c(a = "global_doodle_config")
    public GlobalDoodleConfig globalDoodleConfig;
    @c(a = "has_more")
    int hasMore;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "music_info_list")
    public List<SearchMusic> searchMusicList;

    static {
        Covode.recordClassIndex(71655);
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }
}
