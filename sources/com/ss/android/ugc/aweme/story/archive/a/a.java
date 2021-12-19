package com.ss.android.ugc.aweme.story.archive.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class a extends BaseResponse implements Serializable {
    @c(a = "has_more")
    private final boolean hasMore;
    @c(a = "items")
    private final List<Aweme> items;
    @c(a = "max_cursor")
    private final long maxCursor;
    @c(a = "min_cursor")
    private final long minCursor;

    static {
        Covode.recordClassIndex(89324);
    }

    public static int com_ss_android_ugc_aweme_story_archive_model_StoryArchiveList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.archive.a.a */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a copy$default(a aVar, List list, long j2, long j3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aVar.items;
        }
        if ((i2 & 2) != 0) {
            j2 = aVar.minCursor;
        }
        if ((i2 & 4) != 0) {
            j3 = aVar.maxCursor;
        }
        if ((i2 & 8) != 0) {
            z = aVar.hasMore;
        }
        return aVar.copy(list, j2, j3, z);
    }

    public final List<Aweme> component1() {
        return this.items;
    }

    public final long component2() {
        return this.minCursor;
    }

    public final long component3() {
        return this.maxCursor;
    }

    public final boolean component4() {
        return this.hasMore;
    }

    public final a copy(List<Aweme> list, long j2, long j3, boolean z) {
        return new a(list, j2, j3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.items, aVar.items) && this.minCursor == aVar.minCursor && this.maxCursor == aVar.maxCursor && this.hasMore == aVar.hasMore;
    }

    public final int hashCode() {
        List<Aweme> list = this.items;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_story_archive_model_StoryArchiveList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minCursor)) * 31) + com_ss_android_ugc_aweme_story_archive_model_StoryArchiveList_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxCursor)) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryArchiveList(items=" + this.items + ", minCursor=" + this.minCursor + ", maxCursor=" + this.maxCursor + ", hasMore=" + this.hasMore + ")";
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public a(List<Aweme> list, long j2, long j3, boolean z) {
        this.items = list;
        this.minCursor = j2;
        this.maxCursor = j3;
        this.hasMore = z;
    }
}
