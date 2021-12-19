package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class MusicOwnerInfo implements Serializable {
    @c(a = "avatar")
    public UrlModel avatar;
    @c(a = "enter_type")
    public int enterType;
    @c(a = "follow_status")
    public Integer followStatus;
    @c(a = "handle")
    public String handle;
    @c(a = "nick_name")
    public String nickName;
    @c(a = "sec_uid")
    public String secUid;
    @c(a = "uid")
    public String uid;
    @c(a = "is_verified")
    public boolean verified;

    public interface ArtistType {
        public static final Companion Companion = Companion.$$INSTANCE;

        static {
            Covode.recordClassIndex(71676);
        }

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            static {
                Covode.recordClassIndex(71677);
            }
        }
    }

    static {
        Covode.recordClassIndex(71675);
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getEnterType() {
        return this.enterType;
    }

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setEnterType(int i2) {
        this.enterType = i2;
    }

    public final void setFollowStatus(Integer num) {
        this.followStatus = num;
    }

    public final void setHandle(String str) {
        this.handle = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setVerified(boolean z) {
        this.verified = z;
    }
}
