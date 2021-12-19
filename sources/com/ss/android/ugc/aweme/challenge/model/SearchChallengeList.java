package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.LogPbBean;
import java.util.List;

public class SearchChallengeList extends BaseResponse {
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "keyword_disabled")
    public boolean isDisabled;
    @c(a = "is_match")
    public boolean isMatch;
    @c(a = "challenge_list")
    public List<SearchChallenge> items;
    public String keyword;
    @c(a = "log_pb")
    public LogPbBean logPb;

    static {
        Covode.recordClassIndex(43169);
    }
}
