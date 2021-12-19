package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

public class ChallengeList extends BaseResponse {
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "is_match")
    public boolean isMatch;
    @c(a = "challenge_list")
    public List<Challenge> items;
    @c(a = "max_cursor")
    public long maxCursor;
    @c(a = "min_cursor")
    public long minCursor;

    static {
        Covode.recordClassIndex(43160);
    }
}
