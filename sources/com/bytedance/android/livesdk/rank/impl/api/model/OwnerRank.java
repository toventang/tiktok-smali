package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class OwnerRank {
    @c(a = "gap_description")
    private final b gapDescription;
    @c(a = "gap_score")
    private final long gapScore;
    @c(a = "rank")
    private final int rank;
    @c(a = "rank_str")
    private final String rankStr;
    @c(a = "score")
    private final long score;
    @c(a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(12189);
    }

    public OwnerRank() {
        this(null, 0, null, null, 0, 0, 63, null);
    }

    public static int com_bytedance_android_livesdk_rank_impl_api_model_OwnerRank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_bytedance_android_livesdk_rank_impl_api_model_OwnerRank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ OwnerRank copy$default(OwnerRank ownerRank, User user2, int i2, String str, b bVar, long j2, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            user2 = ownerRank.user;
        }
        if ((i3 & 2) != 0) {
            i2 = ownerRank.rank;
        }
        if ((i3 & 4) != 0) {
            str = ownerRank.rankStr;
        }
        if ((i3 & 8) != 0) {
            bVar = ownerRank.gapDescription;
        }
        if ((i3 & 16) != 0) {
            j2 = ownerRank.score;
        }
        if ((i3 & 32) != 0) {
            j3 = ownerRank.gapScore;
        }
        return ownerRank.copy(user2, i2, str, bVar, j2, j3);
    }

    public final User component1() {
        return this.user;
    }

    public final int component2() {
        return this.rank;
    }

    public final String component3() {
        return this.rankStr;
    }

    public final b component4() {
        return this.gapDescription;
    }

    public final long component5() {
        return this.score;
    }

    public final long component6() {
        return this.gapScore;
    }

    public final OwnerRank copy(User user2, int i2, String str, b bVar, long j2, long j3) {
        l.d(user2, "");
        l.d(str, "");
        l.d(bVar, "");
        return new OwnerRank(user2, i2, str, bVar, j2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerRank)) {
            return false;
        }
        OwnerRank ownerRank = (OwnerRank) obj;
        return l.a(this.user, ownerRank.user) && this.rank == ownerRank.rank && l.a(this.rankStr, ownerRank.rankStr) && l.a(this.gapDescription, ownerRank.gapDescription) && this.score == ownerRank.score && this.gapScore == ownerRank.gapScore;
    }

    public final int hashCode() {
        User user2 = this.user;
        int i2 = 0;
        int hashCode = (((user2 != null ? user2.hashCode() : 0) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_OwnerRank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.rank)) * 31;
        String str = this.rankStr;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        b bVar = this.gapDescription;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_OwnerRank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.score)) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_OwnerRank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.gapScore);
    }

    public final String toString() {
        return "OwnerRank(user=" + this.user + ", rank=" + this.rank + ", rankStr=" + this.rankStr + ", gapDescription=" + this.gapDescription + ", score=" + this.score + ", gapScore=" + this.gapScore + ")";
    }

    public final b getGapDescription() {
        return this.gapDescription;
    }

    public final long getGapScore() {
        return this.gapScore;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getRankStr() {
        return this.rankStr;
    }

    public final long getScore() {
        return this.score;
    }

    public final User getUser() {
        return this.user;
    }

    public OwnerRank(User user2, int i2, String str, b bVar, long j2, long j3) {
        l.d(user2, "");
        l.d(str, "");
        l.d(bVar, "");
        this.user = user2;
        this.rank = i2;
        this.rankStr = str;
        this.gapDescription = bVar;
        this.score = j2;
        this.gapScore = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OwnerRank(User user2, int i2, String str, b bVar, long j2, long j3, int i3, g gVar) {
        this((i3 & 1) != 0 ? new User() : user2, (i3 & 2) != 0 ? Integer.MIN_VALUE : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? new b() : bVar, (i3 & 16) != 0 ? 0 : j2, (i3 & 32) == 0 ? j3 : 0);
    }
}
