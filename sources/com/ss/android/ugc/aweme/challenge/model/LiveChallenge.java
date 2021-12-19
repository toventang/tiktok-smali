package com.ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.Challenge;

public class LiveChallenge {
    @c(a = "ch_info")
    public Challenge challenge;
    @c(a = "room_taged")
    public boolean roomTaged;

    static {
        Covode.recordClassIndex(43162);
    }
}
