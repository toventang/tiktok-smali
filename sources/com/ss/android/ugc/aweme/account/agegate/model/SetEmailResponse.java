package com.ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SetEmailResponse {
    private final int status_code;
    private final String status_msg;

    static {
        Covode.recordClassIndex(38682);
    }

    public static int com_ss_android_ugc_aweme_account_agegate_model_SetEmailResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ SetEmailResponse copy$default(SetEmailResponse setEmailResponse, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = setEmailResponse.status_code;
        }
        if ((i3 & 2) != 0) {
            str = setEmailResponse.status_msg;
        }
        return setEmailResponse.copy(i2, str);
    }

    public final int component1() {
        return this.status_code;
    }

    public final String component2() {
        return this.status_msg;
    }

    public final SetEmailResponse copy(int i2, String str) {
        l.d(str, "");
        return new SetEmailResponse(i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetEmailResponse)) {
            return false;
        }
        SetEmailResponse setEmailResponse = (SetEmailResponse) obj;
        return this.status_code == setEmailResponse.status_code && l.a(this.status_msg, setEmailResponse.status_msg);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_account_agegate_model_SetEmailResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_account_agegate_model_SetEmailResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.status_code) * 31;
        String str = this.status_msg;
        return com_ss_android_ugc_aweme_account_agegate_model_SetEmailResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SetEmailResponse(status_code=" + this.status_code + ", status_msg=" + this.status_msg + ")";
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_msg() {
        return this.status_msg;
    }

    public SetEmailResponse(int i2, String str) {
        l.d(str, "");
        this.status_code = i2;
        this.status_msg = str;
    }
}
