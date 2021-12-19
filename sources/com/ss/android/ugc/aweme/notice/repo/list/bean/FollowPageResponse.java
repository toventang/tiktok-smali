package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class FollowPageResponse extends BaseResponse {
    @c(a = "follow_page_list")
    private final List<FollowPageData> data;
    @c(a = "follow_req_offset")
    private final long followReqOffset;
    @c(a = "has_more")
    private final boolean hasMore;
    @c(a = "noticeLastReadTime")
    private final long noticeLastReadTime;
    @c(a = "notice_max_time")
    private final long noticeMaxTime;
    @c(a = "notice_min_time")
    private final long noticeMinTime;
    @c(a = "total")
    private final int total;

    static {
        Covode.recordClassIndex(72526);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowPageResponse copy$default(FollowPageResponse followPageResponse, int i2, boolean z, long j2, long j3, long j4, long j5, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = followPageResponse.total;
        }
        if ((i3 & 2) != 0) {
            z = followPageResponse.hasMore;
        }
        if ((i3 & 4) != 0) {
            j2 = followPageResponse.followReqOffset;
        }
        if ((i3 & 8) != 0) {
            j3 = followPageResponse.noticeMaxTime;
        }
        if ((i3 & 16) != 0) {
            j4 = followPageResponse.noticeMinTime;
        }
        if ((i3 & 32) != 0) {
            j5 = followPageResponse.noticeLastReadTime;
        }
        if ((i3 & 64) != 0) {
            list = followPageResponse.data;
        }
        return followPageResponse.copy(i2, z, j2, j3, j4, j5, list);
    }

    public final int component1() {
        return this.total;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final long component3() {
        return this.followReqOffset;
    }

    public final long component4() {
        return this.noticeMaxTime;
    }

    public final long component5() {
        return this.noticeMinTime;
    }

    public final long component6() {
        return this.noticeLastReadTime;
    }

    public final List<FollowPageData> component7() {
        return this.data;
    }

    public final FollowPageResponse copy(int i2, boolean z, long j2, long j3, long j4, long j5, List<FollowPageData> list) {
        l.d(list, "");
        return new FollowPageResponse(i2, z, j2, j3, j4, j5, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowPageResponse)) {
            return false;
        }
        FollowPageResponse followPageResponse = (FollowPageResponse) obj;
        return this.total == followPageResponse.total && this.hasMore == followPageResponse.hasMore && this.followReqOffset == followPageResponse.followReqOffset && this.noticeMaxTime == followPageResponse.noticeMaxTime && this.noticeMinTime == followPageResponse.noticeMinTime && this.noticeLastReadTime == followPageResponse.noticeLastReadTime && l.a(this.data, followPageResponse.data);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((((((((com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.followReqOffset)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.noticeMaxTime)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.noticeMinTime)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.noticeLastReadTime)) * 31;
        List<FollowPageData> list = this.data;
        return com_ss_android_ugc_aweme_notice_repo_list_bean_FollowPageResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "FollowPageResponse(total=" + this.total + ", hasMore=" + this.hasMore + ", followReqOffset=" + this.followReqOffset + ", noticeMaxTime=" + this.noticeMaxTime + ", noticeMinTime=" + this.noticeMinTime + ", noticeLastReadTime=" + this.noticeLastReadTime + ", data=" + this.data + ")";
    }

    public final List<FollowPageData> getData() {
        return this.data;
    }

    public final long getFollowReqOffset() {
        return this.followReqOffset;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getNoticeLastReadTime() {
        return this.noticeLastReadTime;
    }

    public final long getNoticeMaxTime() {
        return this.noticeMaxTime;
    }

    public final long getNoticeMinTime() {
        return this.noticeMinTime;
    }

    public final int getTotal() {
        return this.total;
    }

    public FollowPageResponse(int i2, boolean z, long j2, long j3, long j4, long j5, List<FollowPageData> list) {
        l.d(list, "");
        this.total = i2;
        this.hasMore = z;
        this.followReqOffset = j2;
        this.noticeMaxTime = j3;
        this.noticeMinTime = j4;
        this.noticeLastReadTime = j5;
        this.data = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowPageResponse(int i2, boolean z, long j2, long j3, long j4, long j5, List list, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : j2, (i3 & 8) != 0 ? 0 : j3, (i3 & 16) != 0 ? 0 : j4, (i3 & 32) != 0 ? 0 : j5, list);
    }
}
