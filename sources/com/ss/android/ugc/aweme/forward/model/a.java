package com.ss.android.ugc.aweme.forward.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    @c(a = "aweme")
    Aweme aweme;
    @c(a = "time")
    long blockFavoriteTime;
    @c(a = "comment_list")
    List<Comment> comments;
    @c(a = "favorite_ids")
    List<String> favoriteIds;
    @c(a = "favorite_list")
    List<Aweme> favorites;
    @c(a = StringSet.type)
    int itemType;
    @c(a = "count")
    int likeCount;
    String requestId;

    static {
        Covode.recordClassIndex(61325);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public final List<Comment> getComments() {
        return this.comments;
    }

    public final List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public final List<Aweme> getFavorites() {
        return this.favorites;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setBlockFavoriteTime(long j2) {
        this.blockFavoriteTime = j2;
    }

    public final void setComments(List<Comment> list) {
        this.comments = list;
    }

    public final void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public final void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    public final void setItemType(int i2) {
        this.itemType = i2;
    }

    public final void setLikeCount(int i2) {
        this.likeCount = i2;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            aweme2.setRequestId(str);
        }
    }
}
