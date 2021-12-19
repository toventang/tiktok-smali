package com.ss.android.ugc.aweme.question.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

public final class b extends BaseResponse implements Serializable {
    @c(a = "cursor")
    private Integer cursor = 0;
    @c(a = "has_more")
    private Integer hasMore = 0;
    @c(a = "videos")
    private List<? extends Aweme> videos;

    static {
        Covode.recordClassIndex(77906);
    }

    public final Integer getCursor() {
        return this.cursor;
    }

    public final Integer getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getVideos() {
        return this.videos;
    }

    public final boolean isHasMore() {
        Integer num = this.hasMore;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setHasMore(Integer num) {
        this.hasMore = num;
    }

    public final void setVideos(List<? extends Aweme> list) {
        this.videos = list;
    }

    public final void setHasMore(boolean z) {
        int i2;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.hasMore = Integer.valueOf(i2);
    }
}
