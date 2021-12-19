package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class FollowRequest {
    @c(a = "count")
    private final int followRequestCount;

    static {
        Covode.recordClassIndex(72527);
    }

    public FollowRequest() {
        this(0, 1, null);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequest_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ FollowRequest copy$default(FollowRequest followRequest, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = followRequest.followRequestCount;
        }
        return followRequest.copy(i2);
    }

    public final int component1() {
        return this.followRequestCount;
    }

    public final FollowRequest copy(int i2) {
        return new FollowRequest(i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FollowRequest) && this.followRequestCount == ((FollowRequest) obj).followRequestCount;
        }
        return true;
    }

    public final int hashCode() {
        return com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequest_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.followRequestCount);
    }

    public final String toString() {
        return "FollowRequest(followRequestCount=" + this.followRequestCount + ")";
    }

    public final int getFollowRequestCount() {
        return this.followRequestCount;
    }

    public FollowRequest(int i2) {
        this.followRequestCount = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowRequest(int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
