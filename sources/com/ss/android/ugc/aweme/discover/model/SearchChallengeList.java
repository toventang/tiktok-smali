package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class SearchChallengeList extends SearchApiResult {
    @c(a = "challenge_list")
    public List<SearchChallenge> challengeList;
    @c(a = "cursor", b = {"min_cursor"})
    public int cursor;
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "is_match")
    public boolean isMatch;

    static {
        Covode.recordClassIndex(50923);
    }
}
