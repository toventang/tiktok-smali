package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CmplRespForEncrypt extends BaseResponse implements Serializable {
    @c(a = "cmpl_enc")
    private final String complianceEncrypt;
    @c(a = "log_pb")
    private final LogPbBean logPb;

    static {
        Covode.recordClassIndex(47328);
    }

    public CmplRespForEncrypt() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CmplRespForEncrypt copy$default(CmplRespForEncrypt cmplRespForEncrypt, String str, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cmplRespForEncrypt.complianceEncrypt;
        }
        if ((i2 & 2) != 0) {
            logPbBean = cmplRespForEncrypt.logPb;
        }
        return cmplRespForEncrypt.copy(str, logPbBean);
    }

    public final String component1() {
        return this.complianceEncrypt;
    }

    public final LogPbBean component2() {
        return this.logPb;
    }

    public final CmplRespForEncrypt copy(String str, LogPbBean logPbBean) {
        return new CmplRespForEncrypt(str, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CmplRespForEncrypt)) {
            return false;
        }
        CmplRespForEncrypt cmplRespForEncrypt = (CmplRespForEncrypt) obj;
        return l.a(this.complianceEncrypt, cmplRespForEncrypt.complianceEncrypt) && l.a(this.logPb, cmplRespForEncrypt.logPb);
    }

    public final int hashCode() {
        String str = this.complianceEncrypt;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CmplRespForEncrypt(complianceEncrypt=" + this.complianceEncrypt + ", logPb=" + this.logPb + ")";
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public CmplRespForEncrypt(String str, LogPbBean logPbBean) {
        this.complianceEncrypt = str;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CmplRespForEncrypt(String str, LogPbBean logPbBean, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : logPbBean);
    }
}
