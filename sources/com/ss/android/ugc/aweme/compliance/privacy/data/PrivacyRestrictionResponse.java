package com.ss.android.ugc.aweme.compliance.privacy.data;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.compliance.api.model.m;
import com.ss.android.ugc.aweme.compliance.api.model.n;
import h.f.b.g;
import h.f.b.l;
import java.util.Map;

public final class PrivacyRestrictionResponse extends BaseResponse {
    private final LogPbBean logPb;
    private final Map<String, m> popupAgreement;
    private final Map<String, m> postRecord;
    private final n privacySettingRestriction;

    static {
        Covode.recordClassIndex(47856);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.privacy.data.PrivacyRestrictionResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacyRestrictionResponse copy$default(PrivacyRestrictionResponse privacyRestrictionResponse, n nVar, Map map, Map map2, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nVar = privacyRestrictionResponse.privacySettingRestriction;
        }
        if ((i2 & 2) != 0) {
            map = privacyRestrictionResponse.popupAgreement;
        }
        if ((i2 & 4) != 0) {
            map2 = privacyRestrictionResponse.postRecord;
        }
        if ((i2 & 8) != 0) {
            logPbBean = privacyRestrictionResponse.logPb;
        }
        return privacyRestrictionResponse.copy(nVar, map, map2, logPbBean);
    }

    public final n component1() {
        return this.privacySettingRestriction;
    }

    public final Map<String, m> component2() {
        return this.popupAgreement;
    }

    public final Map<String, m> component3() {
        return this.postRecord;
    }

    public final LogPbBean component4() {
        return this.logPb;
    }

    public final PrivacyRestrictionResponse copy(n nVar, Map<String, m> map, Map<String, m> map2, LogPbBean logPbBean) {
        l.d(map, "");
        l.d(map2, "");
        return new PrivacyRestrictionResponse(nVar, map, map2, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyRestrictionResponse)) {
            return false;
        }
        PrivacyRestrictionResponse privacyRestrictionResponse = (PrivacyRestrictionResponse) obj;
        return l.a(this.privacySettingRestriction, privacyRestrictionResponse.privacySettingRestriction) && l.a(this.popupAgreement, privacyRestrictionResponse.popupAgreement) && l.a(this.postRecord, privacyRestrictionResponse.postRecord) && l.a(this.logPb, privacyRestrictionResponse.logPb);
    }

    public final int hashCode() {
        n nVar = this.privacySettingRestriction;
        int i2 = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        Map<String, m> map = this.popupAgreement;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, m> map2 = this.postRecord;
        int hashCode3 = (hashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode3 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "PrivacyRestrictionResponse(privacySettingRestriction=" + this.privacySettingRestriction + ", popupAgreement=" + this.popupAgreement + ", postRecord=" + this.postRecord + ", logPb=" + this.logPb + ")";
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Map<String, m> getPopupAgreement() {
        return this.popupAgreement;
    }

    public final Map<String, m> getPostRecord() {
        return this.postRecord;
    }

    public final n getPrivacySettingRestriction() {
        return this.privacySettingRestriction;
    }

    public PrivacyRestrictionResponse(n nVar, Map<String, m> map, Map<String, m> map2, LogPbBean logPbBean) {
        l.d(map, "");
        l.d(map2, "");
        this.privacySettingRestriction = nVar;
        this.popupAgreement = map;
        this.postRecord = map2;
        this.logPb = logPbBean;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrivacyRestrictionResponse(n nVar, Map map, Map map2, LogPbBean logPbBean, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : nVar, map, map2, (i2 & 8) != 0 ? null : logPbBean);
    }
}
