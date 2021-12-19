package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

public class SearchChallenge {
    @c(a = "challenge_info")
    public Challenge challenge;
    public boolean isFake;
    @c(a = "position")
    public List<Segment> segments;

    static {
        Covode.recordClassIndex(43168);
    }
}
