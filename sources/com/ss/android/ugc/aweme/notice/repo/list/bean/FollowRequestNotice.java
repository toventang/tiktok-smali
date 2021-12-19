package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class FollowRequestNotice {
    @c(a = "count")
    private final int requestCount;

    static {
        Covode.recordClassIndex(72529);
    }

    public FollowRequestNotice() {
        this(0, 1, null);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequestNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ FollowRequestNotice copy$default(FollowRequestNotice followRequestNotice, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = followRequestNotice.requestCount;
        }
        return followRequestNotice.copy(i2);
    }

    public final int component1() {
        return this.requestCount;
    }

    public final FollowRequestNotice copy(int i2) {
        return new FollowRequestNotice(i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FollowRequestNotice) && this.requestCount == ((FollowRequestNotice) obj).requestCount;
        }
        return true;
    }

    public final int hashCode() {
        return com_ss_android_ugc_aweme_notice_repo_list_bean_FollowRequestNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.requestCount);
    }

    public final String toString() {
        return "FollowRequestNotice(requestCount=" + this.requestCount + ")";
    }

    public final int getRequestCount() {
        return this.requestCount;
    }

    public FollowRequestNotice(int i2) {
        this.requestCount = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowRequestNotice(int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
