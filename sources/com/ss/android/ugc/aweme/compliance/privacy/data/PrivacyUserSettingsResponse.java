package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import h.f.b.g;
import h.f.b.l;

public final class PrivacyUserSettingsResponse extends BaseResponse {
    @c(a = "log_pb")
    private final LogPbBean logPb;
    @c(a = "privacy_settings")
    private final q privacyUserSettings;

    static {
        Covode.recordClassIndex(47859);
    }

    public PrivacyUserSettingsResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ PrivacyUserSettingsResponse copy$default(PrivacyUserSettingsResponse privacyUserSettingsResponse, q qVar, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qVar = privacyUserSettingsResponse.privacyUserSettings;
        }
        if ((i2 & 2) != 0) {
            logPbBean = privacyUserSettingsResponse.logPb;
        }
        return privacyUserSettingsResponse.copy(qVar, logPbBean);
    }

    public final q component1() {
        return this.privacyUserSettings;
    }

    public final LogPbBean component2() {
        return this.logPb;
    }

    public final PrivacyUserSettingsResponse copy(q qVar, LogPbBean logPbBean) {
        return new PrivacyUserSettingsResponse(qVar, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyUserSettingsResponse)) {
            return false;
        }
        PrivacyUserSettingsResponse privacyUserSettingsResponse = (PrivacyUserSettingsResponse) obj;
        return l.a(this.privacyUserSettings, privacyUserSettingsResponse.privacyUserSettings) && l.a(this.logPb, privacyUserSettingsResponse.logPb);
    }

    public final int hashCode() {
        q qVar = this.privacyUserSettings;
        int i2 = 0;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PrivacyUserSettingsResponse(privacyUserSettings=" + this.privacyUserSettings + ", logPb=" + this.logPb + ")";
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final q getPrivacyUserSettings() {
        return this.privacyUserSettings;
    }

    public PrivacyUserSettingsResponse(q qVar, LogPbBean logPbBean) {
        this.privacyUserSettings = qVar;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivacyUserSettingsResponse(q qVar, LogPbBean logPbBean, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : qVar, (i2 & 2) != 0 ? null : logPbBean);
    }
}
