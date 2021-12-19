package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

public enum m {
    NONE(0),
    FOLLOW_INVITE(1),
    RECOMMEND_INVITE(2),
    RANDOM_LINK_MIC_INVITE(5),
    ACTIVITY(6),
    WEEKLY_RANK_INVITE(20),
    HOURLY_RANK_INVITE(21);
    
    private int type;

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(5199);
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    private m(int i2) {
        this.type = i2;
    }
}
