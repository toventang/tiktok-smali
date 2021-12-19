package com.ss.android.ugc.aweme.compliance.business.inference.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class Gender implements Serializable {
    @c(a = "gender_tag_content")
    private String genderContent;
    @c(a = "gender_tag_source")
    private String genderSource;
    @c(a = "gender_tag_type")
    private String genderType;
    private int labelType;

    static {
        Covode.recordClassIndex(47560);
    }

    public Gender() {
        this(null, null, null, 0, 15, null);
    }

    public static int com_ss_android_ugc_aweme_compliance_business_inference_model_Gender_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ Gender copy$default(Gender gender, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = gender.genderSource;
        }
        if ((i3 & 2) != 0) {
            str2 = gender.genderType;
        }
        if ((i3 & 4) != 0) {
            str3 = gender.genderContent;
        }
        if ((i3 & 8) != 0) {
            i2 = gender.labelType;
        }
        return gender.copy(str, str2, str3, i2);
    }

    public final String component1() {
        return this.genderSource;
    }

    public final String component2() {
        return this.genderType;
    }

    public final String component3() {
        return this.genderContent;
    }

    public final int component4() {
        return this.labelType;
    }

    public final Gender copy(String str, String str2, String str3, int i2) {
        return new Gender(str, str2, str3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gender)) {
            return false;
        }
        Gender gender = (Gender) obj;
        return l.a(this.genderSource, gender.genderSource) && l.a(this.genderType, gender.genderType) && l.a(this.genderContent, gender.genderContent) && this.labelType == gender.labelType;
    }

    public final int hashCode() {
        String str = this.genderSource;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.genderType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.genderContent;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + com_ss_android_ugc_aweme_compliance_business_inference_model_Gender_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.labelType);
    }

    public final String toString() {
        return "Gender(genderSource=" + this.genderSource + ", genderType=" + this.genderType + ", genderContent=" + this.genderContent + ", labelType=" + this.labelType + ")";
    }

    public final String getGenderContent() {
        return this.genderContent;
    }

    public final String getGenderSource() {
        return this.genderSource;
    }

    public final String getGenderType() {
        return this.genderType;
    }

    public final int getLabelType() {
        return this.labelType;
    }

    public final void setGenderContent(String str) {
        this.genderContent = str;
    }

    public final void setGenderSource(String str) {
        this.genderSource = str;
    }

    public final void setGenderType(String str) {
        this.genderType = str;
    }

    public final void setLabelType(int i2) {
        this.labelType = i2;
    }

    public Gender(String str, String str2, String str3, int i2) {
        this.genderSource = str;
        this.genderType = str2;
        this.genderContent = str3;
        this.labelType = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Gender(String str, String str2, String str3, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? -1 : i2);
    }
}
