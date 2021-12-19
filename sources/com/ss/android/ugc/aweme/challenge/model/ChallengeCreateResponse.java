package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ChallengeCreateResponse {
    @c(a = "challenge_id")
    public long challengeId;
    @c(a = "challenge_name")
    public String challengeName;
    @c(a = "status_code")
    public int statusCode;
    @c(a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(43155);
    }
}
