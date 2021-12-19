package com.ss.android.ugc.aweme.account.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AgeGateResponse implements Serializable {
    public static final a Companion = new a((byte) 0);
    @c(a = "age_gate_post_action")
    private final int ageGatePostAction;
    private final boolean is_prompt;
    @c(a = "log_pb")
    private final LogPbBean logPb;
    @c(a = "register_age_gate_post_action")
    private final int registerAgeGatePostAction;
    private final int status_code;
    private final String status_msg;

    static {
        Covode.recordClassIndex(38744);
    }

    public AgeGateResponse() {
        this(0, null, false, 0, 0, null, 63, null);
    }

    public static int com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AgeGateResponse copy$default(AgeGateResponse ageGateResponse, int i2, String str, boolean z, int i3, int i4, LogPbBean logPbBean, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = ageGateResponse.status_code;
        }
        if ((i5 & 2) != 0) {
            str = ageGateResponse.status_msg;
        }
        if ((i5 & 4) != 0) {
            z = ageGateResponse.is_prompt;
        }
        if ((i5 & 8) != 0) {
            i3 = ageGateResponse.registerAgeGatePostAction;
        }
        if ((i5 & 16) != 0) {
            i4 = ageGateResponse.ageGatePostAction;
        }
        if ((i5 & 32) != 0) {
            logPbBean = ageGateResponse.logPb;
        }
        return ageGateResponse.copy(i2, str, z, i3, i4, logPbBean);
    }

    public final int component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final boolean component3() {
        return this.is_prompt;
    }

    public final int component4() {
        return this.registerAgeGatePostAction;
    }

    public final int component5() {
        return this.ageGatePostAction;
    }

    public final LogPbBean component6() {
        return this.logPb;
    }

    public final AgeGateResponse copy(int i2, String str, boolean z, int i3, int i4, LogPbBean logPbBean) {
        return new AgeGateResponse(i2, str, z, i3, i4, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeGateResponse)) {
            return false;
        }
        AgeGateResponse ageGateResponse = (AgeGateResponse) obj;
        return this.status_code == ageGateResponse.status_code && l.a(this.status_msg, ageGateResponse.status_msg) && this.is_prompt == ageGateResponse.is_prompt && this.registerAgeGatePostAction == ageGateResponse.registerAgeGatePostAction && this.ageGatePostAction == ageGateResponse.ageGatePostAction && l.a(this.logPb, ageGateResponse.logPb);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status_code) * 31;
        String str = this.status_msg;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.is_prompt;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((((hashCode + i3) * 31) + com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.registerAgeGatePostAction)) * 31) + com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.ageGatePostAction)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return com_ss_android_ugc_aweme_account_bean_AgeGateResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + i2;
    }

    public final String toString() {
        return "AgeGateResponse(status_code=" + this.status_code + ", status_msg=" + this.status_msg + ", is_prompt=" + this.is_prompt + ", registerAgeGatePostAction=" + this.registerAgeGatePostAction + ", ageGatePostAction=" + this.ageGatePostAction + ", logPb=" + this.logPb + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38745);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getAgeGatePostAction() {
        return this.ageGatePostAction;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final int getRegisterAgeGatePostAction() {
        return this.registerAgeGatePostAction;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public final boolean is_prompt() {
        return this.is_prompt;
    }

    public AgeGateResponse(int i2, String str, boolean z, int i3, int i4, LogPbBean logPbBean) {
        this.status_code = i2;
        this.status_msg = str;
        this.is_prompt = z;
        this.registerAgeGatePostAction = i3;
        this.ageGatePostAction = i4;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AgeGateResponse(int i2, String str, boolean z, int i3, int i4, LogPbBean logPbBean, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? "" : str, (i5 & 4) != 0 ? false : z, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) == 0 ? i4 : 0, (i5 & 32) != 0 ? null : logPbBean);
    }
}
