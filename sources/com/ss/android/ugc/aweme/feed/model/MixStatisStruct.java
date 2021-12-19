package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class MixStatisStruct implements Serializable {
    @c(a = "collect_vv")
    public long collectVV;
    @c(a = "current_episode")
    public long currentEpisode;
    @c(a = "has_updated_episode")
    public long hasUpdatedEpisode;
    @c(a = "last_read_episode")
    public long lastReadEpisode;
    @c(a = "play_vv")
    public long playVV;
    @c(a = "updated_to_episode")
    public long updatedToEpisode;

    static {
        Covode.recordClassIndex(59420);
    }
}
