package com.ss.android.ugc.aweme.kids.common.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.l;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;

public final class KidsSettings extends BaseResponse {
    @c(a = "ab_test_params")
    private final l abTestParamStruct;
    @c(a = "compliance_settings")
    private final KidsComplianceSettings complianceSettings;

    static {
        Covode.recordClassIndex(67769);
    }

    public static /* synthetic */ KidsSettings copy$default(KidsSettings kidsSettings, KidsComplianceSettings kidsComplianceSettings, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kidsComplianceSettings = kidsSettings.complianceSettings;
        }
        if ((i2 & 2) != 0) {
            lVar = kidsSettings.abTestParamStruct;
        }
        return kidsSettings.copy(kidsComplianceSettings, lVar);
    }

    public final KidsComplianceSettings component1() {
        return this.complianceSettings;
    }

    public final l component2() {
        return this.abTestParamStruct;
    }

    public final KidsSettings copy(KidsComplianceSettings kidsComplianceSettings, l lVar) {
        return new KidsSettings(kidsComplianceSettings, lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsSettings)) {
            return false;
        }
        KidsSettings kidsSettings = (KidsSettings) obj;
        return h.f.b.l.a(this.complianceSettings, kidsSettings.complianceSettings) && h.f.b.l.a(this.abTestParamStruct, kidsSettings.abTestParamStruct);
    }

    public final int hashCode() {
        KidsComplianceSettings kidsComplianceSettings = this.complianceSettings;
        int i2 = 0;
        int hashCode = (kidsComplianceSettings != null ? kidsComplianceSettings.hashCode() : 0) * 31;
        l lVar = this.abTestParamStruct;
        if (lVar != null) {
            i2 = lVar.hashCode();
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "KidsSettings(complianceSettings=" + this.complianceSettings + ", abTestParamStruct=" + this.abTestParamStruct + ")";
    }

    public final l getAbTestParamStruct() {
        return this.abTestParamStruct;
    }

    public final KidsComplianceSettings getComplianceSettings() {
        return this.complianceSettings;
    }

    public KidsSettings(KidsComplianceSettings kidsComplianceSettings, l lVar) {
        this.complianceSettings = kidsComplianceSettings;
        this.abTestParamStruct = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KidsSettings(KidsComplianceSettings kidsComplianceSettings, l lVar, int i2, g gVar) {
        this(kidsComplianceSettings, (i2 & 2) != 0 ? null : lVar);
    }
}
