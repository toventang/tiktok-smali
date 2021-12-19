package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ShareReward implements Serializable {
    @c(a = "highest_profit")
    private final String highestProfit;
    @c(a = "reward_consume_percent")
    private final Integer rewardConsumePercent;

    static {
        Covode.recordClassIndex(50974);
    }

    public ShareReward() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ShareReward copy$default(ShareReward shareReward, Integer num, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = shareReward.rewardConsumePercent;
        }
        if ((i2 & 2) != 0) {
            str = shareReward.highestProfit;
        }
        return shareReward.copy(num, str);
    }

    public final Integer component1() {
        return this.rewardConsumePercent;
    }

    public final String component2() {
        return this.highestProfit;
    }

    public final ShareReward copy(Integer num, String str) {
        return new ShareReward(num, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareReward)) {
            return false;
        }
        ShareReward shareReward = (ShareReward) obj;
        return l.a(this.rewardConsumePercent, shareReward.rewardConsumePercent) && l.a(this.highestProfit, shareReward.highestProfit);
    }

    public final int hashCode() {
        Integer num = this.rewardConsumePercent;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.highestProfit;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ShareReward(rewardConsumePercent=" + this.rewardConsumePercent + ", highestProfit=" + this.highestProfit + ")";
    }

    public final String getHighestProfit() {
        return this.highestProfit;
    }

    public final Integer getRewardConsumePercent() {
        return this.rewardConsumePercent;
    }

    public ShareReward(Integer num, String str) {
        this.rewardConsumePercent = num;
        this.highestProfit = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareReward(Integer num, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str);
    }
}
