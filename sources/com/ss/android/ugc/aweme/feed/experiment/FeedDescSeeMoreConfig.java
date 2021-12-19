package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class FeedDescSeeMoreConfig {
    @c(a = "groupId")
    private final int groupId;
    @c(a = "opacity")
    private final float opacity;

    static {
        Covode.recordClassIndex(58994);
    }

    public static int com_ss_android_ugc_aweme_feed_experiment_FeedDescSeeMoreConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ FeedDescSeeMoreConfig copy$default(FeedDescSeeMoreConfig feedDescSeeMoreConfig, int i2, float f2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = feedDescSeeMoreConfig.groupId;
        }
        if ((i3 & 2) != 0) {
            f2 = feedDescSeeMoreConfig.opacity;
        }
        return feedDescSeeMoreConfig.copy(i2, f2);
    }

    public final int component1() {
        return this.groupId;
    }

    public final float component2() {
        return this.opacity;
    }

    public final FeedDescSeeMoreConfig copy(int i2, float f2) {
        return new FeedDescSeeMoreConfig(i2, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedDescSeeMoreConfig)) {
            return false;
        }
        FeedDescSeeMoreConfig feedDescSeeMoreConfig = (FeedDescSeeMoreConfig) obj;
        return this.groupId == feedDescSeeMoreConfig.groupId && Float.compare(this.opacity, feedDescSeeMoreConfig.opacity) == 0;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_feed_experiment_FeedDescSeeMoreConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.groupId) * 31) + com_ss_android_ugc_aweme_feed_experiment_FeedDescSeeMoreConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.opacity);
    }

    public final String toString() {
        return "FeedDescSeeMoreConfig(groupId=" + this.groupId + ", opacity=" + this.opacity + ")";
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public static int com_ss_android_ugc_aweme_feed_experiment_FeedDescSeeMoreConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public FeedDescSeeMoreConfig(int i2, float f2) {
        this.groupId = i2;
        this.opacity = f2;
    }
}
