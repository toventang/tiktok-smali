package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class Rank {
    @c(a = "combo_badge")
    private final ImageModel comboBadge;
    @c(a = "combo_count")
    private final int comboCount;
    @c(a = "rank")
    private final int rank;
    @c(a = "room_id")
    private final long roomId;
    @c(a = "score")
    private final long score;
    @c(a = "score_description")
    private final String scoreDescription;
    @c(a = "user")
    private final User user;

    static {
        Covode.recordClassIndex(12190);
    }

    public Rank() {
        this(null, 0, null, 0, 0, null, 0, 127, null);
    }

    public static int com_bytedance_android_livesdk_rank_impl_api_model_Rank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_bytedance_android_livesdk_rank_impl_api_model_Rank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ Rank copy$default(Rank rank2, User user2, int i2, String str, long j2, long j3, ImageModel imageModel, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            user2 = rank2.user;
        }
        if ((i4 & 2) != 0) {
            i2 = rank2.rank;
        }
        if ((i4 & 4) != 0) {
            str = rank2.scoreDescription;
        }
        if ((i4 & 8) != 0) {
            j2 = rank2.roomId;
        }
        if ((i4 & 16) != 0) {
            j3 = rank2.score;
        }
        if ((i4 & 32) != 0) {
            imageModel = rank2.comboBadge;
        }
        if ((i4 & 64) != 0) {
            i3 = rank2.comboCount;
        }
        return rank2.copy(user2, i2, str, j2, j3, imageModel, i3);
    }

    public final User component1() {
        return this.user;
    }

    public final int component2() {
        return this.rank;
    }

    public final String component3() {
        return this.scoreDescription;
    }

    public final long component4() {
        return this.roomId;
    }

    public final long component5() {
        return this.score;
    }

    public final ImageModel component6() {
        return this.comboBadge;
    }

    public final int component7() {
        return this.comboCount;
    }

    public final Rank copy(User user2, int i2, String str, long j2, long j3, ImageModel imageModel, int i3) {
        l.d(user2, "");
        l.d(str, "");
        return new Rank(user2, i2, str, j2, j3, imageModel, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rank)) {
            return false;
        }
        Rank rank2 = (Rank) obj;
        return l.a(this.user, rank2.user) && this.rank == rank2.rank && l.a(this.scoreDescription, rank2.scoreDescription) && this.roomId == rank2.roomId && this.score == rank2.score && l.a(this.comboBadge, rank2.comboBadge) && this.comboCount == rank2.comboCount;
    }

    public final int hashCode() {
        User user2 = this.user;
        int i2 = 0;
        int hashCode = (((user2 != null ? user2.hashCode() : 0) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_Rank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.rank)) * 31;
        String str = this.scoreDescription;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_Rank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.roomId)) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_Rank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.score)) * 31;
        ImageModel imageModel = this.comboBadge;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        }
        return ((hashCode2 + i2) * 31) + com_bytedance_android_livesdk_rank_impl_api_model_Rank_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.comboCount);
    }

    public final String toString() {
        return "Rank(user=" + this.user + ", rank=" + this.rank + ", scoreDescription=" + this.scoreDescription + ", roomId=" + this.roomId + ", score=" + this.score + ", comboBadge=" + this.comboBadge + ", comboCount=" + this.comboCount + ")";
    }

    public final ImageModel getComboBadge() {
        return this.comboBadge;
    }

    public final int getComboCount() {
        return this.comboCount;
    }

    public final int getRank() {
        return this.rank;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getScore() {
        return this.score;
    }

    public final String getScoreDescription() {
        return this.scoreDescription;
    }

    public final User getUser() {
        return this.user;
    }

    public Rank(User user2, int i2, String str, long j2, long j3, ImageModel imageModel, int i3) {
        l.d(user2, "");
        l.d(str, "");
        this.user = user2;
        this.rank = i2;
        this.scoreDescription = str;
        this.roomId = j2;
        this.score = j3;
        this.comboBadge = imageModel;
        this.comboCount = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Rank(User user2, int i2, String str, long j2, long j3, ImageModel imageModel, int i3, int i4, g gVar) {
        this((i4 & 1) != 0 ? new User() : user2, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? Long.MIN_VALUE : j2, (i4 & 16) != 0 ? 0 : j3, (i4 & 32) != 0 ? null : imageModel, (i4 & 64) == 0 ? i3 : 0);
    }
}
