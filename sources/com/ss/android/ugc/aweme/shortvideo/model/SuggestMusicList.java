package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class SuggestMusicList {
    public int cursor;
    public boolean hasMore;
    public LogPbBean logPb;
    public List<MusicModel> musicList;
    public Integer musicType;

    static {
        Covode.recordClassIndex(84488);
    }
}
