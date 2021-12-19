package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class AwemeStatisticsBackup implements Serializable {
    @c(a = "aweme_id")
    private String aid = "";
    @c(a = "comment_count")
    private Long commentCount = 0L;
    @c(a = "digg_count")
    private Long diggCount = 0L;
    @c(a = "download_count")
    private Long downloadCount = 0L;
    @c(a = "forward_count")
    private Long forwardCount = 0L;
    @c(a = "play_count")
    private Long playCount = 0L;
    @c(a = "share_count")
    private Long shareCount = 0L;

    static {
        Covode.recordClassIndex(59333);
    }

    public final String getAid() {
        return this.aid;
    }

    public final Long getCommentCount() {
        return this.commentCount;
    }

    public final Long getDiggCount() {
        return this.diggCount;
    }

    public final Long getDownloadCount() {
        return this.downloadCount;
    }

    public final Long getForwardCount() {
        return this.forwardCount;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final Long getShareCount() {
        return this.shareCount;
    }

    public final String toString() {
        return "AwemeStatistics{aid='" + this.aid + "', comemntCount=" + this.commentCount + ", diggCount=" + this.diggCount + ", playCount=" + this.playCount + ", shareCount=" + this.shareCount + ", forwardCount=" + this.forwardCount + "}";
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setCommentCount(Long l2) {
        this.commentCount = l2;
    }

    public final void setDiggCount(Long l2) {
        this.diggCount = l2;
    }

    public final void setDownloadCount$common_feed_release(Long l2) {
        this.downloadCount = l2;
    }

    public final void setForwardCount(Long l2) {
        this.forwardCount = l2;
    }

    public final void setPlayCount(Long l2) {
        this.playCount = l2;
    }

    public final void setShareCount(Long l2) {
        this.shareCount = l2;
    }
}
