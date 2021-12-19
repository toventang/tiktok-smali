package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class LiveUser implements Serializable, Cloneable {
    @c(a = "avatar_large")
    UrlModel avatarLarger;
    @c(a = "avatar_medium")
    UrlModel avatarMedium;
    @c(a = "avatar_thumb")
    UrlModel avatarThumb;
    @c(a = "follow_info")
    FollowInfo followInfo;
    @c(a = "id")
    long id;
    @c(a = "nickname")
    String nickname;
    @c(a = "sec_uid")
    String secUid;
    @c(a = "short_id")
    long shortId;
    @c(a = "display_id")
    String uniqueId;

    static {
        Covode.recordClassIndex(59503);
    }

    public String getSecUid() {
        return this.secUid;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }
}
