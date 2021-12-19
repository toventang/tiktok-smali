package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DislikeRecommendParams {
    public final String secUid;
    public final String uid;

    static {
        Covode.recordClassIndex(61570);
    }

    public static /* synthetic */ DislikeRecommendParams copy$default(DislikeRecommendParams dislikeRecommendParams, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dislikeRecommendParams.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = dislikeRecommendParams.secUid;
        }
        return dislikeRecommendParams.copy(str, str2);
    }

    public final DislikeRecommendParams copy(String str, String str2) {
        l.d(str, "");
        return new DislikeRecommendParams(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DislikeRecommendParams)) {
            return false;
        }
        DislikeRecommendParams dislikeRecommendParams = (DislikeRecommendParams) obj;
        return l.a(this.uid, dislikeRecommendParams.uid) && l.a(this.secUid, dislikeRecommendParams.secUid);
    }

    public final int hashCode() {
        String str = this.uid;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUid;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DislikeRecommendParams(uid=" + this.uid + ", secUid=" + this.secUid + ")";
    }

    public DislikeRecommendParams(String str, String str2) {
        l.d(str, "");
        this.uid = str;
        this.secUid = str2;
    }
}
