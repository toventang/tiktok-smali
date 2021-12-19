package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class PostGuideTasks {
    public final int followCountFromRecommend;
    public final boolean isFollowTaskDone;
    public final boolean isProfileTaskDone;
    public final boolean isShootTaskDone;

    static {
        Covode.recordClassIndex(75246);
    }

    public static int com_ss_android_ugc_aweme_profile_model_PostGuideTasks_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ PostGuideTasks copy$default(PostGuideTasks postGuideTasks, boolean z, boolean z2, boolean z3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = postGuideTasks.isFollowTaskDone;
        }
        if ((i3 & 2) != 0) {
            z2 = postGuideTasks.isShootTaskDone;
        }
        if ((i3 & 4) != 0) {
            z3 = postGuideTasks.isProfileTaskDone;
        }
        if ((i3 & 8) != 0) {
            i2 = postGuideTasks.followCountFromRecommend;
        }
        return postGuideTasks.copy(z, z2, z3, i2);
    }

    public final PostGuideTasks copy(boolean z, boolean z2, boolean z3, int i2) {
        return new PostGuideTasks(z, z2, z3, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostGuideTasks)) {
            return false;
        }
        PostGuideTasks postGuideTasks = (PostGuideTasks) obj;
        return this.isFollowTaskDone == postGuideTasks.isFollowTaskDone && this.isShootTaskDone == postGuideTasks.isShootTaskDone && this.isProfileTaskDone == postGuideTasks.isProfileTaskDone && this.followCountFromRecommend == postGuideTasks.followCountFromRecommend;
    }

    public final int hashCode() {
        boolean z = this.isFollowTaskDone;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.isShootTaskDone;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.isProfileTaskDone) {
            i2 = 0;
        }
        return ((i10 + i2) * 31) + com_ss_android_ugc_aweme_profile_model_PostGuideTasks_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.followCountFromRecommend);
    }

    public final String toString() {
        return "PostGuideTasks(isFollowTaskDone=" + this.isFollowTaskDone + ", isShootTaskDone=" + this.isShootTaskDone + ", isProfileTaskDone=" + this.isProfileTaskDone + ", followCountFromRecommend=" + this.followCountFromRecommend + ")";
    }

    public final boolean allAccomplish() {
        if (!this.isFollowTaskDone || !this.isShootTaskDone || !this.isProfileTaskDone) {
            return false;
        }
        return true;
    }

    public final int taskCountDone() {
        return (this.isFollowTaskDone ? 1 : 0) + (this.isShootTaskDone ? 1 : 0) + (this.isProfileTaskDone ? 1 : 0);
    }

    public PostGuideTasks(boolean z, boolean z2, boolean z3, int i2) {
        this.isFollowTaskDone = z;
        this.isShootTaskDone = z2;
        this.isProfileTaskDone = z3;
        this.followCountFromRecommend = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostGuideTasks(boolean z, boolean z2, boolean z3, int i2, int i3, g gVar) {
        this(z, z2, z3, (i3 & 8) != 0 ? 0 : i2);
    }
}
