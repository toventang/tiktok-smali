package com.ss.android.ugc.aweme.discover.hitrank;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "compeleted_task_cnt")
    private int compeletedTaskCnt;
    @c(a = "total_task_cnt")
    private int totalTaskCnt;

    static {
        Covode.recordClassIndex(50470);
    }

    public static int com_ss_android_ugc_aweme_discover_hitrank_HitTaskInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ a copy$default(a aVar, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = aVar.compeletedTaskCnt;
        }
        if ((i4 & 2) != 0) {
            i3 = aVar.totalTaskCnt;
        }
        return aVar.copy(i2, i3);
    }

    public final int component1() {
        return this.compeletedTaskCnt;
    }

    public final int component2() {
        return this.totalTaskCnt;
    }

    public final a copy(int i2, int i3) {
        return new a(i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.compeletedTaskCnt == aVar.compeletedTaskCnt && this.totalTaskCnt == aVar.totalTaskCnt;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_discover_hitrank_HitTaskInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.compeletedTaskCnt) * 31) + com_ss_android_ugc_aweme_discover_hitrank_HitTaskInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.totalTaskCnt);
    }

    public final String toString() {
        return "HitTaskInfo(compeletedTaskCnt=" + this.compeletedTaskCnt + ", totalTaskCnt=" + this.totalTaskCnt + ")";
    }

    public final int getCompeletedTaskCnt() {
        return this.compeletedTaskCnt;
    }

    public final int getTotalTaskCnt() {
        return this.totalTaskCnt;
    }

    public final void setCompeletedTaskCnt(int i2) {
        this.compeletedTaskCnt = i2;
    }

    public final void setTotalTaskCnt(int i2) {
        this.totalTaskCnt = i2;
    }

    public a(int i2, int i3) {
        this.compeletedTaskCnt = i2;
        this.totalTaskCnt = i3;
    }
}
