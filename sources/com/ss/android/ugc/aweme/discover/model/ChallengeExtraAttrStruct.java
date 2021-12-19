package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class ChallengeExtraAttrStruct implements Serializable {
    @c(a = "is_live")
    private final boolean isLive;

    static {
        Covode.recordClassIndex(50882);
    }

    public ChallengeExtraAttrStruct() {
        this(false, 1, null);
    }

    public static /* synthetic */ ChallengeExtraAttrStruct copy$default(ChallengeExtraAttrStruct challengeExtraAttrStruct, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = challengeExtraAttrStruct.isLive;
        }
        return challengeExtraAttrStruct.copy(z);
    }

    public final boolean component1() {
        return this.isLive;
    }

    public final ChallengeExtraAttrStruct copy(boolean z) {
        return new ChallengeExtraAttrStruct(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ChallengeExtraAttrStruct) && this.isLive == ((ChallengeExtraAttrStruct) obj).isLive;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.isLive;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ChallengeExtraAttrStruct(isLive=" + this.isLive + ")";
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public ChallengeExtraAttrStruct(boolean z) {
        this.isLive = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeExtraAttrStruct(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
