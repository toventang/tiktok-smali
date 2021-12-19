package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.utils.g;
import java.io.Serializable;
import java.util.Arrays;

public class AwemeStatistics implements Serializable, Cloneable {
    @c(a = "aid")
    public String aid;
    @c(a = "comment_count")
    public long commentCount;
    @c(a = "digg_count")
    public long diggCount;
    @c(a = "download_count")
    public long downloadCount;
    @c(a = "forward_count")
    public long forwardCount;
    @c(a = "lose_comment_count")
    public int loseCommentCount;
    @c(a = "lose_count")
    public int loseCount;
    @c(a = "play_count")
    public long playCount;
    @c(a = "share_count")
    public long shareCount;

    static {
        Covode.recordClassIndex(59332);
    }

    public String getAid() {
        return this.aid;
    }

    public long getCommentCount() {
        return this.commentCount;
    }

    public long getDiggCount() {
        return this.diggCount;
    }

    public long getDownloadCount() {
        return this.downloadCount;
    }

    public long getForwardCount() {
        return this.forwardCount;
    }

    public int getLoseCommentCount() {
        return this.loseCommentCount;
    }

    public int getLoseCount() {
        return this.loseCount;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public long getShareCount() {
        return this.shareCount;
    }

    @Override // java.lang.Object
    public AwemeStatistics clone() {
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        awemeStatistics.aid = this.aid;
        awemeStatistics.commentCount = this.commentCount;
        awemeStatistics.diggCount = this.diggCount;
        awemeStatistics.playCount = this.playCount;
        awemeStatistics.shareCount = this.shareCount;
        awemeStatistics.forwardCount = this.forwardCount;
        awemeStatistics.downloadCount = this.downloadCount;
        return awemeStatistics;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.aid, Long.valueOf(this.commentCount), Long.valueOf(this.diggCount), Long.valueOf(this.playCount), Long.valueOf(this.shareCount), Long.valueOf(this.forwardCount), Long.valueOf(this.downloadCount)});
    }

    public String toString() {
        return "AwemeStatistics{aid='" + this.aid + '\'' + ", commentCount=" + this.commentCount + ", diggCount=" + this.diggCount + ", playCount=" + this.playCount + ", shareCount=" + this.shareCount + ", forwardCount=" + this.forwardCount + ", downloadCount=" + this.downloadCount + '}';
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCommentCount(long j2) {
        this.commentCount = j2;
    }

    public void setDiggCount(long j2) {
        this.diggCount = j2;
    }

    public void setDownloadCount(long j2) {
        this.downloadCount = j2;
    }

    public void setForwardCount(long j2) {
        this.forwardCount = j2;
    }

    public void setLoseCommentCount(int i2) {
        this.loseCommentCount = i2;
    }

    public void setLoseCount(int i2) {
        this.loseCount = i2;
    }

    public void setPlayCount(long j2) {
        this.playCount = j2;
    }

    public void setShareCount(long j2) {
        this.shareCount = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatistics)) {
            return false;
        }
        AwemeStatistics awemeStatistics = (AwemeStatistics) obj;
        if (this.commentCount == awemeStatistics.commentCount && this.diggCount == awemeStatistics.diggCount && this.playCount == awemeStatistics.playCount && this.shareCount == awemeStatistics.shareCount && this.forwardCount == awemeStatistics.forwardCount && this.downloadCount == awemeStatistics.downloadCount && g.a(this.aid, awemeStatistics.aid)) {
            return true;
        }
        return false;
    }
}
