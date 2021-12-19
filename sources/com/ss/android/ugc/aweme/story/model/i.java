package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class i extends BaseResponse implements Serializable {
    @c(a = "cursor")
    private long cursor;
    @c(a = "has_more")
    private boolean hasMore;
    @c(a = "total")
    private int total;
    @c(a = "viewer_list")
    private List<h> viewerList;

    static {
        Covode.recordClassIndex(90276);
    }

    public static int com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.i */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i copy$default(i iVar, int i2, boolean z, long j2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iVar.total;
        }
        if ((i3 & 2) != 0) {
            z = iVar.hasMore;
        }
        if ((i3 & 4) != 0) {
            j2 = iVar.cursor;
        }
        if ((i3 & 8) != 0) {
            list = iVar.viewerList;
        }
        return iVar.copy(i2, z, j2, list);
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

    public final List<h> component4() {
        return this.viewerList;
    }

    public final i copy(int i2, boolean z, long j2, List<h> list) {
        return new i(i2, z, j2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.total == iVar.total && this.hasMore == iVar.hasMore && this.cursor == iVar.cursor && l.a(this.viewerList, iVar.viewerList);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2) * 31) + com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.cursor)) * 31;
        List<h> list = this.viewerList;
        return com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryViewerListModel(total=" + this.total + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", viewerList=" + this.viewerList + ")";
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getTotal() {
        return this.total;
    }

    public final List<h> getViewerList() {
        return this.viewerList;
    }

    public final void setCursor(long j2) {
        this.cursor = j2;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setTotal(int i2) {
        this.total = i2;
    }

    public final void setViewerList(List<h> list) {
        this.viewerList = list;
    }

    public i(int i2, boolean z, long j2, List<h> list) {
        this.total = i2;
        this.hasMore = z;
        this.cursor = j2;
        this.viewerList = list;
    }
}
