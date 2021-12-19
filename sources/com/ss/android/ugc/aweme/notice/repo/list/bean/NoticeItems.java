package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class NoticeItems {
    @c(a = "group")
    private final int group;
    @c(a = "has_more")
    private boolean hasMore;
    @c(a = "notice_list")
    private List<? extends MusNotice> items;
    @c(a = "last_read_time")
    private final long lastReadTime;
    @c(a = "list_type")
    private final int listType;
    @c(a = "max_time")
    private final long maxTime;
    @c(a = "min_time")
    private final long minTime;
    @c(a = "total")
    private final int total;

    static {
        Covode.recordClassIndex(72536);
    }

    public NoticeItems() {
        this(null, false, 0, 0, 0, 0, 0, 0, 255, null);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeItems copy$default(NoticeItems noticeItems, List list, boolean z, int i2, long j2, long j3, long j4, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = noticeItems.items;
        }
        if ((i5 & 2) != 0) {
            z = noticeItems.hasMore;
        }
        if ((i5 & 4) != 0) {
            i2 = noticeItems.total;
        }
        if ((i5 & 8) != 0) {
            j2 = noticeItems.maxTime;
        }
        if ((i5 & 16) != 0) {
            j3 = noticeItems.minTime;
        }
        if ((i5 & 32) != 0) {
            j4 = noticeItems.lastReadTime;
        }
        if ((i5 & 64) != 0) {
            i3 = noticeItems.group;
        }
        if ((i5 & 128) != 0) {
            i4 = noticeItems.listType;
        }
        return noticeItems.copy(list, z, i2, j2, j3, j4, i3, i4);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
    public final List<MusNotice> component1() {
        return this.items;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final int component3() {
        return this.total;
    }

    public final long component4() {
        return this.maxTime;
    }

    public final long component5() {
        return this.minTime;
    }

    public final long component6() {
        return this.lastReadTime;
    }

    public final int component7() {
        return this.group;
    }

    public final int component8() {
        return this.listType;
    }

    public final NoticeItems copy(List<? extends MusNotice> list, boolean z, int i2, long j2, long j3, long j4, int i3, int i4) {
        return new NoticeItems(list, z, i2, j2, j3, j4, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeItems)) {
            return false;
        }
        NoticeItems noticeItems = (NoticeItems) obj;
        return l.a(this.items, noticeItems.items) && this.hasMore == noticeItems.hasMore && this.total == noticeItems.total && this.maxTime == noticeItems.maxTime && this.minTime == noticeItems.minTime && this.lastReadTime == noticeItems.lastReadTime && this.group == noticeItems.group && this.listType == noticeItems.listType;
    }

    public final int hashCode() {
        List<? extends MusNotice> list = this.items;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return ((((((((((((hashCode + i2) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxTime)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minTime)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.lastReadTime)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.group)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_NoticeItems_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.listType);
    }

    public final String toString() {
        return "NoticeItems(items=" + this.items + ", hasMore=" + this.hasMore + ", total=" + this.total + ", maxTime=" + this.maxTime + ", minTime=" + this.minTime + ", lastReadTime=" + this.lastReadTime + ", group=" + this.group + ", listType=" + this.listType + ")";
    }

    public final int getGroup() {
        return this.group;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice>, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
    public final List<MusNotice> getItems() {
        return this.items;
    }

    public final long getLastReadTime() {
        return this.lastReadTime;
    }

    public final int getListType() {
        return this.listType;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setItems(List<? extends MusNotice> list) {
        this.items = list;
    }

    public NoticeItems(List<? extends MusNotice> list, boolean z, int i2, long j2, long j3, long j4, int i3, int i4) {
        this.items = list;
        this.hasMore = z;
        this.total = i2;
        this.maxTime = j2;
        this.minTime = j3;
        this.lastReadTime = j4;
        this.group = i3;
        this.listType = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeItems(List list, boolean z, int i2, long j2, long j3, long j4, int i3, int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? null : list, (i5 & 2) != 0 ? false : z, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : j2, (i5 & 16) != 0 ? 0 : j3, (i5 & 32) == 0 ? j4 : 0, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) == 0 ? i4 : 0);
    }
}
