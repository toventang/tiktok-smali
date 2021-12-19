package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class NoticeResponse extends BaseResponse {
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "notice_list")
    public List<BaseNotice> items;
    @c(a = "last_read_time")
    public long lastReadTime;
    @c(a = "log_pb")
    public LogPbBean logPbBean;
    @c(a = "max_time")
    public long maxTime;
    @c(a = "min_time")
    public long minTime;
    @c(a = "total")
    public int total;
    @c(a = "vcd_merge_total")
    public int vcdMergeTotal;
    @c(a = "vcd_toast_text")
    public String vcdToastText;

    static {
        Covode.recordClassIndex(72538);
    }

    public List<BaseNotice> getItems() {
        return this.items;
    }

    public long getLastReadTime() {
        return this.lastReadTime;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public int getTotal() {
        return this.total;
    }

    public int getVcdMergeTotal() {
        return this.vcdMergeTotal;
    }

    public String getVcdToastText() {
        return this.vcdToastText;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setItems(List<BaseNotice> list) {
        this.items = list;
    }

    public void setLastReadTime(long j2) {
        this.lastReadTime = j2;
    }

    public void setMaxTime(long j2) {
        this.maxTime = j2;
    }

    public void setMinTime(long j2) {
        this.minTime = j2;
    }

    public void setStatusCode(int i2) {
        this.status_code = i2;
    }

    public void setTotal(int i2) {
        this.total = i2;
    }

    public void setVcdMergeTotal(int i2) {
        this.vcdMergeTotal = i2;
    }

    public void setVcdToastText(String str) {
        this.vcdToastText = str;
    }
}
