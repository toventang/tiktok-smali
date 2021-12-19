package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class AwemeRelationRecommendModel implements Serializable {
    @c(a = "friend_type_str")
    public String friendTypeStr;
    @c(a = "rec_type")
    public String recType;
    @c(a = "recommend_type")
    public long recommendType;
    @c(a = "relation_text_key")
    public String relationTextKey;

    static {
        Covode.recordClassIndex(59327);
    }

    public AwemeRelationRecommendModel() {
    }

    public static int com_ss_android_ugc_aweme_feed_model_AwemeRelationRecommendModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ AwemeRelationRecommendModel copy$default(AwemeRelationRecommendModel awemeRelationRecommendModel, long j2, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = awemeRelationRecommendModel.recommendType;
        }
        if ((i2 & 2) != 0) {
            str = awemeRelationRecommendModel.relationTextKey;
        }
        if ((i2 & 4) != 0) {
            str2 = awemeRelationRecommendModel.recType;
        }
        if ((i2 & 8) != 0) {
            str3 = awemeRelationRecommendModel.friendTypeStr;
        }
        return awemeRelationRecommendModel.copy(j2, str, str2, str3);
    }

    public final long component1() {
        return this.recommendType;
    }

    public final String component2() {
        return this.relationTextKey;
    }

    public final String component3() {
        return this.recType;
    }

    public final String component4() {
        return this.friendTypeStr;
    }

    public final AwemeRelationRecommendModel copy(long j2, String str, String str2, String str3) {
        return new AwemeRelationRecommendModel(j2, str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeRelationRecommendModel)) {
            return false;
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = (AwemeRelationRecommendModel) obj;
        return this.recommendType == awemeRelationRecommendModel.recommendType && l.a(this.relationTextKey, awemeRelationRecommendModel.relationTextKey) && l.a(this.recType, awemeRelationRecommendModel.recType) && l.a(this.friendTypeStr, awemeRelationRecommendModel.friendTypeStr);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_AwemeRelationRecommendModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_feed_model_AwemeRelationRecommendModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.recommendType) * 31;
        String str = this.relationTextKey;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_AwemeRelationRecommendModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.recType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.friendTypeStr;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AwemeRelationRecommendModel(recommendType=" + this.recommendType + ", relationTextKey=" + this.relationTextKey + ", recType=" + this.recType + ", friendTypeStr=" + this.friendTypeStr + ")";
    }

    public final String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final long getRecommendType() {
        return this.recommendType;
    }

    public final String getRelationTextKey() {
        return this.relationTextKey;
    }

    public final void setFriendTypeStr(String str) {
        this.friendTypeStr = str;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendType(long j2) {
        this.recommendType = j2;
    }

    public final void setRelationTextKey(String str) {
        this.relationTextKey = str;
    }

    public AwemeRelationRecommendModel(long j2, String str, String str2, String str3) {
        this.recommendType = j2;
        this.relationTextKey = str;
        this.recType = str2;
        this.friendTypeStr = str3;
    }
}
