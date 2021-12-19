package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class AwemeToolFeedbackECode {
    private final String code;
    private final String stage;

    static {
        Covode.recordClassIndex(60423);
    }

    public AwemeToolFeedbackECode() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AwemeToolFeedbackECode copy$default(AwemeToolFeedbackECode awemeToolFeedbackECode, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awemeToolFeedbackECode.code;
        }
        if ((i2 & 2) != 0) {
            str2 = awemeToolFeedbackECode.stage;
        }
        return awemeToolFeedbackECode.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.stage;
    }

    public final AwemeToolFeedbackECode copy(String str, String str2) {
        l.d(str, "");
        return new AwemeToolFeedbackECode(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeToolFeedbackECode)) {
            return false;
        }
        AwemeToolFeedbackECode awemeToolFeedbackECode = (AwemeToolFeedbackECode) obj;
        return l.a(this.code, awemeToolFeedbackECode.code) && l.a(this.stage, awemeToolFeedbackECode.stage);
    }

    public final int hashCode() {
        String str = this.code;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.stage;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AwemeToolFeedbackECode(code=" + this.code + ", stage=" + this.stage + ")";
    }

    public final String getCode() {
        return this.code;
    }

    public final String getStage() {
        return this.stage;
    }

    public AwemeToolFeedbackECode(String str, String str2) {
        l.d(str, "");
        this.code = str;
        this.stage = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeToolFeedbackECode(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2);
    }
}
