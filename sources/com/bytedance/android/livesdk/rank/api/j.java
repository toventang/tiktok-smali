package com.bytedance.android.livesdk.rank.api;

import com.bytedance.covode.number.Covode;

public enum j {
    HOURLY_RANK(0, "hourly_rank"),
    WEEKLY_RANK(1, "weekly_rank"),
    HOURLY_STAR_HOST_RANK(2, "hourly_star_host_rank");
    
    private final String rankName;
    private final int type;

    public final String getRankName() {
        return this.rankName;
    }

    public final int getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(12167);
    }

    private j(int i2, String str) {
        this.type = i2;
        this.rankName = str;
    }
}
