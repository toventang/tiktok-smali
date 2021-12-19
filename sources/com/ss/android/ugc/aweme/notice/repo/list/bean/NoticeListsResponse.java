package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class NoticeListsResponse extends BaseResponse {
    private transient List<NoticeItems> collapseNotices;
    @c(a = "log_pb")
    private final LogPbBean lobPb;
    @c(a = "notice_lists")
    private List<NoticeItems> notices;

    static {
        Covode.recordClassIndex(72537);
    }

    public NoticeListsResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeListsResponse copy$default(NoticeListsResponse noticeListsResponse, List list, List list2, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = noticeListsResponse.notices;
        }
        if ((i2 & 2) != 0) {
            list2 = noticeListsResponse.collapseNotices;
        }
        if ((i2 & 4) != 0) {
            logPbBean = noticeListsResponse.lobPb;
        }
        return noticeListsResponse.copy(list, list2, logPbBean);
    }

    public final List<NoticeItems> component1() {
        return this.notices;
    }

    public final List<NoticeItems> component2() {
        return this.collapseNotices;
    }

    public final LogPbBean component3() {
        return this.lobPb;
    }

    public final NoticeListsResponse copy(List<NoticeItems> list, List<NoticeItems> list2, LogPbBean logPbBean) {
        return new NoticeListsResponse(list, list2, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeListsResponse)) {
            return false;
        }
        NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
        return l.a(this.notices, noticeListsResponse.notices) && l.a(this.collapseNotices, noticeListsResponse.collapseNotices) && l.a(this.lobPb, noticeListsResponse.lobPb);
    }

    public final int hashCode() {
        List<NoticeItems> list = this.notices;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<NoticeItems> list2 = this.collapseNotices;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.lobPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode2 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NoticeListsResponse(notices=" + this.notices + ", collapseNotices=" + this.collapseNotices + ", lobPb=" + this.lobPb + ")";
    }

    public final List<NoticeItems> getCollapseNotices() {
        return this.collapseNotices;
    }

    public final LogPbBean getLobPb() {
        return this.lobPb;
    }

    public final List<NoticeItems> getNotices() {
        return this.notices;
    }

    public final void setCollapseNotices(List<NoticeItems> list) {
        this.collapseNotices = list;
    }

    public final void setNotices(List<NoticeItems> list) {
        this.notices = list;
    }

    public NoticeListsResponse(List<NoticeItems> list, List<NoticeItems> list2, LogPbBean logPbBean) {
        this.notices = list;
        this.collapseNotices = list2;
        this.lobPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeListsResponse(List list, List list2, LogPbBean logPbBean, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : logPbBean);
    }
}
