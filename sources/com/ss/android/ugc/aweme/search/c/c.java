package com.ss.android.ugc.aweme.search.c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;

public final class c implements Serializable {
    @com.google.gson.a.c(a = "caption_anchor")
    public a captionAnchor;
    @com.google.gson.a.c(a = "caption_info")
    public b captionInfo;
    @com.google.gson.a.c(a = "match_info")
    public List<d> matchInfoList;
    @com.google.gson.a.c(a = "query_limit")
    public int queryLimit;
    @com.google.gson.a.c(a = "total_limit")
    public int totalLimit;

    static {
        Covode.recordClassIndex(78815);
    }

    public final a getCaptionAnchor() {
        return this.captionAnchor;
    }

    public final b getCaptionInfo() {
        return this.captionInfo;
    }

    public final List<d> getMatchInfoList() {
        return this.matchInfoList;
    }

    public final int getQueryLimit() {
        return this.queryLimit;
    }

    public final int getTotalLimit() {
        return this.totalLimit;
    }

    public final void setCaptionAnchor(a aVar) {
        this.captionAnchor = aVar;
    }

    public final void setCaptionInfo(b bVar) {
        this.captionInfo = bVar;
    }

    public final void setMatchInfoList(List<d> list) {
        this.matchInfoList = list;
    }

    public final void setQueryLimit(int i2) {
        this.queryLimit = i2;
    }

    public final void setTotalLimit(int i2) {
        this.totalLimit = i2;
    }
}
