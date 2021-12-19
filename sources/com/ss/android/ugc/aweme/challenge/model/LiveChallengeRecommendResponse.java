package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class LiveChallengeRecommendResponse {
    @c(a = "challenge_list")
    public List<LiveChallenge> liveChallenges;
    @c(a = "status_code")
    public int statusCode;

    static {
        Covode.recordClassIndex(43163);
    }
}
