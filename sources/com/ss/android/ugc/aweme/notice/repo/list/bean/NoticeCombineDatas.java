package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class NoticeCombineDatas {
    @c(a = "follow_request")
    private final FollowRequest followRequest;
    @c(a = "live_message")
    private List<CombineLiveNotice> liveNotices;
    @c(a = "top_live")
    private k recommendAvatars;
    @c(a = "report_inbox")
    private final List<NoticeItems> reportNotice;
    @c(a = "tiktok_shop_inbox")
    private final List<NoticeItems> shopNotice;

    static {
        Covode.recordClassIndex(72534);
    }

    public NoticeCombineDatas() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeCombineDatas copy$default(NoticeCombineDatas noticeCombineDatas, k kVar, FollowRequest followRequest2, List list, List list2, List list3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kVar = noticeCombineDatas.recommendAvatars;
        }
        if ((i2 & 2) != 0) {
            followRequest2 = noticeCombineDatas.followRequest;
        }
        if ((i2 & 4) != 0) {
            list = noticeCombineDatas.liveNotices;
        }
        if ((i2 & 8) != 0) {
            list2 = noticeCombineDatas.shopNotice;
        }
        if ((i2 & 16) != 0) {
            list3 = noticeCombineDatas.reportNotice;
        }
        return noticeCombineDatas.copy(kVar, followRequest2, list, list2, list3);
    }

    public final k component1() {
        return this.recommendAvatars;
    }

    public final FollowRequest component2() {
        return this.followRequest;
    }

    public final List<CombineLiveNotice> component3() {
        return this.liveNotices;
    }

    public final List<NoticeItems> component4() {
        return this.shopNotice;
    }

    public final List<NoticeItems> component5() {
        return this.reportNotice;
    }

    public final NoticeCombineDatas copy(k kVar, FollowRequest followRequest2, List<CombineLiveNotice> list, List<NoticeItems> list2, List<NoticeItems> list3) {
        return new NoticeCombineDatas(kVar, followRequest2, list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeCombineDatas)) {
            return false;
        }
        NoticeCombineDatas noticeCombineDatas = (NoticeCombineDatas) obj;
        return l.a(this.recommendAvatars, noticeCombineDatas.recommendAvatars) && l.a(this.followRequest, noticeCombineDatas.followRequest) && l.a(this.liveNotices, noticeCombineDatas.liveNotices) && l.a(this.shopNotice, noticeCombineDatas.shopNotice) && l.a(this.reportNotice, noticeCombineDatas.reportNotice);
    }

    public final int hashCode() {
        k kVar = this.recommendAvatars;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        FollowRequest followRequest2 = this.followRequest;
        int hashCode2 = (hashCode + (followRequest2 != null ? followRequest2.hashCode() : 0)) * 31;
        List<CombineLiveNotice> list = this.liveNotices;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<NoticeItems> list2 = this.shopNotice;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<NoticeItems> list3 = this.reportNotice;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "NoticeCombineDatas(recommendAvatars=" + this.recommendAvatars + ", followRequest=" + this.followRequest + ", liveNotices=" + this.liveNotices + ", shopNotice=" + this.shopNotice + ", reportNotice=" + this.reportNotice + ")";
    }

    public final FollowRequest getFollowRequest() {
        return this.followRequest;
    }

    public final List<CombineLiveNotice> getLiveNotices() {
        return this.liveNotices;
    }

    public final k getRecommendAvatars() {
        return this.recommendAvatars;
    }

    public final List<NoticeItems> getReportNotice() {
        return this.reportNotice;
    }

    public final List<NoticeItems> getShopNotice() {
        return this.shopNotice;
    }

    public final void setLiveNotices(List<CombineLiveNotice> list) {
        this.liveNotices = list;
    }

    public final void setRecommendAvatars(k kVar) {
        this.recommendAvatars = kVar;
    }

    public NoticeCombineDatas(k kVar, FollowRequest followRequest2, List<CombineLiveNotice> list, List<NoticeItems> list2, List<NoticeItems> list3) {
        this.recommendAvatars = kVar;
        this.followRequest = followRequest2;
        this.liveNotices = list;
        this.shopNotice = list2;
        this.reportNotice = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeCombineDatas(k kVar, FollowRequest followRequest2, List list, List list2, List list3, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : kVar, (i2 & 2) != 0 ? null : followRequest2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, (i2 & 16) == 0 ? list3 : null);
    }
}
