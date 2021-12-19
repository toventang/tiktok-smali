package com.ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.request_combine.a;
import h.f.b.g;
import h.f.b.l;

public final class ComplianceSettingCombineModel extends a {
    @c(a = "body")
    private ComplianceSetting complianceSetting;

    static {
        Covode.recordClassIndex(78545);
    }

    public ComplianceSettingCombineModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ ComplianceSettingCombineModel copy$default(ComplianceSettingCombineModel complianceSettingCombineModel, ComplianceSetting complianceSetting2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            complianceSetting2 = complianceSettingCombineModel.complianceSetting;
        }
        return complianceSettingCombineModel.copy(complianceSetting2);
    }

    public final ComplianceSetting component1() {
        return this.complianceSetting;
    }

    public final ComplianceSettingCombineModel copy(ComplianceSetting complianceSetting2) {
        return new ComplianceSettingCombineModel(complianceSetting2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ComplianceSettingCombineModel) && l.a(this.complianceSetting, ((ComplianceSettingCombineModel) obj).complianceSetting);
        }
        return true;
    }

    public final int hashCode() {
        ComplianceSetting complianceSetting2 = this.complianceSetting;
        if (complianceSetting2 != null) {
            return complianceSetting2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ComplianceSettingCombineModel(complianceSetting=" + this.complianceSetting + ")";
    }

    public final ComplianceSetting getComplianceSetting() {
        return this.complianceSetting;
    }

    public final void setComplianceSetting(ComplianceSetting complianceSetting2) {
        this.complianceSetting = complianceSetting2;
    }

    public ComplianceSettingCombineModel(ComplianceSetting complianceSetting2) {
        this.complianceSetting = complianceSetting2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComplianceSettingCombineModel(ComplianceSetting complianceSetting2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : complianceSetting2);
    }
}
