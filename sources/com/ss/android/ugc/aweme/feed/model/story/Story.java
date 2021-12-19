package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class Story implements Serializable {
    @c(a = "chat_disabled")
    public boolean chatDisable;
    @c(a = "expired_at")
    public long expiredAt;
    public boolean isFaked;
    public boolean isLoading;
    @c(a = "is_official")
    public boolean isOfficial;
    public boolean isPublishing;
    @c(a = "total_comments")
    public long totalComments;
    @c(a = "viewed")
    public boolean viewed;
    @c(a = "viewer_count")
    public long viewerCount;

    static {
        Covode.recordClassIndex(59525);
    }

    public Story() {
        this(0, false, 0, false, 0, false, false, false, false, 511, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ Story copy$default(Story story, long j2, boolean z, long j3, boolean z2, long j4, boolean z3, boolean z4, boolean z5, boolean z6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = story.expiredAt;
        }
        if ((i2 & 2) != 0) {
            z = story.viewed;
        }
        if ((i2 & 4) != 0) {
            j3 = story.totalComments;
        }
        if ((i2 & 8) != 0) {
            z2 = story.isOfficial;
        }
        if ((i2 & 16) != 0) {
            j4 = story.viewerCount;
        }
        if ((i2 & 32) != 0) {
            z3 = story.chatDisable;
        }
        if ((i2 & 64) != 0) {
            z4 = story.isLoading;
        }
        if ((i2 & 128) != 0) {
            z5 = story.isFaked;
        }
        if ((i2 & 256) != 0) {
            z6 = story.isPublishing;
        }
        return story.copy(j2, z, j3, z2, j4, z3, z4, z5, z6);
    }

    public final long component1() {
        return this.expiredAt;
    }

    public final boolean component2() {
        return this.viewed;
    }

    public final long component3() {
        return this.totalComments;
    }

    public final boolean component4() {
        return this.isOfficial;
    }

    public final long component5() {
        return this.viewerCount;
    }

    public final boolean component6() {
        return this.chatDisable;
    }

    public final boolean component7() {
        return this.isLoading;
    }

    public final boolean component8() {
        return this.isFaked;
    }

    public final boolean component9() {
        return this.isPublishing;
    }

    public final Story copy(long j2, boolean z, long j3, boolean z2, long j4, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new Story(j2, z, j3, z2, j4, z3, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Story)) {
            return false;
        }
        Story story = (Story) obj;
        return this.expiredAt == story.expiredAt && this.viewed == story.viewed && this.totalComments == story.totalComments && this.isOfficial == story.isOfficial && this.viewerCount == story.viewerCount && this.chatDisable == story.chatDisable && this.isLoading == story.isLoading && this.isFaked == story.isFaked && this.isPublishing == story.isPublishing;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.expiredAt) * 31;
        boolean z = this.viewed;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i3) * 31) + com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.totalComments)) * 31;
        boolean z2 = this.isOfficial;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode3 = (((com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + i6) * 31) + com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.viewerCount)) * 31;
        boolean z3 = this.chatDisable;
        if (z3) {
            z3 = true;
        }
        int i9 = z3 ? 1 : 0;
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = (com_ss_android_ugc_aweme_feed_model_story_Story_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode3 + i9) * 31;
        boolean z4 = this.isLoading;
        if (z4) {
            z4 = true;
        }
        int i13 = z4 ? 1 : 0;
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        boolean z5 = this.isFaked;
        if (z5) {
            z5 = true;
        }
        int i17 = z5 ? 1 : 0;
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        if (!this.isPublishing) {
            i2 = 0;
        }
        return i20 + i2;
    }

    public final String toString() {
        return "Story(expiredAt=" + this.expiredAt + ", viewed=" + this.viewed + ", totalComments=" + this.totalComments + ", isOfficial=" + this.isOfficial + ", viewerCount=" + this.viewerCount + ", chatDisable=" + this.chatDisable + ", isLoading=" + this.isLoading + ", isFaked=" + this.isFaked + ", isPublishing=" + this.isPublishing + ")";
    }

    public final boolean getChatDisable() {
        return this.chatDisable;
    }

    public final long getExpiredAt() {
        return this.expiredAt;
    }

    public final long getTotalComments() {
        return this.totalComments;
    }

    public final boolean getViewed() {
        return this.viewed;
    }

    public final long getViewerCount() {
        return this.viewerCount;
    }

    public final boolean isFaked() {
        return this.isFaked;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isOfficial() {
        return this.isOfficial;
    }

    public final boolean isPublishing() {
        return this.isPublishing;
    }

    public final void setFaked(boolean z) {
        this.isFaked = z;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setPublishing(boolean z) {
        this.isPublishing = z;
    }

    public final void setViewed(boolean z) {
        this.viewed = z;
    }

    public Story(long j2, boolean z, long j3, boolean z2, long j4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.expiredAt = j2;
        this.viewed = z;
        this.totalComments = j3;
        this.isOfficial = z2;
        this.viewerCount = j4;
        this.chatDisable = z3;
        this.isLoading = z4;
        this.isFaked = z5;
        this.isPublishing = z6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Story(long j2, boolean z, long j3, boolean z2, long j4, boolean z3, boolean z4, boolean z5, boolean z6, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : j2, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : j3, (i2 & 8) != 0 ? false : z2, (i2 & 16) == 0 ? j4 : 0, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? false : z4, (i2 & 128) != 0 ? false : z5, (i2 & 256) == 0 ? z6 : false);
    }
}
