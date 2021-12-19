package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class f extends BaseResponse implements Serializable {
    @c(a = "cursor")
    private long cursor;
    @c(a = "has_more")
    private boolean hasMore;
    @c(a = "liked_list")
    private List<User> likedList;
    @c(a = "total")
    private int total;

    static {
        Covode.recordClassIndex(90273);
    }

    public static int com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.f */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f copy$default(f fVar, int i2, boolean z, long j2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = fVar.total;
        }
        if ((i3 & 2) != 0) {
            z = fVar.hasMore;
        }
        if ((i3 & 4) != 0) {
            j2 = fVar.cursor;
        }
        if ((i3 & 8) != 0) {
            list = fVar.likedList;
        }
        return fVar.copy(i2, z, j2, list);
    }

    public final int component1() {
        return this.total;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final long component3() {
        return this.cursor;
    }

    public final List<User> component4() {
        return this.likedList;
    }

    public final f copy(int i2, boolean z, long j2, List<User> list) {
        return new f(i2, z, j2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.total == fVar.total && this.hasMore == fVar.hasMore && this.cursor == fVar.cursor && l.a(this.likedList, fVar.likedList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2) * 31) + com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor)) * 31;
        List<User> list = this.likedList;
        return com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryLikedListModel(total=" + this.total + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", likedList=" + this.likedList + ")";
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<User> getLikedList() {
        return this.likedList;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setCursor(long j2) {
        this.cursor = j2;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLikedList(List<User> list) {
        this.likedList = list;
    }

    public final void setTotal(int i2) {
        this.total = i2;
    }

    public f(int i2, boolean z, long j2, List<User> list) {
        this.total = i2;
        this.hasMore = z;
        this.cursor = j2;
        this.likedList = list;
    }
}
