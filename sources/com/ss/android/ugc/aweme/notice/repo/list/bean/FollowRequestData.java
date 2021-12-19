package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class FollowRequestData {
    @c(a = "create_time")
    private final long createTime;
    @c(a = "from_user")
    private final User user;

    static {
        Covode.recordClassIndex(72528);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequestData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ FollowRequestData copy$default(FollowRequestData followRequestData, User user2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user2 = followRequestData.user;
        }
        if ((i2 & 2) != 0) {
            j2 = followRequestData.createTime;
        }
        return followRequestData.copy(user2, j2);
    }

    public final User component1() {
        return this.user;
    }

    public final long component2() {
        return this.createTime;
    }

    public final FollowRequestData copy(User user2, long j2) {
        l.d(user2, "");
        return new FollowRequestData(user2, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowRequestData)) {
            return false;
        }
        FollowRequestData followRequestData = (FollowRequestData) obj;
        return l.a(this.user, followRequestData.user) && this.createTime == followRequestData.createTime;
    }

    public final int hashCode() {
        User user2 = this.user;
        return ((user2 != null ? user2.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequestData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.createTime);
    }

    public final String toString() {
        return "FollowRequestData(user=" + this.user + ", createTime=" + this.createTime + ")";
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final User getUser() {
        return this.user;
    }

    public FollowRequestData(User user2, long j2) {
        l.d(user2, "");
        this.user = user2;
        this.createTime = j2;
    }
}
