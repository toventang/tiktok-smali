package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ChallengeElasticLayer implements Serializable {
    @c(a = "desc")
    private final String desc;
    @c(a = "tag")
    private final String tag;

    static {
        Covode.recordClassIndex(50881);
    }

    public ChallengeElasticLayer() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ChallengeElasticLayer copy$default(ChallengeElasticLayer challengeElasticLayer, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = challengeElasticLayer.tag;
        }
        if ((i2 & 2) != 0) {
            str2 = challengeElasticLayer.desc;
        }
        return challengeElasticLayer.copy(str, str2);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.desc;
    }

    public final ChallengeElasticLayer copy(String str, String str2) {
        return new ChallengeElasticLayer(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeElasticLayer)) {
            return false;
        }
        ChallengeElasticLayer challengeElasticLayer = (ChallengeElasticLayer) obj;
        return l.a(this.tag, challengeElasticLayer.tag) && l.a(this.desc, challengeElasticLayer.desc);
    }

    public final int hashCode() {
        String str = this.tag;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.desc;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ChallengeElasticLayer(tag=" + this.tag + ", desc=" + this.desc + ")";
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTag() {
        return this.tag;
    }

    public ChallengeElasticLayer(String str, String str2) {
        this.tag = str;
        this.desc = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeElasticLayer(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
