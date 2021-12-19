package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.bq.a.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;

public class RelationFetchResponse extends BaseResponse {
    @c(a = "block_results")
    List<a> blockResults;
    @c(a = "followings")
    List<IMUser> followings;
    @c(a = "has_more")
    int hasMore;
    @c(a = "hotsoon_hide_text")
    String hotSoonNotice;
    @c(a = "hotsoon_hide_en_text")
    String hotSoonNoticeEn;
    @c(a = "max_time")
    long maxTime;
    @c(a = "min_time")
    long minTime;
    @c(a = "next_req_count")
    int nextReqCount;

    static {
        Covode.recordClassIndex(66131);
    }

    public List<a> getBlockResults() {
        return this.blockResults;
    }

    public List<IMUser> getFollowings() {
        return this.followings;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public String getHotSoonNotice() {
        return this.hotSoonNotice;
    }

    public String getHotSoonNoticeEn() {
        return this.hotSoonNoticeEn;
    }

    public long getMaxTime() {
        return this.maxTime;
    }

    public long getMinTime() {
        return this.minTime;
    }

    public int getNextReqCount() {
        return this.nextReqCount;
    }

    public void setBlockResults(List<a> list) {
        this.blockResults = list;
    }

    public void setFollowings(List<IMUser> list) {
        this.followings = list;
    }

    public void setHasMore(int i2) {
        this.hasMore = i2;
    }

    public void setHotSoonNotice(String str) {
        this.hotSoonNotice = str;
    }

    public void setHotSoonNoticeEn(String str) {
        this.hotSoonNoticeEn = str;
    }

    public void setMaxTime(long j2) {
        this.maxTime = j2;
    }

    public void setMinTime(long j2) {
        this.minTime = j2;
    }

    public void setNextReqCount(int i2) {
        this.nextReqCount = i2;
    }
}
