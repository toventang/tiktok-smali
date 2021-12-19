package com.ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class MutualUser implements Serializable {
    @c(a = "avatar_medium")
    public UrlModel avatarMedium;
    @c(a = "nickname")
    public String nickname;
    @c(a = "sec_uid")
    public String secUid;

    static {
        Covode.recordClassIndex(61592);
    }

    public MutualUser() {
    }

    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final int hashCode() {
        return Objects.hash(this.secUid, this.nickname);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutualUser)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Objects.equals(this.secUid, this.nickname);
    }

    public MutualUser(String str, String str2, UrlModel urlModel) {
        l.d(str, "");
        l.d(str2, "");
        this.secUid = str;
        this.nickname = str2;
        this.avatarMedium = urlModel;
    }
}
