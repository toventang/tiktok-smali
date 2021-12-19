package com.ss.android.ugc.aweme.compliance.business.inference.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class InferenceCategory extends BaseResponse implements Serializable {
    @c(a = "active_interest_tags")
    private final List<LabelData> activeInterestTags;
    @c(a = "gender_tag")
    private final Gender genderTag;
    @c(a = "inactive_interest_tags")
    private final List<LabelData> inactiveInterestTags;
    @c(a = "interest_tags")
    private final List<LabelData> interestTags;

    static {
        Covode.recordClassIndex(47561);
    }

    public InferenceCategory() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.business.inference.model.InferenceCategory */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InferenceCategory copy$default(InferenceCategory inferenceCategory, List list, List list2, List list3, Gender gender, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = inferenceCategory.interestTags;
        }
        if ((i2 & 2) != 0) {
            list2 = inferenceCategory.activeInterestTags;
        }
        if ((i2 & 4) != 0) {
            list3 = inferenceCategory.inactiveInterestTags;
        }
        if ((i2 & 8) != 0) {
            gender = inferenceCategory.genderTag;
        }
        return inferenceCategory.copy(list, list2, list3, gender);
    }

    public final List<LabelData> component1() {
        return this.interestTags;
    }

    public final List<LabelData> component2() {
        return this.activeInterestTags;
    }

    public final List<LabelData> component3() {
        return this.inactiveInterestTags;
    }

    public final Gender component4() {
        return this.genderTag;
    }

    public final InferenceCategory copy(List<LabelData> list, List<LabelData> list2, List<LabelData> list3, Gender gender) {
        return new InferenceCategory(list, list2, list3, gender);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InferenceCategory)) {
            return false;
        }
        InferenceCategory inferenceCategory = (InferenceCategory) obj;
        return l.a(this.interestTags, inferenceCategory.interestTags) && l.a(this.activeInterestTags, inferenceCategory.activeInterestTags) && l.a(this.inactiveInterestTags, inferenceCategory.inactiveInterestTags) && l.a(this.genderTag, inferenceCategory.genderTag);
    }

    public final int hashCode() {
        List<LabelData> list = this.interestTags;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<LabelData> list2 = this.activeInterestTags;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<LabelData> list3 = this.inactiveInterestTags;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Gender gender = this.genderTag;
        if (gender != null) {
            i2 = gender.hashCode();
        }
        return hashCode3 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "InferenceCategory(interestTags=" + this.interestTags + ", activeInterestTags=" + this.activeInterestTags + ", inactiveInterestTags=" + this.inactiveInterestTags + ", genderTag=" + this.genderTag + ")";
    }

    public final List<LabelData> getActiveInterestTags() {
        return this.activeInterestTags;
    }

    public final Gender getGenderTag() {
        return this.genderTag;
    }

    public final List<LabelData> getInactiveInterestTags() {
        return this.inactiveInterestTags;
    }

    public final List<LabelData> getInterestTags() {
        return this.interestTags;
    }

    public InferenceCategory(List<LabelData> list, List<LabelData> list2, List<LabelData> list3, Gender gender) {
        this.interestTags = list;
        this.activeInterestTags = list2;
        this.inactiveInterestTags = list3;
        this.genderTag = gender;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InferenceCategory(List list, List list2, List list3, Gender gender, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : list3, (i2 & 8) != 0 ? null : gender);
    }
}
