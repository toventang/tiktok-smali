package com.bytedance.android.livesdk.rank.api;

import com.bytedance.covode.number.Covode;

public enum g {
    Unknown(0, "unknown"),
    HOURLY_RANK_PROMPT(1, "hourly_rank_prompt"),
    WEEKLY_RANK_PROMPT(2, "weekly_rank_prompt");
    
    private final String rankName;
    private final int type;

    public final String getRankName() {
        return this.rankName;
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(12164);
    }

    private g(int i2, String str) {
        this.type = i2;
        this.rankName = str;
    }
}
