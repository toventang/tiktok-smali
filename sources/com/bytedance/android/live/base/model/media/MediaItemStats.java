package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MediaItemStats {
    @c(a = "comment_count")
    private int commentCount;
    @c(a = "digg_count")
    private int diggCount;
    @c(a = "id")
    private long id;
    @c(a = "play_count")
    private int playCount;
    @c(a = "share_count")
    private int shareCount;

    static {
        Covode.recordClassIndex(3610);
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getId() {
        return this.id;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    public void setCommentCount(int i2) {
        this.commentCount = i2;
    }

    public void setDiggCount(int i2) {
        this.diggCount = i2;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setPlayCount(int i2) {
        this.playCount = i2;
    }

    public void setShareCount(int i2) {
        this.shareCount = i2;
    }
}
