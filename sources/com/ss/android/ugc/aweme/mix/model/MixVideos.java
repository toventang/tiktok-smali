package com.ss.android.ugc.aweme.mix.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

public class MixVideos implements Serializable {
    @c(a = "has_more")
    public int hasMore;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "max_cursor")
    public long maxCursor;
    @c(a = "min_cursor")
    public long minCursor;
    @c(a = "status_code")
    public int statusCode;
    @c(a = "status_msg")
    public String statusMsg;
    @c(a = "videos")
    public List<Aweme> videos;

    static {
        Covode.recordClassIndex(70705);
    }
}
