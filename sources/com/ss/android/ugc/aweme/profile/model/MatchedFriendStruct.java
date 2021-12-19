package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class MatchedFriendStruct implements Serializable {
    @c(a = "external_recommend_reason")
    public ExternalRecommendReasonStruct externalRecommendReasonStruct;
    @c(a = "mutual_struct")
    public MutualStruct mMutualStruct;
    @c(a = "rec_type")
    public String recType;
    @c(a = "recommend_reason")
    public String recommendReason;
    @c(a = "relation_type")
    public String relationType;

    static {
        Covode.recordClassIndex(75240);
    }

    public MatchedFriendStruct() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MatchedFriendStruct copy$default(MatchedFriendStruct matchedFriendStruct, String str, String str2, String str3, MutualStruct mutualStruct, ExternalRecommendReasonStruct externalRecommendReasonStruct2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = matchedFriendStruct.recommendReason;
        }
        if ((i2 & 2) != 0) {
            str2 = matchedFriendStruct.recType;
        }
        if ((i2 & 4) != 0) {
            str3 = matchedFriendStruct.relationType;
        }
        if ((i2 & 8) != 0) {
            mutualStruct = matchedFriendStruct.mMutualStruct;
        }
        if ((i2 & 16) != 0) {
            externalRecommendReasonStruct2 = matchedFriendStruct.externalRecommendReasonStruct;
        }
        return matchedFriendStruct.copy(str, str2, str3, mutualStruct, externalRecommendReasonStruct2);
    }

    public final String component1() {
        return this.recommendReason;
    }

    public final String component2() {
        return this.recType;
    }

    public final String component3() {
        return this.relationType;
    }

    public final MutualStruct component4() {
        return this.mMutualStruct;
    }

    public final ExternalRecommendReasonStruct component5() {
        return this.externalRecommendReasonStruct;
    }

    public final MatchedFriendStruct copy(String str, String str2, String str3, MutualStruct mutualStruct, ExternalRecommendReasonStruct externalRecommendReasonStruct2) {
        return new MatchedFriendStruct(str, str2, str3, mutualStruct, externalRecommendReasonStruct2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedFriendStruct)) {
            return false;
        }
        MatchedFriendStruct matchedFriendStruct = (MatchedFriendStruct) obj;
        return l.a(this.recommendReason, matchedFriendStruct.recommendReason) && l.a(this.recType, matchedFriendStruct.recType) && l.a(this.relationType, matchedFriendStruct.relationType) && l.a(this.mMutualStruct, matchedFriendStruct.mMutualStruct) && l.a(this.externalRecommendReasonStruct, matchedFriendStruct.externalRecommendReasonStruct);
    }

    public final int hashCode() {
        String str = this.recommendReason;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.recType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.relationType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        MutualStruct mutualStruct = this.mMutualStruct;
        int hashCode4 = (hashCode3 + (mutualStruct != null ? mutualStruct.hashCode() : 0)) * 31;
        ExternalRecommendReasonStruct externalRecommendReasonStruct2 = this.externalRecommendReasonStruct;
        if (externalRecommendReasonStruct2 != null) {
            i2 = externalRecommendReasonStruct2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "MatchedFriendStruct(recommendReason=" + this.recommendReason + ", recType=" + this.recType + ", relationType=" + this.relationType + ", mMutualStruct=" + this.mMutualStruct + ", externalRecommendReasonStruct=" + this.externalRecommendReasonStruct + ")";
    }

    public final ExternalRecommendReasonStruct getExternalRecommendReasonStruct() {
        return this.externalRecommendReasonStruct;
    }

    public final MutualStruct getMMutualStruct() {
        return this.mMutualStruct;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final String getRecommendReason() {
        return this.recommendReason;
    }

    public final String getRelationType() {
        return this.relationType;
    }

    public final void setExternalRecommendReasonStruct(ExternalRecommendReasonStruct externalRecommendReasonStruct2) {
        this.externalRecommendReasonStruct = externalRecommendReasonStruct2;
    }

    public final void setMMutualStruct(MutualStruct mutualStruct) {
        this.mMutualStruct = mutualStruct;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public final void setRelationType(String str) {
        this.relationType = str;
    }

    public MatchedFriendStruct(String str, String str2, String str3, MutualStruct mutualStruct, ExternalRecommendReasonStruct externalRecommendReasonStruct2) {
        this.recommendReason = str;
        this.recType = str2;
        this.relationType = str3;
        this.mMutualStruct = mutualStruct;
        this.externalRecommendReasonStruct = externalRecommendReasonStruct2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MatchedFriendStruct(String str, String str2, String str3, MutualStruct mutualStruct, ExternalRecommendReasonStruct externalRecommendReasonStruct2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : mutualStruct, (i2 & 16) == 0 ? externalRecommendReasonStruct2 : null);
    }
}
