package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class FollowPageData {
    @c(a = "create_time")
    private final long createTime;
    @c(a = "follow_request")
    private final FollowRequestData followRequest;
    @c(a = "notice")
    private final MusNotice notice;
    private final int type;

    static {
        Covode.recordClassIndex(72525);
    }

    public FollowPageData() {
        this(0, null, null, 0, 15, null);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ FollowPageData copy$default(FollowPageData followPageData, int i2, MusNotice musNotice, FollowRequestData followRequestData, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = followPageData.type;
        }
        if ((i3 & 2) != 0) {
            musNotice = followPageData.notice;
        }
        if ((i3 & 4) != 0) {
            followRequestData = followPageData.followRequest;
        }
        if ((i3 & 8) != 0) {
            j2 = followPageData.createTime;
        }
        return followPageData.copy(i2, musNotice, followRequestData, j2);
    }

    public final int component1() {
        return this.type;
    }

    public final MusNotice component2() {
        return this.notice;
    }

    public final FollowRequestData component3() {
        return this.followRequest;
    }

    public final long component4() {
        return this.createTime;
    }

    public final FollowPageData copy(int i2, MusNotice musNotice, FollowRequestData followRequestData, long j2) {
        return new FollowPageData(i2, musNotice, followRequestData, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowPageData)) {
            return false;
        }
        FollowPageData followPageData = (FollowPageData) obj;
        return this.type == followPageData.type && l.a(this.notice, followPageData.notice) && l.a(this.followRequest, followPageData.followRequest) && this.createTime == followPageData.createTime;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31;
        MusNotice musNotice = this.notice;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (musNotice != null ? musNotice.hashCode() : 0)) * 31;
        FollowRequestData followRequestData = this.followRequest;
        if (followRequestData != null) {
            i2 = followRequestData.hashCode();
        }
        return ((hashCode + i2) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.createTime);
    }

    public final String toString() {
        return "FollowPageData(type=" + this.type + ", notice=" + this.notice + ", followRequest=" + this.followRequest + ", createTime=" + this.createTime + ")";
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final FollowRequestData getFollowRequest() {
        return this.followRequest;
    }

    public final MusNotice getNotice() {
        return this.notice;
    }

    public final int getType() {
        return this.type;
    }

    public FollowPageData(int i2, MusNotice musNotice, FollowRequestData followRequestData, long j2) {
        this.type = i2;
        this.notice = musNotice;
        this.followRequest = followRequestData;
        this.createTime = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowPageData(int i2, MusNotice musNotice, FollowRequestData followRequestData, long j2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? null : musNotice, (i3 & 4) == 0 ? followRequestData : null, (i3 & 8) != 0 ? 0 : j2);
    }
}
