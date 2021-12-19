package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class RelationLabelUser implements Serializable {
    @c(a = "avatar")
    public UrlModel avatarLarger;
    @c(a = "avatar_thumb")
    public UrlModel avatarThumb;
    @c(a = "follow_status")
    public int followStatus;
    @c(a = "nickname")
    public String nickName = "";
    @c(a = "remark_name")
    public String remarkName = "";
    @c(a = "sec_uid")
    public String secUid = "";
    @c(a = "uid")
    public long uid;

    static {
        Covode.recordClassIndex(59450);
    }

    public final UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setFollowStatus(int i2) {
        this.followStatus = i2;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setRemarkName(String str) {
        this.remarkName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(long j2) {
        this.uid = j2;
    }
}
