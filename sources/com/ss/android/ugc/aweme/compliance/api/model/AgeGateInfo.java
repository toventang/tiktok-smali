package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class AgeGateInfo implements Serializable {
    @c(a = "register_age_gate_action")
    private final int registerAgeGateAction;

    static {
        Covode.recordClassIndex(47324);
    }

    public AgeGateInfo() {
        this(0, 1, null);
    }

    public static int com_ss_android_ugc_aweme_compliance_api_model_AgeGateInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ AgeGateInfo copy$default(AgeGateInfo ageGateInfo, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = ageGateInfo.registerAgeGateAction;
        }
        return ageGateInfo.copy(i2);
    }

    public final int component1() {
        return this.registerAgeGateAction;
    }

    public final AgeGateInfo copy(int i2) {
        return new AgeGateInfo(i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AgeGateInfo) && this.registerAgeGateAction == ((AgeGateInfo) obj).registerAgeGateAction;
        }
        return true;
    }

    public final int hashCode() {
        return com_ss_android_ugc_aweme_compliance_api_model_AgeGateInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.registerAgeGateAction);
    }

    public final String toString() {
        return "AgeGateInfo(registerAgeGateAction=" + this.registerAgeGateAction + ")";
    }

    public final int getRegisterAgeGateAction() {
        return this.registerAgeGateAction;
    }

    public AgeGateInfo(int i2) {
        this.registerAgeGateAction = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AgeGateInfo(int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
