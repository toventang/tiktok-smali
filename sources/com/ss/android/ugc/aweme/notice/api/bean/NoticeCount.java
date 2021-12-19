package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class NoticeCount {
    @c(a = "clear_occasion")
    private Integer clearOccasion;
    @c(a = "count")
    private int count;
    @c(a = "extra")
    private g extra;
    @c(a = "group")
    private int group;
    @c(a = "show_type")
    private Integer showType;

    static {
        Covode.recordClassIndex(72412);
    }

    public static int com_ss_android_ugc_aweme_notice_api_bean_NoticeCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ NoticeCount copy$default(NoticeCount noticeCount, int i2, int i3, Integer num, Integer num2, g gVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = noticeCount.count;
        }
        if ((i4 & 2) != 0) {
            i3 = noticeCount.group;
        }
        if ((i4 & 4) != 0) {
            num = noticeCount.showType;
        }
        if ((i4 & 8) != 0) {
            num2 = noticeCount.clearOccasion;
        }
        if ((i4 & 16) != 0) {
            gVar = noticeCount.extra;
        }
        return noticeCount.copy(i2, i3, num, num2, gVar);
    }

    public final int component1() {
        return this.count;
    }

    public final int component2() {
        return this.group;
    }

    public final Integer component3() {
        return this.showType;
    }

    public final Integer component4() {
        return this.clearOccasion;
    }

    public final g component5() {
        return this.extra;
    }

    public final NoticeCount copy(int i2, int i3, Integer num, Integer num2, g gVar) {
        return new NoticeCount(i2, i3, num, num2, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeCount)) {
            return false;
        }
        NoticeCount noticeCount = (NoticeCount) obj;
        return this.count == noticeCount.count && this.group == noticeCount.group && l.a(this.showType, noticeCount.showType) && l.a(this.clearOccasion, noticeCount.clearOccasion) && l.a(this.extra, noticeCount.extra);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notice_api_bean_NoticeCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((com_ss_android_ugc_aweme_notice_api_bean_NoticeCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.count) * 31) + com_ss_android_ugc_aweme_notice_api_bean_NoticeCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.group)) * 31;
        Integer num = this.showType;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_notice_api_bean_NoticeCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.clearOccasion;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        g gVar = this.extra;
        if (gVar != null) {
            i2 = gVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "NoticeCount(count=" + this.count + ", group=" + this.group + ", showType=" + this.showType + ", clearOccasion=" + this.clearOccasion + ", extra=" + this.extra + ")";
    }

    public final Integer getClearOccasion() {
        return this.clearOccasion;
    }

    public final int getCount() {
        return this.count;
    }

    public final g getExtra() {
        return this.extra;
    }

    public final int getGroup() {
        return this.group;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final void setClearOccasion(Integer num) {
        this.clearOccasion = num;
    }

    public final void setCount(int i2) {
        this.count = i2;
    }

    public final void setExtra(g gVar) {
        this.extra = gVar;
    }

    public final void setGroup(int i2) {
        this.group = i2;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public NoticeCount(int i2, int i3, Integer num, Integer num2, g gVar) {
        this.count = i2;
        this.group = i3;
        this.showType = num;
        this.clearOccasion = num2;
        this.extra = gVar;
    }
}
