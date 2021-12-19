package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.g;
import java.util.List;

public class AVSearchChallengeList {
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "keyword_disabled")
    public boolean isDisabled;
    @c(a = "is_match")
    public boolean isMatch;
    @c(a = "challenge_list")
    public List<g> items;
    public String keyword;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "words_query_record")
    public RecommendWordMob recommendWordMob;

    static {
        Covode.recordClassIndex(84400);
    }
}
