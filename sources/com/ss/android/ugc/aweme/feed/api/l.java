package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class l implements Serializable {
    @c(a = "status_code")
    private final int code;
    @c(a = "first_vid")
    private final long firstVid;
    @c(a = "user_list")
    private final List<k> followingInterestUsers;
    @c(a = "log_pb")
    private final LogPbBean logPbBean;
    @c(a = "video_num")
    private final int videoNum;

    static {
        Covode.recordClassIndex(57901);
    }

    public l() {
        this(0, null, 0, 0, null, 31, null);
    }

    public final int getCode() {
        return this.code;
    }

    public final long getFirstVid() {
        return this.firstVid;
    }

    public final List<k> getFollowingInterestUsers() {
        return this.followingInterestUsers;
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final int getVideoNum() {
        return this.videoNum;
    }

    public l(int i2, List<k> list, int i3, long j2, LogPbBean logPbBean2) {
        this.code = i2;
        this.followingInterestUsers = list;
        this.videoNum = i3;
        this.firstVid = j2;
        this.logPbBean = logPbBean2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i2, List list, int i3, long j2, LogPbBean logPbBean2, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? new ArrayList() : list, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? 0 : j2, (i4 & 16) != 0 ? null : logPbBean2);
    }
}
