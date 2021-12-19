package com.ss.android.ugc.aweme.compliance.business.inference.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class LabelData implements Serializable {
    @c(a = "interest_tag_active")
    private Boolean interestTagActive;
    @c(a = "interest_tag_id")
    private String interestTagId;
    @c(a = "interest_tag_value")
    private String interestTagValue;
    private int labelType;

    static {
        Covode.recordClassIndex(47562);
    }

    public LabelData() {
        this(null, null, null, 0, 15, null);
    }

    public static int com_ss_android_ugc_aweme_compliance_business_inference_model_LabelData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ LabelData copy$default(LabelData labelData, String str, String str2, Boolean bool, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = labelData.interestTagId;
        }
        if ((i3 & 2) != 0) {
            str2 = labelData.interestTagValue;
        }
        if ((i3 & 4) != 0) {
            bool = labelData.interestTagActive;
        }
        if ((i3 & 8) != 0) {
            i2 = labelData.labelType;
        }
        return labelData.copy(str, str2, bool, i2);
    }

    public final String component1() {
        return this.interestTagId;
    }

    public final String component2() {
        return this.interestTagValue;
    }

    public final Boolean component3() {
        return this.interestTagActive;
    }

    public final int component4() {
        return this.labelType;
    }

    public final LabelData copy(String str, String str2, Boolean bool, int i2) {
        return new LabelData(str, str2, bool, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelData)) {
            return false;
        }
        LabelData labelData = (LabelData) obj;
        return l.a(this.interestTagId, labelData.interestTagId) && l.a(this.interestTagValue, labelData.interestTagValue) && l.a(this.interestTagActive, labelData.interestTagActive) && this.labelType == labelData.labelType;
    }

    public final int hashCode() {
        String str = this.interestTagId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.interestTagValue;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.interestTagActive;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return ((hashCode2 + i2) * 31) + com_ss_android_ugc_aweme_compliance_business_inference_model_LabelData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.labelType);
    }

    public final String toString() {
        return "LabelData(interestTagId=" + this.interestTagId + ", interestTagValue=" + this.interestTagValue + ", interestTagActive=" + this.interestTagActive + ", labelType=" + this.labelType + ")";
    }

    public final Boolean getInterestTagActive() {
        return this.interestTagActive;
    }

    public final String getInterestTagId() {
        return this.interestTagId;
    }

    public final String getInterestTagValue() {
        return this.interestTagValue;
    }

    public final int getLabelType() {
        return this.labelType;
    }

    public final void setInterestTagActive(Boolean bool) {
        this.interestTagActive = bool;
    }

    public final void setInterestTagId(String str) {
        this.interestTagId = str;
    }

    public final void setInterestTagValue(String str) {
        this.interestTagValue = str;
    }

    public final void setLabelType(int i2) {
        this.labelType = i2;
    }

    public LabelData(String str, String str2, Boolean bool, int i2) {
        this.interestTagId = str;
        this.interestTagValue = str2;
        this.interestTagActive = bool;
        this.labelType = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LabelData(String str, String str2, Boolean bool, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? false : bool, (i3 & 8) != 0 ? -1 : i2);
    }
}
