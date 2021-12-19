package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.request_combine.a;
import h.f.b.l;

public final class NoticeCountCombineModel extends a {
    @c(a = "body")
    private NoticeList noticeList;

    static {
        Covode.recordClassIndex(78547);
    }

    public static /* synthetic */ NoticeCountCombineModel copy$default(NoticeCountCombineModel noticeCountCombineModel, NoticeList noticeList2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            noticeList2 = noticeCountCombineModel.noticeList;
        }
        return noticeCountCombineModel.copy(noticeList2);
    }

    public final NoticeList component1() {
        return this.noticeList;
    }

    public final NoticeCountCombineModel copy(NoticeList noticeList2) {
        l.d(noticeList2, "");
        return new NoticeCountCombineModel(noticeList2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NoticeCountCombineModel) && l.a(this.noticeList, ((NoticeCountCombineModel) obj).noticeList);
        }
        return true;
    }

    public final int hashCode() {
        NoticeList noticeList2 = this.noticeList;
        if (noticeList2 != null) {
            return noticeList2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "NoticeCountCombineModel(noticeList=" + this.noticeList + ")";
    }

    public final NoticeList getNoticeList() {
        return this.noticeList;
    }

    public final void setNoticeList(NoticeList noticeList2) {
        l.d(noticeList2, "");
        this.noticeList = noticeList2;
    }

    public NoticeCountCombineModel(NoticeList noticeList2) {
        l.d(noticeList2, "");
        this.noticeList = noticeList2;
    }
}
