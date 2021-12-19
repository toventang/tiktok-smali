package com.ss.android.ugc.aweme.forward.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Extra;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public class ForwardItemList {
    @c(a = "error_code")
    public int error_code;
    @c(a = "extra")
    Extra extra;
    @c(a = "has_more")
    int hasMore;
    @c(a = "forward_list")
    List<Aweme> items;
    @c(a = "log_pb")
    private LogPbBean logPb;
    @c(a = "max_cursor", b = {"max_time"})
    long maxCursor;
    @c(a = "min_cursor", b = {"min_time"})
    long minCursor;
    @c(a = "status_code")
    public int status_code;
    @c(a = "status_msg")
    public String status_msg;

    static {
        Covode.recordClassIndex(61323);
    }

    public int getError_code() {
        return this.error_code;
    }

    public Extra getExtra() {
        return this.extra;
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

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public void setError_code(int i2) {
        this.error_code = i2;
    }

    public void setExtra(Extra extra2) {
        this.extra = extra2;
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

    public void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}
