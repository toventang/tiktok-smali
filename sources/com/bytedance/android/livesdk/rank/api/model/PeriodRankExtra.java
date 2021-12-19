package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class PeriodRankExtra extends Extra {
    @c(a = "gap_description")
    public String gapDescription;
    @c(a = "self_info")
    public User mUser;
    @c(a = "self_rank")
    public int selfRank;
    @c(a = "self_score")
    public long selfScore;

    static {
        Covode.recordClassIndex(12170);
    }
}
