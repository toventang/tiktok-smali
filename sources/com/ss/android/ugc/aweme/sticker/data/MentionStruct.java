package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class MentionStruct implements Serializable {
    @c(a = "user_avatar_url")
    public UrlModel avatarUrl;
    @c(a = "nickname")
    public String nickname = "";
    @c(a = "sec_uid")
    public String secUid = "";
    @c(a = "user_id")
    public String userId = "";
    @c(a = "user_name")
    public String username = "";

    static {
        Covode.recordClassIndex(88101);
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public MentionStruct() {
    }

    public final void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUsername(String str) {
        this.username = str;
    }

    public MentionStruct(String str, String str2, String str3, String str4, UrlModel urlModel) {
        this.userId = str;
        this.secUid = str2;
        this.username = str3;
        this.nickname = str4;
        this.avatarUrl = urlModel;
    }
}
