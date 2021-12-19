package com.ss.android.ugc.aweme.mix.api.response;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

public final class c extends BaseResponse implements Serializable {
    @com.google.gson.a.c(a = "has_more")
    private boolean hasMore;
    @com.google.gson.a.c(a = "max_cursor")
    private long maxCursor;
    @com.google.gson.a.c(a = "min_cursor")
    private long minCursor;
    @com.google.gson.a.c(a = "aweme_list")
    private List<? extends Aweme> mixVideos;

    static {
        Covode.recordClassIndex(70316);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getMixVideos() {
        return this.mixVideos;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMaxCursor(long j2) {
        this.maxCursor = j2;
    }

    public final void setMinCursor(long j2) {
        this.minCursor = j2;
    }

    public final void setMixVideos(List<? extends Aweme> list) {
        this.mixVideos = list;
    }
}
