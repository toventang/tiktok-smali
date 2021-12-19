package com.ss.android.ugc.aweme.feed.model.story;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.g;
import h.f.b.l;
import h.k.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class UserStory extends BaseResponse implements Serializable {
    public long addToCacheTime;
    @c(a = "all_viewed")
    public boolean allViewed;
    public UserStoryCurrentInfo currentInfo;
    @c(a = "current_position")
    public long currentPosition;
    public boolean fakeAwemeShell;
    public boolean fakeSelfStoryCollection;
    @c(a = "has_more_after")
    public boolean hasMoreAfter;
    @c(a = "has_more_before")
    public boolean hasMoreBefore;
    @c(a = "last_story_created_at")
    public long lastStoryCreatedAt;
    @c(a = "max_cursor")
    public long maxCursor;
    @c(a = "min_cursor")
    public long minCursor;
    public long originTotalCount;
    public boolean shouldShowGuide;
    @c(a = "stories")
    public List<Aweme> stories;
    @c(a = "total_count")
    public long totalCount;

    static {
        Covode.recordClassIndex(59527);
    }

    public UserStory() {
    }

    public static int com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ UserStory copy$default(UserStory userStory, List list, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, long j6, long j7, UserStoryCurrentInfo userStoryCurrentInfo, boolean z4, boolean z5, boolean z6, int i2, Object obj) {
        List<Aweme> list2 = list;
        boolean z7 = z;
        long j8 = j4;
        long j9 = j3;
        long j10 = j2;
        long j11 = j6;
        boolean z8 = z2;
        boolean z9 = z3;
        long j12 = j5;
        boolean z10 = z6;
        long j13 = j7;
        UserStoryCurrentInfo userStoryCurrentInfo2 = userStoryCurrentInfo;
        boolean z11 = z5;
        boolean z12 = z4;
        if ((i2 & 1) != 0) {
            list2 = userStory.stories;
        }
        if ((i2 & 2) != 0) {
            j10 = userStory.totalCount;
        }
        if ((i2 & 4) != 0) {
            j9 = userStory.currentPosition;
        }
        if ((i2 & 8) != 0) {
            z7 = userStory.allViewed;
        }
        if ((i2 & 16) != 0) {
            j8 = userStory.minCursor;
        }
        if ((i2 & 32) != 0) {
            j12 = userStory.maxCursor;
        }
        if ((i2 & 64) != 0) {
            z8 = userStory.hasMoreAfter;
        }
        if ((i2 & 128) != 0) {
            z9 = userStory.hasMoreBefore;
        }
        if ((i2 & 256) != 0) {
            j11 = userStory.lastStoryCreatedAt;
        }
        if ((i2 & 512) != 0) {
            j13 = userStory.originTotalCount;
        }
        if ((i2 & 1024) != 0) {
            userStoryCurrentInfo2 = userStory.currentInfo;
        }
        if ((i2 & 2048) != 0) {
            z12 = userStory.shouldShowGuide;
        }
        if ((i2 & 4096) != 0) {
            z11 = userStory.fakeSelfStoryCollection;
        }
        if ((i2 & 8192) != 0) {
            z10 = userStory.fakeAwemeShell;
        }
        return userStory.copy(list2, j10, j9, z7, j8, j12, z8, z9, j11, j13, userStoryCurrentInfo2, z12, z11, z10);
    }

    public final List<Aweme> component1() {
        return this.stories;
    }

    public final long component10() {
        return this.originTotalCount;
    }

    public final UserStoryCurrentInfo component11() {
        return this.currentInfo;
    }

    public final boolean component12() {
        return this.shouldShowGuide;
    }

    public final boolean component13() {
        return this.fakeSelfStoryCollection;
    }

    public final boolean component14() {
        return this.fakeAwemeShell;
    }

    public final long component2() {
        return this.totalCount;
    }

    public final long component3() {
        return this.currentPosition;
    }

    public final boolean component4() {
        return this.allViewed;
    }

    public final long component5() {
        return this.minCursor;
    }

    public final long component6() {
        return this.maxCursor;
    }

    public final boolean component7() {
        return this.hasMoreAfter;
    }

    public final boolean component8() {
        return this.hasMoreBefore;
    }

    public final long component9() {
        return this.lastStoryCreatedAt;
    }

    public final UserStory copy(List<Aweme> list, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, long j6, long j7, UserStoryCurrentInfo userStoryCurrentInfo, boolean z4, boolean z5, boolean z6) {
        l.d(list, "");
        return new UserStory(list, j2, j3, z, j4, j5, z2, z3, j6, j7, userStoryCurrentInfo, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStory)) {
            return false;
        }
        UserStory userStory = (UserStory) obj;
        return l.a(this.stories, userStory.stories) && this.totalCount == userStory.totalCount && this.currentPosition == userStory.currentPosition && this.allViewed == userStory.allViewed && this.minCursor == userStory.minCursor && this.maxCursor == userStory.maxCursor && this.hasMoreAfter == userStory.hasMoreAfter && this.hasMoreBefore == userStory.hasMoreBefore && this.lastStoryCreatedAt == userStory.lastStoryCreatedAt && this.originTotalCount == userStory.originTotalCount && l.a(this.currentInfo, userStory.currentInfo) && this.shouldShowGuide == userStory.shouldShowGuide && this.fakeSelfStoryCollection == userStory.fakeSelfStoryCollection && this.fakeAwemeShell == userStory.fakeAwemeShell;
    }

    public final int hashCode() {
        List<Aweme> list = this.stories;
        int i2 = 0;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.totalCount)) * 31) + com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentPosition)) * 31;
        boolean z = this.allViewed;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((((hashCode + i4) * 31) + com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minCursor)) * 31) + com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxCursor)) * 31;
        boolean z2 = this.hasMoreAfter;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i7) * 31;
        boolean z3 = this.hasMoreBefore;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((((i10 + i11) * 31) + com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.lastStoryCreatedAt)) * 31) + com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.originTotalCount)) * 31;
        UserStoryCurrentInfo userStoryCurrentInfo = this.currentInfo;
        if (userStoryCurrentInfo != null) {
            i2 = userStoryCurrentInfo.hashCode();
        }
        int i14 = (com_ss_android_ugc_aweme_feed_model_story_UserStory_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + i2) * 31;
        boolean z4 = this.shouldShowGuide;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z5 = this.fakeSelfStoryCollection;
        if (z5) {
            z5 = true;
        }
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        if (!this.fakeAwemeShell) {
            i3 = 0;
        }
        return i22 + i3;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UserStory(stories=" + this.stories + ", totalCount=" + this.totalCount + ", currentPosition=" + this.currentPosition + ", allViewed=" + this.allViewed + ", minCursor=" + this.minCursor + ", maxCursor=" + this.maxCursor + ", hasMoreAfter=" + this.hasMoreAfter + ", hasMoreBefore=" + this.hasMoreBefore + ", lastStoryCreatedAt=" + this.lastStoryCreatedAt + ", originTotalCount=" + this.originTotalCount + ", currentInfo=" + this.currentInfo + ", shouldShowGuide=" + this.shouldShowGuide + ", fakeSelfStoryCollection=" + this.fakeSelfStoryCollection + ", fakeAwemeShell=" + this.fakeAwemeShell + ")";
    }

    public final long getAddToCacheTime() {
        return this.addToCacheTime;
    }

    public final boolean getAllViewed() {
        return this.allViewed;
    }

    public final UserStoryCurrentInfo getCurrentInfo() {
        return this.currentInfo;
    }

    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    public final boolean getFakeAwemeShell() {
        return this.fakeAwemeShell;
    }

    public final boolean getFakeSelfStoryCollection() {
        return this.fakeSelfStoryCollection;
    }

    public final boolean getHasMoreAfter() {
        return this.hasMoreAfter;
    }

    public final boolean getHasMoreBefore() {
        return this.hasMoreBefore;
    }

    public final long getLastStoryCreatedAt() {
        return this.lastStoryCreatedAt;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final long getOriginTotalCount() {
        return this.originTotalCount;
    }

    public final boolean getShouldShowGuide() {
        return this.shouldShowGuide;
    }

    public final List<Aweme> getStories() {
        return this.stories;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public final void setAllViewed(boolean z) {
        this.allViewed = z;
    }

    public final void setCurrentInfo(UserStoryCurrentInfo userStoryCurrentInfo) {
        this.currentInfo = userStoryCurrentInfo;
    }

    public final void setCurrentPosition(long j2) {
        this.currentPosition = j2;
    }

    public final void setHasMoreAfter(boolean z) {
        this.hasMoreAfter = z;
    }

    public final void setHasMoreBefore(boolean z) {
        this.hasMoreBefore = z;
    }

    public final void setLastStoryCreatedAt(long j2) {
        this.lastStoryCreatedAt = j2;
    }

    public final void setMaxCursor(long j2) {
        this.maxCursor = j2;
    }

    public final void setMinCursor(long j2) {
        this.minCursor = j2;
    }

    public final void setOriginTotalCount(long j2) {
        this.originTotalCount = j2;
    }

    public final void setShouldShowGuide(boolean z) {
        this.shouldShowGuide = z;
    }

    public final void setTotalCount(long j2) {
        this.totalCount = j2;
    }

    public final void setAddToCacheTime(long j2) {
        if (this.addToCacheTime <= 0) {
            this.addToCacheTime = j2;
        }
    }

    public final boolean hasDiffForLoad(UserStory userStory) {
        if (userStory == null) {
            return false;
        }
        if (this.stories.size() == userStory.stories.size() && this.currentPosition == userStory.currentPosition && this.minCursor == userStory.minCursor && this.maxCursor == userStory.maxCursor && this.originTotalCount == userStory.originTotalCount && this.hasMoreAfter == userStory.hasMoreAfter && this.hasMoreBefore == userStory.hasMoreBefore && this.lastStoryCreatedAt == userStory.lastStoryCreatedAt) {
            return false;
        }
        return true;
    }

    public final List<k<UserStory, ?>> diffProperties(UserStory userStory) {
        List<Aweme> list;
        ArrayList arrayList = new ArrayList();
        List<Aweme> list2 = this.stories;
        if (userStory != null) {
            list = userStory.stories;
        } else {
            list = null;
        }
        if (!l.a(list2, list)) {
            arrayList.add(UserStory$diffProperties$1.INSTANCE);
        }
        long j2 = this.currentPosition;
        if (userStory == null || j2 != userStory.currentPosition) {
            arrayList.add(UserStory$diffProperties$2.INSTANCE);
        }
        boolean z = this.allViewed;
        if (userStory == null || z != userStory.allViewed) {
            arrayList.add(UserStory$diffProperties$3.INSTANCE);
        }
        long j3 = this.minCursor;
        if (userStory == null || j3 != userStory.minCursor) {
            arrayList.add(UserStory$diffProperties$4.INSTANCE);
        }
        long j4 = this.maxCursor;
        if (userStory == null || j4 != userStory.maxCursor) {
            arrayList.add(UserStory$diffProperties$5.INSTANCE);
        }
        long j5 = this.totalCount;
        if (userStory == null || j5 != userStory.totalCount) {
            arrayList.add(UserStory$diffProperties$6.INSTANCE);
        }
        long j6 = this.originTotalCount;
        if (userStory == null || j6 != userStory.originTotalCount) {
            arrayList.add(UserStory$diffProperties$7.INSTANCE);
        }
        boolean z2 = this.hasMoreAfter;
        if (userStory == null || z2 != userStory.hasMoreAfter) {
            arrayList.add(UserStory$diffProperties$8.INSTANCE);
        }
        boolean z3 = this.hasMoreBefore;
        if (userStory == null || z3 != userStory.hasMoreBefore) {
            arrayList.add(UserStory$diffProperties$9.INSTANCE);
        }
        long j7 = this.lastStoryCreatedAt;
        if (userStory == null || j7 != userStory.lastStoryCreatedAt) {
            arrayList.add(UserStory$diffProperties$10.INSTANCE);
        }
        boolean z4 = this.fakeSelfStoryCollection;
        if (userStory == null || z4 != userStory.fakeSelfStoryCollection) {
            arrayList.add(UserStory$diffProperties$11.INSTANCE);
        }
        return arrayList;
    }

    public UserStory(List<Aweme> list, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, long j6, long j7, UserStoryCurrentInfo userStoryCurrentInfo, boolean z4, boolean z5, boolean z6) {
        l.d(list, "");
        this.stories = list;
        this.totalCount = j2;
        this.currentPosition = j3;
        this.allViewed = z;
        this.minCursor = j4;
        this.maxCursor = j5;
        this.hasMoreAfter = z2;
        this.hasMoreBefore = z3;
        this.lastStoryCreatedAt = j6;
        this.originTotalCount = j7;
        this.currentInfo = userStoryCurrentInfo;
        this.shouldShowGuide = z4;
        this.fakeSelfStoryCollection = z5;
        this.fakeAwemeShell = z6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserStory(List list, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, long j6, long j7, UserStoryCurrentInfo userStoryCurrentInfo, boolean z4, boolean z5, boolean z6, int i2, g gVar) {
        this(list, j2, (i2 & 4) != 0 ? 0 : j3, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : j4, (i2 & 32) != 0 ? 0 : j5, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? 0 : j6, (i2 & 512) != 0 ? 0 : j7, (i2 & 1024) != 0 ? new UserStoryCurrentInfo(null, null, 3, null) : userStoryCurrentInfo, (i2 & 2048) != 0 ? false : z4, (i2 & 4096) != 0 ? false : z5, (i2 & 8192) != 0 ? false : z6);
    }
}
