package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import h.f.b.l;
import java.io.Serializable;

public final class g implements Serializable {
    @c(a = "count")
    private final int count;
    @c(a = "group")
    private final int group;
    @c(a = "is_mark_read")
    private final int markRead;
    @c(a = "max_time")
    private final long maxTime;
    @c(a = "min_time")
    private final long minTime;

    static {
        Covode.recordClassIndex(72551);
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ g copy$default(g gVar, int i2, long j2, long j3, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = gVar.group;
        }
        if ((i5 & 2) != 0) {
            j2 = gVar.maxTime;
        }
        if ((i5 & 4) != 0) {
            j3 = gVar.minTime;
        }
        if ((i5 & 8) != 0) {
            i3 = gVar.count;
        }
        if ((i5 & 16) != 0) {
            i4 = gVar.markRead;
        }
        return gVar.copy(i2, j2, j3, i3, i4);
    }

    public final int component1() {
        return this.group;
    }

    public final long component2() {
        return this.maxTime;
    }

    public final long component3() {
        return this.minTime;
    }

    public final int component4() {
        return this.count;
    }

    public final int component5() {
        return this.markRead;
    }

    public final g copy(int i2, long j2, long j3, int i3, int i4) {
        return new g(i2, j2, j3, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.group == gVar.group && this.maxTime == gVar.maxTime && this.minTime == gVar.minTime && this.count == gVar.count && this.markRead == gVar.markRead;
    }

    public final int hashCode() {
        return (((((((com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.group) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxTime)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minTime)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.count)) * 31) + com_ss_android_ugc_aweme_notice_repo_list_bean_MultiNotice_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.markRead);
    }

    public final String toString() {
        return "MultiNotice(group=" + this.group + ", maxTime=" + this.maxTime + ", minTime=" + this.minTime + ", count=" + this.count + ", markRead=" + this.markRead + ")";
    }

    public final int getCount() {
        return this.count;
    }

    public final int getGroup() {
        return this.group;
    }

    public final int getMarkRead() {
        return this.markRead;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final String toReqStr() {
        String b2 = dg.a().b(n.a(this));
        l.b(b2, "");
        return b2;
    }

    public g(int i2, long j2, long j3, int i3, int i4) {
        this.group = i2;
        this.maxTime = j2;
        this.minTime = j3;
        this.count = i3;
        this.markRead = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, long j2, long j3, int i3, int i4, int i5, h.f.b.g gVar) {
        this(i2, (i5 & 2) != 0 ? 0 : j2, (i5 & 4) == 0 ? j3 : 0, (i5 & 8) != 0 ? 20 : i3, (i5 & 16) != 0 ? 1 : i4);
    }
}
