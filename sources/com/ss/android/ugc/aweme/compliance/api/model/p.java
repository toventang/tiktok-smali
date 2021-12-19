package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class p implements Serializable {
    @c(a = "res_type")
    private final int resType;
    @c(a = "show_type")
    private final int showType;
    @c(a = "value")
    private final int value;

    static {
        Covode.recordClassIndex(47362);
    }

    public p() {
        this(0, 0, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionOption_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ p copy$default(p pVar, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = pVar.value;
        }
        if ((i5 & 2) != 0) {
            i3 = pVar.showType;
        }
        if ((i5 & 4) != 0) {
            i4 = pVar.resType;
        }
        return pVar.copy(i2, i3, i4);
    }

    public final int component1() {
        return this.value;
    }

    public final int component2() {
        return this.showType;
    }

    public final int component3() {
        return this.resType;
    }

    public final p copy(int i2, int i3, int i4) {
        return new p(i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.value == pVar.value && this.showType == pVar.showType && this.resType == pVar.resType;
    }

    public final int hashCode() {
        return (((com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionOption_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.value) * 31) + com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionOption_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.showType)) * 31) + com_ss_android_ugc_aweme_compliance_api_model_PrivacySettingRestrictionOption_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.resType);
    }

    public final int getResType() {
        return this.resType;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final int getValue() {
        return this.value;
    }

    public final String toString() {
        return "{'value':" + this.value + ", 'show_type':" + this.showType + ", 'res_type':" + this.resType + "}";
    }

    public p(int i2, int i3, int i4) {
        this.value = i2;
        this.showType = i3;
        this.resType = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i2, int i3, int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0 : i4);
    }
}
