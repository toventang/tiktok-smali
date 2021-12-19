package com.ss.android.ugc.aweme.kids.liked.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class KidFeedItemList {
    @c(a = "has_more")
    private int hasMore;
    @c(a = "aweme_list")
    private List<? extends Aweme> items;
    @c(a = "log_pb")
    private LogPbBean logPb;
    @c(a = "max_cursor", b = {"max_time"})
    private long maxCursor;
    @c(a = "min_cursor", b = {"min_time"})
    private long minCursor;
    @c(a = "rid")
    private String requestId;
    @c(a = "status_code")
    private int status_code;

    static {
        Covode.recordClassIndex(68221);
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getItems() {
        return this.items;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setHasMore(int i2) {
        this.hasMore = i2;
    }

    public final void setItems(List<? extends Aweme> list) {
        this.items = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMaxCursor(long j2) {
        this.maxCursor = j2;
    }

    public final void setMinCursor(long j2) {
        this.minCursor = j2;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setStatus_code(int i2) {
        this.status_code = i2;
    }
}
