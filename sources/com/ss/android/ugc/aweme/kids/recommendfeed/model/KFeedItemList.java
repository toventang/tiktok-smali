package com.ss.android.ugc.aweme.kids.recommendfeed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class KFeedItemList implements d {
    @c(a = "block_code")
    public int blockCode;
    @c(a = "has_more")
    public int hasMore;
    @c(a = "aweme_list")
    public List<Aweme> items;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "max_cursor", b = {"max_time"})
    public long maxCursor;
    @c(a = "min_cursor", b = {"min_time"})
    public long minCursor;
    @c(a = "refresh_clear")
    public int refreshClear;
    @c(a = "rid")
    public String requestId;
    @c(a = "status_code")
    public int statusCode;
    @c(a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(68286);
    }

    public int getBlockCode() {
        return this.blockCode;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Aweme> getItems() {
        return this.items;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public KFeedItemList clone() {
        KFeedItemList kFeedItemList = new KFeedItemList();
        kFeedItemList.minCursor = this.minCursor;
        kFeedItemList.maxCursor = this.maxCursor;
        kFeedItemList.hasMore = this.hasMore;
        kFeedItemList.items = this.items;
        kFeedItemList.requestId = this.requestId;
        kFeedItemList.refreshClear = this.refreshClear;
        kFeedItemList.statusCode = this.statusCode;
        kFeedItemList.statusMsg = this.statusMsg;
        kFeedItemList.blockCode = this.blockCode;
        kFeedItemList.logPb = this.logPb;
        return kFeedItemList;
    }

    public void setBlockCode(int i2) {
        this.blockCode = i2;
    }

    public void setHasMore(int i2) {
        this.hasMore = i2;
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j2) {
        this.maxCursor = j2;
    }

    public void setMinCursor(long j2) {
        this.minCursor = j2;
    }

    public void setRefreshClear(int i2) {
        this.refreshClear = i2;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
