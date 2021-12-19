package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public final class MusicPerformer implements Serializable {
    @c(a = "avatar")
    public MusicAvatar avatar;
    @c(a = "id")
    public String id;
    @c(a = StringSet.name)
    public String name;

    static {
        Covode.recordClassIndex(71678);
    }

    public final MusicAvatar getAvatar() {
        return this.avatar;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }
}
