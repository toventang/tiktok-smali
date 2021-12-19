package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class AwemeToolFeedbackInfo {
    @c(a = "cancel_count")
    private final int cancelCount;
    private final int count;
    @c(a = "e_code")
    private final List<AwemeToolFeedbackECode> eCode;
    private final String name;
    @c(a = "success_count")
    private final int successCount;

    static {
        Covode.recordClassIndex(60424);
    }

    public AwemeToolFeedbackInfo() {
        this(null, 0, 0, 0, null, 31, null);
    }

    public static int com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_AwemeToolFeedbackInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwemeToolFeedbackInfo copy$default(AwemeToolFeedbackInfo awemeToolFeedbackInfo, String str, int i2, int i3, int i4, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = awemeToolFeedbackInfo.name;
        }
        if ((i5 & 2) != 0) {
            i2 = awemeToolFeedbackInfo.count;
        }
        if ((i5 & 4) != 0) {
            i3 = awemeToolFeedbackInfo.successCount;
        }
        if ((i5 & 8) != 0) {
            i4 = awemeToolFeedbackInfo.cancelCount;
        }
        if ((i5 & 16) != 0) {
            list = awemeToolFeedbackInfo.eCode;
        }
        return awemeToolFeedbackInfo.copy(str, i2, i3, i4, list);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.count;
    }

    public final int component3() {
        return this.successCount;
    }

    public final int component4() {
        return this.cancelCount;
    }

    public final List<AwemeToolFeedbackECode> component5() {
        return this.eCode;
    }

    public final AwemeToolFeedbackInfo copy(String str, int i2, int i3, int i4, List<AwemeToolFeedbackECode> list) {
        l.d(str, "");
        l.d(list, "");
        return new AwemeToolFeedbackInfo(str, i2, i3, i4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeToolFeedbackInfo)) {
            return false;
        }
        AwemeToolFeedbackInfo awemeToolFeedbackInfo = (AwemeToolFeedbackInfo) obj;
        return l.a(this.name, awemeToolFeedbackInfo.name) && this.count == awemeToolFeedbackInfo.count && this.successCount == awemeToolFeedbackInfo.successCount && this.cancelCount == awemeToolFeedbackInfo.cancelCount && l.a(this.eCode, awemeToolFeedbackInfo.eCode);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (((((((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_AwemeToolFeedbackInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.count)) * 31) + com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_AwemeToolFeedbackInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.successCount)) * 31) + com_ss_android_ugc_aweme_feedback_runtime_behavior_strategy_AwemeToolFeedbackInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cancelCount)) * 31;
        List<AwemeToolFeedbackECode> list = this.eCode;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AwemeToolFeedbackInfo(name=" + this.name + ", count=" + this.count + ", successCount=" + this.successCount + ", cancelCount=" + this.cancelCount + ", eCode=" + this.eCode + ")";
    }

    public final int getCancelCount() {
        return this.cancelCount;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<AwemeToolFeedbackECode> getECode() {
        return this.eCode;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSuccessCount() {
        return this.successCount;
    }

    public AwemeToolFeedbackInfo(String str, int i2, int i3, int i4, List<AwemeToolFeedbackECode> list) {
        l.d(str, "");
        l.d(list, "");
        this.name = str;
        this.count = i2;
        this.successCount = i3;
        this.cancelCount = i4;
        this.eCode = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeToolFeedbackInfo(String str, int i2, int i3, int i4, List list, int i5, g gVar) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) == 0 ? i4 : 0, (i5 & 16) != 0 ? new ArrayList() : list);
    }
}
