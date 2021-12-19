package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.util.List;

public final class DraftOperationLog {
    @c(a = "count")
    private final int count;
    @c(a = "e_code")
    private final List<DraftOperationCode> errorCode;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "success_count")
    private final int successCount;

    static {
        Covode.recordClassIndex(60426);
    }

    public DraftOperationLog() {
        this(null, 0, null, 0, 15, null);
    }

    public static int com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_DraftOperationLog_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.DraftOperationLog */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DraftOperationLog copy$default(DraftOperationLog draftOperationLog, String str, int i2, List list, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = draftOperationLog.name;
        }
        if ((i4 & 2) != 0) {
            i2 = draftOperationLog.count;
        }
        if ((i4 & 4) != 0) {
            list = draftOperationLog.errorCode;
        }
        if ((i4 & 8) != 0) {
            i3 = draftOperationLog.successCount;
        }
        return draftOperationLog.copy(str, i2, list, i3);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.count;
    }

    public final List<DraftOperationCode> component3() {
        return this.errorCode;
    }

    public final int component4() {
        return this.successCount;
    }

    public final DraftOperationLog copy(String str, int i2, List<DraftOperationCode> list, int i3) {
        l.d(str, "");
        l.d(list, "");
        return new DraftOperationLog(str, i2, list, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftOperationLog)) {
            return false;
        }
        DraftOperationLog draftOperationLog = (DraftOperationLog) obj;
        return l.a(this.name, draftOperationLog.name) && this.count == draftOperationLog.count && l.a(this.errorCode, draftOperationLog.errorCode) && this.successCount == draftOperationLog.successCount;
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_DraftOperationLog_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.count)) * 31;
        List<DraftOperationCode> list = this.errorCode;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((hashCode + i2) * 31) + com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_DraftOperationLog_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.successCount);
    }

    public final String toString() {
        return "DraftOperationLog(name=" + this.name + ", count=" + this.count + ", errorCode=" + this.errorCode + ", successCount=" + this.successCount + ")";
    }

    public final int getCount() {
        return this.count;
    }

    public final List<DraftOperationCode> getErrorCode() {
        return this.errorCode;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public DraftOperationLog(String str, int i2, List<DraftOperationCode> list, int i3) {
        l.d(str, "");
        l.d(list, "");
        this.name = str;
        this.count = i2;
        this.errorCode = list;
        this.successCount = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftOperationLog(String str, int i2, List list, int i3, int i4, g gVar) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? z.INSTANCE : list, (i4 & 8) != 0 ? 0 : i3);
    }
}
