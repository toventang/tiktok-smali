package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class UnReadVideoInfo implements Serializable {
    @c(a = "latest_unread_video_created_time")
    public long latestUnreadVideoCreatedTime;
    @c(a = "unread_count")
    public int unReadCount;

    static {
        Covode.recordClassIndex(75266);
    }

    public UnReadVideoInfo() {
    }

    public static int com_ss_android_ugc_aweme_profile_model_UnReadVideoInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_profile_model_UnReadVideoInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ UnReadVideoInfo copy$default(UnReadVideoInfo unReadVideoInfo, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = unReadVideoInfo.unReadCount;
        }
        if ((i3 & 2) != 0) {
            j2 = unReadVideoInfo.latestUnreadVideoCreatedTime;
        }
        return unReadVideoInfo.copy(i2, j2);
    }

    public final int component1() {
        return this.unReadCount;
    }

    public final long component2() {
        return this.latestUnreadVideoCreatedTime;
    }

    public final UnReadVideoInfo copy(int i2, long j2) {
        return new UnReadVideoInfo(i2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnReadVideoInfo)) {
            return false;
        }
        UnReadVideoInfo unReadVideoInfo = (UnReadVideoInfo) obj;
        return this.unReadCount == unReadVideoInfo.unReadCount && this.latestUnreadVideoCreatedTime == unReadVideoInfo.latestUnreadVideoCreatedTime;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_profile_model_UnReadVideoInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.unReadCount) * 31) + com_ss_android_ugc_aweme_profile_model_UnReadVideoInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.latestUnreadVideoCreatedTime);
    }

    public final String toString() {
        return "UnReadVideoInfo(unReadCount=" + this.unReadCount + ", latestUnreadVideoCreatedTime=" + this.latestUnreadVideoCreatedTime + ")";
    }

    public final long getLatestUnreadVideoCreatedTime() {
        return this.latestUnreadVideoCreatedTime;
    }

    public final int getUnReadCount() {
        return this.unReadCount;
    }

    public final void setUnReadCount(int i2) {
        this.unReadCount = i2;
    }

    public UnReadVideoInfo(int i2, long j2) {
        this.unReadCount = i2;
        this.latestUnreadVideoCreatedTime = j2;
    }
}
